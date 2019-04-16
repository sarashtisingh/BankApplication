package com.cg.xyzBank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("manager")
public class ManagerController {

	@PostMapping("login")
	public ModelAndView loginValidation(@RequestParam String username, @RequestParam String password) {
		ModelAndView modelandView = null;
		if (username.equals("xyz") && password.equals("manager")) {
			modelandView = new ModelAndView("addCustomer");

		} else {
			modelandView = new ModelAndView("manager");
		}
		return modelandView;
	}
}
