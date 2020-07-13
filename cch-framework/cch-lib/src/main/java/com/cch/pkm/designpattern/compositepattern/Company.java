package com.cch.pkm.designpattern.compositepattern;

import java.util.*;

public class Company extends EntityComponent {

  private String companyName;

  private List<EntityComponent> companies = new ArrayList<>();

  private Department department = new Department();

  // Subsidiary Companies
  private HashMap<Company, List<EntityComponent>> subCompanies = new HashMap();

  @Override
  void addEntityName(String companyName) {
    this.companyName = companyName;
  }

  @Override
  void addDepartment(EntityComponent department) {
    List<String> departments = this.department.getAllDepartment();
    EntityComponent currentDepartment = this.department;
    for (int i = 0; i < departments.size(); i++) {
      currentDepartment.departments.add(departments.get(i));
    }
  }

  @Override
  void addSubEntity(EntityComponent entity) {
    this.companies.add(entity);
    this.subCompanies.put(this, companies);
  }

  @Override
  String getEntityName() {
    return this.companyName;
  }

  @Override
  public Department getDepartment() {
    return department;
  }

  @Override
  void printEntity() {
    Set<Company> set = subCompanies.keySet();
    Iterator it = set.iterator();
    while (it.hasNext()) {
      Company company = (Company) it.next();
      // Parent Company
      System.out.println(company.companyName);
      List<String> departments = company.getDepartment().departments;
      // Parent Company Departmens
      for (int i = 0; i < departments.size(); i++) {
        String departmentName = departments.get(i);
        System.out.println(" |- " + departmentName);
      }
      // Subsidiary Company
      List<EntityComponent> subCompanyList = subCompanies.get(company);
      for (int i = 0; i < subCompanyList.size(); i++) {
        EntityComponent subCompany = subCompanyList.get(i);
        System.out.println(" |- " + subCompany.getEntityName());
        List<String> subDepartments = subCompany.getDepartment().departments;
        for (int j = 0; j < subDepartments.size(); j++) {
          System.out.println("  |- " + subDepartments.get(j));
        }
      }
    }
  }
}
