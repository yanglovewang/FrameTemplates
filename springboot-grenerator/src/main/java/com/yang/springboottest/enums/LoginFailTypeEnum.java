package com.yang.springboottest.enums;

public enum LoginFailTypeEnum {
	
	UN_LOGIN("0", "未登录"),
	PARAM_ERROR("10", "账号或者密码错误"),
	USER_NOT_EXIST("11", "账号不存在"),
	BLACKLIST("99", "黑名单");
	
	private String code;
	private String message;

	private LoginFailTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}

}
