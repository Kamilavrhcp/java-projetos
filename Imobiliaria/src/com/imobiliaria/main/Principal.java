package com.imobiliaria.main;

import java.time.LocalDate;
import com.imobiliaria.classes.Aluguel;
import com.imobiliaria.classes.Venda;

public class Principal {

  public static void main(String[] args) {
    Aluguel apto1 = new Aluguel("Rua Lamartine Babo, 32", LocalDate.now(), 1800);

    System.out.println("Endereço: " + apto1.getEndereco());
    System.out.println("Valor aluguel: " + apto1.getValorAluguel());

    Venda apto2 = new Venda("Rua Lam, 123", LocalDate.now(), 65656);
    System.out.println("Endereço: " + apto2.getEndereco());
    System.out.println("Valor aluguel: " + apto2.getValorVenda());

    apto1.ativarCadastro();

    apto1.alugar();

    System.out.println(apto1.isAlugado());

  }
}
