package com.shie.mobile.service;

import com.shie.mobile.exception.ApplicationException;

public interface CodeGenerationService {
	/***
	 * 根据手机号生成验证码
	 * 
	 * @param sessionId
	 * @return 手机验证码
	 * @throws Exception
	 */
	public String generateVerificationCode(String sessionId) throws ApplicationException;

	
}
