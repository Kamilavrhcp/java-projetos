package com.trybe.contapoupanca;

public class ContaPoupanca {
  private double saldo;
  private String titularConta;

  ContaPoupanca(String nome, double valorDepositado) {
    this.titularConta = nome;
    this.saldo = valorDepositado;
  }

  public void depositar(double valorDepositado) {
    this.saldo += valorDepositado;
  }

  public void sacar(double valorDepositado) {
    this.saldo -= valorDepositado;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }

}
