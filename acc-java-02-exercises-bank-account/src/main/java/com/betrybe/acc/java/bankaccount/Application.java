package com.betrybe.acc.java.bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner pessoaUsuaria =  new Scanner(System.in);
    AccountNumberFormatter formataNumero = new AccountNumberFormatter();
    
    try {
      System.out.println("Por favor, digite a sua conta!");
      int conta = pessoaUsuaria.nextInt();
      
      String format = formataNumero.formatAccountNumber(conta); 
      System.out.println("Numero da conta: " + format);      
    } catch (InputMismatchException e) {
      System.out.println("Número da conta inválido!");
    }
    
  }

}
