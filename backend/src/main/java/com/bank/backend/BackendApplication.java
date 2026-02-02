package com.bank.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bank.backend.model.UserCred;
import com.bank.backend.repo.UserCredRepository;
import com.bank.backend.service.GreetService;

@SpringBootApplication
public class BackendApplication {
	
	@Autowired
	private GreetService gs ;
	
	@Autowired
	private UserCredRepository ucr ;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return (args) -> {
			System.out.println(gs.greet() + " Hello");
			
			for(UserCred user : ucr.customQuery("na")) {
				
					System.out.println(user.getPassword() + " , " + user.getUsername());
			
			}
		};
	}

}
