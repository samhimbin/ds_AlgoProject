package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.driversetup;
import PageObjects.ArraysPage;
import PageObjects.HomePage;
import PageObjects.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;

import java.time.Duration;

public class ArraysStepdf extends Basepage {
	WebDriver driver = driversetup.getDriver();
	ArraysPage arraypage = new ArraysPage(driver);

	String excelpath = ".\\src/test/resources/ExcelData/pythoncodeData.xlsx";
	
	String expectedcode;
	String actcode;
	String output;
	String result;

	@Given("User click on get started button on array module and navigate to array page")
	public void user_click_on_get_started_button_on_array_module_and_navigate_to_array_page() {

		driversetup.openPage("https://dsportalapp.herokuapp.com/login");
		loginpage = new Loginpage(driver);
		loginpage.enternamepasswrd("nitha", "nithasdet109");
		loginpage.loginbtnclk();
		String actUrl = driver.getCurrentUrl();
		String expUrl = "https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(expUrl, actUrl);
		arraypage.ArrayGetStarted();
		LoggerLoad.info("Arrays");
		
	}

	@When("User click on Arrays in Python Topic and navigate to arrays in python page")
	public void user_click_on_arrays_in_python_topic_and_navigate_to_arrays_in_python_page() {
		arraypage.ArraysInPython();
	}

	@Given("User click on Try here button on Arrays in Python page and navigate to try edidor page")
	public void user_click_on_try_here_button_on_arrays_in_python_page() {

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		arraypage.TryHere();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String string, Integer int1)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(excelpath, "sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output = testdata.get(int1).get("output");
		//System.out.println(pycode);

		arraypage.Txtarea(pycode, output);

	}

	@When("User click on run button")
	public void user_click_on_run_button() {
		arraypage.Runbutton();
		
	}

	@Then("User should be presented with run result")
	public void user_should_be_presented_with_run_result() {

		String result = (arraypage.outPut());

		LoggerLoad.info("Arrays valid output= " + result);

		arraypage.textclear();
		
	}

	@When("The user enter invalid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and(String string, Integer int1)
			throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(excelpath, "sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output = testdata.get(int1).get("output");
		
		LoggerLoad.info("Arrays invalid output= " );
		arraypage.Txtarea(pycode, output);

	}

	@Then("User should get alert message")
	public void alert_should_be_present() {

		Alert alert = driver.switchTo().alert();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		if (w.until(ExpectedConditions.alertIsPresent()) == null)
			System.out.println("alert not exist");
		else
			System.out.println("Alert exists");

		alert.accept();
		driversetup.NavBack();
	}

	@Given("User click on Arrays Using List topic")
	public void user_click_on_arrays_using_list_topic() {
		arraypage.arraysList();
	}

	@Given("click Try here button and navigate to try edidor page")
	public void click_try_here_button_and_navigate_to_try_edidor_page() {
		arraypage.TryHere();
	}

	@Given("User click on basic Operations in Lists")
	public void user_click_on_basic_operations_in_lists() {
		arraypage.BasicOpInList();
	}

	@Given("User click on Applications of Array")
	public void user_click_on_applications_of_array() {
		arraypage.ApplOfArray();
	}

	@Given("User click on Practies Questions")
	public void user_click_on_practies_questions() {
		arraypage.PraQues();
	}

	@When("User click on Question1 its navigate to tryeditor page")
	public void user_click_on_question1_its_navigate_to_tryeditor_page() {
		arraypage.que1();
	}

	@When("User clear the tryeditor textbox")
	public void user_clear_the_tryeditor_textbox() throws InterruptedException {
		arraypage.txteditorclr();
	
	}

	@When("User click on Question2 its navigate to tryeditor page")
	public void user_click_on_question2_its_navigate_to_tryeditor_page() {
		arraypage.que2();
	}

	@When("User click on Question3 its navigate to tryeditor page")
	public void user_click_on_question3_its_navigate_to_tryeditor_page() {
		arraypage.que3();
	}

	@When("User click on Question4 its navigate to tryeditor page")
	public void user_click_on_question4_its_navigate_to_tryeditor_page() {
		arraypage.que4();
	}

}