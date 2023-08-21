package com.xworkz.hostel;

public class TheHattersHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from TheHattersHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from TheHattersHostel");
	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  TheHattersHostel");

	}

}
