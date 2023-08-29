package com.xworkz.watch;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.watch.config.AppConfig;
import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class Runner {

	public static void main(String[] args) {

		List<String> li = Arrays.asList("BTM", "Jayanagar", "Rajajinagar");
		List<String> li2 = Arrays.asList("BTM", "Jayanagar");
		List<String> li3=Arrays.asList("Jayanagar","JpNagar");

		ApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);

		WatchDto dto = new WatchDto(1, "Sonata", 800, li, "Black");
		WatchDto dto1 = new WatchDto(2, "FastTrack", 900, li2, "Brown");
		WatchDto dto2 = new WatchDto(3, "Titan", 10000, li, "White");

		WatchService service = contex.getBean(WatchServiceImpl.class);
		service.save(dto);
		service.save(dto1);
		boolean save = service.save(dto2);
		System.out.println(save);

		boolean update = service.updateColourById(1, "Grey");
		System.out.println(update);
		
		boolean up2=service.updateBranchById(2, li3);
		System.out.println(up2);
		
		//boolean dlt = service.delete("Titan");
	    //System.out.println(dlt);

		List<WatchDto> read = service.readAll();
		for (WatchDto dtoList : read) {
			System.out.println(dtoList);
		}

	}

}
