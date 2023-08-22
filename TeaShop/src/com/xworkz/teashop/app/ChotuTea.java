package com.xworkz.teashop.app;

import org.springframework.stereotype.Component;

@Component
public class ChotuTea implements TeaShop {

	@Override
	public void givesEnergey() {
		System.out.println("givesEnergey method from ChotuTea");

	}

	@Override
	public void immunityBooster() {
		System.out.println("immunityBooster method from ChotuTea");

	}

}
