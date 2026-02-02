package com.mphasis.springjdbcapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.springjdbcapp.dao.ContactDAO;
import com.mphasis.springjdbcapp.model.Contact;

@Service("contactService")
public class ContactService {
	
	@Autowired
	private ContactDAO contactDAO ;
	
	
	
	
	public ContactDAO getContactDAO() {
		return contactDAO;
	}

	public void setContactDAO(ContactDAO contactDAO) {
		this.contactDAO = contactDAO;
	}

	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public List<Contact> getAll(){
		return contactDAO.findAll();
	}
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public Contact save(Contact c) {
		return contactDAO.save(c);
	}
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public Contact getById(String id) {
		return contactDAO.findById(id);
	}
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public String deleteById(String id) {
		return contactDAO.delete(id);
	}

}
