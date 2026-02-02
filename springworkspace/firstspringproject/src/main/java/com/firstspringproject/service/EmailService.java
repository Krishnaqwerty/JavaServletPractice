package com.firstspringproject.service;

public class EmailService {
	
	private EmailConfig info ;
	
	
	
	
	public EmailConfig getInfo() {
		return info;
	}




	public void setInfo(EmailConfig info) {
		this.info = info;
	}


	
	public EmailService() {
		// TODO Auto-generated constructor stub
	}


	public EmailService(EmailConfig info) {
		
		this.info = info;
	}




	public void sendEmail() {
		System.out.println("Email Sent To " + info.getIp() + " @" + info.getToken());
	}
	
	
	

}
