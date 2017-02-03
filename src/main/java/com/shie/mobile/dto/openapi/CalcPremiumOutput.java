package com.shie.mobile.dto.openapi;

import java.util.List;

public class CalcPremiumOutput extends GeneralOpenApiOutPut {
	private List<CalcPremiumOutPutDetail> itemList;

	public List<CalcPremiumOutPutDetail> getItemList() {
		return itemList;
	}

	public void setItemList(List<CalcPremiumOutPutDetail> itemList) {
		this.itemList = itemList;
	}

}
