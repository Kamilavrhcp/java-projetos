package com.trybe.contabancaria;

/**
 * Classe ContaBancaria.
 **/

public class ContaBancaria {

  /**
   * Atributos.
   **/
  
  private int saldo;
  Cliente cliente = new Cliente();    
  
  /**
   * Métodos.
   **/
  
  public int getSaldo() {
    return saldo;
  }
  
  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }
  
  public String getNomeCliente() {
    return cliente.getNome();
  }
  
  public void setNomeCliente(String nome) {
    cliente.setNome(nome);  
  }    
  
  public String getCpfCliente() {
    return cliente.getCpf();
  }
  
  public void setCpfCliente(String cpf) {
    cliente.setCpf(cpf);
  }
  
  public int depositar(int valor) {
    this.saldo += valor;
    return saldo;
  }
  
  public int sacar(int valor) {
    this.saldo -= valor;
    return saldo;
  }
  
  public int verSaldo() {
    return this.saldo;    
  }
  
}
