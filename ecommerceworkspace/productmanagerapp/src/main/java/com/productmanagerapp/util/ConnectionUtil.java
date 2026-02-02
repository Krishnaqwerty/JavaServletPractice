package com.productmanagerapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
		}
			
			
		
	}

	public static Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "root@39");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
			
			
		}
		
		
		return null ;
		
		
	}
	
	
}
