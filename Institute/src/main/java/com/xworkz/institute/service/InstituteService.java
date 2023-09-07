package com.xworkz.institute.service;

import org.springframework.ui.Model;

public interface InstituteService {
	
	
	public boolean validate(String userName,String email,String password,Model model);

}
