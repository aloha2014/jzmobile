package com.shie.mobile.service;

public interface NotificationService {
	/**
	 * 向指定手机号发送验证码短信通知
	 * 
	 * @param mobileNo
	 */
	public void sendVerificationCode(String mobileNo);
}
