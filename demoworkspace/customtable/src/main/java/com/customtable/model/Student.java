package com.customtable.model;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@Column(name = "id", length = 5)
	private String id;
	@Column(name = "name", length = 20)
	private String name;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Locker locker ;
	

	public Student() {
		
		
		
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


	public Locker getLocker() {
		return locker;
	}


	public void setLocker(Locker locker) {
		this.locker = locker;
	}


	public Student(String id, String name, Locker locker) {
		super();
		this.id = id;
		this.name = name;
		this.locker = locker;
	}


	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, locker, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(locker, other.locker) && Objects.equals(name, other.name);
	}
	
	
	
	

}
