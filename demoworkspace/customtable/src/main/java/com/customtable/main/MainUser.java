package com.customtable.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.model.Address;
import com.customtable.model.User;
import com.customtable.util.HibernateUtil;

public class MainUser {
	
	
	public static void main(String[] args) {
		save();
	}
	
	
	

	private static void save() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		Address address = new Address("Kharadi It Park", "Pune", "411029");
		User user = new User("U2", "Mayank");
		
		user.setAddress(address);
		
		
		
		session.persist(user);
		session.getTransaction().commit();
		System.out.println(user.getId() + " saved...");
		session.clear();
		HibernateUtil.shutdown();
		
		
	}

	
}
