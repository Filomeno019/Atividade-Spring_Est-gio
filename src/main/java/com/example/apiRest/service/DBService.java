package com.example.apiRest.service;

import org.springframework.stereotype.Service;

import com.example.apiRest.models.Cliente;
import com.example.apiRest.repositories.ClienteRepository;

@Service
public class DBService {
	
	private ClienteRepository repo;
	
	
	public void inicializarBancoDados() {
		
		Cliente cliente = new Cliente (null , "Antonio Filomeno", "14082001", "0000000000", "50310409802", "169969357385");
		repo.save(cliente);
		
	}

}
