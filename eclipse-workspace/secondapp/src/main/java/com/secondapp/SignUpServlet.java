package com.secondapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String emailid = req.getParameter("emailid");
		
		RequestDispatcher rd = req.getRequestDispatcher("success");
		
		rd.forward(req, resp);
		
	}

}
