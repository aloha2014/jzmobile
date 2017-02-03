package com.shie.mobile.dto.web;

import com.shie.mobile.util.CodeDefinition;

public class CommonResponse {
	private Object data;
	private String returnCode;
	private String returnMsg;

	public CommonResponse(CodeDefinition status) {
		super();		
		this.returnCode = status.getCode();
		this.returnMsg = status.getMessage();
	}

	public CommonResponse() {
		super();	
		this.returnCode = CodeDefinition.SUCCESS.getCode();
		this.returnMsg = CodeDefinition.SUCCESS.getMessage();
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

}
