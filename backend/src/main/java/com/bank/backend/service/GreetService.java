package com.bank.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetService {
	
	@Value("${message}")
	private String message;
	@Value("${location}")
	private String location;
	
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public String greet() {
		logger.info("executing greet()");
		logger.info(message + " , " + location);
		logger.error("executing greet()");
		logger.error(message + " , " + location);
		return message + " " + location ;
	}

}
