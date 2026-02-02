package com.customtable.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
//@DiscriminatorValue("UPI")
public class UPIPayment extends Payment {
	
	private String upid ;
	private String paymentapp ;
	
	
	
	
	public UPIPayment() {
		// TODO Auto-generated constructor stub
	}




	public String getUpid() {
		return upid;
	}




	public void setUpid(String upid) {
		this.upid = upid;
	}




	public String getPaymentapp() {
		return paymentapp;
	}




	public void setPaymentapp(String paymentapp) {
		this.paymentapp = paymentapp;
	}

	
	
	


	
	

}
