package com.trybe.acc.java.anobissexto;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class AnoBissexto {
  public boolean identificarAnoBissexto(int ano) {
    Year anoBissexto = Year.of(ano);
    return anoBissexto.isLeap();
  }

  /**
   * Método identificar o próximo ano bissexto.
   */
  public int identificarProximoAnoBissexto(String data) {
    String dataBR = "dd/MM/yyyy";
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern(dataBR);
    LocalDate date = LocalDate.parse(data, formatarData);

    while (!date.isLeapYear()) {
      date = date.plusYears(1);
    }

    return date.getYear();
  }
}
