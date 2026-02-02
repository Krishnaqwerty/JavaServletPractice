package classtask;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MathServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print(getServletContext().getInitParameter("institutename") + 
				"<br>" +
				"<h3>Department: Mathematics </h3> " +
				"<br>" +
				
				"<h3>HOD: </h3> " + getServletConfig().getInitParameter("hodname") +
				"<br>" +
				
				"<h3>Courses: </h3>" + getServletConfig().getInitParameter("totalcourses") +
				
				"<br>" + 
				
				"<h3>Max Students Allowed:  </h3> " + getServletContext().getInitParameter("maxstudents") +
				
				"<br>"
				
				) ;
		
		
	}

}
