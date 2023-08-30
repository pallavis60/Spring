package com.xworkz.employee.config;


import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.employee")
public class AppConfig {
	
//	@Bean
//	public EntityManagerFactory getEntityManagerFactory() {
//	
// LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//		      emf.setPersistenceUnitName("databaseProperties");
//		      return (EntityManagerFactory) emf;
//	}
// 
}
