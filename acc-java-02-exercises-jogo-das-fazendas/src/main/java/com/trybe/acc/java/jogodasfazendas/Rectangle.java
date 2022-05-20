package com.trybe.acc.java.jogodasfazendas;

public class Rectangle extends Polygon {

  public Rectangle(double base, double height) {
    super(base, height);

  }

  @Override
  public double medindoArea(double base, double height) {
    return base * height;
  }

  @Override
  public double area() {
    return medindoArea(base, height);
  }
}
