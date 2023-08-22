package com.xworkz.channel.app;

import org.springframework.stereotype.Component;

@Component(value = "zeeKannada")
public class ZeeKannada implements Channel {

	@Override
	public void giveEntertainment() {
		System.out.println("giveEntertainment from ZeeKannada");

	}

	@Override
	public void giveInspiration() {
		System.out.println("giveInspiration from ZeeKannada");

	}

}
