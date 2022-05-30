package com.trybe.gestaotime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Classe Documento.
 */

@Entity
public class Documento {
  /**
   * Atributos.
   */
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
  @Column(nullable = false)
  private String cpf;
  
  @Column(nullable = false)
  private String numeroCarteiraTrabalho;
  
  @Column(nullable = false)
  private String numeroCbf;
  
  /**
   * Métodos.
   */
  
  @JoinColumn(name = "jogador_id")
  @OneToOne(fetch = FetchType.LAZY)
  private Jogador jogador;
  
  public Integer getId() {
    return id;
  }

  public String getCpf() {
    return cpf;
  }

  public String getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }

  public String getNumeroCbf() {
    return numeroCbf;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
    this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
  }

  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }  
  
}
