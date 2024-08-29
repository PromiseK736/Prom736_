package Funtionality;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.*;

public class stepDefition {
	
	public gotoURL gotourl;
	public whitepapers whitepapers;
	public verifyTitle verifytitle;
	public whitepapertitle whitepapertitle;
	public fillDetails filldetails;
	public sendCopy clicksendCopy;
	public verifyCopySendmsg copySendmsg;
	
	public void setup(WebDriver driver)
	{
		gotourl = new gotoURL(driver);
		whitepapers = new whitepapers();
		verifytitle = new verifyTitle();
		whitepapertitle = new whitepapertitle();
		filldetails = new fillDetails();
		clicksendCopy = new sendCopy();
		copySendmsg = new verifyCopySendmsg();
		
		
	}
	
	@Given("launch url")
	public void launch_url() 
	{
		gotourl.launchURL();
	}
	
	@When("click white papers")
	public void click_white_papers() 
	{
		whitepapers.WhitepaperREsource();

	}

	@When("verify title reads")
	public void verify_title_reads() 
	{
		verifytitle.TitleRead();

	}

	@When("click white paper title")
	public void click_white_paper_title() 
	{
		whitepapertitle.TitilePage();
	}

	@Then("fill details")
	public void fill_details() 
	{
		filldetails.filldetails();
	}

	@Then("click send copy")
	public void click_send_copy() 
	{
	
		clicksendCopy.clickSendCopy();
	}
	
	@Then("verify copy send")
	public void verify_copy_send() 
	{
		copySendmsg.copySendmsg();
	}

}
