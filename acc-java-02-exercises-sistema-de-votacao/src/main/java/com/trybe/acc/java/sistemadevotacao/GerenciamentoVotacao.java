package com.trybe.acc.java.sistemadevotacao;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Gerenciamento da votação.
 * 
 * @author Kamila.
 *
 */

public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfComputado = new ArrayList<String>();
  private int totalVotos = 0;


  /**
   * Método cadastrar candidatos.
   * 
   * @param nome - nome de uma pessoa candidata.
   * @param numero - número que fará referência ao candidato.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    boolean existeNumero = true;

    for (int i = 0; i < pessoasCandidatas.size(); i++) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
        existeNumero = false;
      }
    }

    if (existeNumero) {
      PessoaCandidata pc = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(pc);
    }

  }

  /**
   * Método utilizado para cadastrar eleitores.
   * 
   * @param nome - nome de uma pessoa eleitora.
   * @param cpf - número do cpf do eleitor.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    boolean existeNumero = true;

    for (int i = 0; i < pessoasEleitoras.size(); i++) {
      if (pessoasEleitoras.get(i).getCpf().compareTo(cpf) == 0) {
        System.out.println("Pessoa eleitora já cadastrada!");
        existeNumero = false;
      }
    }

    if (existeNumero) {
      PessoaEleitora pe = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(pe);
    }
  }

  /**
   * Gerenciar a votação.
   * 
   * @param cpfPessoaEleitora - cpf do eleitor.
   * @param numeroPessoaCandidata - número do candodato.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    boolean existeNumero = true;

    for (int i = 0; i < cpfComputado.size(); i++) {
      if (cpfComputado.get(i).compareTo(cpfPessoaEleitora) == 0) {
        existeNumero = false;
        System.out.println("Pessoa eleitora já votou!");
      }
    }

    if (existeNumero) {
      for (int l = 0; l < pessoasCandidatas.size(); l++) {
        if (pessoasCandidatas.get(l).getNumero() == numeroPessoaCandidata) {
          pessoasCandidatas.get(l).receberVoto();
          cpfComputado.add(cpfPessoaEleitora);
          totalVotos += 1;
        }
      }
    }
  }

  /**
   * Mostrar o relatório da votação.
   */
  public void mostrarResultado() {
    DecimalFormat decimalFormat = new DecimalFormat("#0.0#%");
    float votos;

    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata pessoa : pessoasCandidatas) {
        votos = pessoa.getVotos();
        System.out.println("Nome: " + pessoa.getNome() + " - " + pessoa.getVotos() + " votos ( "
            + decimalFormat.format(votos / (float) totalVotos) + " )");
      }
      System.out.println("Total de votos: " + totalVotos);
    }

  }
}
