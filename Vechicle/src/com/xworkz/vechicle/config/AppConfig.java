package com.xworkz.vechicle.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

import com.xworkz.vechicle.dto.VechicleDto;
import com.xworkz.vechicle.repo.VechicleRepo;
import com.xworkz.vechicle.repo.VechicleRepoImpl;
import com.xworkz.vechicle.service.VechicleServiceImplTwo;

                                                                                                                                                                                                                                                                                                      


@Configuration
@ComponentScan("com.xworkz.vechicle")
@Lazy(true)
public class AppConfig {
	
	@Bean
	public List<VechicleDto> getList(){
		return new ArrayList<VechicleDto>();
	}
	
	
	@Bean
    @Primary
	public VechicleRepo getVechicleRpoImpl() {
		return new  VechicleRepoImpl();
		
		
	}
	
	@Bean
	public VechicleRepo getVechicleRepoImplTwo() {
		return new VechicleServiceImplTwo();
		
	}

	

}
