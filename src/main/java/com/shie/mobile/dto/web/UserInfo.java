package com.shie.mobile.dto.web;

import java.io.Serializable;

public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6719096898782236956L;
	private String sessionId;
	private String ipAddress;
	private String mobileNo;
	private String orderId;
	private String provinceComCode;
	private String branchComCode;
	private String businessComCode;
	private String agentCode;
	private String verfiCode;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProvinceComCode() {
		return provinceComCode;
	}

	public void setProvinceComCode(String provinceComCode) {
		this.provinceComCode = provinceComCode;
	}

	public String getBranchComCode() {
		return branchComCode;
	}

	public void setBranchComCode(String branchComCode) {
		this.branchComCode = branchComCode;
	}

	public String getBusinessComCode() {
		return businessComCode;
	}

	public void setBusinessComCode(String businessComCode) {
		this.businessComCode = businessComCode;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getVerfiCode() {
		return verfiCode;
	}

	public void setVerfiCode(String verfiCode) {
		this.verfiCode = verfiCode;
	}

}
