package com.xworkz.hostel;

public class ClinkHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from ClinkHostel");


	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from ClinkHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  ClinkHostel");
		
	}

}
