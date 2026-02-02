package thirdapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletD extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		String location = getServletContext().getInitParameter("location");
		String classroom = getServletConfig().getInitParameter("classroom");
		
		PrintWriter out = resp.getWriter();
		
		out.print("location: " + location);
		out.print("<br>");
		out.print("classroom: " + classroom);
		
		
		
	}

}
