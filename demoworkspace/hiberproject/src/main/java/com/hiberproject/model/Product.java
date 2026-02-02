package com.hiberproject.model;

import java.util.Objects;

import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
@NamedQuery(name = "allproducts", query = "FROM Product")
public class Product {
	@Id
	@Column(name="code", length = 20)
	private String code ;
	@Column(name="name", length = 20)
	private String name ;
	private int price ;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String code, String name, int price) {
		
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(code, other.code);
	}
	
	
	
	
	
	

}
