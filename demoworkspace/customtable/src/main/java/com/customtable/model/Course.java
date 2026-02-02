package com.customtable.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	
	
	@Id
	@Column(name = "id", length = 5)
	private String id ;
	
	@Column(name = "name", length = 20)
	private String name ;
	
	@ManyToMany(mappedBy = "courses", cascade = CascadeType.PERSIST)
	private List<Participant> participants = new ArrayList<Participant>();
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String id, String name) {
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
	
	
	public void addParticipant(Participant p) {
		participants.add(p);
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
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
