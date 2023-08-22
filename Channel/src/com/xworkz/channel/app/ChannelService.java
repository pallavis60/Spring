package com.xworkz.channel.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChannelService {

	@Autowired
	@Qualifier("zeeKannada")
	private Channel channel;

	@Autowired
	@Qualifier("colorsKannada")
	private Channel channel2;

	public void serviceMethod() {

		channel.giveEntertainment();
		channel.giveInspiration();

		channel2.giveEntertainment();
		channel2.giveInspiration();
	}

}
