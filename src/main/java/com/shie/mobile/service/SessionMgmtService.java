package com.shie.mobile.service;

import com.shie.mobile.dto.web.UserInfo;
import com.shie.mobile.exception.ApplicationException;

public interface SessionMgmtService {
	/**
	 * 创建用户会话信息
	 * 
	 * @param userInfo
	 * @return User's session info
	 */
	public UserInfo createSession(UserInfo userInfo) throws ApplicationException;

	/**
	 * 获取用户会话信息
	 * 
	 * @param sessionId
	 * @return
	 */
	public UserInfo getSession(String sessionId);
	
	
	/**
	 * 更新用户会话信息
	 * 
	 * @param sessionId
	 * @return
	 */
	public UserInfo updateSession(UserInfo userInfo) throws ApplicationException;
	
	/***
	 * 用户手机验证码校验
	 * 
	 * @param userInfo
	 *            用户信息
	 * @param phoneNo
	 *            用户录入的手机验证码
	 * @return True:匹配成功 False:失败
	 * @throws Exception
	 */
	public boolean checkVericationCode(UserInfo userInfo, String phoneNo) throws ApplicationException;
}
