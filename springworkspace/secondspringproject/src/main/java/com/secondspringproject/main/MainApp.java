package com.secondspringproject.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.secondspringproject.config.SpringConfig;
import com.secondspringproject.service.GreetService;
import com.secondspringproject.service.OrderService;

public class MainApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		OrderService os = container.getBean("orderService", OrderService.class);
		
		GreetService gs = container.getBean("greetService", GreetService.class);
		
		gs.greet();
		
		os.placeOrder();
		
		container.close();
		container.registerShutdownHook();
		
		
		
	}

}
