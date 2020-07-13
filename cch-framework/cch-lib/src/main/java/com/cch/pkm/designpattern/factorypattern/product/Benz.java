package com.cch.pkm.designpattern.factorypattern.product;

public class Benz extends Car {

  @Override
  public void produce() {
    System.out.println("Benz producing...");
  }
}
