package com.firstspringproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("movieBookingService")
public class MovieBookingService {
	@Autowired
	private PaymentService paymentService;
	
	public void bookTicket(int n) {
		paymentService.pay();
		System.out.println("Tickets booked..." + n);
	}

}
