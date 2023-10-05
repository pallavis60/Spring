package com.xworkz.creativity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.service.CreativityService;

@Controller
public class CreativityController {
	
	@Autowired
	private CreativityService service;

	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public String register(CreativityDto dto ,Model model) {
		
	boolean save =	service.register(dto, model);
	
	if(save) {
		model.addAttribute("dtoSaved", "Data is saved");
		return "Register";
	}
	else {
		
		model.addAttribute("dtoNotSaved","Data is not saved" );
		return "Register";
		
	}
		
	}
}
