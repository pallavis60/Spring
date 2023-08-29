package com.xworkz.vechicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vechicle.dto.VechicleDto;
import com.xworkz.vechicle.repo.VechicleRepo;

@Component
public class VechicleServiceImpl implements VechicleService {
	
	@Autowired
  private VechicleRepo repo;

	@Override
	public boolean save(VechicleDto dto) {
		
		repo.save(dto);
		
		return true;
	}

}
