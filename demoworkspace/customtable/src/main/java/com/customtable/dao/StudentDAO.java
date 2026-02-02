package com.customtable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.model.Locker;
import com.customtable.model.Student;
import com.customtable.util.HibernateUtil;

public class StudentDAO {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
private  void save(Student student) {
		
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.persist(student);
		session.getTransaction().commit();
		System.out.println(student.getId() + " saved...");
		session.clear();
		HibernateUtil.shutdown();
		
	}

public String finByID(String id) {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	
	Student student = session.find(Student.class, id);

	session.getTransaction().commit();
	System.out.println(student.getId() + " , "+ student.getName() + " , "+ student.getLocker().getId() + " , " + student.getLocker().getLocation());
	session.clear();
	HibernateUtil.shutdown();
	
	
	return student.getName();
	
	
	
}










}
