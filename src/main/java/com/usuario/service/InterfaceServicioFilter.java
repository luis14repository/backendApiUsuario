package com.usuario.service;

import com.usuario.DTO.UsuarioEntradaDTO;
import com.usuario.DTO.UsuarioFiltroServiceDTO;
import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;

public interface InterfaceServicioFilter {
	
	
 UsuarioFiltroServiceDTO Ususarios(UsuarioEntradaDTO usuariosB); 
	
 Phone[] phone(UsuarioEntradaDTO usuariosB, Integer identificador ); 
	
 UsuarioEntity usuarioNew(UsuarioEntradaDTO usuariosB);
 
 
}
