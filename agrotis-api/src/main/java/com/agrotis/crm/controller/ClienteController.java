package com.agrotis.crm.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.agrotis.crm.model.Cliente;
import com.agrotis.crm.repository.ClienteRepository;
import com.agrotis.crm.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	private String nome;
	private String cnpf;
	private LocalDateTime dataInicial;
	private LocalDateTime dataFinal;
	private String observacoes;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);	
	}
	
	@GetMapping(path="/{id}")
	public Optional<Cliente> buscar(@PathVariable long id) {
		return clienteRepository.findById(id);
	}
	
	@DeleteMapping(path="/{id}")
	public Optional<Cliente> deletar(@PathVariable long id) {
		clienteRepository.deleteById(id);
		return null;
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity<Object> atualizar(@PathVariable long id) {
		Optional<Cliente> atualizarCliente = clienteRepository.findById(id);
		if(!atualizarCliente.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro não encontrado");
		}		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCnpj(cnpf);
		cliente.setDataInicial(dataInicial);
		cliente.setDataFinal(dataFinal);
		cliente.setObservacoes(observacoes);
		
		return ResponseEntity.status(HttpStatus.OK).body(ClienteService.save(cliente));
	}	
	
}
