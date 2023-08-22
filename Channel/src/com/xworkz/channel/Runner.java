package com.xworkz.channel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.channel.app.ChannelService;
import com.xworkz.channel.config.AppConfig;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ChannelService service = context.getBean(ChannelService.class);
		service.serviceMethod();
	}

}
