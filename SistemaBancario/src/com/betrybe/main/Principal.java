package com.betrybe.main;

import com.betrybe.core.ContaCorrente;
import com.betrybe.core.ContaPoupanca;

public class Principal {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente();

    cc.depositar(100);
    System.out.println("O seu saldo inicial da conta corrente é: " + cc.getSaldo());

    cc.sacar(20);
    System.out.println("O seu saldo atual da conta corrente é: " + cc.getSaldo());

    ContaPoupanca cp = new ContaPoupanca();

    cp.depositar(100);
    System.out.println("O seu saldo inicial da conta poupanca é: " + cp.getSaldo());

    cp.sacar(20);
    System.out.println("O seu saldo atual da conta poupanca é: " + cp.getSaldo());

    cp.simularRendimento(1);
    System.out.println("O seu saldo atual da conta poupanca é: " + cp.getSaldo());


  }

}
