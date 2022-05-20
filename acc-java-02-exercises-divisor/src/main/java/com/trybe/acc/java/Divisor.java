package com.trybe.acc.java;

public class Divisor {

  public static void main(String[] args) {
    Divisor dividindo = new Divisor();
    System.out.println(dividindo.dividir(2, 2));
  }

  /**
   * Método que verifica se é possivel fazer a divisão de dois números inteiros.
   * 
   * @param numero1 - dividendo
   * @param numero2 - divisor.
   * @return resultado do dividendo com o divisor.
   */
  public int dividir(int numero1, int numero2) {

    try {
      int resultado = numero1 / numero2;
      return resultado;
    } catch (ArithmeticException e) {
      return 0;
    }

  }
}
