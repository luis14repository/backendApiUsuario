package com.usuario.entitty;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Entity
public class UsuarioEntity {

	@Id
	private String id;

	private String email;

	private String name;

	private String password;

	private String state;

	private LocalDate datecreate;

	private LocalDate dateupdate;

	private LocalDate lastadmissionDate;

	private String token;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDate getDatecreate() {
		return datecreate;
	}

	public void setDatecreate(LocalDate datecreate) {
		this.datecreate = datecreate;
	}

	public LocalDate getDateupdate() {
		return dateupdate;
	}

	public void setDateupdate(LocalDate dateupdate) {
		this.dateupdate = dateupdate;
	}

	public LocalDate getLastadmissionDate() {
		return lastadmissionDate;
	}

	public void setLastadmissionDate(LocalDate lastadmissionDate) {
		this.lastadmissionDate = lastadmissionDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
