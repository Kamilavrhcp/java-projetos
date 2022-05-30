package com.trybe.acc.java.datacenter.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_datacenter")
public class Datacenter {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  @Column(nullable = false)
  private String nome;
  
  @Column(nullable = false)
  private String localidade;
  
  @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Servidor> servidores = new ArrayList<Servidor>();;

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getLocalidade() {
    return localidade;
  }

  public List<Servidor> getServidores() {
    return servidores;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setLocalidade(String localidade) {
    this.localidade = localidade;
  }

  public void setServidores(List<Servidor> servidores) {
    this.servidores = servidores;
  }
  
  public void addServidor(Servidor servidor) {
    servidores.add(servidor);    
  }

}
