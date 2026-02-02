package com.firstapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		if(session.getAttribute("usersession") == null) {
			
			RequestDispatcher rd = req.getRequestDispatcher("loginPage.html");
			
			rd.forward(req, resp);
			
		}else {
			
			
			out.print("Already Logged In");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		session.setAttribute("usersession", username);
		
		if((username == null) || (password == null) || username.equals("") || password.equals("")) {
			out.print("username or/and password is/are missing");
		}else if((username.equals("admin")) && (password.equals("admin"))) {
			
			out.print("Hello Admin");
			
		}else {
			out.print("Login Failed");
		}
	}

}
