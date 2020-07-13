package com.cch.pkm.designpattern.builderpattern;

public class ComputerElement {

  private String CPU;
  private String mainboard;
  private String memory;
  private String SSD;
  private String power;
  private String computerCase;

  public ComputerElement() {}

  public ComputerElement(
      String CPU, String mainboard, String memory, String SSD, String power, String computerCase) {
    this.CPU = CPU;
    this.mainboard = mainboard;
    this.memory = memory;
    this.SSD = SSD;
    this.power = power;
    this.computerCase = computerCase;
  }

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  public String getMainboard() {
    return mainboard;
  }

  public void setMainboard(String mainboard) {
    this.mainboard = mainboard;
  }

  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  public String getSSD() {
    return SSD;
  }

  public void setSSD(String SSD) {
    this.SSD = SSD;
  }

  public String getPower() {
    return power;
  }

  public void setPower(String power) {
    this.power = power;
  }

  public String getComputerCase() {
    return computerCase;
  }

  public void setComputerCase(String computerCase) {
    this.computerCase = computerCase;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Computer List: \n");
    sb.append("CPU: ").append(CPU).append("\n");
    sb.append("mainboard: ").append(mainboard).append("\n");
    sb.append("memory: ").append(memory).append("\n");
    sb.append("SSD: ").append(SSD).append("\n");
    sb.append("power: ").append(power).append("\n");
    sb.append("computer case: ").append(computerCase).append("\n");
    return sb.toString();
  }
}
