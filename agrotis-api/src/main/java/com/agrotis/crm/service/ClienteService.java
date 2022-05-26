package com.agrotis.crm.service;

import org.springframework.stereotype.Service;

import com.agrotis.crm.model.Cliente;
import com.agrotis.crm.repository.ClienteRepository;

@Service
public class ClienteService {
	final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public static Object save(Cliente cliente) {
		/**
		 * Este método está incompleto, 
		 * como fiquei sem tempo, deixei só a estrutura.
		 * Mas eu queria ter terminado :(
		 */
		return null;
	}
	

}
