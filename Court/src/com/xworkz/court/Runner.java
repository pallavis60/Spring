package com.xworkz.court;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.court.app.CourtService;
import com.xworkz.court.config.AppConfig;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CourtService service = context.getBean(CourtService.class);
		service.callingServiceMethod();

	}

}
