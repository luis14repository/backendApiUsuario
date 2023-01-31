package com.usuario.DTO;



import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
	
	private String code;
	private String message;
	

	
	
	public ErrorDTO(String code, String ex) {
			
			this.code = code;
			this.message = ex;
		}
		
	
	
	

}
