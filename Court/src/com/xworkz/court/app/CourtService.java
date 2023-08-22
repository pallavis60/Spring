package com.xworkz.court.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CourtService {

	@Autowired
	@Qualifier(value = "highCourt")
	private Court court;

	@Autowired
	@Qualifier(value = "supremeCourt")
	private Court court1;

	public void callingServiceMethod() {

		court.givesTheRightDecision();
		court.givesTheReliefFromPressure();

		court1.givesTheRightDecision();
		court1.givesTheReliefFromPressure();
	}

}
