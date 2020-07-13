package com.cch.pkm.designpattern.prototypepattern;

public class Classroom implements Cloneable {

  private String classroom;

  public Classroom() {}

  public String getClassroom() {
    return classroom;
  }

  public void setClassroom(String classroom) {
    this.classroom = classroom;
  }

  @Override
  public String toString() {
    return "Classroom{" +
            "classroom='" + classroom + '\'' +
            '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
