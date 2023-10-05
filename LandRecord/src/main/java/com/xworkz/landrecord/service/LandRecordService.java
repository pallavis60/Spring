package com.xworkz.landrecord.service;

import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.AdminDto;

public interface LandRecordService {
	
	public boolean singIn(String email,Model model);
	
	public AdminDto otpValidate(String otp,Model model);
	
	
	

	
	

}
