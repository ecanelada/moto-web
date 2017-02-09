package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, This is your new Moto-web project. ENJOY Spring!</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
