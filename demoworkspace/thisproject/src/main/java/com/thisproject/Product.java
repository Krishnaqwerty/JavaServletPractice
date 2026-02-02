package com.thisproject;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String id ;
	private String name ;
	private double price ;
	
	private List<Category> categories = new ArrayList<Category>();
	
	
	public Product() {
		
	}
	
	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	
	

}
