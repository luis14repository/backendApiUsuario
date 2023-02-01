package com.usuario.DTO;

import com.usuario.entitty.Phone;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UsuarioEntradaDTO {
	

	
	
	@NotNull(message = "El name name es nulo")	
	//@Pattern(regexp = "[a-z][A-Z][ ]",message =  "El name  no cumple con la estructura")	
	private String name;
	
	@Email(message = "El campo email no cumple con la estructura")	
	private String email;
	
	@NotNull(message = "El campo password es nulo")	
	private String password;
	
	@NotNull(message = "El campo phone es nulo")	
	private Phone[] phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Phone[] getPhone() {
		return phone;
	}
	public void setPhone(Phone[] phone) {
		this.phone = phone;
	}
	
	

}
