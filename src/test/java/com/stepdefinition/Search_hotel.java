package com.stepdefinition;

import java.text.ParseException;

import com.objectrepository.Login_page;
import com.objectrepository.Searchhotel_page;
import com.resource.Functionlibrary;

import cucumber.api.java.en.When;

public class Search_hotel extends Functionlibrary {
	
	@When("user need to search for the hotel by fill the form")
	public void user_need_to_search_for_the_hotel_by_fill_the_form() throws ParseException {
	   Login_page page=new Login_page();
	   type(page.getUser(),"dnsh2627");
	   type(page.getPass(),"dnsh26dhivya27");
		button(page.getBtn());
		Searchhotel_page page1=new Searchhotel_page();
		dropdown(page1.getLocation(), "Sydney");
		dropdown(page1.getHotels(), "Hotel Sunshine");
		dropdown(page1.getRoom_type(), "Double");
		dropdown(page1.getRoom_nos(), "1 - One");
type(page1.getDatepick_in(),"20/01/2020");
type(page1.getDatepick_out(),"22/01/2020");
		dropdown(page1.getAdult_room(),"2 - Two");
		dropdown(page1.getChild_room(), "- Select Children per Room -");
	}

	@When("click on search button")
	public void click_on_search_button() {
	  
	}

}
