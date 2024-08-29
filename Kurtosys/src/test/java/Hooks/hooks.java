package Hooks;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.base;

public class hooks extends base{
	
	@Before
	public void beforeBrwoser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pzk0412\\eclipse-workspace\\Kurtosys\\src\\test\\resources\\resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@After
	public void afterBrowser()
	{
		driver.close();
	}

}
