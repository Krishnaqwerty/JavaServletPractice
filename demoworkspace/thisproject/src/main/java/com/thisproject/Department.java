package com.thisproject;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	
	private String did;
	private String name;
	private List<Employee> employees = new ArrayList<Employee>() ;
	
	
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department(String did, String name) {
		super();
		this.did = did;
		this.name = name;
	}
	
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public void removeEmployee(Employee e) {
		employees.remove(e);
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	

}
