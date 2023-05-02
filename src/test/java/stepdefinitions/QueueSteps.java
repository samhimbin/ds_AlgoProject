package stepdefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.driversetup;
import PageObjects.HomePage;
import PageObjects.QueuePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;


public class QueueSteps extends Combase {

	String excelpath = ".\\src/test/resources/ExcelData/PythonExcel.xlsx";
	String output="";
	String expmsg;
	String actmsg;
	String windowtitle;
	WebDriver driver =driversetup.getDriver();
	QueuePage queuepage = new QueuePage(driver);

	@Given("user able to click on dropdown for queue")
	public void user_able_to_click_on_dropdown_for_queue() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.dropDownclk();
		Thread.sleep(1000);   
	}

	@When("user select queue option")
	public void user_select_queue_option() throws InterruptedException {
		queuepage.selectqueue();
		Thread.sleep(1000);
		LoggerLoad.info("select Queue menu from dropdown");	   
	}

	@When("user select queue in python")
	public void user_select_queue_in_python() throws InterruptedException {
		LoggerLoad.info("select queuein python");
		queuepage.queuemenuselection(1);		
		Thread.sleep(1000);   
	}

	@Given("user click on Try Here button in queue")
	public void user_click_on_try_here_button_in_queue() {
		queuepage.queuetrybtnclk();
		LoggerLoad.info("queue try button click");
	}

	@When("user enter valid code in queue in python from given {string} and {int}")
	public void user_enter_valid_code_in_queue_in_python_from_given_and(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		LoggerLoad.info("User enter valid code for operations in stack");
		List<Map<String, String>> testData=reader.getData(excelpath,"Sheet1");
		String pythoncode=testData.get(int1).get("code"); // Column heading
		output=testData.get(int1).get("result"); // Column heading
		expmsg=output;
		System.out.println(pythoncode);
		System.out.println(output);
		queuepage.queuereadcode(pythoncode);	    
	}

	@When("user click run button in queue")
	public void user_click_run_button_in_queue() throws InterruptedException {
		queuepage.queuerunbtnclk();
		LoggerLoad.info("queue run button click");
	}

	@Then("user should see output in queue")
	public void user_should_see_output_in_queue() {
		actmsg=queuepage.queuecompoutout();
		System.out.println(actmsg);
		driver.navigate().back();  
	}

	@When("user enter invalid code in queue in python from given {string} and {int}")
	public void user_enter_invalid_code_in_queue_in_python_from_given_and(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		LoggerLoad.info("User enter valid code for operations in stack");
		List<Map<String, String>> testData=reader.getData(excelpath,"Sheet1");
		String pythoncode=testData.get(int1).get("code"); // Column heading
		output=testData.get(int1).get("result"); // Column heading
		expmsg=output;
		System.out.println(pythoncode);
		System.out.println(output);
		queuepage.queuereadcode(pythoncode);    
	}

	@Then("user should get alert in queue")
	public void user_should_get_alert_in_queue() throws InterruptedException {

		LoggerLoad.info("run button click for invalid code");
		Alert alert =driver.switchTo().alert();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		if(w.until(ExpectedConditions.alertIsPresent())==null)
			System.out.println("alert not exist");
		else
			System.out.println("Alert exists");
		alert.accept();
		driversetup.NavBack();
		Thread.sleep(3000);   
	}

	@Given("user select using collections")
	public void user_select_using_collections() throws InterruptedException {
		LoggerLoad.info("select using collections");
		queuepage.queuemenuselection(2);		
		Thread.sleep(1000); 	    
	}

	@Given("user select using array page")
	public void user_select_using_array_page() throws InterruptedException {
		LoggerLoad.info("select using arrays");
		queuepage.queuemenuselection(3);		
		Thread.sleep(1000); 	    
	}

	@Given("user select queue operation page")
	public void user_select_queue_operation_page() throws InterruptedException {
		LoggerLoad.info("select queue operation");
		queuepage.queuemenuselection(4);		
		Thread.sleep(1000);     
	}


	@Given("user select practice questions in queue")
	public void user_select_practice_questions_in_queue() throws InterruptedException {
		LoggerLoad.info("select practice questions in queue");
		queuepage.queuemenuselection(5);		
		Thread.sleep(1000);	   
	}

	@Given("navigate back to login page from queue")
	public void navigate_back_to_login_page_from_queue() {
		driversetup.NavBack();
	}
}
