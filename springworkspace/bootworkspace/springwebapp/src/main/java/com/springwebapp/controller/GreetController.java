package com.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springwebapp.service.LoginService;

@Controller
public class GreetController {
	
	
	LoginService loginService = new LoginService();
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greet() {
		return "greetpage" ;
	}
	
	@GetMapping("/mphasis")
	public String mphasis() {
		return "mphasispage";
	}
	
	
	
	@GetMapping("/login")
	public String login() {
		return "loginpage";
	}
	
	@PostMapping("/dologin")
	public String dologin(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		
		if(loginService.check(username, password)) {
			model.addAttribute("username", username);
		}else {
			model.addAttribute("error", "Invalid Credentials, Please Try Again...");
			return "loginpage";
		}
		
		return "welcomepage";
	}

}
