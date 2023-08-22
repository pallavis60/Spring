package com.xworkz.court.app;

import org.springframework.stereotype.Component;

@Component(value ="supremeCourt" )
public class SupremeCourt implements Court {

	@Override
	public void givesTheRightDecision() {
		System.out.println("givesTheRightDecision from  SupremeCourt");
	}

	@Override
	public void givesTheReliefFromPressure() {
		System.out.println("givesTheReliefFromPressure from  SupremeCourt");

	}

}
