package com.trybe.acc.java;

public class NullGuard {
  /**
   * Método printar o nome.
   * 
   * @param divisor - parametro.
   * @return - resultado / erro
   */
  public String printName(int divisor) {
    NullGenerator gerador = new NullGenerator();

    try {
      return gerador.getNome(divisor);
    } catch (Exception error) {
      return error.getMessage();
    }
  }

}
