package PageObjects;
import java.io.IOException;
import stepdefinitions.Combase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Scenario;
import utilities.*;

public class registrationpage extends Combase {

	@FindBy(name="username") WebElement usrnametxt;
	@FindBy(name="password1") WebElement passwordtxt;
	@FindBy(name="password2") WebElement passwordcnftxt;
	@FindBy(xpath="//a[text()=' Register ']") WebElement reglink;
	@FindBy(xpath="//input[@value='Register']") WebElement registerbtn;
	@FindBy(xpath="//div[@role='alert']") WebElement alertmsg;

	//Actions act = new Actions(driver);
	Scenario scenario;
	 public  registrationpage(WebDriver webDriver)
	  {
	   PageFactory.initElements(webDriver, this);
	  }	
	public void registrationlink() throws InterruptedException{
		reglink.click();
		Thread.sleep(2000);
	}

	public void regbtnclk() {
		registerbtn.click();

	}


	public void readusernameandpassword(String uname,String pswrd,String pswrdcnf) throws IOException, InterruptedException {

		usrnametxt.sendKeys(uname);
		passwordtxt.sendKeys(pswrd);
		passwordcnftxt.sendKeys(pswrdcnf);
	}
}
