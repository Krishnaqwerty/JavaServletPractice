package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemoRead {
	
	public static void main(String[] args) {
		System.out.println("!!! Welcome !!!");
		
		String url = "jdbc:mysql://localhost/demo";
		String username = "root" ;
		String password = "root@39" ;
		
		try {
			Connection con = DriverManager.getConnection(url, username, password) ;
			
			String query = "select * from products;" ;
			PreparedStatement stmt = con.prepareStatement(query);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("code") + ", " + rs.getString("name") + ", " + rs.getInt("price"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
