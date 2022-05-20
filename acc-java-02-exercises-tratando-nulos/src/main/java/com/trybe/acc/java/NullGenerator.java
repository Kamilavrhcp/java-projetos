package com.trybe.acc.java;

public class NullGenerator {

  /**
   * Método que busca o nome.
   * 
   * @param numero - valor do parametro.
   * @return - nome.
   * @throws Exception - Nome nulo
   */
  public static String getNome(int numero) throws Exception {
    String nome = "BOB";

    if (numero % 2 != 0) {
      throw new Exception("Nome nulo");
    } else {
      return nome;
    }
  }
}
