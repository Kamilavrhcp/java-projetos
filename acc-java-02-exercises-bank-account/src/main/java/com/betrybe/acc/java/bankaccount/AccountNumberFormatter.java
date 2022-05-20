package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String value = Integer.toString(literalAccountNumber);   
   
    if (value.length() > 6) {
      return StringUtils.right(value, 6);         
    } else if (value.length() < 6) {
      return StringUtils.leftPad(value, 6, '0');       
    } 
    return value;
  }    
}