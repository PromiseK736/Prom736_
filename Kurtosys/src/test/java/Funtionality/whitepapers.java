package Funtionality;

import org.openqa.selenium.By;

import Base.base;

public class whitepapers extends base{
	
	By whitepaperResouirce = By.xpath("(//span[contains(text(),'White Papers & eBooks')])[3]");
	
	public void WhitepaperREsource()
	{
		driver.findElement(whitepaperResouirce).click();
	}
	
	
}
