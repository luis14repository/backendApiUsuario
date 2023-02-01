package com.usuario.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.usuario.DTO.UsuarioEntradaDTO;
import com.usuario.DTO.UsuarioFiltroServiceDTO;
import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;


@Service("servicioFiltro")
public class UserFiltro implements InterfaceServicioFilter {

	@Override
	public UsuarioFiltroServiceDTO Ususarios(UsuarioEntradaDTO usuarioEntradaDTO) {
		
		UsuarioFiltroServiceDTO usuarioJson = new UsuarioFiltroServiceDTO();
		usuarioJson.setEmail(usuarioEntradaDTO.getEmail());
		usuarioJson.setName(usuarioEntradaDTO.getName());
		usuarioJson.setPassword(usuarioEntradaDTO.getPassword());
		
		return usuarioJson;
	}

	@Override
	public Phone[] phone(UsuarioEntradaDTO usuarioEntradaDTO, String Identificador) {
		
		Phone[] pphone = usuarioEntradaDTO.getPhone();	
		
		for (int i = 0; i < pphone.length; i++) {
			pphone[i].setIdentificador(Identificador);
			}
		
		return pphone;
	}
	
	

	@Override
	public UsuarioEntity usuarioNew(UsuarioEntradaDTO usuarioEntradaDTO) {
		
		LocalDate fecha1 = null;		
		
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		
		usuarioEntity.setName(usuarioEntradaDTO.getName());
		usuarioEntity.setEmail(usuarioEntradaDTO.getEmail());
		usuarioEntity.setPassword(usuarioEntradaDTO.getPassword());
		usuarioEntity.setState("Activo");
		usuarioEntity.setToken("");
		usuarioEntity.setDatecreate(fecha1.now());
		usuarioEntity.setDateupdate(fecha1.now());
		usuarioEntity.setLastadmissionDate(fecha1.now());	
		
		return usuarioEntity;
	}
	
	
	

}
