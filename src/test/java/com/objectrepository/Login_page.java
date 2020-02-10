package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resource.Functionlibrary;

public class Login_page extends Functionlibrary{
	
public Login_page()
		{ 
	    PageFactory.initElements(driver, this);
			}
@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;

    @FindBy(id="login")
    private WebElement btn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtn() {
		return btn;
	}
}
