package com.customtable.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String addr ;
	private String city ;
	private String pin ;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String addr, String city, String pin) {
	
		this.addr = addr;
		this.city = city;
		this.pin = pin;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addr, city, pin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(city, other.city) && Objects.equals(pin, other.pin);
	}
	
	
	
	
	

}
