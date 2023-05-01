package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.Combase;
import utilities.LoggerLoad;

public class Arrays extends Combase {
	

	@FindBy(xpath = "//body//div[2]//a[text()='Get Started']")
	WebElement arrayGetStarted;
	
	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement arraysInPython;
	
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHere;
	
	@FindBy(xpath ="//pre[@role='presentation']")
	WebElement textbox;
	
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runbutton;
	
	@FindBy(xpath = "//pre[@id='output']")
	WebElement output;
	
	public Arrays(WebDriver driver) {
		LoggerLoad.info("clickarraygetstartedbutton");
		PageFactory.initElements(driver,this);
		driver.switchTo().window(driver.getWindowHandle());	
	}
	public void ArrayGetStarted() {
	
		arrayGetStarted.click();
	}
	
	public void ArraysInPython() {
		arraysInPython.click();
	}
	
	public void TryHere() {
		tryHere.click();
	}
	
	public void Textbox() {
		textbox.sendKeys("print('in Arrays module')");
	}
	
	public void Runbutton() {
		runbutton.click();
	}
	public void outPut() {
		output.getText();
	}
	public String gethomepageTitle() {
		return "NumpyNinja";
	}
}