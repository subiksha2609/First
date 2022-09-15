package com.subi.week5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	 private int id;
	 private int deptId;
	 private String name;
	 private int salary;

	 public Employee(int id, int deptId, String name, int salary) {
	  super();
	  this.id = id;
	  this.deptId = deptId;
	  this.name = name;
	  this.salary = salary;
	 }
	 public int getId() {
	  return id;
	 }
	 public String getName() {
	  return name;
	 }
	 public int getSalary() {
	  return salary;
	 }
	 public int getDeptId() {
	  return deptId;
	 }

	}

public class EmployeeStr {

	public static void main(String[] args) {
		int total=0;
		 List <Employee> employees = Arrays.asList(new Employee(1, 1000,"Chandra Shekhar", 6000),
				   new Employee(1, 1000, "Rajesh", 8000), 
				   new Employee(1, 1004,"Rahul", 9000), 
				   new Employee(1, 1001, "Suresh", 12000),
				   new Employee(1, 1004, "Satosh", 8500));
		 
		
		  total=employees.stream().mapToInt(Employee -> Employee.getSalary()).sum();
		  


		  System.out.println("Employee Salary Total  : "+total);
	}

}
