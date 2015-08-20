package com.person.model;

import java.io.Serializable;
import java.util.List;

public class JsonResponseResult implements Serializable{

	private static final long serialVersionUID = 1L;

	String message;


	public JsonResponseResult() {

	}
	
	public JsonResponseResult(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
