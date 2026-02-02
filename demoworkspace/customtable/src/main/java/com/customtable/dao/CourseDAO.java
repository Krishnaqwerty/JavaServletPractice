package com.customtable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.model.Course;
import com.customtable.model.Employee;
import com.customtable.util.HibernateUtil;

public class CourseDAO {
	
private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public Course save(Course c) {
			
			
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			session.persist(c);
			session.getTransaction().commit();
			System.out.println(c.getId() + " saved...");
			session.close();
			HibernateUtil.shutdown();
			return c ;
			
		}
	
	
	
	public Course finByID(String id) {
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Course c = session.find(Course.class, id);

		session.getTransaction().commit();

		session.clear();
		HibernateUtil.shutdown();
		
		
		return c ;
		
		
		
	}
	
	

}
