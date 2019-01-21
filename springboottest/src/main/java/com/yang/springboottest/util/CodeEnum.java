package com.yang.springboottest.util;

public enum CodeEnum {
	SUCCESS("0", "The request succeeded normally!"),
	FAILURE("1", "Failed to fullfill the request!"),

	INVALID_PARAM("1000", "Invalid parameters"),

	LOGIN_FAILED("2000", "Invalid username or password"),
	UNAUTHORIZED("2010", "Unauthorized");

	private String code;
	private String message;

	private CodeEnum(String code, String message) {
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
