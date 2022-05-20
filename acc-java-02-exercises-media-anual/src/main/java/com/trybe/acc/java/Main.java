package com.trybe.acc.java;

import java.util.Scanner;

public class Main {

  /**
   * Método principal.
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner instanciaDeScanner = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    String nome = instanciaDeScanner.next();

    System.out.println("Entre com as notas das provas:");
    System.out.println("Avaliação 1:");
    String nota1Entrada = instanciaDeScanner.next();
    double nota1 = Double.parseDouble(nota1Entrada);

    System.out.println("Avaliação 2:");
    String nota2Entrada = instanciaDeScanner.next();
    double nota2 = Double.parseDouble(nota2Entrada);

    System.out.println("Avaliação 3:");
    String nota3Entrada = instanciaDeScanner.next();
    double nota3 = Double.parseDouble(nota3Entrada);

    System.out.println("Avaliação 4:");
    String nota4Entrada = instanciaDeScanner.next();
    double nota4 = Double.parseDouble(nota4Entrada);

    Nota instanciaDeNota = new Nota();
    double mediaNota = instanciaDeNota.calcularMedia(nota1, nota2, nota3, nota4);

    System.out.println("Olá, " + nome + ", sua média é " + mediaNota);


    instanciaDeScanner.close();
  }

}
