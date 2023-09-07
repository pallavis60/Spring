package com.xworkz.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CompanyController {
	
	
	public CompanyController() {
		System.out.println("CompanyController");
	}
	
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String getMessage(Model model) {
		System.out.println("GetPage method  is Running");
		model.addAttribute("welcome", "This is First Page");
		return "Welcome";
		
	}
	
	

}
