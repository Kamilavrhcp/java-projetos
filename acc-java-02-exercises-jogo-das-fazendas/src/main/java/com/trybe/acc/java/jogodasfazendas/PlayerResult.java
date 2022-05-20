package com.trybe.acc.java.jogodasfazendas;

/**
 * Método para calcular resultados dos jogadores.
 * 
 * @author Kamila.
 *
 */
public class PlayerResult {
  private String playerName;
  private Farm[] farms;


  /*
   * Construtor.
   */
  public PlayerResult(String playerName, Farm[] farms) {
    this.playerName = playerName;
    this.farms = farms;
  }

  /**
   * Retorna o resultado de pontos.
   * 
   * @return a soma dos pontos da fazenda.
   */
  public double score() {
    double result = 0;

    for (Farm fazenda : farms) {
      result += fazenda.area();
    }
    return result;
  }

  /*
   * Método para mostrar resultados.
   */
  public String toString() {
    return "O player fazendeiro que ganhou é " + this.playerName + " com a quantidade de pontos "
        + this.score();
  }


}
