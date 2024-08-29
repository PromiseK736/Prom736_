package Funtionality;

import org.openqa.selenium.By;

import Base.base;

public class whitepapertitle extends base{
	
	By titlePaper = By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div/div/div/div[1]/article[1]/div/div[1]/p/a");
	
	public void TitilePage()
	{
		driver.findElement(titlePaper).click();
	}

}
