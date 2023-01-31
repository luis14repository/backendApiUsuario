package com.usuario.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;

import jakarta.transaction.Transactional;


public interface PhonesRepository extends JpaRepository<Phone, Integer> { 
	
	@Query(value = "SELECT * FROM PHONE WHERE IDENTIFICADOR = ?",nativeQuery = true)		
	List<Phone> findAllIdentificador(Integer identificador);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE  FROM PHONE WHERE IDENTIFICADOR = ?",nativeQuery = true)		
	void deletePhone(Integer id);
	

}
