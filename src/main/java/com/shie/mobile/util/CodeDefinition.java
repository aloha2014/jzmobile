package com.shie.mobile.util;

public enum CodeDefinition {
	SUCCESS("00", "处理成功"), 
	GEN_VER_CODE_ERR("01", "获取验证码处理失败"),
	SESSION_EMPTY_ERR("02", "用户会话数据为空"),
	GEN_SESSION_CODE_ERR("03", "创建用户会话信息处理失败"),
	UPDATE_SESSION_CODE_ERR("04", "更新用户会话信息处理失败"),
	CALC_PREMIUM_ERR("05", "计算保费信息失败"),	
	GENERAL_SYS_ERR("99", "系统处理失败");
	
	private String code;
	private String message;

	private CodeDefinition(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public static String getMessageByCode(String code) {
		for (CodeDefinition status : CodeDefinition.values()) {
			if (status != null && status.getCode().equals(code)) {
				return status.getMessage();
			}

		}
		return null;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return this.code + "---" + this.message;
	}
}
