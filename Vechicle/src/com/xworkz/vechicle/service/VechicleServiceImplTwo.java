package com.xworkz.vechicle.service;

import com.xworkz.vechicle.dto.VechicleDto;
import com.xworkz.vechicle.repo.VechicleRepo;

public class VechicleServiceImplTwo implements VechicleRepo {

	@Override
	public boolean save(VechicleDto dto) {
		System.out.println("Second method for repo");
		return false;
	}

}
