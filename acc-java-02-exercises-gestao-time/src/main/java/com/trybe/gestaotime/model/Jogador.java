package com.trybe.gestaotime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Classe Jogador.
 **/

@Entity
public class Jogador {

  /**
   * Atributos.
   **/
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
  @Column(nullable = false)
  private String nome;
  
  @Column(nullable = false)
  private String posicao;  
  
  // private String time;
  
  /**
   * Métodos.
   **/
  
  @JoinColumn(name = "documento_id")
  @OneToOne(fetch = FetchType.LAZY)
  private Documento documento;
  
  @ManyToOne
  @JoinColumn(name = "time_id")
  private Time time;

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getPosicao() {
    return posicao;
  }

  public Documento getDocumento() {
    return documento;
  }

  public Time getTime() {
    return time;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPosicao(String posicao) {
    this.posicao = posicao;
  }

  public void setDocumento(Documento documento) {
    this.documento = documento;
  }

  public void setTime(Time time) {
    this.time = time;
  }   

}
