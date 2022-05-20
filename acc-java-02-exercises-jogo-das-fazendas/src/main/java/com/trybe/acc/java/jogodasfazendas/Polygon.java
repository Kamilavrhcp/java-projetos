package com.trybe.acc.java.jogodasfazendas;


public abstract class Polygon implements Farm {
  protected double base;
  protected double height;


  public Polygon(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public abstract double medindoArea(double base, double height);

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }


}
