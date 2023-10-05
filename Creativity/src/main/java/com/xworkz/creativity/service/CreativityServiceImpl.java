package com.xworkz.creativity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.repo.CreativityRepo;
import com.xworkz.creativity.repo.CreativityRepoImpl;

@Service
public class CreativityServiceImpl  implements CreativityService{
	
	@Autowired
	private CreativityRepo repo;

	
	public boolean validate(CreativityDto dto, Model model) {
		boolean valid=true;
		if(dto==null) {
			model.addAttribute("dtoNull", "Form is Empty");
			valid=false;
			
		}
		if(dto.getName()==null || dto.getName().isEmpty() || dto.getName().length()<4 || dto.getName().length()>25) {
			model.addAttribute("name", "Name is not valid");
			valid=false;

		}
		if(dto.getEmail()==null || dto.getEmail().isEmpty()) {
			model.addAttribute("email", "Email is not valid");
			valid=false;
		}
		if(dto.getFatherName()==null || dto.getFatherName().isEmpty() || dto.getFatherName().length()<4 ||dto.getFatherName().length()>25) {
			model.addAttribute("fatherName", "Father Name is Not valid");
			valid=false;
		}
		if(dto.getMotherName()==null || dto.getMotherName().isEmpty() || dto.getMotherName().length()<4 || dto.getMotherName().length()>25) {
			model.addAttribute("motherName", "MOtherName is not valid");
			valid=false;
		}
		if(dto.getLocation()==null || dto.getLocation().isEmpty() || dto.getLocation().length()<5 || dto.getLocation().length()>25) {
			model.addAttribute("location", "Location is not valid");
			valid=false;
		}
		if(dto.getDateOfBirth()==null || dto.getDateOfBirth().isEmpty()) {
			model.addAttribute("date", "Fill The Date Of Birth");
			valid=false;
		}
		if(dto.getNumber()==null ) {
		  model.addAttribute("number", "Phone Nummber is not valid");
			valid= false;
		}
		
		
		return valid;
	}

	@Override
	public boolean register(CreativityDto dto, Model model) {
		
		if(validate(dto, model)) {
			System.out.println("sending dto to repo");
			return repo.register(dto);
		}
		System.out.println("Data is not going to repo");
		return false;
	}

}
