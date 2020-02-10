package com.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Functionlibrary {
	
	public static WebDriver driver;
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\hotel\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);		
	}

	public void type(WebElement ele,String name) {
		ele.sendKeys(name);	
	}
	
	public void button(WebElement ele) {
		ele.click();
		}
		public void dropdown(WebElement ele,String name) {
			Select s=new Select(ele);
		   s.selectByVisibleText(name);
		}
    public void date(WebElement ele, String name) throws ParseException {
    	SimpleDateFormat fr=new SimpleDateFormat("m/d/y");
fr.parse(name);    	
    }
}
