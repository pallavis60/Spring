package com.xworkz.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.school.dto.SchoolDto;
import com.xworkz.school.repo.SchoolRepo;

@Component
public class SchoolServiceImpl implements SchoolService {
	 @Autowired
	 private SchoolRepo repo;

	@Override
	public boolean save(SchoolDto dto) {
		if(dto!=null) {
			return repo.save(dto);
			
		}
		return false;
	}

}
