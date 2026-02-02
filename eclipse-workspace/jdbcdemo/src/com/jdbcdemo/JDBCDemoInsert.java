
package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class JDBCDemoInsert {
	
	public static void main(String[] args) {
		System.out.println("!!! Welcome !!!");
		
		String url = "jdbc:mysql://localhost/demo";
		String username = "root" ;
		String password = "root@39" ;
		
		try {
			Connection con = DriverManager.getConnection(url, username, password) ;
			
			String query = "insert into products values(?,?,?) ;" ;
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, "p4");
			stmt.setString(2, "monitor2");
			stmt.setInt(3, 44000);
			
			int n = stmt.executeUpdate();
			
			System.out.println(n + " record(s) inserted!!!!!!!!!!");
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
