package com.trybe.conversorcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Conversor {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   */
  public static void main(String[] args) throws IOException {
    File pastaDeEntradas = new File("./entradas/");
    File pastaDeSaidas = new File("./saidas/");
    new Conversor().converterPasta(pastaDeEntradas, pastaDeSaidas);
  }

  /**
   * Converte todos os arquivos CSV da pasta de entradas. Os resultados são gerados na pasta de
   * saídas, deixando os arquivos originais inalterados.
   *
   * @param pastaDeEntradas Pasta contendo os arquivos CSV gerados pela página web.
   * @param pastaDeSaidas Pasta em que serão colocados os arquivos gerados no formato requerido pelo
   *        subsistema.
   *
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   */
  public void converterPasta(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    if (!pastaDeSaidas.exists()) {
      pastaDeSaidas.mkdir();

      for (File arquivo : pastaDeEntradas.listFiles()) {

        String separadores = pastaDeSaidas + File.separator + arquivo.getName();
        FileWriter escreverArquivo = new FileWriter(separadores);
        FileReader lerArquivo = new FileReader(arquivo);

        BufferedReader lerBuffered = new BufferedReader(lerArquivo);
        BufferedWriter escreverBuffered = new BufferedWriter(escreverArquivo);

        String cabecalho = "";
        String linhasDoArquivo = "";

        do {
          if (cabecalho.isEmpty()) {
            linhasDoArquivo = lerBuffered.readLine();
            cabecalho = linhasDoArquivo;
          } else {
            linhasDoArquivo = this.formatarLinha(linhasDoArquivo);
          }
          escreverBuffered.write(linhasDoArquivo);
          escreverBuffered.newLine();
          escreverBuffered.flush();
          linhasDoArquivo = lerBuffered.readLine();
        } while (linhasDoArquivo != null);
        lerArquivo.close();
        escreverArquivo.close();
        lerBuffered.close();
        escreverBuffered.close();
      }
    }

  }

  private String formatarLinha(String linhasDoArquivo) {
    String[] linha = linhasDoArquivo.split(",");
    FormataDados formataDados = new FormataDados(linha[0], linha[1], linha[3]);

    linha[0] = formataDados.getNomeCompleto();
    linha[1] = formataDados.getData();
    linha[3] = formataDados.getCpf();

    return String.join(",", linha);
  }
}
