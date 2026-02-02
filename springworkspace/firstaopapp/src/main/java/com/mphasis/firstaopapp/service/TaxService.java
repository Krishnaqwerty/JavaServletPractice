package com.mphasis.firstaopapp.service;

import org.springframework.stereotype.Service;

@Service("taxService")
public class TaxService {
	
	public void computeTax() {
		System.out.println("Computing Tax...");
	}

}
