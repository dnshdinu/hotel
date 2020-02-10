package com.stepdefinition;


import com.resource.Functionlibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Functionlibrary {
	@Before
	public void beforebackground() {
		launch("https://adactin.com/HotelApp/");
		
	}
	
	@After
	public void afterscenario() {
		driver.close();
	}

}
