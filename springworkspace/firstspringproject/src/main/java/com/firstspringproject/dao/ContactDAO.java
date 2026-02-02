package com.firstspringproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.firstspringproject.model.Contact;

@Repository("contactDAO")
public class ContactDAO {
	

	
	
	@Autowired
	private JdbcTemplate jd ;
	
	
	public List<Contact> findAll(){
		
		List<Contact> contacts = jd.query("select * from contacts", new BeanPropertyRowMapper<Contact>(Contact.class));
		
		return contacts ;
		
	}

}
