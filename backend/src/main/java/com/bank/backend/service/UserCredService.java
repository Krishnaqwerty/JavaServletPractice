package com.bank.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.backend.model.UserCred;
import com.bank.backend.repo.UserCredRepository;



@Service
public class UserCredService {
	
	
	private UserCredRepository repo ;

	public UserCredService(UserCredRepository repo) {
	
		this.repo = repo;
	}
	
	
	@Transactional
	public UserCred createUser(UserCred user) {
		return repo.save(user);
	}
	
	@Transactional(readOnly = true)
	public UserCred getUserById(Long id) {
		return repo.findById(id).orElse(null);
		
	}
	
	@Transactional(readOnly = true)
	public List<UserCred> getAllUser() {
		return repo.findAll();
	}
	
	@Transactional
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	

}
