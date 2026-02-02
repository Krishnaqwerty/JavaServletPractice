package com.thisproject;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	
	private String id ;
	private String name ;
	private List<Product> products = new ArrayList<Product>();
	
	
	
	
	public Category() {
		
	}
	
	
	public Category(String id, String name) {
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


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	
	

}
