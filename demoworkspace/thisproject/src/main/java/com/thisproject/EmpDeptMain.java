package com.thisproject;

public class EmpDeptMain {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("E1", "Tom");
		Employee e2 = new Employee("E1", "Tom");
		
		Department d = new Department("D1", "Sales");
		
		e1.setDepartment(d);
		e2.setDepartment(d);
		
		
		d.addEmployee(e1);
		d.addEmployee(e2);
		
//		System.out.println(e1.getEmpid() + " , " + e1.getName() + " , " + e1.getDepartment().getName());
//		System.out.println(e2.getEmpid() + " , " + e2.getName() + " , " + e2.getDepartment().getName());
		
		for(Employee e : d.getEmployees()) {
				System.out.println(d.getName() + " , "+ e.getEmpid() + " , " + e.getName());
		}
		
		
	}
	

}
