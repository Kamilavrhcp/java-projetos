package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;


public class Principal {

  /**
   * Método principal.
   *
   * @param args - Início do sistema.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao instanciaGerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    short opcao = 0;

    do {

      System.out.println("Cadastrar pessoa candidata?\n" + "        1 - Sim\n" + "        2 - Não\n"
          + "        Entre com o número correspondente à opção desejada:");

      String opcaoDeEntrada = scanner.next();
      opcao = Short.parseShort(opcaoDeEntrada);

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomeCandidata = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        short numeroCandidata = scanner.nextShort();

        instanciaGerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidata, numeroCandidata);
      }

    } while (opcao != 2);
    do {
      System.out.println("Cadastrar pessoa eleitora?\n" + "     1 - Sim\n" + "     2 - Não\n"
          + "     Entre com o número correspondente à opção desejada:");

      String opcaoDeEntrada = scanner.next();
      opcao = Short.parseShort(opcaoDeEntrada);

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomeEleitora = scanner.next();

        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfEleitora = scanner.next();

        instanciaGerenciamentoVotacao.cadastrarPessoaEleitora(nomeEleitora, cpfEleitora);
      }

    } while (opcao != 2);
    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "     1 - Votar\n" + "     2 - Resultado Parcial\n" + "     3 - Finalizar Votação");

      String opcaoDeEntrada = scanner.next();
      opcao = Short.parseShort(opcaoDeEntrada);

      if (opcao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfEleitora = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int numeroCandidata = scanner.nextInt();

        instanciaGerenciamentoVotacao.votar(cpfEleitora, numeroCandidata);
      } else if (opcao == 2) {
        instanciaGerenciamentoVotacao.mostrarResultado();
      } else if (opcao == 3) {
        instanciaGerenciamentoVotacao.mostrarResultado();
      }

    } while (opcao != 3);
  }

}
