package com.trybe.acc.java.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Pessoa Candidata.
   * 
   * @param nome - nome do candidato.
   * @param numero - número que irá referênciar o candidato.
   */
  public PessoaCandidata(String nome, int numero) {
    this.numero = numero;
    this.votos = 0;
    this.nome = nome; // this.setNome() = nome;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  @Override
  public String getNome() {
    return this.nome;
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void receberVoto() {
    this.votos += 1;
  }


}
