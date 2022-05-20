package com.trybe.acc.java.jogodasfazendas;

public class Triangle extends Polygon {

  public Triangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double medindoArea(double base, double height) {
    return (base * height) / 2;
  }

  @Override
  public double area() {
    return medindoArea(base, height);
  }



}
