package com.xworkz.watch.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.watch.dto.WatchDto;

@Component
public class WatchRepoImpl  implements WatchRepo{
	@Autowired
	List<WatchDto> list;

	@Override
	public boolean save(WatchDto dto) {
		
		list.add(dto);
		System.out.println("Data is saved");
		return true;
	}

	@Override
	public List<WatchDto> readAll() {
		System.out.println("Read method from repo");
		return list;
	}

	@Override
	public boolean updateColourById(Integer id, String color) {
				
		System.out.println("Updated ");
		
     for(WatchDto dto :list) {
    	if( dto.getId().equals(id)) {
    		dto.setColor(color);
    		System.out.println("Color is updated");
    		return true;
    	}
    	System.out.println("Value is not matching");
    	return false;
    	
     }
     System.out.println("Value is not updated");
     return false;
   
	}

	@Override
	public boolean delete(String name) {
		for(WatchDto dto :list) {
		if(dto.getBrandName().equals(name)) {
			list.remove(dto);
			System.out.println("Deleted");
			return true;
		}
			
		}
		return false;
	}

	@Override
	public boolean updateBranchById(Integer id, List<String> branch) {
		
		for(WatchDto dto :list) {
			if(dto.getId().equals(id)) {
				dto.setBranches(branch);
				System.out.println("Branch is updated");
				return true;
			}
		}
		return false;
	}

}
