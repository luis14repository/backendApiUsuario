package com.usuario.DTO;

import java.time.LocalDate;

import com.usuario.entitty.UsuarioEntity;

public class ResponseUserDTO {

	private String id;
	private LocalDate creater;
	private LocalDate modified;
	private LocalDate lastLogin;
	private String token;
	private String isActive;
	
	
	
	public  ResponseUserDTO(UsuarioEntity usuarioEntity) {
		
		 this.id = usuarioEntity.getId();
		 this.creater = usuarioEntity.getDatecreate();
		 this.modified = usuarioEntity.getDateupdate();
		 this.lastLogin = usuarioEntity.getLastadmissionDate();
		 this.token = usuarioEntity.getToken();
		 this.isActive= usuarioEntity.getState();	 
		
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public LocalDate getCreater() {
		return creater;
	}
	public void setCreater(LocalDate creater) {
		this.creater = creater;
	}
	public LocalDate getModified() {
		return modified;
	}
	public void setModified(LocalDate modified) {
		this.modified = modified;
	}
	public LocalDate getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDate lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	
	
}
