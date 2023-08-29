package com.xworkz.watch.repo;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchRepo {

	public boolean save(WatchDto dto);

	public List<WatchDto> readAll();

	public boolean updateColourById(Integer id, String color);

	public boolean delete(String name);
	
	public boolean updateBranchById(Integer id, List<String> branch);

}
