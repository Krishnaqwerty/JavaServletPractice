package com.productmanagerapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.productmanagerapp.model.Product;
import com.productmanagerapp.util.ConnectionUtil;

public class ProductDAO {

	public List<Product> findAll(){
		
		List<Product> products = new ArrayList<>();
		
		Connection con = ConnectionUtil.getConnection();
		
		String query = "select * from products ;" ;
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				products.add(new Product(rs.getString("code"), rs.getString("name"), rs.getInt("price")));
				
			}
			
			rs.close();
			stmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null ;
		}
		
		
		return products;
		
	}

	public Product save(Product product) {
		
		
			
		Connection con = ConnectionUtil.getConnection();
		String query = "insert into products values(?, ?, ?) ;" ;
		
		
		
		
		try {	
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, product.getCode());
			stmt.setString(2, product.getName());
			stmt.setInt(3, product.getPrice());
			
			stmt.executeUpdate();
			
			stmt.close();
			con.close();
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			return null ;
			
		}
		
		
//		if( n > 0 ) {
			return product ;
//		}else {
//			return null ;
//		}
		
		
	}

	public void delete(String code) {
		
		
		
		Connection con = ConnectionUtil.getConnection();
		
		
		
		
		String query = "delete from products where code = ? ; " ;
		
		
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, code);
			
			
			
			stmt.close();
			con.close();
			
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
		
		
		
		
	}

	public Product searchByCode(String code) {
		
		
//		List<Product> product = new ArrayList<>();
		Product product = null ;
		
		Connection con = ConnectionUtil.getConnection();
		
		
		
		
		String query = "select * from products where code = ? ; " ;
		
		System.out.println("Running Query: " + query);
		
		
		
		try {
			
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, code);
			
			System.out.println("no problem upto here");
			
			ResultSet rs = stmt.executeQuery();
			
			System.out.println("No Problem upto here 2");
			
			System.out.println(rs.getString("code") + "done!");
			
			
			while(rs.next()) {
			product = new Product(rs.getString("code"), rs.getString("name"), rs.getInt("price"));
			}
			
			
			
			rs.close();
			stmt.close();
			con.close();
			
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			return null ;
			
		}
		
		
		
		
		return product;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
