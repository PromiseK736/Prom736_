package Funtionality;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;

import Base.base;

public class verifyCopySendmsg extends base{
	
	Alert alert = driver.switchTo().alert();
  
	public void copySendmsg() {
		
	
		try {
	       
	        alert.getText();

	        
	    } catch (Exception e) {
	    }
	}

}
