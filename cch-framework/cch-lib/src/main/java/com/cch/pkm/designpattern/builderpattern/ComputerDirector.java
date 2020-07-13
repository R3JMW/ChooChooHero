package com.cch.pkm.designpattern.builderpattern;

public class ComputerDirector {

  private ComputerBuilder computerBuilder = new ComputerBuilderImpl();

  public ComputerElement build(
      String CPU, String mainboard, String memory, String SSD, String computerCase) {
    return this.computerBuilder
        .CPU(CPU)
        .mainboard(mainboard)
        .memory(memory)
        .SSD(SSD)
        .computerCase(computerCase)
        .build();
  }
}
