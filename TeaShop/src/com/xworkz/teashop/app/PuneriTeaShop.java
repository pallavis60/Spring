package com.xworkz.teashop.app;

import org.springframework.stereotype.Component;

@Component
public class PuneriTeaShop implements TeaShop {

	@Override
	public void givesEnergey() {
		System.out.println("giveEnergy method from PuneriTeaShop");

	}

	@Override
	public void immunityBooster() {
		System.out.println("immunityBooster method from PuneriTeaShop");

	}

}
