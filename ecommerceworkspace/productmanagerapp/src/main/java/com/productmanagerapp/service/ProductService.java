package com.productmanagerapp.service;

import java.util.List;

import com.productmanagerapp.dao.ProductDAO;
import com.productmanagerapp.model.Product;

public class ProductService {
	
	private ProductDAO productDAO = new ProductDAO();
	
	public List<Product> getProducts() {
		return productDAO.findAll();
	}
	
	public Product addProduct(Product product){
		
		Product addedProduct = productDAO.save(product);
		
		return addedProduct ;
	}
	
	
	public void deleteProduct(String code) {
		
		 productDAO.delete(code);
		 
	}

	public Product searchProducts(String code) {
		
		return productDAO.searchByCode(code);
		
	}

}
