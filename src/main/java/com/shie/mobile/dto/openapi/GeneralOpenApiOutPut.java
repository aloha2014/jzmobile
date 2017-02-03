package com.shie.mobile.dto.openapi;

abstract class GeneralOpenApiOutPut {
	private String msgCode;
	private String msgInfo;

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsgInfo() {
		return msgInfo;
	}

	public void setMsgInfo(String msgInfo) {
		this.msgInfo = msgInfo;
	}

}
