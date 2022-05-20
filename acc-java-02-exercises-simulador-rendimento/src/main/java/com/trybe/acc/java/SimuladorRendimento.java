package com.trybe.acc.java;

import java.time.LocalDate;

public class SimuladorRendimento {
  /**
   * Metódo para simular os rendimentos em anos.
   */
  public int simularRendimentoAnos(double montanteInicial, double valorObjetivo) {
    int anos = 0;
    double rendimentoAnual = 0.1 + 1;
    double rendimentos = montanteInicial;

    while (rendimentos <= valorObjetivo) {
      rendimentos = rendimentos * rendimentoAnual;
      anos += 1;    
    }    
 
    return LocalDate.now().plusYears(anos).getYear();

  }
  
  /**
   * Método principal. 
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo 
            + " no ano " + obj.simularRendimentoAnos(inicial, objetivo));
  }
}
