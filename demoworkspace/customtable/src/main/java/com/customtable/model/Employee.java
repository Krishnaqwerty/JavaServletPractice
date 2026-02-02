package com.customtable.model;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@Column(name = "id", length = 5)
	private String id ;
	
	@Column(name = "name", length = 20)
	private String name ;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Department department ;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public Employee(String id, String name, Department department) {
		
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	

}
