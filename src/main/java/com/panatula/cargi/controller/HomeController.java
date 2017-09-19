package com.panatula.cargi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET, value= "/home")
	public @ResponseBody
	String home(){
		return "Home says: Cargi is just starting , ways to go";
	}

}
