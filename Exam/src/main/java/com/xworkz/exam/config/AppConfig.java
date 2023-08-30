package com.xworkz.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.exam")
public class AppConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactory() {
		LocalEntityManagerFactoryBean emf = new LocalEntityManagerFactoryBean();
		 emf.setPersistenceUnitName("databaseProperties");
		return emf;
		
	}

}
