package com.xzc.blog.common.util;

import java.io.Serializable;

public class AjaxValidate implements Serializable {

	private static final long serialVersionUID = 5284564803868598564L;

	private String value;

	private boolean result;

	private String message;

	public AjaxValidate() {
	}

	public AjaxValidate(boolean result, String message) {
		this.value = null;
		this.result = result;
		this.message = message;
	}
	
	public AjaxValidate(String value, boolean result, String message) {
		this.value = value;
		this.result = result;
		this.message = message;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}