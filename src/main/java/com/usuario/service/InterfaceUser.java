package com.usuario.service;

import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;
import com.usuario.entitty.UsuarioJson;
import com.usuario.entitty.UsuariosB;

public interface InterfaceUser {
	
	
 UsuarioJson Ususarios(UsuariosB usuariosB); 
	
 Phone[] phone(UsuariosB usuariosB, Integer identificador ); 
	
 UsuarioEntity usuarioNew(UsuariosB usuariosB);
 
 
}
