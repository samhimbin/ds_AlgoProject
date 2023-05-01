package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Combase;
import utilities.LoggerLoad;

public class HomePage extends Combase  {
 //WebDriver driver;
	
	//@FindBy(xpath="//button[text()='Get Started']") WebElement getstarted;
	//@FindBy(xpath="//button[text()='Get Started']") WebElement getstarted;
	//@FindBy(xpath="//a[text()='Data Structures']") WebElement dropdownele;
	//@FindBy(css = "div#dropdown-menu show")
		//@FindBy(linkText="Data Structures")	WebElement dropdownele;
	
	
	
	
	//@FindBy(xpath="//a[contains(text(),'Data Structures')]")WebElement dropdownele;
	@FindBy(xpath="//div[@class='nav-item dropdown']/a") WebElement dropdownele;
	@FindBy (xpath="//a[text()='Arrays']") WebElement arraysele;

	@FindBy (xpath="//a[text()='Linked List']")	WebElement linkedlistele;

	@FindBy (xpath="//a[text()='Stack']") WebElement stackele;

	@FindBy (xpath="//a[text()='Queue']") WebElement queueele;

	@FindBy (xpath="//a[text()='Tree']") WebElement treeele;

	@FindBy (xpath="//a[text()='Graph']") WebElement graphele;

	//@FindBy (className="alert alert-primary")WebElement alertele;
	@FindBy(xpath="//div[@role='alert']")WebElement alertele;
	@FindBy (xpath = "//h5[text()='Array']/..//a") WebElement moduleele;
	@FindBy(xpath = "//div[@class=\"dropdown-menu show\"]/a[2]")
	WebElement dropLinklist;

	//constructor of the homepage

	public  HomePage(WebDriver driver) {
		//this.driver=driver;
		LoggerLoad.info("enter homepage feature");
		PageFactory.initElements(driver,this);
		driver.switchTo().window(driver.getWindowHandle());
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);

	}
	public void getstartedbtn() {
		//driver.switchTo().activeElement();
		//getstarted.click();
	}
	public void dropDownclk() {
		
		LoggerLoad.info("enter dropdownclk");
		dropdownele.click();
	}
	public void arrays() {
		LoggerLoad.info("enter arrayselection");
		arraysele.click();
	}
	public String alert() {
		return alertele.getText();
	}
	public void modulegtstarted() {
		moduleele.click();
	}
	public void pickLinkedlist() {
		dropLinklist.click();
	}
}