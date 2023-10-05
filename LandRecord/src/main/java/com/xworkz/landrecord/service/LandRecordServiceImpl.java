package com.xworkz.landrecord.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.AdminDto;
import com.xworkz.landrecord.repo.LandRecordRepo;

@Service
public class LandRecordServiceImpl implements LandRecordService {
	@Autowired
	private LandRecordRepo repo;
	
	public boolean validate(AdminDto dto,Model model) {
		boolean valid=true;
		
		if(dto==null) {
			model.addAttribute("dtoValidate", "Please Enter Requirments");
			valid=false;
		}
		if(dto.getAdminName()==null || dto.getAdminName().isEmpty() || dto.getAdminName().length()<4 || dto.getAdminName().length()>25) {
			model.addAttribute("AdminName", "Enter Valid Name");
			valid=false;
		}
		if(dto.getEmail()==null || dto.getEmail().isEmpty()) {
			model.addAttribute("email", "Enter Valid Email");
			valid=false;
		}
		
		return valid;
	
	}
	
	

	public  String generatedOTP() {	
		int randomNo=(int)( Math.random() * 9000)+1000;
		String otp = String.valueOf(randomNo);
		return otp;
	}
	


	
	public AdminDto findByEmail(String email, Model model) {
		if(email!=null && !email.isEmpty()) {
			System.out.println(" email Send to repo ");
			try {
				AdminDto dto = repo.findByEmail(email);
				return dto;
				
			} catch (Exception e) {
				System.out.println("No Result Found");
				return null;
			}
			
		}
		model.addAttribute("emailValidate", "Email is not valid");
		return null;
		
	}


	@Override
	public boolean singIn(String email, Model model) {
		if(email!=null && !email.isEmpty()) {
		
		AdminDto dto =	findByEmail( email, model);
		if(dto!=null) {
			String otp =generatedOTP();
			boolean update =repo.updateOtpByEmail(otp, email);
			System.out.println(update);
			
			model.addAttribute("OTP Sent", "Otp sent");
			return true;
		
		}
		System.out.println("Not updated");
		return false;
	}
		model.addAttribute("emailValidate", "Please enter email ");
		return false;
		
		
	}



	@Override
	public AdminDto otpValidate(String otp,Model model) {
		if(otp!=null && !otp.isEmpty()) {
		try {
			AdminDto dto =repo.findOtp(otp);
			System.out.println(dto);
			model.addAttribute("otp", "Otp is verified");
			return dto;
		} catch (Exception e) {
			model.addAttribute("otp", "Otp is inncorrect");
			return null;
			
		}
		}
		model.addAttribute("otp", "Otp is required");
		return null;
		
		
		
	}
		}
	




	    
	