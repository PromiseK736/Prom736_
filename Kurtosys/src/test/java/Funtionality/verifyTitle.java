package Funtionality;

import org.openqa.selenium.By;

import Base.base;

public class verifyTitle extends base{
	
	By titleReads = By.xpath("//h2[contains(text(),'White Papers')]");
	String verifyName = "White Papers";
	
	public void TitleRead()
	{
		String title = driver.findElement(titleReads).getText();
		
		if(title.equalsIgnoreCase(verifyName))
		{
			System.out.println("title is correct");
			
		}
		
		else {
			System.out.println("title not correct");
		}
	}

}
