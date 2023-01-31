package com.usuario.controller;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.entitty.Phone;
import com.usuario.entitty.UsuarioEntity;
import com.usuario.entitty.UsuariosB;
import com.usuario.exception.BusinessException;
import com.usuario.exception.RequestException;
import com.usuario.repository.PhonesRepository;
import com.usuario.repository.UsuariosRepository;
import com.usuario.service.InterfaceUser;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UsuarioCotroller {

	@Autowired
	@Qualifier("servicioInicial")
	private InterfaceUser interfaceUser;

	@Autowired
	private UsuariosRepository usuariosRespository;

	@Autowired
	private PhonesRepository phonesRepository;

	@PostMapping("/createuserj")	
	public ResponseEntity<BusinessException> create(@Valid @RequestBody UsuariosB usuariosB, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			throw new BusinessException("Error en un campo de entrada",HttpStatus.INTERNAL_SERVER_ERROR, bindingResult.getFieldError().getDefaultMessage());
		}
		
		
		UsuarioEntity usuarioEntity = interfaceUser.usuarioNew(usuariosB);

		usuariosRespository.save(usuarioEntity);
		
		
		Phone[] phone = interfaceUser.phone(usuariosB, usuarioEntity.getId());
		
		
		for (Phone p : phone) {
				phonesRepository.save(p);			
			}	
		
		throw new BusinessException("",HttpStatus.OK,"El usuario fue creado satisfactoriamente");
			
	}
	

	

	@GetMapping("/getUsuarios")
	@ResponseStatus(HttpStatus.OK)
	public List<UsuarioEntity> findAllUsuarios() {
		return usuariosRespository.findAll();
	}

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UsuarioEntity getUserId(@PathVariable("id") Integer id) {
		return usuariosRespository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Error al traer el elemento" + id));
	}

	@PutMapping("/putUser")
	@ResponseStatus(HttpStatus.OK)
	public void putUser(@RequestBody UsuarioEntity usuarioEntity) {
		usuariosRespository.save(usuarioEntity);
	}

	@DeleteMapping(value = "delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Integer id) {
		deletePhones(id);	
		usuariosRespository.deleteById(id);			
	}

	@PostMapping("/createphone")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Phone phone) {
		phonesRepository.save(phone);
	}

	@PutMapping("/putphone")
	@ResponseStatus(HttpStatus.OK)
	public void putPhone(@RequestBody Phone phone) {
		phonesRepository.save(phone);
	}

	@GetMapping("/getphone/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Phone getPhoneId(@PathVariable("id") Integer id) {
		return phonesRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Error al traer el elemento" + id));
	}

	@GetMapping("/getphoneid/{idr}")
	@ResponseStatus(HttpStatus.OK)
	public List<Phone> getPhones(@PathVariable("idr") Integer identificador) {
		return phonesRepository.findAllIdentificador(identificador);
  
	}

	@PutMapping("/deletephone/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deletePhone(@PathVariable("id") Integer id) {
		phonesRepository.deleteById(id);

	}

	@DeleteMapping(value = "/delphoneid/{idr}")
	@ResponseStatus(HttpStatus.OK)
	public void deletePhones(@PathVariable("idr") Integer idr) {
		phonesRepository.deletePhone(idr);
		
	}

}
