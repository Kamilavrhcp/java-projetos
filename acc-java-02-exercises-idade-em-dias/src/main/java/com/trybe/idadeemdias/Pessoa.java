package com.trybe.idadeemdias;

public class Pessoa {
  public int calcularIdadeEmDias(int anos, int meses, int dias) {
    // int diasAnos = 365 * anos;
    // int diasMeses = 30 * meses;
    int quantidadeTotalDias = (anos * 365) + (meses * 30) + dias;
    return quantidadeTotalDias;
  }

}
