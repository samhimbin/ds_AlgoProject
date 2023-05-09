package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.Basepage;

public class portalopeningpage extends Basepage {

	 public portalopeningpage (WebDriver webDriver)
	  {
	   PageFactory.initElements(webDriver, this);
	  }
	
	@FindBy(xpath="//button[text()='Get Started']") WebElement getstartedbtn;

		
	public void clickgetstartedbtn() {
		getstartedbtn.click();
	}
	public  String gethomepagetitle() {
		return "NumpyNinja";
	}
}
