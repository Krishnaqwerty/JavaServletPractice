package com.customtable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.model.Payment;
import com.customtable.util.HibernateUtil;

public class PaymentDAO {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public Payment save(Payment p) {
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.persist(p);
		session.getTransaction().commit();
		System.out.println(p.getId() + " saved...");
//		session.close();
//		HibernateUtil.shutdown();
		
		
		
		return p ;
		
	}

}
