package com.betrybe.core;

public class ContaPoupanca extends Conta {

  @Override
  public void sacar(double valor) {
    this.saldo -= valor + 2;
  }

  public void simularRendimento() {
    saldo *= 0.05;
  }

  public void simularRendimento(double taxa) {
    saldo *= taxa;
  }

}
