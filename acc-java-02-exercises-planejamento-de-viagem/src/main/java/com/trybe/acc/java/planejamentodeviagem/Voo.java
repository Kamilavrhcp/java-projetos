package com.trybe.acc.java.planejamentodeviagem;

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;

    this.tempoVoo = (int) Math.round(duracaoDouble);
    return tempoVoo;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {

    return "Seu embarque será em: " + embarque + "\n" + "A origem da sua viagem: " + origem + "\n"
        + "Seu desembarque será em: " + desembarque + "\n" + "O seu destino é em: " + destino;
  }
}
