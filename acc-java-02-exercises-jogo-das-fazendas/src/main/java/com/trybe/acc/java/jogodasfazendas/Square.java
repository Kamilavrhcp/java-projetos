package com.trybe.acc.java.jogodasfazendas;

public class Square implements Farm {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return this.side * this.side;
  }

}
