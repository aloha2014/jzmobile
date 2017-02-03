package com.shie.mobile.dto.openapi;

import java.util.HashSet;
import java.util.Set;

public class CalcPremiumInput{
	private int insOrderId;
	private String productCode;
	private String applyDate;
	private String startDate;
	private String endDate;
	private String provinceComCode;
	private String branchComCode;
	private String businessComCode;
	private Set<CalcPremiumInputDetail> itemList;

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

	public Set<CalcPremiumInputDetail> getItemList() {
		return itemList;
	}

	public void setItemList(Set<CalcPremiumInputDetail> itemList) {
		this.itemList = itemList;
	}

	public void addItemList(CalcPremiumInputDetail detailInfo) {
		if (this.itemList == null) {
			this.itemList = new HashSet<CalcPremiumInputDetail>();
		}
		this.itemList.add(detailInfo);
	}
}
