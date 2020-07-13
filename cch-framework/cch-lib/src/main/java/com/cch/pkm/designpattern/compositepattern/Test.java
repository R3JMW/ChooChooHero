package com.cch.pkm.designpattern.compositepattern;

public class Test {

  public static void main(String[] args) {
    EntityComponent department = new Department();
    department.addDepartmentName("DMS");
    department.addDepartmentName("PS");
    department.addDepartmentName("HR");

    EntityComponent companyDL = new Company();
    companyDL.addEntityName("Kingland System DL");
    companyDL.addDepartment(department);
    companyDL.getDepartment().addDepartmentName("Intern Bootcamp");
    companyDL.getDepartment().addDepartmentName("Kroger");
    companyDL.getDepartment().addDepartmentName("Indy");
    companyDL.getDepartment().addDepartmentName("EHM");
    companyDL.getDepartment().addDepartmentName("MFPS");

    EntityComponent companyCL = new Company();
    companyCL.addEntityName("Kingland System");
    companyCL.addSubEntity(companyDL);
    companyCL.getDepartment().addDepartmentName("TA");
    companyCL.getDepartment().addDepartmentName("CAT");

    companyCL.printEntity();
  }
}
