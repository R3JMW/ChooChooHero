package com.cch.pkm.designpattern.builderpattern;

public class ComputerBuilderImpl implements ComputerBuilder {

  private ComputerElement ce = new ComputerElement();

  @Override
  public ComputerBuilder CPU(String CPU) {
    this.ce.setCPU(CPU);
    return this;
  }

  @Override
  public ComputerBuilder mainboard(String mainboard) {
    this.ce.setMainboard(mainboard);
    return this;
  }

  @Override
  public ComputerBuilder memory(String memory) {
    this.ce.setMemory(memory);
    return this;
  }

  @Override
  public ComputerBuilder SSD(String SSD) {
    this.ce.setSSD(SSD);
    return this;
  }

  @Override
  public ComputerBuilder power(String power) {
    this.ce.setPower(power);
    return this;
  }

  @Override
  public ComputerBuilder computerCase(String computerCase) {
    this.ce.setComputerCase(computerCase);
    return this;
  }

  @Override
  public ComputerElement build() {
    return this.ce;
  }
}
