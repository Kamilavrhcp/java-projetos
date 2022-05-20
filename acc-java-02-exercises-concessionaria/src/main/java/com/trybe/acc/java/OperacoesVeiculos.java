package com.trybe.acc.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacoesVeiculos {
  public <T> int numVeiculosDiferentesVendidos(Stream<T> veiculosVendidos) {
    int veiculosDiferentes = (int) veiculosVendidos.distinct().count();
    return veiculosDiferentes;
  }

  public <T> Stream<String> obterRepresentacao(Stream<T> veiculos) {
    return veiculos.map(veiculo -> veiculo.toString());
  }

  public <T> List<T> obterLista(Stream<T> veiculos) {
    return veiculos.collect(Collectors.toList());
  }
}
