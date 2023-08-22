package com.xworkz.teashop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.teashop.app.ChaiWala;
import com.xworkz.teashop.app.ChotuTea;
import com.xworkz.teashop.app.DunDunsTeaShop;
import com.xworkz.teashop.app.PuneriTeaShop;
import com.xworkz.teashop.app.TeaShop;
import com.xworkz.teashop.app.TeaTime;
import com.xworkz.teashop.config.AppConfig;

public class TeaRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TeaShop tea = context.getBean(PuneriTeaShop.class);
		tea.givesEnergey();
		tea.immunityBooster();

		System.out.println("-------------------------------------");

		TeaShop tea1 = context.getBean(TeaTime.class);
		tea1.givesEnergey();
		tea1.immunityBooster();

		System.out.println("-------------------------------------");

		TeaShop tea2 = context.getBean(DunDunsTeaShop.class);
		tea2.givesEnergey();
		tea2.immunityBooster();

		System.out.println("-------------------------------------");

		TeaShop tea3 = context.getBean(ChotuTea.class);
		tea3.givesEnergey();
		tea3.immunityBooster();

		System.out.println("-------------------------------------");

		TeaShop tea4 = context.getBean(ChaiWala.class);
		tea4.givesEnergey();
		tea4.immunityBooster();

	}

}
