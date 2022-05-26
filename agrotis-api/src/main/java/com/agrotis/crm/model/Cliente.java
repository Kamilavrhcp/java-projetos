package com.agrotis.crm.model;

import java.time.LocalDateTime;
//import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private LocalDateTime dataInicial;
	
	@Column(nullable = false)
	private LocalDateTime dataFinal;
	
	@Column(nullable = false)
	private String cnpj;
	
	@Column(nullable = true)
	private String observacoes;
	
	@ManyToOne	
	private InfosPropriedade infosPropriedade;
	
//	@OneToMany //(mappedBy = "cliente")
//	private Laboratorio laboratorio;
	
//	public Cliente(String nome, LocalDateTime dataInicial, LocalDateTime dataFinal, String cnpj, String observacoes) {
//		super();
//		this.nome = nome;
//		this.dataInicial = dataInicial;
//		this.dataFinal = dataFinal;
//		this.cnpj = cnpj;
//		this.observacoes = observacoes;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDateTime dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDateTime getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDateTime dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}	

}
