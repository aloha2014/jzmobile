package com.shie.mobile.service;

import com.shie.mobile.exception.ApplicationException;

public interface CodeGenerationService {
	/**
	 * 生成会话Id
	 * 
	 * @return
	 * @throws ApplicationException
	 */
	public String generateSessionId() throws ApplicationException;

	/***
	 * 根据手机号生成验证码
	 * 
	 * @param sessionId
	 * @return 手机验证码
	 * @throws Exception
	 */
	public String generateVerificationCode(String sessionId) throws ApplicationException;

	/**
	 * 生成订单号
	 * 
	 * @return
	 * @throws ApplicationException
	 */
	public String generateInsOrderId() throws ApplicationException;
}
