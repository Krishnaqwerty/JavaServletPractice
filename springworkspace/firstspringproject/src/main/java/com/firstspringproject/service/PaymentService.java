package com.firstspringproject.service;

import org.springframework.stereotype.Service;

@Service("paymentService")
public class PaymentService {
	
	public void pay() {
		System.out.println("Payment Processed !");
	}

}
