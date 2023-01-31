package com.usuario.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.usuario.DTO.UsuarioEntradaDTO;
import com.usuario.DTO.UsuarioFiltroServiceDTO;
import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;


@Service("servicioInicial")
public class userA implements InterfaceUser {

	@Override
	public UsuarioFiltroServiceDTO Ususarios(UsuarioEntradaDTO usuariosB) {
		
		UsuarioFiltroServiceDTO usuarioJson = new UsuarioFiltroServiceDTO();
		usuarioJson.setEmail(usuariosB.getEmail());
		usuarioJson.setName(usuariosB.getName());
		usuarioJson.setPassword(usuariosB.getPassword());
		
		return usuarioJson;
	}

	@Override
	public Phone[] phone(UsuarioEntradaDTO usuariosB, Integer Identificador) {
		
		Phone[] pphone = usuariosB.getPhone();	
		
		for (int i = 0; i < pphone.length; i++) {
			pphone[i].setIdentificador(Identificador);
			}
		
		return pphone;
	}
	
	

	@Override
	public UsuarioEntity usuarioNew(UsuarioEntradaDTO usuariosB) {
		
		LocalDate fecha1 = null;		
		
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		
		usuarioEntity.setName(usuariosB.getName());
		usuarioEntity.setEmail(usuariosB.getEmail());
		usuarioEntity.setPassword(usuariosB.getPassword());
		usuarioEntity.setState("Activo");
		usuarioEntity.setToken("");
		usuarioEntity.setDatecreate(fecha1.now());
		usuarioEntity.setDateupdate(fecha1.now());
		usuarioEntity.setLastadmissionDate(fecha1.now());	
		
		return usuarioEntity;
	}
	
	
	

}
