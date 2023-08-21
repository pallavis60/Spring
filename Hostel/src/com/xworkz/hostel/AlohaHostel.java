package com.xworkz.hostel;

public class AlohaHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from AlohaHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from AlohaHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  AlohaHostel");

	}

}
