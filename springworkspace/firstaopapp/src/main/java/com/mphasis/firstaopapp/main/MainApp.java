package com.mphasis.firstaopapp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.firstaopapp.config.SpringConfig;
import com.mphasis.firstaopapp.service.DiscountService;
import com.mphasis.firstaopapp.service.OrderService;
import com.mphasis.firstaopapp.service.TaxService;

public class MainApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		OrderService os = container.getBean("orderService", OrderService.class);
		
		TaxService ts = container.getBean("taxService", TaxService.class);
		
		DiscountService ds = container.getBean("discountService", DiscountService.class);
		
		
		os.placeOrder();
		ds.computeDiscount();
		ts.computeTax();
		container.close();
		container.registerShutdownHook();
		
	}

}
