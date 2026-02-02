package com.springwebapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springwebapp.model.Contact;

@Repository("contactDAO")
public class ContactDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public List<Contact> findAll(){
		
		String query = "select * from contacts";
		
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Contact>(Contact.class));
		
	}
	
	
	public Contact save(Contact c) {
		String query = "insert into contacts(id) values(?)";
		
		Object params[] = {c.getId()};
		int n = jdbcTemplate.update(query, params);
		
		if (n > 0) {
		return c ;
		}else {
			return null ;
		}
		
	}
	
	public Contact findById(String id) {
		String query = "select * from contacts where id = ?";
		
		Object params[] = {id};
		
		return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<Contact>(Contact.class), params);
	}
	
	public String delete(String id) {
		
		String query = "delete from contacts where id = ?";
		
		Object params[] = {id};
		
		int n = jdbcTemplate.update(query, params);
		
		if(n > 0) {
			return id ;
		}else 
		return null ;
		
	}

}
