package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefinitions.*;
import PageObjects.Arrays;
import utilities.*;

import org.junit.Assert;

import DriverFactory.*;

public class arraySteps extends Combase{
	@Given("User click on get started button on array module")
	public void user_click_on_get_started_button_on_array_module() {
	   arraypage = new Arrays(driversetup.getDriver());
	   LoggerLoad.info("click getstart btn on arraymodule");
	   arraypage.ArrayGetStarted();
	}

	@When("User navigate to array page")
	public void user_navigate_to_array_page() {
	    String homepageTitle = driversetup.getTitle();
	    String ExpectedTitle = arraypage.gethomepageTitle();
	    Assert.assertEquals(ExpectedTitle, homepageTitle);
	}
	@When("User click on Arrays in Python and navigate to arrays in python page")
	public void user_click_on_arrays_in_python_and_navigate_to_arrays_in_python_page() {
		   arraypage.ArraysInPython();
	}

	@When("User click on Try here button and navigate to tryEditor page")
	public void user_click_on_try_here_button_and_navigate_to_try_editor_page() {
	   arraypage.TryHere();
	}

	@Given("If the User give valid  python code in tryEditor")
	public void if_the_user_give_valid_python_code_in_try_editor() {
		arraypage.Textbox();
	}

	@When("User click on Run button")
	public void user_click_on_run_button() {
		arraypage.Runbutton();
	    	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
	   arraypage.outPut();
	}

	@Given("If the user give invalid python code in tryEditor")
	public void if_the_user_give_invalid_python_code_in_try_editor() {
	   
	}

	@When("click on Run button")
	public void click_on_run_button() {
	   
	}

	@Then("The user should be presented with Run error message")
	public void the_user_should_be_presented_with_run_error_message() {
	    
	}
}
