package com.trybe.acc.java.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidade Veículo.
 *
 */

@Entity
public class Veiculo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private int ano;

  @Column(nullable = false)
  private String modelo;

  @Column(nullable = false)
  private String quilometragem;

  public Long getId() {
    return id;
  }

  public int getAno() {
    return ano;
  }

  public String getModelo() {
    return modelo;
  }

  public String getQuilometragem() {
    return quilometragem;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setQuilometragem(String quilometragem) {
    this.quilometragem = quilometragem;
  }
}
