package com.shie.mobile.dto.openapi;

import java.math.BigDecimal;

public class CalcPremiumOutPutDetail {
	private String provinceCode;
	private String cityCode;
	private String districtCode;
	private String buildStructure;
	private String clauseCode;
	private BigDecimal premium;

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getBuildStructure() {
		return buildStructure;
	}

	public void setBuildStructure(String buildStructure) {
		this.buildStructure = buildStructure;
	}

	public String getClauseCode() {
		return clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

	public BigDecimal getPremium() {
		return premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

}
