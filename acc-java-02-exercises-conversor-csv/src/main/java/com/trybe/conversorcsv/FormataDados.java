package com.trybe.conversorcsv;

public class FormataDados {
  private String nomeCompleto;
  private String data;
  private String cpf;


  /**
   * Método para formatar os dados de nome, data e cpf.
   * 
   * @param nomeCompleto - recebe nome completo;
   * @param cpf - recebe cpf;
   */
  public FormataDados(String nomeCompleto, String data, String cpf) {
    super();
    this.nomeCompleto = nomeCompleto;
    this.data = data;
    this.cpf = cpf;
  }


  public String getNomeCompleto() {
    return nomeCompleto.toUpperCase();
  }


  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }


  public String getData() {
    String[] dataSplit = data.split("/");
    return String.join("-", dataSplit[2], dataSplit[1], dataSplit[0]);
  }


  public void setData(String data) {
    this.data = data;
  }


  /**
   * Método para formatar o CPF utilizando substring.
   * 
   * @return
   */
  public String getCpf() {
    String cpfSubstring = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
        + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    return cpfSubstring;
  }


  public void setCpf(String cpf) {
    this.cpf = cpf;
  }



}
