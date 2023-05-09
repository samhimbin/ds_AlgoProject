package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import DriverFactory.driversetup;
import PageObjects.ArraysPage;
import PageObjects.GraphPage;
import PageObjects.HomePage;
import PageObjects.Lnklist;
import PageObjects.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class GraphSteps extends Basepage {
	WebDriver driver = driversetup.getDriver();
	String excelpath = ".\\src/test/resources/ExcelData/pythoncodeData.xlsx";
	String expmsg;
     
	 @Given("user is in homepage after logging in with valid credentials")
	    public void user_is_in_homepage_after_logging_in_with_valid_credentials() throws Throwable {
		 driversetup.openPage("https://dsportalapp.herokuapp.com/login");
			loginpage = new Loginpage(driver);
			loginpage.enternamepasswrd("nitha", "nithasdet109");
			loginpage.loginbtnclk();
	   
	    }

	    @When("user picks graph option from dropdown menu")
	    public void user_picks_graph_option_from_dropdown_menu() throws Throwable {
	       graphpage =new GraphPage(driver);
	       //graphpage.dropdownclick();
	      // graphpage.selectGraphFromDropdown();
	    }

	    @Then("user will be directed to Graph module page")
	    public void user_will_be_directed_to_graph_module_page() throws Throwable {
	     // graphpage.graphLinkOption();
	      
	      }
	    @Given("The user is in a try here page having  tryEditor with a Run button to test")
		public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
			LoggerLoad.info("In tryEditor page");
			
		}

		@And("user clicks on tryHere button")
		public void user_clicks_on_try_here_button() {
			graphpage.Tryhere();
			}

		@When("The user Enter valid python code in tryEditor from sheet {string} and {int}")
		public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String string, Integer row)
				throws InvalidFormatException, IOException {
			ExcelReader reader = new ExcelReader();
			LoggerLoad.info("User is in TryEditor page");
			List<Map<String, String>> testData = reader.getData(excelpath, "Sheet1");
			String pyCode = testData.get(row).get("pythoncode"); // Column heading
			String output = testData.get(row).get("result"); // Column heading
			expmsg = output;
			
			//graphpage.Textarea(pyCode, output);
			LoggerLoad.info("python code being sent");

		}

		@When("user click on Run button")
		public void user_click_on_run_button() {
			graphpage.run();

		}

		@Then("The user should be presented with the output")
		public void the_user_should_be_presented_with_the_output() {
			String res = graphpage.output();
			System.out.println("result = " + res);
			driversetup.NavBack();

		}


	 
    

	

	
	


	

}
