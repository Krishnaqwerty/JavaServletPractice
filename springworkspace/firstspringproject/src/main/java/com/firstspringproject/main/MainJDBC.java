package com.firstspringproject.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.firstspringproject.dao.ContactDAO;
import com.firstspringproject.model.Contact;

public class MainJDBC {
	
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		

		
		
		 ContactDAO cd = container.getBean("contactDAO", ContactDAO.class);
				 
		 List<Contact> contacts = cd.findAll();
		
		for(Contact c : contacts) System.out.println(c.getId());
		
		container.close();
		container.registerShutdownHook();
		
	}
	

}
