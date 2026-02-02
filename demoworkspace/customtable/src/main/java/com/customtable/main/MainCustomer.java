package com.customtable.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.model.Customer;

import com.customtable.util.HibernateUtil;



public class MainCustomer {
	
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		Long id = (long) 101 ;
		
//		Customer customer = new Customer(id, "hello.ji@mphasis.com", "Hello Ji", "1234567893", date );
		
//		saveCustomer(customer);
//		findCustomerById(id);
//		
//		
		String newPhone = "1234568975";
		updateCustomerPhone(id, newPhone );
		
		
	}

	private static void updateCustomerPhone(Long id, String newPhone) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Customer c = session.find(Customer.class, id);
		c.setPhonenumber(newPhone);
		
		session.persist(c);
		System.out.println(c.getCustomerId() + " Updated...");
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}

	private static void findCustomerById(Long id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Customer c = session.find(Customer.class, id);
		
		
		System.out.println(c.getCustomerId() + " , " + c.getEmail() + " , " + c.getFullname() + " , " + c.getPhonenumber() + " , " + c.getRegistrationDate());
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
		
	}

	private static void saveCustomer(Customer customer) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		
		session.persist(customer);
		session.getTransaction().commit();
		System.out.println(customer.getCustomerId() + " saved...");
		HibernateUtil.shutdown();
		
	}
	

}
