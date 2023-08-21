package com.xworkz.hostel;

public class AuroraHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from AuroraHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from AuroraHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  AuroraHostel");

	}

}
