package com.controle_frota.main;

import com.controle_frota.core.Caminhao;
import com.controle_frota.core.Carro;

public class Principal {

  public static void main(String[] args) {
    Carro c1 = new Carro("RTF 1234", 2018);
    Caminhao c2 = new Caminhao("RTF 656", 2015);

    c1.abastecer("Posto 1", "Kamila", 180);
    c1.abastecer("Posto 2", "Vanessa", 280);

    c2.abastecer(null, "Ribeiro", 210);

    c1.listaAbastecimentos();
    c2.listaAbastecimentos();

  }

}
