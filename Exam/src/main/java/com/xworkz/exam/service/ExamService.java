package com.xworkz.exam.service;

import java.util.List;

import com.xworkz.exam.dto.ExamDto;

public interface ExamService {
	
	public boolean save(ExamDto dto);
	
	public List<ExamDto> findByName(String name);
	
	public boolean DtoExist(String name);

}

