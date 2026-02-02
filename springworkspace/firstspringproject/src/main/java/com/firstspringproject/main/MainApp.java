package com.firstspringproject.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firstspringproject.service.GreetService;
import com.firstspringproject.service.OrderService;




public class MainApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		
		GreetService greetService = container.getBean("greetService", GreetService.class);
		
		String res = greetService.greet();
		System.out.println(res);
		
		
		OrderService po = container.getBean("orderService",OrderService.class);
		
		po.placeOrder();
		
		container.close();
		
		container.registerShutdownHook();
		
	}

}
