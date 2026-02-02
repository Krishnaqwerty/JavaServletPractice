package com.customtable.model;

import java.util.Objects;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;





@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "ptype", length = 5)
//@DiscriminatorValue("CASH")
public class Payment {

	@Id
	private String id ;
	
	private int amount ;
	
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public String getId() {
		return id;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}




	public Payment(String id, int amount) {
		
		this.id = id;
		this.amount = amount;
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
		Payment other = (Payment) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
}
