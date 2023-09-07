package com.xworkz.institute.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class InstituteServiceImpl implements InstituteService {

	@Override
	public boolean validate(String userName, String email, String password, Model model) {
		if (userName != null && !userName.isEmpty() && userName.length() >= 5) {

			if (email != null && !email.isEmpty() && email.length() >= 10) {

				if (password != null && !password.isEmpty() && password.length() >= 8 && password.length() <= 16) {
					System.out.println("Data is validated");
					return true;
				}
				model.addAttribute("password", "Password is not valid");
				System.out.println("Passwrod is not valid");
				return false;

			}
			model.addAttribute("email", "Email is not valid");
			System.out.println("Email is not valid");
			return false;

		}

		model.addAttribute("userName", "UserName is not valid");
		System.out.println("UserName is not valid");
		return false;
	}

}
