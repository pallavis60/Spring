package com.xworkz.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.institute.service.InstituteService;


@Controller
public class FirstController {
	
	
	@Autowired
	 private InstituteService service;
	
	@RequestMapping(value="/message" , method=RequestMethod.GET)
	public String getMessage(Model model) {
		
		model.addAttribute("welcome", " Once Again Welcome all");
		
		return "Welcome";
	}
	
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String getForm(@RequestParam String userName,String email,String password,Model model) {
		System.out.println(userName);
		System.out.println(email);
		System.out.println(password);
		
		boolean isValid = service.validate(userName, email, password, model);
		System.out.println(isValid);
  
	      return "Welcome";	
	
		
	}

}
