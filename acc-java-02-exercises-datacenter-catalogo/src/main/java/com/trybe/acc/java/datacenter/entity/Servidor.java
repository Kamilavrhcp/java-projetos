package com.trybe.acc.java.datacenter.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_servidor")
public class Servidor {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  @Column(nullable = false)
  private String nome;
  
  @Column(nullable = false)
  private Long datacenter_id;
  
  @ManyToOne
  @JoinColumn(name = "datacenter_id")
  private Datacenter datacenter;
  
  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(name = "relacionamento_servidor_aplicacao",
      joinColumns = {@JoinColumn(name = "servidor_id")},      
      inverseJoinColumns = {@JoinColumn(name = "aplicacao_id")})  
  private List<Aplicacao> aplicacoes = new ArrayList<Aplicacao>();;

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public Long getDatacenter_id() {
    return datacenter_id;
  }

  public Datacenter getDatacenter() {
    return datacenter;
  }

  public List<Aplicacao> getAplicacoes() {
    return aplicacoes;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDatacenter_id(Long datacenter_id) {
    this.datacenter_id = datacenter_id;
  }

  public void setDatacenter(Datacenter datacenter) {
    this.datacenter = datacenter;
  }

  public void setAplicacoes(List<Aplicacao> aplicacoes) {
    this.aplicacoes = aplicacoes;
  }

  public void addAplicacao(Aplicacao aplicacao) {
    aplicacoes.add(aplicacao);
  }
}
