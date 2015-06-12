package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorld {
 
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
 
		String message = "Spring MVC 3.0!!";
		return new ModelAndView("hello", "message", message);
	}
}