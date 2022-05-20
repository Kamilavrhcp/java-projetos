package com.trybe.polimorfismo;

public class FuncionarioPessoaJuridica extends Funcionario {

  public double calcularSalarioLiquido() {
    return this.salarioBruto - (salarioBruto * 0.1);
  }
}
