package com.trybe.acc.java;

public class Nota {
  /**
   * Calcula média anual de notas.
   */

  public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double notas = nota1 + nota2 + nota3 + nota4;
    double quantidadeNotas = 4;
    double mediaNotas = notas / quantidadeNotas;
    return mediaNotas;
  }

}
