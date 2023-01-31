package com.usuario.exception;

public class RequestException extends RuntimeException {

	 private String code;

	    public RequestException(String code, String message) {
	        super(message);
	        setCode( code);
	        
	    }

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	    
	    
}
