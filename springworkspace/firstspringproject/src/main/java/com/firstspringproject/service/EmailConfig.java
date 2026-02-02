package com.firstspringproject.service;

public class EmailConfig {
	
	private String ip ;
	private String token ;
	
	
	
	public EmailConfig(String ip, String token) {
		super();
		this.ip = ip;
		this.token = token;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	

}
