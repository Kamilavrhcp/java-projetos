package com.trybe.gerarpessoausuaria;

public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */

  public String getUsuario() {
    String mensagem = "Usuário inválido";

    if (super.nome == null || super.nome.isEmpty()) {
      return mensagem;
    } else if (super.sobrenome == null || super.sobrenome.isEmpty()) {
      return mensagem;
    }
    return super.nome + "." + super.sobrenome;
  }
}
