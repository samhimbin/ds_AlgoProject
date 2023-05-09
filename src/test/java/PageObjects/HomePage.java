package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Basepage;
import utilities.LoggerLoad;

public class HomePage extends Basepage {
	
	// constructor of the homepage

		public HomePage(WebDriver driver) {

			LoggerLoad.info("enter homepage feature");
			PageFactory.initElements(driver, this);
			
		}

	@FindBy(xpath = "//div[@class='nav-item dropdown']/a")
	WebElement dropdownele;
	@FindBy(xpath = "//a[text()='Arrays']")
	WebElement arraysele;

	@FindBy(xpath = "//a[text()='Linked List']")
	WebElement linkedlistele;

	@FindBy(xpath = "//a[text()='Stack']")
	WebElement stackele;

	@FindBy(xpath = "//a[text()='Queue']")
	WebElement queueele;

	@FindBy(xpath = "//a[text()='Tree']")
	WebElement treeele;

	@FindBy(xpath = "//a[text()='Graph']")
	WebElement graphele;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement alertele;
	@FindBy(xpath = "//h5[text()='Array']/..//a")
	WebElement moduleele;
	@FindBy(xpath = "//div[@class=\"dropdown-menu show\"]/a[2]")
	WebElement dropLinklist;

	

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
	public void selectstack() {
		stackele.click();
	}
	public void selectqueue() {
		queueele.click();
	}
	public void selectlinklist() {
		linkedlistele.click();
	}
	public void selectgraph() {
		graphele.click();
	}
	
}