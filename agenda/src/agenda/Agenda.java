package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
  private File arquivoBancoDados;
  private List<Contato> contatos;

  public Agenda() {
    this.contatos = new ArrayList<Contato>();
    this.arquivoBancoDados = new File("c:\\trybe\\banco.txt");
  }

  public void adicionarContatos(Contato contato) {
    try {
      FileWriter escritorArquivo = null;
      BufferedWriter bufferedEscritor = null;

      if (!this.arquivoBancoDados.exists()) {
        arquivoBancoDados.createNewFile();
      }

      escritorArquivo = new FileWriter(arquivoBancoDados, true); // caso o arquivo não exista,
      bufferedEscritor = new BufferedWriter(escritorArquivo); // será criado

      bufferedEscritor.write(contato.toString());
      bufferedEscritor.newLine();
      bufferedEscritor.flush();

      escritorArquivo.close();
      bufferedEscritor.close();

      this.contatos.add(contato);
      System.out.println("Contato adicionado com sucesso!");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void exibirContato() {
    try {
      FileReader leitorArquivo = null;
      BufferedReader bufferedLeitor = null;

      if (arquivoBancoDados.exists()) {
        leitorArquivo = new FileReader(arquivoBancoDados);
        bufferedLeitor = new BufferedReader(leitorArquivo);

        String conteudoLinha = bufferedLeitor.readLine();

        while (conteudoLinha != null) {
          System.out.println(conteudoLinha);
          conteudoLinha = bufferedLeitor.readLine();
        }

        leitorArquivo.close();
        bufferedLeitor.close();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
