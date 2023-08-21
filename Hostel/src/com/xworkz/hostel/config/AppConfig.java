package com.xworkz.hostel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.hostel.AlohaHostel;
import com.xworkz.hostel.AngmohHostel;
import com.xworkz.hostel.AuroraHostel;
import com.xworkz.hostel.BabilaHostel;
import com.xworkz.hostel.BookAbdBedHostel;
import com.xworkz.hostel.ClinkHostel;
import com.xworkz.hostel.CracowHostel;
import com.xworkz.hostel.EinsteinHostel;
import com.xworkz.hostel.HomCookingHostel;
import com.xworkz.hostel.TheHattersHostel;

@Configuration
public class AppConfig {

	@Bean
	public AlohaHostel getAlohaHostel() {

		return new AlohaHostel();
	}

	@Bean
	public AngmohHostel getAngmohHostel() {

		return new AngmohHostel();
	}

	@Bean
	public AuroraHostel getAuroraHostel() {

		return new AuroraHostel();

	}

	@Bean
	public BabilaHostel getBabilaHostel() {

		return new BabilaHostel();
	}

	@Bean
	public BookAbdBedHostel getBookAbdBedHostel() {

		return new BookAbdBedHostel();
	}

	@Bean
	public ClinkHostel getClinkHostel() {

		return new ClinkHostel();
	}

	@Bean
	public CracowHostel getCracowHostel() {
		return new CracowHostel();
	}

	@Bean
	public EinsteinHostel getEinsteinHostel() {

		return new EinsteinHostel();
	}

	@Bean
	public HomCookingHostel getHomCookingHostel() {

		return new HomCookingHostel();
	}

	@Bean
	public TheHattersHostel getHattersHostel() {

		return new TheHattersHostel();

	}

}
