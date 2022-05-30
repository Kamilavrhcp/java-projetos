package com.trybe.acc.java.datacenter.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Aplicacao {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)  
  private Long id;
  
  @Column(nullable = false)
  private String nome;
  
  @Column(nullable = false)
  private String descricao;
  
  @ManyToMany(mappedBy = "aplicacoes")  
  private List<Servidor> servidores;

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
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

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setServidores(List<Servidor> servidores) {
    this.servidores = servidores;
  } 

}
