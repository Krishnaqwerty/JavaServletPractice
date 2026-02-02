package com.customtable.main;

import com.customtable.dao.EmployeeDAO;
import com.customtable.model.Department;
import com.customtable.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		save(employeeDAO);
		
		
		String id = "E1" ;
		
		read(employeeDAO, id);
		
		
		

	}

	private static void read(EmployeeDAO employeeDAO, String id) {
		Employee emp = employeeDAO.finByID(id);
		
		System.out.println(emp.getId() + " , " + emp.getDepartment().getId());
	}

	private static void save(EmployeeDAO employeeDAO) {
		Employee employee = new Employee("E1", "Krishna");
		Department department = new Department("D1", "Mobile Apps");
		employee.setDepartment(department);
		
		Employee emp = employeeDAO.save(employee);
		
		System.out.println(emp.getName());
	}

}
