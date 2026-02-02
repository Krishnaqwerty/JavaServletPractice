package com.mphasis.springjdbcapp.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.springjdbcapp.config.SpringConfig;
import com.mphasis.springjdbcapp.model.Contact;
import com.mphasis.springjdbcapp.service.ContactService;

public class MainApp {
	
	
	public static void main(String[] args) {
		
		
//		create();
		
		read();
		
//		read("C1");
//		
//		delete("C1");
	}

	private static void delete(String id) {


		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		ContactService cs = container.getBean("contactService",ContactService.class);
		String c = cs.deleteById(id);
		
		
			
		System.out.println(c + " deleted !");
			
	
		
		container.close();
		container.registerShutdownHook();
		
		
	}

	private static void create() {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		ContactService cs = container.getBean("contactService",ContactService.class);
		Contact c = new Contact("C8", "Krishna", "krishna@mph.in");
		Contact cSaved = cs.save(c);
		
		System.out.println(cSaved + " saved !");
		
		container.close();
		container.registerShutdownHook();
		
	}

	private static void read() {
		
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		ContactService cs = container.getBean("contactService",ContactService.class);
		List<Contact> contacts = cs.getAll();
		
		for(Contact c : contacts) {
			
			System.out.println(c.getId() + " , " + c.getName() + " , " + c.getEmail());
			
		}
		
		container.close();
		container.registerShutdownHook();
		
	}
	
	
	private static void read(String id) {
			
			
			AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
			ContactService cs = container.getBean("contactService",ContactService.class);
			Contact c = cs.getById(id);
			
			
				
			System.out.println(c.getId() + " , " + c.getName() + " , " + c.getEmail());
				
		
			
			container.close();
			container.registerShutdownHook();
			
		}
	

}
