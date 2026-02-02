package com.mphasis.springjdbcapp.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.mphasis.springjdbcapp"})
public class SpringConfig {
	
	@Bean
	@Scope("singleton")
	DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springdb");
		ds.setUsername("root");
		ds.setPassword("root@39");
		
		return ds ;
	}
	
	
	
	@Bean
	@Scope("singleton")
	JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(driverManagerDataSource());
	}
	
	@Bean
	@Scope("singleton")
	PlatformTransactionManager transactionManager(DataSource datasource) {
		
		return new DataSourceTransactionManager(datasource);
		
	}

}
