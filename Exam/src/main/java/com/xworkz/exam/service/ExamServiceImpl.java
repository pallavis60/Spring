package com.xworkz.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.exam.dto.ExamDto;
import com.xworkz.exam.repo.ExamRepo;

@Component
public class ExamServiceImpl implements ExamService {
	
	@Autowired
	private ExamRepo repo;

	@Override
	public boolean save(ExamDto dto) {
		if(!DtoExist(dto.getStudentName())) {
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getRollNo()>0) {
					if(dto.getStudentName()!=null && dto.getStudentName().length()>5) {
						if(dto.getSubject()!=null) {
							if(dto.getDepartment()!=null) {
								if(dto.getTimimg()>2) {
									System.out.println("Data is validated");
									return repo.save(dto);
								}
								System.out.println("Timing is not valid");
								return false;
							}
							System.out.println("department is not valid");
							return false;
							
						}
						System.out.println("Subject is not valid");
						return false;
					}
					System.out.println("Student name is not valid");
					return false;
				}
				System.out.println("RollNumber is not valid");
				return false;
			}
			System.out.println("Id is not valid");
			return false;
		}
		System.out.println("Dto is null");
		return false;
	}
		System.out.println("dto is already Exist");
		return false;
		
	}
	
	@Override
	public List<ExamDto> findByName(String name) {
		 List<ExamDto> list= repo.findByName(name);
		 if(list != null) {
			 System.out.println("given dto is not null from FindByName");
			 return list;
		 }
		 System.out.println("dto service");
		 return null;
		
	}

	
	
@Override
	public boolean DtoExist(String name) {
	
	if(findByName( name)!= null) {
		 System.out.println("given dto is not null from dtpExist");
		 
		return true; 
	 }
	 System.out.println("dto service");
	return false;
	
}

}
