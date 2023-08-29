package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchService {
	
	public boolean save(WatchDto dto);
	
	public List<WatchDto> readAll();
	
	public boolean updateColourById(Integer id,String color);
	
	public boolean delete(String name);
	
	public boolean updateBranchById(Integer id,List<String> branch);

	

}
