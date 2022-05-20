package com.trybe.idadeemdias;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner instanciaDeScanner = new Scanner(System.in);
    System.out.println("Qual é o seu nome?");
    String nome = instanciaDeScanner.next();

    System.out.println("Qual é sua idade em anos, meses e dias?");

    System.out.println("anos:");
    String anosDeEntrada = instanciaDeScanner.next();

    System.out.println("meses:");
    String mesesDeEntrada = instanciaDeScanner.next();

    System.out.println("dias:");
    String diasDeEntrada = instanciaDeScanner.next();

    int anos = Integer.parseInt(anosDeEntrada);
    int meses = Integer.parseInt(mesesDeEntrada);
    int dias = Integer.parseInt(diasDeEntrada);

    Pessoa instanciaDePessoa = new Pessoa();
    int totalDias = instanciaDePessoa.calcularIdadeEmDias(anos, meses, dias);
    // Olá Paulo, sua idade em dias é 11404
    System.out.println("Olá " + nome + ", sua idade em dias é " + totalDias);

    instanciaDeScanner.close();

  }

}
