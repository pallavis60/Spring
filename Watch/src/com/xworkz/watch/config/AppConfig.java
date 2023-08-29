package com.xworkz.watch.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.watch.dto.WatchDto;


@Configuration
@ComponentScan("com.xworkz.watch")
public class AppConfig {
	
	@Bean
	public List<WatchDto> getList(){
		return new ArrayList<WatchDto>();
		
	}

}
