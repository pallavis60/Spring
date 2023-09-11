package com.xworkz.spotify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class SpotifyDBConfig {
	
	
	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
		
		LocalEntityManagerFactoryBean emf = new LocalEntityManagerFactoryBean();
		emf.setPersistenceUnitName("databaseProperties");
		return emf;
	}

}
