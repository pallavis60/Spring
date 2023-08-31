package com.xworkz.taxi;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taxi.config.TaxiConfig;
import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

public class TaxiRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(TaxiConfig.class);

		TaxiDto dto = new TaxiDto(1, 5789, 800, true, "J.P Nagar", "7");
		TaxiDto dto1 = new TaxiDto(2, 9866, 900, true, "Janagarr", "3");
		TaxiDto dto2 = new TaxiDto(3, 4789, 1000, true, "Btm Layout", "2");
		TaxiDto dto3 = new TaxiDto(4, 3885, 1900, true, "Rajajinagar", "5");

		TaxiService service = context.getBean(TaxiServiceImpl.class);

//		boolean save=service.saveTaxi(dto1);
//		service.saveTaxi(dto2);
//		service.saveTaxi(dto3);
//		System.out.println(save);

		TaxiDto find = service.findTaxiByLocation("Janagarr");
		System.out.println(find);

		System.out.println("=====================================");
		List<TaxiDto> dtos = service.findByAvailableStatus(false);
		for (TaxiDto list : dtos) {
			System.out.println(list);
		}

		System.out.println("=====================================");

  boolean update =  service.updateTaxiAvailableById(1, true);
   System.out.println(update);

		System.out.println("=====================================");

		boolean updated = service.updateTaxiEarningsById(1000, 1);
		System.out.println(updated);
		
		service.bookTaxi();

		System.out.println("=====================================");

		List<TaxiDto> read = service.readAll();

		for (TaxiDto list : read) {
			System.out.println(list);

		}

	}

}
