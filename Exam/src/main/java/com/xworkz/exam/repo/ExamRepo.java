package com.xworkz.exam.repo;

import java.util.List;

import com.xworkz.exam.dto.ExamDto;

public interface ExamRepo {
	
	public boolean save(ExamDto dto);
	
	public List<ExamDto> findByName(String name);
	
	

}
