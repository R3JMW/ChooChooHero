package com.cch.pkm.designpattern.compositepattern;

import java.util.List;

public class Department extends EntityComponent {

  @Override
  void addDepartmentName(String department) {
    this.departments.add(department);
  }

  @Override
  List<String> getAllDepartment() {
    return this.departments;
  }
}
