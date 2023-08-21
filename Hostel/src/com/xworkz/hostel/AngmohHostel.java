package com.xworkz.hostel;

public class AngmohHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from AngmohHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from AngmohHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  AngmohHostel");

	}

}
