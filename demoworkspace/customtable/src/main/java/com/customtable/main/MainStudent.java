package com.customtable.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.customtable.dao.StudentDAO;
import com.customtable.model.Locker;
import com.customtable.model.Student;

import com.customtable.util.HibernateUtil;

public class MainStudent {

	public static void main(String[] args) {
		
		
		StudentDAO studentDAO = new StudentDAO() ;
		
		String id = "S1";
		String name = studentDAO.finByID(id);
		
		System.out.println("Name: " + name + "...");

	}

	
	
	
	
	

}
