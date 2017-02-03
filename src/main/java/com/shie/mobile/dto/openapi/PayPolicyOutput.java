package com.shie.mobile.dto.openapi;

public class PayPolicyOutput extends GeneralOpenApiOutPut {
	private String shortURL;
	private String expireTime;

	public String getShortURL() {
		return shortURL;
	}

	public void setShortURL(String shortURL) {
		this.shortURL = shortURL;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

}
