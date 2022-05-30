package com.trybe.gestaotime.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Classe Torcedor.
 **/

@Entity
public class Torcedor {

  /**
   * Atributos.
   **/
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
  @Column(nullable = false)
  private String nome;
  
  /**
   * Métodos.
   **/  
  
  @ManyToMany(mappedBy = "torcedores")  
  private List<Time> times;

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public List<Time> getTimes() {
    return times;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTimes(List<Time> times) {
    this.times = times;
  } 
}
