package com.policy.dto;

public class Response {
	
	private String message;
	
	private Integer status;
	
	private Long custId;

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

	

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(String message, Integer status) {
		super();
		this.message = message;
		this.status = status;
	}

	public Response(String message, Integer status, Long custId) {
		super();
		this.message = message;
		this.status = status;
		this.custId = custId;
	}

}
