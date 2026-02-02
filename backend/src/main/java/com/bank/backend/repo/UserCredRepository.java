package com.bank.backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.backend.model.UserCred;

public interface UserCredRepository extends JpaRepository<UserCred, Long> {
	
	@Query("select p from UserCred p where p.username like %?1")
	public List<UserCred> customQuery(String endsWith);
	
	

}
