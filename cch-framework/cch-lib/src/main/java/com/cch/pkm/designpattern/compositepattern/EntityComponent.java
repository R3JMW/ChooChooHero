package com.cch.pkm.designpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityComponent {

  // Department Name List
  public List<String> departments = new ArrayList<>();

  // Handle Methods

  // Add EntityName
  void addEntityName(String entityName) {
    throw new UnsupportedOperationException("Add Entity Name Operation is NOT supported.");
  }

  // Add Department Name
  void addDepartmentName(String departmentName) {
    throw new UnsupportedOperationException("Add Department Name Operation is NOT supported.");
  }

  // Add Entity
  void addEntity(EntityComponent entity) {
    throw new UnsupportedOperationException("Add Entity Operation is NOT supported.");
  }

  // Add Subsidiary Entity
  void addSubEntity(EntityComponent subEntity) {
    throw new UnsupportedOperationException("Add Subsidiary Entity Operation is NOT supported.");
  }

  // Add Department
  void addDepartment(EntityComponent department) {
    throw new UnsupportedOperationException("Add Department Operation is NOT supported.");
  }

  String getEntityName() {
    throw new UnsupportedOperationException("Get All Entity Operation is NOT supported.");
  }

  List<String> getAllEntity() {
    throw new UnsupportedOperationException("Get All Entity Operation is NOT supported.");
  }

  EntityComponent getDepartment() {
    throw new UnsupportedOperationException("Get Department Operation is NOT supported.");
  }

  List<String> getAllDepartment() {
    throw new UnsupportedOperationException("Get All Department Operation is NOT supported.");
  }

  void printEntity() {
    throw new UnsupportedOperationException("Print Entity Operation is NOT supported.");
  }
}
