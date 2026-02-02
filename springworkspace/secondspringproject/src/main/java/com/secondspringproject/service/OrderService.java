package com.secondspringproject.service;

public class OrderService {
	
	private EmailService emailService ;

	public OrderService(EmailService emailService) {
		super();
		this.emailService = emailService;
	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	
	public void placeOrder() {
		
		System.out.println("Order Placed!");
		emailService.sendEmail();
		
	}
	
	

}
