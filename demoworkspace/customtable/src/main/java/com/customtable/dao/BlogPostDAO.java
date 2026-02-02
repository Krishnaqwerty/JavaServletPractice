package com.customtable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.model.BlogPost;
import com.customtable.util.HibernateUtil;

public class BlogPostDAO {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public BlogPost save(BlogPost blogpost) {
			
			
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			session.persist(blogpost);
			session.getTransaction().commit();
			System.out.println(blogpost.getId() + " saved...");
			session.close();
			HibernateUtil.shutdown();
			return blogpost ;
			
		}
	
	
	
	public BlogPost finByID(String id) {
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		BlogPost blogpost = session.find(BlogPost.class, id);

		session.getTransaction().commit();

		session.clear();
		HibernateUtil.shutdown();
		
		
		return blogpost ;
		
		
		
	}

}
