package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  /**
   * Método inicial e principal.
   * 
   * @param args - argumento
   */
  public static void main(String[] args) {
    // Este projeto eu pedi auxílio ao Marcus. =)
    Scanner instanciaDeScanner = new Scanner(System.in);
    ArrayList<Short> arrayIdade = new ArrayList<Short>();

    short opcao = 0;

    do {

      System.out.println("Entre com o número correspondente à opção desejada:"
          + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");

      String opcaoDeEntrada = instanciaDeScanner.next();
      opcao = Short.parseShort(opcaoDeEntrada);


      if (opcao == 1) {
        String mensagem = "Entre com a idade";
        System.out.println(mensagem);
        String idadeDeEntrada = instanciaDeScanner.next();
        short idade = Short.parseShort(idadeDeEntrada);
        verificaIdade(idade);
        arrayIdade.add(idade);

      } else if (opcao != 1 && opcao != 2) {
        System.out.println("Entre com uma opção válida!");
      } else if (opcao == 2) {
        montadorDeRelatorio(arrayIdade);
      }

    } while (opcao != 2);
    instanciaDeScanner.close();
  }


  static void verificaIdade(short idade) {

    if (idade < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (idade >= 18 && idade <= 49) {
      System.out.println("Pessoa adulta, catraca liberada!");
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    }
  }

  static void montadorDeRelatorio(ArrayList<Short> arrayIdade) {
    int qtidadeDezoito = 0;
    int qtidadeEntre1849 = 0;
    int qtidadeMaior49 = 0;


    for (int i = 0; i < arrayIdade.size(); i++) {
      if (arrayIdade.get(i) < 18) {
        qtidadeDezoito += 1;
      } else if (arrayIdade.get(i) >= 18 && arrayIdade.get(i) <= 49) {
        qtidadeEntre1849 += 1;
      } else {
        qtidadeMaior49 += 1;
      }

    }
    geradorDeRelatorio(qtidadeDezoito, qtidadeEntre1849, qtidadeMaior49);
  }

  static void geradorDeRelatorio(int qtidadeDezoito, int qtidadeEntre1849, int qtidadeMaior49) {
    double total = qtidadeDezoito + qtidadeEntre1849 + qtidadeMaior49;
    DecimalFormat decimalFormat = new DecimalFormat("##0.0%");

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + qtidadeDezoito);
    System.out.println("adultas: " + qtidadeEntre1849);
    System.out.println("a partir de 50: " + qtidadeMaior49);

    System.out.println("----- Percentual -----");
    double menores = (qtidadeDezoito / total);
    System.out.println("menores: " + decimalFormat.format(menores));
    double maiores = (qtidadeMaior49 / total);
    System.out.println("adultas: " + decimalFormat.format(maiores));
    double adultas = (qtidadeMaior49 / total);
    System.out.println("a partir de 50: " + decimalFormat.format(adultas));

    System.out.println("TOTAL: " + (int) total);

  }
}
