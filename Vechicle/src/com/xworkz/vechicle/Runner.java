package com.xworkz.vechicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.vechicle.config.AppConfig;
import com.xworkz.vechicle.dto.VechicleDto;
import com.xworkz.vechicle.service.VechicleService;
import com.xworkz.vechicle.service.VechicleServiceImpl;

public class Runner {
  
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		VechicleDto dto = new VechicleDto(1,"Bike","TwoWheeler","Blcak",50000);
		
		VechicleService service = context.getBean(VechicleServiceImpl.class);
		boolean save =service.save(dto);
		System.out.println(save);
		

	}

}
