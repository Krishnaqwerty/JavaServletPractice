package com.firstspringproject.service;

public class OrderService {
	
	private EmailService esp ;
	
	
	
	public EmailService getEsp() {
		return esp;
	}

	
	public OrderService() {
		// TODO Auto-generated constructor stub
	}

	public OrderService(EmailService esp) {
		
		this.esp = esp;
	}



	public void setEsp(EmailService esp) {
		this.esp = esp;
	} 
	



	public void placeOrder() {
		
		System.out.println("Order Placed !");
		
		esp.sendEmail();
		
	}

}
