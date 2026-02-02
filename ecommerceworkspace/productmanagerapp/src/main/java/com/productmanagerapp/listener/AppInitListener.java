package com.productmanagerapp.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class AppInitListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println(sce.getServletContext().getContextPath() + " initialized...");
		
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println(sce.getServletContext().getContextPath() + " destroyed...");
		
	}

}
