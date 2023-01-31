package com.usuario.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.usuario.DTO.ErrorDTO;
import com.usuario.exception.BusinessException;
import com.usuario.exception.RequestException;




@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<ErrorDTO> runtimeExceptionHandler(RuntimeException ex){
		ErrorDTO error =  ErrorDTO.builder().code("Error en un Campo").message(ex.getMessage()).build();		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	 @ExceptionHandler(value = RequestException.class)
	    public ResponseEntity<ErrorDTO> requestExceptionHandler(RequestException ex){
	        ErrorDTO error = ErrorDTO.builder().code(ex.getCode()).message(ex.getMessage()).build();
	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }

	
	
	 @ExceptionHandler(value = BusinessException.class)
	    public ResponseEntity<ErrorDTO> businessExceptionHandler(BusinessException ex){
	        ErrorDTO error = ErrorDTO.builder().code(ex.getCode()).message(ex.getMessage()).build();
	        return new ResponseEntity<>(error, ex.getStatus());
	    }
	    
	    

}
