package com.xworkz.court.app;

import org.springframework.stereotype.Component;

@Component(value="highCourt")
public class HighCourt implements Court {

	@Override
	public void givesTheRightDecision() {
		System.out.println("givesTheRightDecision from  HighCourt");

	}

	@Override
	public void givesTheReliefFromPressure() {
		System.out.println("givesTheReliefFromPressure from  HighCourt");

	}

}
