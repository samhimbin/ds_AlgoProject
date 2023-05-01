package stepdefinitions;

import DriverFactory.driversetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.*;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utilities.*;

public class Loginsteps extends Combase {
	
	String excelpath =".\\src/test/resources/ExcelData/ds-algologin.xlsx";
	String message="";
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		loginpage = new Loginpage(driversetup.getDriver());
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(excelpath,string);
		String username = testdata.get(int1).get("username");
		String password = testdata.get(int1).get("password");
		message = testdata.get(int1).get("expectedmessage");

		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		if (username != null || password != null) {
			loginpage.enternamepasswrd(username, password,driversetup.getDriver());
		}
	}

	@Then("click login button")
	public void click_login_button() {
		LoggerLoad.info("User clicks on login button");
		LoggerLoad.info("Expected Message - Excel Sheet :  " + message);
		String msg = loginpage.loginbtnclk();;
		LoggerLoad.info("Actual Message :  " + msg);
		assertEquals(msg, message);
	}
}
