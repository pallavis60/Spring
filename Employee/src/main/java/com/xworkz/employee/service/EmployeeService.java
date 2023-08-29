package com.xworkz.employee.service;

import java.util.List;

import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeService {

	public boolean save(EmployeeDto dto);

	public EmployeeDto findById(int id);

	public EmployeeDto findByIdAndName(int id, String name);

	public boolean updateExperianceByName(float exp, String name);

	public boolean updateExpAndPositionByNameAndId(float exp, String position, String name,int id);

	public boolean deleteByName(String name);
	
	public boolean deleteByNameAndId(int id,String name);

	public List<EmployeeDto> readAll();

}
