package com.xworkz.hostel;

public class EinsteinHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from EinsteinHostel ");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from EinsteinHostel ");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  EinsteinHostel");

	}

}
