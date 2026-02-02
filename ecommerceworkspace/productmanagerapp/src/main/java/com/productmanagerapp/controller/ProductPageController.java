package com.productmanagerapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.productmanagerapp.model.Product;
import com.productmanagerapp.service.ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/productspage")
public class ProductPageController extends HttpServlet {

	private ProductService productService = new ProductService();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getParameter("op").equals("list"))
		{
		
		req.setAttribute("products", productService.getProducts());
		req.getRequestDispatcher("WEB-INF/view/productpage.jsp").forward(req, resp);
		
		}
		
		
		if(req.getParameter("op").equals("add")) {
			
			
			
			
			req.getRequestDispatcher("WEB-INF/view/addproductpage.jsp").forward(req, resp);
			
			
	}
		
		
		if(req.getParameter("op").equals("del")) {
			
			

					
					productService.deleteProduct(req.getParameter("code"));
			

			
			req.setAttribute("products", productService.getProducts());
			req.getRequestDispatcher("WEB-INF/view/productpage.jsp").forward(req, resp);
			
		}
		
		
		if(req.getParameter("op").equals("search")){
			
		
			req.getRequestDispatcher("WEB-INF/view/searchproductpage.jsp").forward(req, resp);
			
			
		}
		
		
		
		if(req.getParameter("op").equals("dosearch")){
			
			String code = req.getParameter("searchcode");
			
			Product p =  (Product) productService.searchProducts(code) ;
			
			req.setAttribute("searchresult", p);
			
			
			
			req.getRequestDispatcher("WEB-INF/view/showsearchresult.jsp").forward(req, resp);
			
			
		}
		
		
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
//		if(req.getParameter("op").equals("dosearch")){
//			
//			String code = req.getParameter("searchcode");
//			
//			System.out.println(code + " before searching");
//			
////			Product p =  (Product) productService.searchProducts(code) ;
//			
////			System.out.println(p.getCode() + " after searching");
//			
//			req.setAttribute("searchresult", productService.searchProducts(code));
//			
//			
//			
//			req.getRequestDispatcher("WEB-INF/view/showsearchresult.jsp").forward(req, resp);
//			
//			
//			return ;
//			
//			
//		}
		
			
			
		String code = req.getParameter("code");
		String name = req.getParameter("name");
		int price = Integer.valueOf(req.getParameter("price"));
		
		Product product = new Product(code, name, price);
		
		
		
				req.setAttribute("products", productService.addProduct(product));
				
				
				
				
				
				req.getRequestDispatcher("WEB-INF/view/productsavedpage.jsp").forward(req, resp);
				
				
				
				
		}
	
	
	
	
	
	
	
	
		
	
	
}
