package com.bank.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.backend.dto.UserCredDTO;
import com.bank.backend.model.UserCred;
import com.bank.backend.service.UserCredService;

@RestController
@RequestMapping("api/v1/users")
public class UserCredController {
	

	 private final UserCredService service;

	    public UserCredController(UserCredService service) {
	        this.service = service;
	    }

	    @PostMapping
	    public UserCred create(@RequestBody UserCred user) {
	        return service.createUser(user);
	    }
	    
	    
	    @PostMapping("saveAka")
	    public UserCred createAka(@RequestBody UserCredDTO useraka) {
	    	UserCred user = new UserCred(useraka.getId(), useraka.getUsername(), useraka.getPassword());
	        return service.createUser(user);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<UserCred> get(@PathVariable Long id) {
	    	UserCred user = service.getUserById(id);
	    	
	    	if(user != null) 
	        return new ResponseEntity<UserCred>(user, HttpStatus.OK);
	        
	        return new ResponseEntity<UserCred>(user, HttpStatus.NOT_FOUND);
	    }
	    
	    @GetMapping("/all")
	    public ResponseEntity<List<UserCred>> getALl(){
	    	
	    	List<UserCred> allUser = service.getAllUser();
	    	
	    	if(allUser != null) {
	    	
	    	return new ResponseEntity<List<UserCred>>(allUser, HttpStatus.OK);
	    	
	    	}
	    	
	    	
	    	return new ResponseEntity<List<UserCred>>(allUser, HttpStatus.NOT_FOUND);

	    }
	    
	    
	    @DeleteMapping("/delete/{id}")
	    public void delete(@PathVariable Long id) {
	    
	    	service.deleteById(id);
	    
	    }
	    
	    
	    @GetMapping("/allAka")
	    public ResponseEntity<List<UserCredDTO>> getAllAka(){
	    	
	    	List<UserCred> allUser = service.getAllUser();
	    	
	    	List<UserCredDTO> allUserMap = new ArrayList<UserCredDTO>();
	    	
	    	for(UserCred uc :allUser) {
	    		allUserMap.add(new UserCredDTO(uc.getId(), uc.getUsername(), uc.getPassword()));
	    	}
	    	
	    	if(allUser != null) {
	    	
	    	return new ResponseEntity<List<UserCredDTO>>(allUserMap, HttpStatus.OK);
	    	
	    	}
	    	
	    	
	    	return new ResponseEntity<List<UserCredDTO>>(allUserMap, HttpStatus.NOT_FOUND);

	    }
	    
}
