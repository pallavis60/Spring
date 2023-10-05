package com.xworkz.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DBBeanConfiig {

	@Bean
	public LocalEntityManagerFactoryBean getLOEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean emf = new LocalEntityManagerFactoryBean();
		emf.setPersistenceUnitName("databaseProperties");
		return emf;
	}

}
