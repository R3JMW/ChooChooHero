package com.cch.pkm.designpattern.builderpattern;

public interface ComputerBuilder {
  ComputerBuilder CPU(String CPU);

  ComputerBuilder mainboard(String mainboard);

  ComputerBuilder memory(String memory);

  ComputerBuilder SSD(String SSD);

  ComputerBuilder power(String power);

  ComputerBuilder computerCase(String computerCase);

  ComputerElement build();
}
