package com.trybe.polimorfismo;

public class FuncionarioPessoaFisica extends Funcionario {

  @Override
  public double calcularSalarioLiquido() {
    return this.salarioBruto - (salarioBruto * 0.2);
  }
}
