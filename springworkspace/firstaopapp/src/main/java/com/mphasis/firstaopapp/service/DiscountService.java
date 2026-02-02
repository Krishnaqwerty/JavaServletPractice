package com.mphasis.firstaopapp.service;

import org.springframework.stereotype.Service;

@Service("discountService")
public class DiscountService {
	
	public void computeDiscount() {
		System.out.println("Computing Discount...");
	}

}
