package com.firstspringproject.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firstspringproject.model.Product;


public class MainAppProduct {
	
	public static void main(String[] args) {
		
ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Product p = container.getBean("product", Product.class);
		
		
		
		System.out.println(p.getId() +  " , " + p.getName() + " , " + p.getPrice() + " , " + p.getColorVariants() ) ;
		
		p.setPrice(5000);
		
		System.out.println(p.getId() +  " , " + p.getName() + " , " + p.getPrice() + " , " + p.getColorVariants() ) ;
		
		container.close();
		
		container.registerShutdownHook();
		
		
	}

}
