package com.xworkz.teashop.app;

import org.springframework.stereotype.Component;

@Component
public class ChaiWala implements TeaShop {

	@Override  
	public void givesEnergey() {
		System.out.println("givesEnergey method from ChaiWala");

	}

	@Override
	public void immunityBooster() {
		System.out.println("givesEnergey method from ChaiWala");

	}

}
