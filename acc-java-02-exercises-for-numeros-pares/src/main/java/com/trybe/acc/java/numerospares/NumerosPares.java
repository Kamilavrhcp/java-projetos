package com.trybe.acc.java.numerospares;

/**
 * Classe NumerosPares.
 * 
 */
public class NumerosPares {

  /**
   * Método para implementar o for que vai gerar os números de 4 a 20.
   * 
   */

  public static void main(String[] args) {

    /**
     * Método para imprimir no console os números de 4 a 20.
     * 
     */

    // int numero = 4;

    for (int i = 4; i <= 20; i += 2) {
      // numero += 2;
      imprime(i);

    }

  }

  public static void imprime(int numero) {
    System.out.println(numero);
  }

}
