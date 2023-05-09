package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import DriverFactory.driversetup;
import PageObjects.DataStructuresPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataStructureSteps extends Basepage {

	WebDriver driver = driversetup.getDriver();
	DataStructuresPage datastrpage =new DataStructuresPage(driver);
	

	@Given("User click on Get started button in data Structures module")
	public void user_click_on_get_started_button_in_data_structures_module() {
		
		datastrpage.clickGetStarted();
	}

	@When("User click on Time Complexity button")
	public void user_click_on_time_complexity_button() {
	    datastrpage.selectTimecomplexity();
	}

	@Given("User click on practice questons")
	public void user_click_on_practice_questons() {
	   datastrpage.practicequestions();
	}

	@Given("Navigate back to data stuctures introduction page")
	public void navigate_back_to_data_stuctures_introduction_page() {
	   driver.navigate().back();
	}
}
