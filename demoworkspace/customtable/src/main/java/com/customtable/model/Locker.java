package com.customtable.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lockers")
public class Locker {
	
	@Id
	@Column(name = "id", length = 5)
	private String id ;
	@Column(name = "location", length = 30)
	private String location ;
	

	public Locker() {
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Locker(String id, String location) {
		super();
		this.id = id;
		this.location = location;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, location);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locker other = (Locker) obj;
		return Objects.equals(id, other.id) && Objects.equals(location, other.location);
	}
	
	
	

}
