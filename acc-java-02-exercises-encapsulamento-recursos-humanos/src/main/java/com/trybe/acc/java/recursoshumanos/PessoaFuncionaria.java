package com.trybe.acc.java.recursoshumanos;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class PessoaFuncionaria {
  private String nomeCompleto;
  private String cpf;
  private String endereco;
  private double salario;

  PessoaFuncionaria(String nomeObjeto, String cpfObjeto, String enderecoObjeto,
      double salarioObjeto) {
    nomeCompleto = nomeObjeto;
    cpf = cpfObjeto;
    endereco = enderecoObjeto;
    salario = salarioObjeto;


  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nome) {
    this.nomeCompleto = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getCpf() {
    return cpf;
  }

}
