package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.services.ContactService;

@Controller
public class BillingController {
	@Autowired ContactService contactService;
	@RequestMapping("/generateBill")
public String viewBillingPage(@RequestParam("id") long id,Model model) {
		Contact contact=contactService.getcontactById(id);
		model.addAttribute("contact", contact);
	return "generate_bill";
}
}
