package com.customtable.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "participants")
public class Participant {
	
	
	@Id
	@Column(name = "id", length = 5)
	private String id ;
	
	@Column(name = "name", length = 20)
	private String name ;
	
	
	@ManyToMany
	@JoinTable(
			
					
					name = "participant_course",
					
					joinColumns = @JoinColumn(name = "participant_id"),
					inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> courses = new ArrayList<Course>();
	
	
	
	
	
	public Participant() {
		// TODO Auto-generated constructor stub
	}



	public Participant(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	
	
	
	public void addCourses(Course c) {
		courses.add(c);
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
		Participant other = (Participant) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
