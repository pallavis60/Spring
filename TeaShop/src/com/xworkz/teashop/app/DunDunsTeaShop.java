package com.xworkz.teashop.app;

import org.springframework.stereotype.Component;

@Component
public class DunDunsTeaShop implements TeaShop {

	@Override
	public void givesEnergey() {
		System.out.println("givesEnergey method from DunDunsTeaShop");

	}

	@Override
	public void immunityBooster() {
		System.out.println("immunityBooster method from DunDunsTeaShop");


	}

}
