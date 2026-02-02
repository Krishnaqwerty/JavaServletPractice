package classtask.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class PerformanceFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("This is Performance Filter.");
		
		HttpServletRequest request = (HttpServletRequest)req ;
		HttpServletResponse response = (HttpServletResponse)resp ;
		
		System.out.println(request.getRequestURL());
		
		Long startTime = System.currentTimeMillis();
		
		System.out.println(startTime);
		
		System.out.println("Response Status before Releasing: " + response.getStatus());
		
//		RequestDispatcher rd = req.getRequestDispatcher("MathServlet");
//		
//		rd.forward(req, resp);
		
		chain.doFilter(req, resp);
		Long endTime = System.currentTimeMillis();
		System.out.println("Total Response Time: " + (endTime - startTime) + " ms");
		System.out.println("Response Status after Releasing: " + response.getStatus());
		
		
	}

}
