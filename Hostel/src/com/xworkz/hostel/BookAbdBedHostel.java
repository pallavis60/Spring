package com.xworkz.hostel;

public class BookAbdBedHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from BookAbdBedHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from BookAbdBedHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  BookAbdBedHostel");

	}

}
