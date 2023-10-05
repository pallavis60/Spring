package com.xworkz.landrecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.landrecord.dto.AdminDto;
import com.xworkz.landrecord.service.LandRecordService;

@Controller
public class LandController {
	
	@Autowired
	private LandRecordService service;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
    public String logIn(@RequestParam String email,Model model) {
   boolean result =service.singIn(email, model);
   if(result) {
	  System.out.println("Accont varifived");
    	return "Home";
    	
    }
     System.out.println("Cant't find Account");
     model.addAttribute("AccountNotExist", "cant't find Account");
    	return "Home";
    	
    }
	
	@RequestMapping(value="/sendOtp", method=RequestMethod.POST)
	public String otpVefication(@RequestParam String otp,Model model) {
	AdminDto dto =	service.otpValidate(otp, model);
	if(dto!=null) {
		System.out.println("Otp verified");
		model.addAttribute("dto", dto);
		return "Main";
		
	}
	System.out.println("Otp incorrect");
	return "Home";
		
		
	}

	}
	
	
	

