package com.xworkz.teashop.app;

import org.springframework.stereotype.Component;

@Component
public class TeaTime implements TeaShop {

	@Override
	public void givesEnergey() {
		System.out.println("givesEnergey method from TeaTime");

	}

	@Override
	public void immunityBooster() {
		System.out.println("immunityBooster method from TeaTime");

	}

}
