package com.policy.dto;

public class Response {
	
	private String message;
	
	private Integer status;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Response(String message, Integer status) {
		super();
		this.message = message;
		this.status = status;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

}
