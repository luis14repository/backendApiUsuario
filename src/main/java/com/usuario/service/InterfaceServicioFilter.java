package com.usuario.service;

import com.usuario.DTO.UsuarioEntradaDTO;
import com.usuario.DTO.UsuarioFiltroServiceDTO;
import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;

public interface InterfaceServicioFilter {
	
	
 UsuarioFiltroServiceDTO Ususarios(UsuarioEntradaDTO usuarioEntradaDTO); 
	
 Phone[] phone(UsuarioEntradaDTO usuarioEntradaDTO, String identificador ); 
	
 UsuarioEntity usuarioNew(UsuarioEntradaDTO usuarioEntradaDTO);
 
 
}
