package com.shie.mobile.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shie.mobile.dao.SessionmgmtMapper;
import com.shie.mobile.dto.web.UserInfo;
import com.shie.mobile.entity.Sessionmgmt;
import com.shie.mobile.entity.SessionmgmtExample;
import com.shie.mobile.entity.SessionmgmtExample.Criteria;
import com.shie.mobile.exception.ApplicationException;
import com.shie.mobile.service.CodeGenerationService;
import com.shie.mobile.service.SessionMgmtService;
import com.shie.mobile.util.BizConstant;
import com.shie.mobile.util.CodeDefinition;
import com.shie.mobile.util.PhoneValidator;
import com.shie.mobile.util.RedisCacheUtil;

@Service("SessionMgmtService")
public class SessionMgmtServiceImpl implements SessionMgmtService {
	@Autowired
	private RedisCacheUtil redisCacheUtil;	
	@Autowired
	private SessionmgmtMapper sessionmgmtMapper;
	@Autowired
	private CodeGenerationService codeGenerationService;
	@Override
	public UserInfo createSession(UserInfo userInfo) throws ApplicationException {
		if (userInfo == null) {
			userInfo = new UserInfo();
		}
		String sessionId =codeGenerationService.generateSessionId();
		userInfo.setSessionId(sessionId);
		//缓存用户会话信息15分钟
		redisCacheUtil.saveObject(sessionId, userInfo, 900);
		return null;
	}

	@Override
	public UserInfo getSession(String sessionId) {	
		return (UserInfo) redisCacheUtil.readObject(sessionId);
	}

	@Override
	public UserInfo createUserInfo(UserInfo userInfo) throws ApplicationException {
		if(userInfo==null||StringUtils.isBlank(userInfo.getSessionId())){
			throw new ApplicationException("用户会话数据为空", CodeDefinition.SESSION_EMPTY_ERR);
		}
		if(!PhoneValidator.isPhoneCallNum(userInfo.getMobileNo())){
			throw new ApplicationException("电话号码有误", CodeDefinition.SESSION_PHONE_NO_ERR);
		}
		if(userInfo.getBusinessComCode()==null){
			userInfo.setBusinessComCode(BizConstant.DEFAULT_BUSINESS_COMPANY_CODE);
		}
		if(userInfo.getProvinceComCode()==null){
			userInfo.setProvinceComCode(BizConstant.DEFAULT_PROVINCE_COMPANY_CODE);
		}
		if(userInfo.getBranchComCode()==null){
			userInfo.setBranchComCode(BizConstant.DEFAULT_BRANCH_COMPANY_CODE);
		}
		if(userInfo.getAgentCode()==null){
			userInfo.setAgentCode(BizConstant.DEFAULT_AGENT_CODE);
		}	
		userInfo.setOrderId(codeGenerationService.generateInsOrderId());
		sessionmgmtMapper.insert(convertToPO(userInfo));		
		return userInfo;
	}

	private Sessionmgmt convertToPO(UserInfo userInfo) {
		Sessionmgmt session=new Sessionmgmt();
		session.setSessionId(userInfo.getSessionId());
		session.setCreatetime(new Date(System.currentTimeMillis()));
		session.setBusinesscomcode(userInfo.getBusinessComCode());
		session.setBranchcomcode(userInfo.getBranchComCode());
		session.setProvincecomcode(userInfo.getProvinceComCode());
		session.setAgentcode(userInfo.getAgentCode());
		session.setInsorderId(new Integer(userInfo.getOrderId()));
		session.setIpaddress(userInfo.getIpAddress());
		session.setMobileno(userInfo.getMobileNo());
		session.setVerficode(userInfo.getVerfiCode());
		return session;
	}

	@Override
	public boolean checkVericationCode(UserInfo userInfo) throws ApplicationException {
		if(userInfo==null||StringUtils.isBlank(userInfo.getSessionId())){
			throw new ApplicationException("用户会话数据为空", CodeDefinition.SESSION_EMPTY_ERR);
		}
		if(StringUtils.isBlank(userInfo.getVerfiCode())){
			throw new ApplicationException("手机验证码为空", CodeDefinition.SESSION_VERIFICATION_NO_EMPTY);
		}
		SessionmgmtExample example=new SessionmgmtExample();
		Criteria criteria = example.createCriteria();
		criteria.andSessionIdEqualTo(userInfo.getSessionId());
		List<Sessionmgmt> sessionList = sessionmgmtMapper.selectByExample(example);
		if(sessionList==null||sessionList.isEmpty()){
			throw new ApplicationException("用户会话数据在数据库查询失败", CodeDefinition.SESSION_EMPTY_ERR);
		}
		return userInfo.getVerfiCode()==sessionList.get(0).getVerficode();	
	}
}
