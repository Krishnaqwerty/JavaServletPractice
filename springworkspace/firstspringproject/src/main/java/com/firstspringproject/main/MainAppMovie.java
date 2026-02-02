package com.firstspringproject.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firstspringproject.service.MovieBookingService;

public class MainAppMovie {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
				
				MovieBookingService ms = container.getBean("movieBookingService", MovieBookingService.class);
				
				ms.bookTicket(5);
				
				container.close();
				
				container.registerShutdownHook();
				
				
			}

}
