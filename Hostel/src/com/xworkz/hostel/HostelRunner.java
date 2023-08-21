package com.xworkz.hostel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.hostel.config.AppConfig;

public class HostelRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Hostel hostel = context.getBean(AlohaHostel.class);

		hostel.helpsToStay();
		hostel.givesSecurity();
		hostel.givenForRent(10000);

		System.out.println("------------------------------------------");

		Hostel hostel1 = context.getBean(AngmohHostel.class);

		hostel1.helpsToStay();
		hostel1.givesSecurity();
		hostel1.givenForRent(5000);

		System.out.println("------------------------------------------");

		Hostel hostel2 = context.getBean(AuroraHostel.class);

		hostel2.helpsToStay();
		hostel2.givesSecurity();
		hostel2.givenForRent(6000);

		System.out.println("------------------------------------------");

		Hostel hostel3 = context.getBean(BabilaHostel.class);

		hostel3.helpsToStay();
		hostel3.givesSecurity();
		hostel3.givenForRent(7000);

		System.out.println("------------------------------------------");

		Hostel hostel4 = context.getBean(BookAbdBedHostel.class);

		hostel4.helpsToStay();
		hostel4.givesSecurity();
		hostel4.givenForRent(8000);

		System.out.println("------------------------------------------");

		Hostel hostel5 = context.getBean(ClinkHostel.class);

		hostel5.helpsToStay();
		hostel5.givesSecurity();
		hostel5.givenForRent(8600);

		System.out.println("------------------------------------------");

		Hostel hostel6 = context.getBean(CracowHostel.class);

		hostel6.helpsToStay();
		hostel6.givesSecurity();
		hostel6.givenForRent(6500);

		System.out.println("------------------------------------------");

		Hostel hostel7 = context.getBean(EinsteinHostel.class);

		hostel7.helpsToStay();
		hostel7.givesSecurity();
		hostel7.givenForRent(5500);

		System.out.println("------------------------------------------");

		Hostel hostel8 = context.getBean(HomCookingHostel.class);

		hostel8.helpsToStay();
		hostel8.givesSecurity();
		hostel8.givenForRent(8400);

		System.out.println("------------------------------------------");

		Hostel hostel9 = context.getBean(TheHattersHostel.class);

		hostel9.helpsToStay();
		hostel9.givesSecurity();
		hostel9.givenForRent(6100);

	}

}
