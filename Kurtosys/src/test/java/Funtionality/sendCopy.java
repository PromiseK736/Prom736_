package Funtionality;

import Base.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


//import org.openqa.selenium.By;


public class sendCopy extends base{
	
	private WebDriver _driver;
	By sendCopybutt = By.xpath("(//button[@type='submit'])[1]");
    
	
	
	public void clickSendCopy() {
		
		
		driver.findElement(sendCopybutt).click();
		
	}
	public void takeEvidence() throws IOException {
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)_driver;

	    File file = takesScreenshot.getScreenshotAs(OutputType.FILE);

	    FileUtils.copyFile(file, new File("Screenshots/image1.png"));
	}
	

}
