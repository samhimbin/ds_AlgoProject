package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import DriverFactory.driversetup;
import utilities.*;
import stepdefinitions.Combase;

public class Loginpage extends Combase{


	@FindBy(linkText="Sign in") WebElement signinlink;
	@FindBy(id="id_username") WebElement usrnametxt;
	@FindBy(id="id_password") WebElement passwrdtxt;
	@FindBy(xpath="//input[@value='Login']") WebElement loginbtn;
	@FindBy(xpath="//div[@role='alert']") WebElement alertmsg;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		driver.switchTo().window(driver.getWindowHandle());
	}

	public boolean enternamepasswrd(String givenusrname,String givenpasswrd,WebDriver driver)
	{
		usrnametxt.sendKeys(givenusrname);
		passwrdtxt.sendKeys(givenpasswrd);
		Boolean isRequired=false;
		
		// To check empty fields , we need to check "required" field is on an attribute
		if (givenusrname.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", usrnametxt);
			return isRequired;
		} else if (givenpasswrd.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;",passwrdtxt);
			return isRequired;
		}
		return isRequired;
	}

	public String loginbtnclk() {
		loginbtn.click();
		return alertmsg.getText();
	}

}