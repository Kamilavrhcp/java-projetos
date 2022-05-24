package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {

  /**
   * Atributos.
   **/

  /**
   * Métodos que validam cpf.
   **/
  public static boolean validarCpf(String cpf) {
    String[] cpfSplit = cpf.split("");
    int primeiroDv = 0;
    int segundoDv = 0;
    int multDez = 10;
    int multOnze = 11;

    // primeiroDV
    for (int i = 0; i < 9; i++) {
      primeiroDv += (Integer.parseInt(cpfSplit[i]) * multDez);
      multDez -= 1;
    }


    primeiroDv = 11 - (primeiroDv % 11);
    System.out.println(primeiroDv);

    // segundoDv
    for (int i = 0; i < 10; i++) {
      segundoDv += (Integer.parseInt(cpfSplit[i]) * multOnze);
      multOnze -= 1;
    }

    segundoDv = 11 - (segundoDv % 11);

    if (primeiroDv == Integer.parseInt(cpfSplit[9])
        && (segundoDv == Integer.parseInt(cpfSplit[10]))) {
      return true;
    } else {
      return false;
    }
  }
}
