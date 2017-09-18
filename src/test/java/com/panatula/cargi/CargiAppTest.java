package com.panatula.cargi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.panatula.cargi.controller.HomeController;


public class CargiAppTest 
{
	@Test
	public void starterTest()
    {
		HomeController controller = new HomeController();
		String greeting = controller.home().toString();
		assertEquals(greeting, "Cargi is just starting , ways to go");
       
    }
}
