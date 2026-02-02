package com.springwebapp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean check(String username, String password) {
		if(username.equals("krishna") && password.equals("kumar")) {
			return true ;
		}
		
		return false ;
	}

}
