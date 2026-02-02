package com.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springwebapp.model.Contact;
import com.springwebapp.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService ;

	public ContactService getContactService() {
		return contactService;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}
	
	
	
	@GetMapping("/contacts")
	public String getContacts(Model model) {
		model.addAttribute("contacts", contactService.getAll());
		return "contactslistpage" ;
	}
	
	
	@GetMapping("/addcontact")
	public String addContact() {
		return "addcontactpage" ;
	}
	
	
	@PostMapping("/savecontact")
	public String saveContact(@RequestParam("id") String id, Model model) {
		Contact c = new Contact(id);
		
		model.addAttribute("savedContact", contactService.save(c));
		
		return "savedcontact" ;
	}
	

}
