package com.shie.mobile.dto.openapi;

public class UndwrtProposalOutput extends GeneralOpenApiOutPut {
	private String orderId;
	private String insOrderId;
	private String productCode;
	private String startDate;
	private String endDate;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getInsOrderId() {
		return insOrderId;
	}

	public void setInsOrderId(String insOrderId) {
		this.insOrderId = insOrderId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

}
