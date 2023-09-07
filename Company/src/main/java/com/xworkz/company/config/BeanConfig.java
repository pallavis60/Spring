package com.xworkz.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.company")
@EnableWebMvc
public class BeanConfig  implements WebMvcConfigurer  {
	
	public BeanConfig() {
		System.out.println("Constructor from BeanConfig ");
	}
	
	@Bean
	public ViewResolver viweResolver() {
		
		return new  InternalResourceViewResolver("/WEB-INF/", ".jsp");
	}

}
