package com.xworkz.hostel;

public class HomCookingHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from HomCookingHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from HomCookingHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  HomCookingHostel");
		
	}

}
