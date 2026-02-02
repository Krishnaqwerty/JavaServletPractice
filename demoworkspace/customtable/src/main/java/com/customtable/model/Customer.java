package com.customtable.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;



@Entity
@Table(name = "shop_customers", 

		indexes = {
				@Index(name = "idx_phonenumber", columnList = "phonenumber")
		}
		
		)
public class Customer {
	
	@Id
	private Long CustomerId ;
	
	@Column(name = "email", length = 60 , unique = true)
	private String email ;
	
	@Column(name = "fullname", length = 30 )
	private String fullname ;
	
	@Column(name = "phonenumber", length = 40 )
	private String phonenumber ;
	
	private LocalDate registrationDate ;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(Long customerId, String email, String fullname, String phonenumber, LocalDate registrationDate) {
		super();
		CustomerId = customerId;
		this.email = email;
		this.fullname = fullname;
		this.phonenumber = phonenumber;
		this.registrationDate = registrationDate;
	}


	public Long getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}


	@Override
	public int hashCode() {
		return Objects.hash(CustomerId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(CustomerId, other.CustomerId);
	}
	
	
	

}
