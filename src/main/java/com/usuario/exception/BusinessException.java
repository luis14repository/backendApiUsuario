package com.usuario.exception;

import org.springframework.http.HttpStatus;

import com.usuario.DTO.ResponseUserDTO;

public class BusinessException extends RuntimeException {
	
	private ResponseUserDTO responseUserDTO;
	private HttpStatus status;
	private String code;
	
	
	public BusinessException(ResponseUserDTO responseUserDTO,String code, HttpStatus status, String message) {
		super(message);
		setStatus(status);
		setCode(code);
		setResponseUserDTO( responseUserDTO);
		
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public ResponseUserDTO getResponseUserDTO() {
		return responseUserDTO;
	}


	public void setResponseUserDTO(ResponseUserDTO responseUserDTO) {
		this.responseUserDTO = responseUserDTO;
	}


	public HttpStatus getStatus() {
		return status;
	}


	public void setStatus(HttpStatus status) {
		this.status = status;
	}


	
	
}
