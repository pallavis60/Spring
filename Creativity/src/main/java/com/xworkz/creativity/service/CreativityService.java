package com.xworkz.creativity.service;

import org.springframework.ui.Model;

import com.xworkz.creativity.dto.CreativityDto;

public interface CreativityService {
	
	public boolean register(CreativityDto dto,Model model);

}
