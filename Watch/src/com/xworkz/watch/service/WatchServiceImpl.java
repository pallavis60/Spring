package com.xworkz.watch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepo;


@Component
public class WatchServiceImpl implements WatchService {
	
	@Autowired
	WatchRepo repo;

	@Override
	public boolean save(WatchDto dto) {
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getBrandName()!=null) {
					if(dto.getBranches()!=null) {
						System.out.println("Data is validated");
					return 	repo.save(dto);
					}
					System.out.println("Branch is not valid");
					return false;
				}
				System.out.println("brandName is not valid");
				return false;
			}
			System.out.println("id is not valid");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public List<WatchDto> readAll() {
		System.out.println("Read method from service");
		return repo.readAll();
	}

	@Override
	public boolean updateColourById(Integer id, String color) {
		if(id>0) {
			if(color!=null) {
				System.out.println("Data is validate");
				return repo.updateColourById(id, color);
			}
			System.out.println("Color is not valid");
			return false;
		}
		System.out.println("Id is not valid");
		return false;
	}

	@Override
	public boolean delete(String name) {
		if(name!=null) {
			System.out.println("Name is valid");
			return repo.delete(name);
		}
		System.out.println("Name is not valid");
		return false;
	}

	@Override
	public boolean updateBranchById(Integer id, List<String> branch) {
				
		return repo.updateBranchById(id, branch);
		
	}

}
