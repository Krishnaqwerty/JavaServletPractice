package com.secondapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/success")
public class SuccessServlet extends HttpServlet {
	
	ArrayList<String> emailList = new ArrayList<>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String emailid = req.getParameter("emailid");
		
		PrintWriter out = resp.getWriter();
		
		if(emailList.contains(emailid)) {
			out.print("<h3>Already Registered!</h3>");
		}else {
		
		
		
		
		emailList.add(emailid);
		out.print("<h3>Welcome!</h3>");
		
		out.print("<h3>Hello ! </h3>" + firstname + " " + lastname  );
		
		
		}
		
	
 }
}