package com.thisproject;

public class ProductCategoryMain {
	
	public static void main(String[] args) {
		
		Category c = new Category("c1", "Computer Accessories");
		
		Product p1 = new Product("P1", "Mouse", 500);
		p1.getCategories().add(c);
		

		Product p2 = new Product("P2", "Mouse", 500);
		p1.getCategories().add(c);
		
		c.getProducts().add(p1);
		c.getProducts().add(p2);
		
		
	}

}
