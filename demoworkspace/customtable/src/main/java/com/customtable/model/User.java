package com.customtable.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@Column(name = "id", length = 5)
	private String id ;
	@Column(name = "name", length = 20)
	private String name ;
	@Embedded
	private Address address ;


	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	


	public User(String id, String name) {
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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
