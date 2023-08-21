package com.xworkz.hostel;

public class BabilaHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from BabilaHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from BabilaHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  BabilaHostel");
	}

}
