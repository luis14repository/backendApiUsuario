package com.usuario.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service("serviciogenerateUUID")
public class generateUUID implements InterfaceGenerateUUID {

	@Override
	public String generateUUID() {
		
		String uuid = UUID.randomUUID().toString().toUpperCase().substring(0,8);
		
		return uuid;
	}
		
	
}
