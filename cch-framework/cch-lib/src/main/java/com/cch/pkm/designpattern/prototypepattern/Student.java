package com.cch.pkm.designpattern.prototypepattern;

public class Student implements Cloneable {

  private String name;
  private Integer age;
  private Classroom classroom;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Classroom getClassroom() {
    return classroom;
  }

  public void setClassroom(Classroom classroom) {
    this.classroom = classroom;
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", age=" + age + ", classroom=" + classroom + '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Student student = (Student) super.clone();
    student.setClassroom((Classroom) student.classroom.clone());
    return student;
  }
}
