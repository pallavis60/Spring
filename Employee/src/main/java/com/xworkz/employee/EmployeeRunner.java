package com.xworkz.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.employee.config.AppConfig;
import com.xworkz.employee.constant.Gender;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import com.xworkz.employee.service.EmployeeServiceImpl;

public class EmployeeRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeDto dto = new EmployeeDto(1, "Sheela", "Manager", "4-5-2023", 3.3f, "Shivamogga", "BE", 24,
				Gender.Female, 9845935213L);
		EmployeeDto dto1 = new EmployeeDto(2, "Maha", "Developer", "3-4-2022", 4.2f, "Tamilnadu", "BE", 22,
				Gender.Female, 8645935213L);
		EmployeeDto dto2 = new EmployeeDto(3, "Lakshmi", "Ceo", "6-6-2021", 5.7f, "Kalburgi", "Bcom", 27, Gender.Female,
				9787654545L);
		EmployeeDto dto3 = new EmployeeDto(4, "Nikitha", "BusinessAnalist", "7-7-2020", 7.3f, "Dhavangere", "BSE", 24,
				Gender.Female, 8976565655L);
		EmployeeDto dto4 = new EmployeeDto(5, "Anusha", "ChiefExecutiveOfficer", "9-6-2023", 3.3f, "Belagavi", "BSE",
				24, Gender.Female, 8989898989L);
		EmployeeDto dto5 = new EmployeeDto(6, "Aman", "ChiefInformationOfficer", "10-5-2023", 3.3f, "Rajasthan", "MSE",
				24, Gender.Female, 8787656545L);

		EmployeeService service = context.getBean(EmployeeServiceImpl.class);
//	boolean save=service.save(dto);  
//	System.out.println(save);
//	service.save(dto1);
//	service.save(dto2);
//	service.save(dto3);
//	service.save(dto4);
//	service.save(dto5);

		EmployeeDto foundedId = service.findById(1);
		System.out.println(foundedId);

		System.out.println("=======================================");
		EmployeeDto foundedDto = service.findByIdAndName(2, "Maha");
		System.out.println(foundedDto);

		System.out.println("======================================");

		boolean update = service.updateExperianceByName(6.0f, "Lakshmi");
		System.out.println(update);

		System.out.println("===============================================");

		boolean updated = service.updateExpAndPositionByNameAndId(5.3f, "Manager", "Aman",6);
		System.out.println(updated);

		System.out.println("==========================================");

		// boolean dlt = service.deleteByName("Nikitha");
		// System.out.println(dlt);
		
		//boolean dlt = service.deleteByNameAndId(5, "Anusha");
		//System.out.println(dlt);

		List<EmployeeDto> read = service.readAll();

		for (EmployeeDto list : read) {
			System.out.println(list);
		}

	}

}