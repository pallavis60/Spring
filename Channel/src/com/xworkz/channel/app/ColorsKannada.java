package com.xworkz.channel.app;

import org.springframework.stereotype.Component;

@Component(value = "colorsKannada")
public class ColorsKannada implements Channel {

	@Override
	public void giveEntertainment() {
		System.out.println("giveEntertainment from ColorsKannada");

	}

	@Override
	public void giveInspiration() {
		System.out.println("giveInspiration from ColorsKannada");
	}

}
