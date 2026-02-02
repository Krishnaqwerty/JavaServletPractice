package com.thisproject;

public class Employee {
	
	private String empid;
	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Employee(String empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	private String name;
	private Department department;
	
	
	public Employee() {
		
	}

}
