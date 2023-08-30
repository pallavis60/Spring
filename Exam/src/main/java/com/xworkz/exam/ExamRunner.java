package com.xworkz.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.exam.config.AppConfig;
import com.xworkz.exam.constant.Department;
import com.xworkz.exam.dto.ExamDto;
import com.xworkz.exam.service.ExamService;
import com.xworkz.exam.service.ExamServiceImpl;

public class ExamRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ExamDto dto = new ExamDto(5,Department.Science,101,"RanjiniNayak","Chemisty",3.3f,"4-5-23");
		ExamDto dto1 = new ExamDto(2,Department.Arts,101,"Ashwini","History",2.3f,"5-5-22");
		
		ExamService service =context.getBean(ExamServiceImpl.class);
		service.DtoExist(dto.getStudentName());
	    boolean save =service.save(dto);
	    System.out.println(save);
		
	}

}
