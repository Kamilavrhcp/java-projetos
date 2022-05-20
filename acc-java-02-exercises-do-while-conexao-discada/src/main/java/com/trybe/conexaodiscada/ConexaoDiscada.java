package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */
public class ConexaoDiscada {

  /**
   * Conexão Discada.
   */

  public static void main(String[] args) {
    // Seu código aqui
    int tentativas = 0;
    boolean conexao = false;

    do {
      tentativas += 1;
      conexao = conectou();

    } while (tentativas < 3 && conexao == false);
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
