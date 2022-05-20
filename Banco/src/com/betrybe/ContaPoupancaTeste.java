package com.betrybe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContaPoupancaTeste {

  @Test
  void testeDepositar() {
    ContaPoupanca poupanca = new ContaPoupanca();
    assertEquals(3000, poupanca.depositar(3000));
  }
  
  void testeSacar() {
    ContaPoupanca poupanca = new ContaPoupanca();
    poupanca.depositar(5000);
    assertEquals(2000, poupanca.sacar(3000));
  }
  
  void testeVerSaldo() {
    ContaPoupanca poupanca = new ContaPoupanca();
    poupanca.depositar(2000);
    poupanca.sacar(500);
    assertEquals(1500, poupanca.verSaldo());
  }
}
