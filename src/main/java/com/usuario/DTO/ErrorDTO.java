package com.usuario.DTO;



import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
	
	
	private ResponseUserDTO responseUserDTO;
	private String code;
	private String message;
	
	
	
	public ErrorDTO(ResponseUserDTO responseUserDTO ,String code, String ex) {
			this.responseUserDTO = responseUserDTO;
			this.code = code;
			this.message = ex;
		}
		
	
	
	

}
