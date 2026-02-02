package com.customtable.main;

import com.customtable.dao.BlogPostDAO;
import com.customtable.model.BlogPost;
import com.customtable.model.Comment;

public class MainBlog {

	public static void main(String[] args) {

		BlogPostDAO blogpostDAO = new BlogPostDAO();
		
//		save(blogpostDAO);
		

		
		String id = "B1";
		
		
		find(blogpostDAO, id);
		
		
	}

	private static void find(BlogPostDAO blogpostDAO, String id) {
		BlogPost newb = blogpostDAO.finByID(id);
		
		System.out.println(newb.getId() + " , " + newb.getTitle() + " , " + newb.getComments().get(0).getId() + " , " + newb.getComments().get(0).getUser() + " , " + newb.getComments().get(0).getComment());
	}

	private static void save(BlogPostDAO blogpostDAO) {
		BlogPost blogpost = new BlogPost("B1", "Solid Principles", "Dr. Joe");
		Comment c1 = new Comment("C1", "Krishna", "Nice Writting Skill...");
		c1.setBlogpost(blogpost);
		Comment c2 = new Comment("C2", "Dheeraj", "Nice Writting Skill...");
		c2.setBlogpost(blogpost);
		
		blogpost.addComment(c1);
		blogpost.addComment(c2);
		
		
		
		
		BlogPost newb = blogpostDAO.save(blogpost);
		
		System.out.println(newb.getId() + " , " + newb.getTitle() + " , " + newb.getComments().get(0).getId() + " , " + newb.getComments().get(0).getUser() + " , " + newb.getComments().get(0).getComment());
	}

}
