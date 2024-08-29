package Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.base;

public class fillDetails extends base{
	
	By fistName = By.xpath("(//input[@id='form-field-firstname'])[1]");
	By lastName = By.xpath("(//input[@id='form-field-lastname'])[1]");
	By company = By.xpath("//input[@id='form-field-company']");
	By industry = By.xpath("//select[@id='form-field-industry']");
	
	public void filldetails()
	{
		driver.findElement(fistName).sendKeys("promise");
		driver.findElement(lastName).sendKeys("khosa");
		driver.findElement(company).sendKeys("Kurtosys");
		
		WebElement nameToSelect = driver.findElement(industry);
		Select sele = new Select(nameToSelect);
		sele.selectByVisibleText("Banking");
		
	}

}
