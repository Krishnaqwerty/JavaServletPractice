package com.secondspringproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.secondspringproject.service.EmailService;
import com.secondspringproject.service.GreetService;
import com.secondspringproject.service.OrderService;

@Configuration
@ComponentScan(basePackages = {"com.secondspringproject"})
public class SpringConfig {
	
	
	@Bean
	@Scope("singleton")
	public GreetService greetService() {
		return new GreetService();
	}
	
	
	
	@Bean
	@Scope("singleton")
	public EmailService emailService() {
		return new EmailService();
	}
	
	
	@Bean
	@Scope("singleton")
	public OrderService orderService() {
		return new OrderService(emailService());
	}
	
	

}
