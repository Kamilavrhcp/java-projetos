package com.trybe.contabancaria;

/**
 * Classe Cliente.
 **/

public class Cliente {

  /**
   * Atributos.
   **/
  private String nome;
  private String cpf;
  
  /**
   * Métodos.
   **/
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  /**
   * Método valida cpf.
   **/
  public void setCpf(String cpf) {
    if (ValidaCpf.validarCpf(cpf)) {
      this.cpf = cpf;
    } else {
      this.cpf = null;
    }
  }  
}
