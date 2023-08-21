package com.xworkz.hostel;

public class CracowHostel implements Hostel {

	@Override
	public void helpsToStay() {
		System.out.println("helpsToStay from CracowHostel");

	}

	@Override
	public void givesSecurity() {
		System.out.println("givesSecurity from CracowHostel");

	}

	@Override
	public void givenForRent(int amount) {
		System.out.println("givenForRent from  CracowHostel");
		
	}

}
