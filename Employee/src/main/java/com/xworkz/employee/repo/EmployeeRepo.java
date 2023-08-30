package com.xworkz.employee.repo;

import java.util.List;

import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeRepo {

	public boolean save(EmployeeDto dto);

	public EmployeeDto findById(int id);

	public EmployeeDto findByIdAndName(int id, String name);

	public boolean updateExperianceByName(float exp, String name);

	public boolean updateExpAndPositionByNameAndId(float exp, String position, String name,int id);

	public boolean deleteByName(String name);

	public List<EmployeeDto> readAll();

	public boolean deleteByNameAndId(int id, String name);
	
	public List<EmployeeDto> findByName(String name);
	

}
