package PageObjects;
import java.io.IOException;
import stepdefinitions.Basepage;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Scenario;
import utilities.*;

public class registrationpage extends Basepage {

	public  registrationpage(WebDriver webDriver)
	  {
	   PageFactory.initElements(webDriver, this);
	  }
	
	@FindBy(name="username") WebElement usrnametxt;
	@FindBy(name="password1") WebElement passwordtxt;
	@FindBy(name="password2") WebElement passwordcnftxt;
	@FindBy(xpath="//a[text()=' Register ']") WebElement reglink;
	@FindBy(xpath="//input[@value='Register']") WebElement registerbtn;
	@FindBy(xpath="//div[@role='alert']") WebElement alertmsg;

	
	 	
	public void registrationlink() throws InterruptedException{
		reglink.click();
		
	}

	public void regbtnclk() {
		registerbtn.click();

	}


	public void readusernameandpassword(String uname,String pswrd,String pswrdcnf) throws IOException, InterruptedException {

		usrnametxt.sendKeys(uname);
		passwordtxt.sendKeys(pswrd);
		passwordcnftxt.sendKeys(pswrdcnf);
	}
	public void generateRandomUsernamePassword() {
		String randomUserName = RandomStringUtils.randomAlphabetic(10);
		usrnametxt.sendKeys(randomUserName);
		 String randomPassword=RandomStringUtils.randomAlphanumeric(10);
	     passwordtxt.sendKeys(randomPassword);
	     passwordcnftxt.sendKeys(randomPassword);
	     
	}
	public String alertdismsg() {
		 return alertmsg.getText();
	}
	
}
