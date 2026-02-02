package com.customtable.model;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
//@DiscriminatorValue("CARD")
public class CardPayment extends Payment {
	
	
	private String cardNo ;
	
	private String name ;
	
	private Date expiryDate ;
	
	public CardPayment() {
		// TODO Auto-generated constructor stub
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	

}
