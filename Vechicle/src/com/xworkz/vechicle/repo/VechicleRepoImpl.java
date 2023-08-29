package com.xworkz.vechicle.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.vechicle.dto.VechicleDto;



public class VechicleRepoImpl implements VechicleRepo {
	
	@Autowired
	List<VechicleDto> list ;

	@Override
	public boolean save(VechicleDto dto) {
		
		list.add(dto);
		
		System.out.println("Data is saved");
		return true;
	}

}
