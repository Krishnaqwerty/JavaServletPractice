package com.customtable.main;

import com.customtable.dao.CourseDAO;
import com.customtable.model.Course;
import com.customtable.model.Participant;

public class MainCourse {
	
	public static void main(String[] args) {
		
		 
		
		
		runsave();
//		runfind();
		
	}

	private static void runfind() {
		
		
		
		CourseDAO courseDAO = new CourseDAO();
		
		String id = "C1" ;
		
		Course c = courseDAO.finByID(id);
		
		
		System.out.println(c.getName());
		
		
		
		
		
	}

	private static void runsave() {
		
		
		
		
		

		CourseDAO courseDAO = new CourseDAO();
		
		Participant p1 = new Participant("P1", "Krishna");
		Participant p2 = new Participant("P2", "Dheeraj");
		
		Course c1 = new Course("C1", "Mathematics");
		Course c2 = new Course("C2", "Physics");
		
		p1.addCourses(c1);
		p1.addCourses(c2);
		p2.addCourses(c1);
		p2.addCourses(c2);
		
		c1.addParticipant(p1);
		c1.addParticipant(p2);
		c2.addParticipant(p1);
		c2.addParticipant(p2);
		
		courseDAO.save(c1);
		courseDAO.save(c2);
		
		
	}

}
