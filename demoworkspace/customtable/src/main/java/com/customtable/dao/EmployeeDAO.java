package com.customtable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.model.Employee;
import com.customtable.model.Student;
import com.customtable.util.HibernateUtil;

public class EmployeeDAO {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public Employee save(Employee emp) {
			
			
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			session.persist(emp);
			session.getTransaction().commit();
			System.out.println(emp.getId() + " saved...");
			session.close();
			HibernateUtil.shutdown();
			return emp ;
			
		}
	
	
	
	public Employee finByID(String id) {
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Employee employee = session.find(Employee.class, id);

		session.getTransaction().commit();

		session.clear();
		HibernateUtil.shutdown();
		
		
		return employee ;
		
		
		
	}
	

}
