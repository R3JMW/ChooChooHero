package com.cch.pkm.designpattern.builderpattern;

public class Test {

  public static void main(String[] args) {
    ComputerDirector cd = new ComputerDirector();
    System.out.println(
        cd.build(
            "Intel i9 9900K",
            "AUS 8310z Gaming",
            "Kingston 16G x2 Hacker",
            "Samsung 512G 970 avo",
            "Corsair Gamming"));
  }
}
