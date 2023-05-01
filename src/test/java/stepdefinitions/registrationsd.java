package stepdefinitions;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.*;
import stepdefinitions.Combase;
import PageObjects.registrationpage;
import io.cucumber.java.en.*;
import utilities.*;

public class registrationsd extends Combase {
	String excelpath =".\\src/test/resources/ExcelData/ds-algoregistration.xlsx";
	
	//String excelpath =".\\src/test/resources/ExcelData/dummysheet.xlsx";

	String expmsg="";
	
	@Given("user click registration link")
	public void user_click_registration_link() throws InterruptedException  {
		
		//driver.switchTo().window(driver.getWindowHandle());
		
		registerPage = new registrationpage(driversetup.getDriver());
		registerPage.registrationlink();
		Thread.sleep(2000);
	}

	@When("user enter username,password,confirm password from given {string} and {int}")
	public void user_enter_username_password_confirm_password_from_given_and(String string, Integer int1) throws IOException, InvalidFormatException, InterruptedException {	  

		ExcelReader reader = new ExcelReader();
		LoggerLoad.info("User enter registration credentials");
		List<Map<String, String>> testData=reader.getData(excelpath,"Sheet1");
		String User_name=testData.get(int1).get("username"); // Column heading
		String Pass_word=testData.get(int1).get("password"); // Column heading
		String Pass_wordcnf = testData.get(int1).get("passwordconfirm");
		expmsg=testData.get(int1).get("expectedmsg");
		registerPage.readusernameandpassword(User_name, Pass_word,Pass_wordcnf);
		LoggerLoad.info("Registration credentials entered");
		Thread.sleep(2000);
	}

	@Then("user click register button with expected message")
	public void user_click_register_button_with_expected_message() throws InterruptedException {
		registerPage.regbtnclk();
		/*String actmsg="";
		WebElement hidtext=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='username']"))));
		System.out.println(hidtext.getAttribute("validationMessage"));
		LoggerLoad.info(hidtext.getAttribute("validationMessage"));
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driversetup.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName()); 
		}   
		driversetup.tearDown();
			if (rowval<=2) {
			actmsg=hidtext.getAttribute("validationMessage");
			rowval++;
		}
		else
		{
			actmsg=alertmsg.getText();
		}
		LoggerLoad.info("Expected Message - Excel Sheet :  " +expmsg);
		LoggerLoad.info("Actual Message :  "+actmsg);
		assertEquals(actmsg, expmsg);*/
		Thread.sleep(2000);
	}
}
