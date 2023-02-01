package com.usuario.repository;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.usuario.DTO.ResponseUserDTO;
import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;


public interface UsuariosRepository extends JpaRepository<UsuarioEntity, Integer> { 
	

	
	@Query(value = "SELECT email FROM USUARIO_ENTITY WHERE IDENTIFICADOR = ?",nativeQuery = true)		
	List<Phone> findAllIdentificador(Integer identificador);
	
	
	
	
	
}
