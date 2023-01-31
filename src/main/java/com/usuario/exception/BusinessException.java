package com.usuario.exception;

import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException {
	
	private String code;
	private HttpStatus status;
	
	
	public BusinessException(String code, HttpStatus status, String message) {
		super(message);
		setCode(code);
		setStatus(status);
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public HttpStatus getStatus() {
		return status;
	}


	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	
	
	
}
