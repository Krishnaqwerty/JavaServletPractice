package com.firstspringproject.service;

public class GreetService {
	
	
	public void init() {
		System.out.println("in init method od GreetService...");
	}
	
	public String greet() {
		return "Hello !!" ;
	}
	

	public void destroy() {
		System.out.println("in destroy method od GreetService...");
	}

}
