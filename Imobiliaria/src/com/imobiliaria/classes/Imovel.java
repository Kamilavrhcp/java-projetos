package com.imobiliaria.classes;

import java.time.LocalDate;

public class Imovel {
  private String endereco;
  private LocalDate datacadastro;
  protected boolean ativo;

  public Imovel(String endereco, LocalDate datacadastro) {
    super();
    this.endereco = endereco;
    this.datacadastro = datacadastro;
    this.ativo = false;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public LocalDate getDatacadastro() {
    return datacadastro;
  }

  public void setDatacadastro(LocalDate datacadastro) {
    this.datacadastro = datacadastro;
  }

  public boolean isAtivo() {
    return ativo;
  }

  public void ativarCadastro() {
    this.ativo = true;
  }



}
