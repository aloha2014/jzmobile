package com.shie.mobile.controller;

import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shie.mobile.dto.web.CommonResponse;
import com.shie.mobile.dto.web.PayPolicyNotification;
import com.shie.mobile.dto.web.PaymentInfo;
import com.shie.mobile.dto.web.PolicyInfo;
import com.shie.mobile.dto.web.PremiumInfo;
import com.shie.mobile.dto.web.ProposalRequest;
import com.shie.mobile.dto.web.UserInfo;
import com.shie.mobile.exception.ApplicationException;
import com.shie.mobile.service.CodeGenerationService;
import com.shie.mobile.util.CodeDefinition;
import com.shie.mobile.service.NotificationService;
import com.shie.mobile.service.ProposalService;
import com.shie.mobile.service.SessionMgmtService;

@RequestMapping("/proposal")
@Controller
public class ProposalController {
	private final static Logger logger = LoggerFactory.getLogger(ProposalController.class);
	@Autowired
	private CodeGenerationService codeGenerationService;

	@Autowired
	private SessionMgmtService sessionMgmtService;

	@Autowired
	private NotificationService notificationService;

	@Autowired
	private ProposalService proposalService;
	
	@Value("${payment.callback.success}")
    private String PAYMENT_CALLBACK_SUCCESS_URL;
	
	@Value("${payment.callback.failure}")
    private String PAYMENT_CALLBACK_FAILURE_URL;

	/***
	 * 初始化用户信息，保存业务归属信息
	 * 
	 * @param applicantPhoneNo
	 * @return
	 * @throws Exception
	 */ 
	@RequestMapping(value = "initialize", method = RequestMethod.POST)
	@ResponseBody
	public CommonResponse initialize(@RequestBody UserInfo userInfo) throws Exception {
		try {
			UserInfo userData = sessionMgmtService.createSession(userInfo);
			CommonResponse response = new CommonResponse();
			response.setData(userData);
			return response;
		} catch (ApplicationException e) {
			logger.error("initialization failed", e);
			return new CommonResponse(e.getErrorCode());
		}
	}

	/***
	 * 计算保费信息
	 * 
	 * @param proposalRequest
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "calcuatePremium", method = RequestMethod.POST)
	@ResponseBody
	public CommonResponse calcuatePremium(@RequestBody ProposalRequest proposalRequest) throws Exception {
		try {
			confirmUserInfo(proposalRequest.getUserInfo());
		} catch (ApplicationException e) {
			logger.error("check user session failed", e);
			return new CommonResponse(e.getErrorCode());
		}
		CommonResponse response = new CommonResponse();
		try {
			// 计算保费
			List<PremiumInfo> premiumList = proposalService.calculatePremium(proposalRequest);
			response.setData(premiumList);
			return response;
		} catch (ApplicationException e) {
			logger.error("calucate premium failed", e);
			return new CommonResponse(e.getErrorCode());
		}
	}

	/**
	 * 获取手机验证码
	 * 
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "getVerificationCode", method = RequestMethod.POST)
	@ResponseBody
	public CommonResponse getVerificationCode(@RequestBody UserInfo userInfo) throws Exception {
		try {
			confirmUserInfo(userInfo);
		} catch (ApplicationException e) {
			logger.error("check user session failed", e);
			return new CommonResponse(e.getErrorCode());
		}
		// 生成手机验证码
		String verificationCode = codeGenerationService.generateVerificationCode(userInfo.getSessionId());
		if (StringUtils.isBlank(verificationCode)) {
			return new CommonResponse(CodeDefinition.GEN_VER_CODE_ERR);
		} else {
			userInfo.setVerfiCode(verificationCode);
			try {
				userInfo = sessionMgmtService.updateSession(userInfo);
				// 短信通知用户
				notificationService.sendVerificationCode(userInfo.getMobileNo());
				// 不返回后台生成的验证码给前台
				userInfo.setVerfiCode(null);
				CommonResponse response = new CommonResponse();
				response.setData(userInfo);
				return response;
			} catch (ApplicationException e) {
				logger.error("get verification code failed", e);
				return new CommonResponse(e.getErrorCode());
			}
		}
	}

	/***
	 * 提交投保单，进入待支付
	 * 
	 * @param proposalRequest
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "submitProposal", method = RequestMethod.POST)
	@ResponseBody
	public CommonResponse submitProposal(@RequestBody ProposalRequest proposalRequest) throws Exception {
		try{
			//校验投保单数据
			proposalService.checkProposal(proposalRequest);
		}catch(ApplicationException e){
			logger.info("Proposal invalid", e);
			return new CommonResponse(e.getErrorCode());
		}
		PaymentInfo paymentInfo = proposalService.submitProposal(proposalRequest);
		CommonResponse response = new CommonResponse();
		response.setData(paymentInfo);		
		return response;
	}
	
	@RequestMapping(value = "paymentCallback", method = RequestMethod.POST)
	public ModelAndView paymentCallback(@RequestBody PayPolicyNotification payPolicyNotification) throws Exception {
		StringBuffer returnUrl=new StringBuffer("redirect:");
		if(payPolicyNotification!=null&&"1".equals(payPolicyNotification.getPayResult())){
			//如果支付成功则请求出单
			try{
				PolicyInfo policyInfo = proposalService.generatePolicy(payPolicyNotification);
				returnUrl.append(PAYMENT_CALLBACK_SUCCESS_URL);
				returnUrl.append("policyNo=");
				returnUrl.append(policyInfo.getPolicyNo());
			}catch(Exception e){
				logger.error("generate policy failed",e);
				returnUrl.append(PAYMENT_CALLBACK_FAILURE_URL);
			}
		}else{
			//如果支付失败
			returnUrl.append(PAYMENT_CALLBACK_FAILURE_URL);
		}
		ModelAndView mv = new ModelAndView(returnUrl.toString());	
		return mv;
	}

	/***
	 * 检查用户会话信息是否存在，若不存在进行创建
	 * 
	 * @throws Exception
	 */
	private void confirmUserInfo(UserInfo userInfo) throws ApplicationException {
		if (userInfo == null) {
			throw new ApplicationException("用户会话数据为空", CodeDefinition.SESSION_EMPTY_ERR);
		}
		if (userInfo.getSessionId() == null || sessionMgmtService.getSession(userInfo.getSessionId()) == null) {
			// 若会话信息不存在则为用户创建会话
			userInfo = sessionMgmtService.createSession(userInfo);
		}
	}
}
