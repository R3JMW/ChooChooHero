package com.cch.pkm.designpattern.prototypepattern;

public class Test {

  public static void main(String[] args) throws CloneNotSupportedException {
    Classroom classroom = new Classroom();
    classroom.setClassroom("3-7");

    Student studentA = new Student();
    studentA.setName("Dave");
    studentA.setAge(12);
    studentA.setClassroom(classroom);

    Student studentB = (Student) studentA.clone();
    Student studentC = (Student) studentA.clone();

    System.out.println(studentA.toString());
    System.out.println(studentB.toString());
    System.out.println(studentC.toString());

    studentB.getClassroom().setClassroom("3-12");

    System.out.println(studentA.toString());
    System.out.println(studentB.toString());
    System.out.println(studentC.toString());
  }
}
