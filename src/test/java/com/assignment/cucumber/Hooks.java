package com.assignment.cucumber;

import java.io.IOException;

import com.assignment.utils.Inputs;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks{
	
	Driverfactory driverfactory; 
	
	@Before
	public void inputs() throws IOException {
		System.out.println("========================Before Hooks================");
		Inputs.inputs();
		driverfactory.webDriverinit();
	}
	@After
	public void teardown() {
		
		System.out.println("=============After Hooks================");
		//driverfactory.driver.quit();
	}

} 
