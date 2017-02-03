package com.shie.mobile.dto.openapi;

import java.util.List;

public class UndwrtProposalInput {
	private int insOrderId;
	private String productCode;
	private String applyDate;
	private String startDate;
	private String endDate;
	private String provinceComCode;
	private String branchComCode;
	private String businessComCode;
	private String agentCode;
	private String operatorCode;
	private PolicyHolder policyHolder;
	private List<Insurant> insurantList;

	public int getInsOrderId() {
		return insOrderId;
	}

	public void setInsOrderId(int insOrderId) {
		this.insOrderId = insOrderId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public PolicyHolder getPolicyHolder() {
		return policyHolder;
	}

	public void setPolicyHolder(PolicyHolder policyHolder) {
		this.policyHolder = policyHolder;
	}

	public List<Insurant> getInsurantList() {
		return insurantList;
	}

	public void setInsurantList(List<Insurant> insurantList) {
		this.insurantList = insurantList;
	}

}
