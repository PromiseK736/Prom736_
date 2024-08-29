package Funtionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class gotoURL extends base{

	String baseURL = "https://google.com";
	private WebDriver _driver;
	
	public gotoURL(WebDriver driver) {
		
		this._driver = driver;
		PageFactory.initElements(_driver,this);
	}

	public void launchURL()
	{
		_driver.navigate().to(baseURL);
		
	}
}
