package com.shie.mobile.exception;

import com.shie.mobile.util.CodeDefinition;

public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2554798651321849609L;
	private CodeDefinition errorCode;

	public ApplicationException(String message, CodeDefinition errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public CodeDefinition getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(CodeDefinition errorCode) {
		this.errorCode = errorCode;
	}

}
