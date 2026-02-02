package com.bank.backend.webcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.bank.backend.dto.UserCredDTO;
import com.bank.backend.model.UserCred;
import com.bank.backend.service.UserCredService;

@Controller
public class HomePageController {
	
	@Autowired UserCredService ucs ;
	
	@GetMapping("/homepage")
	public String homepage() {
		return "homage" ;
	}
	
	@GetMapping("/showAll")
	public String showAll(Model model) {
		
		List<UserCredDTO> userDTOList = new ArrayList<UserCredDTO>(); 
		
		List<UserCred> userList = ucs.getAllUser();
		
		for(UserCred u : userList) userDTOList.add(new UserCredDTO(u.getId(), u.getUsername(), u.getPassword()));
		
		model.addAttribute("userList", userList);
		
		return "userlist" ;
	}

}
