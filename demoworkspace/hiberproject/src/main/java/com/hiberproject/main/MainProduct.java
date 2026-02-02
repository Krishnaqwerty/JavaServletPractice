package com.hiberproject.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import com.hiberproject.model.Product;
import com.hiberproject.util.HibernateUtil;

public class MainProduct {
	
	public static void main(String[] args) {
		
//		save();
//		read();
//		delete();
//		update();
		readAll();
		
	}
	
	
	private static void update() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Product p = session.find(Product.class,"P1");
		p.setPrice(1500);
		
		session.persist(p);
		System.out.println(p.getCode() + " Updated...");
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}


	private static void delete() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Product p = session.find(Product.class,"P2");
		
		session.remove(p);
		System.out.println(p.getCode() + " , " + p.getName() + " , " + p.getPrice());
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}


	private static void read() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Product p = session.find(Product.class,"P2");
		
		
		System.out.println(p.getCode() + " , " + p.getName() + " , " + p.getPrice());
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}

	
	private static void readAll() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		SelectionQuery<Product> query = session.createSelectionQuery("FROM Product", Product.class);
		List<Product> products = query.getResultList();
		
		for(Product p : products)
		System.out.println(p.getCode() + " , " + p.getName() + " , " + p.getPrice());
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}

	public static void save() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Product p = new Product("P2", "Mouse", 12000);
		
		session.persist(p);
		session.getTransaction().commit();
		System.out.println(p.getCode() + " saved...");
		HibernateUtil.shutdown();
		
		
	}
		
	

}
