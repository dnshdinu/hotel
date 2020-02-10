package com.stepdefinition;

import com.objectrepository.Login_page;
import com.resource.Functionlibrary;

import cucumber.api.java.en.When;

public class Login extends Functionlibrary {
	Login_page page=new Login_page();
	
	@When("need to enter the username and password")
	public void need_to_enter_the_username_and_password() {
	   
	   type(page.getUser(),"dnsh2627");
	   type(page.getPass(),"dnsh26dhivya27");
	}

	@When("click the login button")
	public void click_the_login_button() {
	   button(page.getBtn());
	}
}
