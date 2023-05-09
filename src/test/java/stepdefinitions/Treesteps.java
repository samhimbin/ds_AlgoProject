package stepdefinitions;

import org.openqa.selenium.WebDriver;

import DriverFactory.driversetup;
import PageObjects.TreePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Treesteps extends Basepage{
	String excelpath = ".\\ExcelData/pythoncode.xlsx";
	String output="";
	String expmsg;
	String actmsg;
	
	WebDriver driver = driversetup.getDriver();

	TreePage treepage = new TreePage(driver);
	
	
	
	@Given("user is able to click on dropdown")
	public void user_is_able_to_click_on_dropdown() throws InterruptedException {
		Thread.sleep(1000);
	   treepage.dropdown();
	}

	@When("user click Tree item from the drop down menu")
	public void user_click_tree_item_from_the_drop_down_menu() {
	    treepage.dropdown_tree();;
	}

	@Then("user should be navigate to the {string} Page")
	public void user_should_be_navigate_to_the_page(String string) {
	    treepage.getTreePageTitle();
	}

	@Given("user is able to click on overview of trees")
	public void user_is_able_to_click_on_overview_of_trees() {
	    treepage.clickOnoverviewOfTreesPage();
	}
	@When("user clicks {string} button and navigate to try editor page for valid code test")
	public void user_clicks_button_and_navigate_to_try_editor_page_for_valid_code_test(String string) {
	   treepage.click_Tryhere();
	}

	

	@Given("user clicks {string} button and navigate to try editor page")
	public void user_clicks_button_and_navigate_to_try_editor_page(String string) {
	   treepage.click_Tryhere();
	}

	@Given("The user clicks on the Terminologies button")
	public void the_user_clicks_on_the_terminologies_button() {
	   treepage.clickOnTerminologiesLink();
	}

	@Given("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
	   treepage.clickOnTypesOfTreesPage();
	}

	@Given("The user clicks on the Tree Traversals button")
	public void the_user_clicks_on_the_tree_traversals_button() {
	   treepage.clickOnTreeTraversalsLink();
	}

	@Given("The user clicks on the Traversal illustration button")
	public void the_user_clicks_on_the_traversal_illustration_button() {
	   treepage.clickOnTrav_illus_Link();
	}

	@Given("The user clicks on the binary trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
	   treepage.clickOnBinaryTreesLink();
	}

	@Given("The user clicks on the Types of binary trees")
	public void the_user_clicks_on_the_types_of_binary_trees() {
	  treepage.clickOnTypesOfBTLink();
	}

	@Given("The user clicks on the Implementation in Python button")
	public void the_user_clicks_on_the_implementation_in_python_button() {
	   treepage.click_implementationinPython();
	}

	@Given("The user clicks on the binary tree traversals button for btt")
	public void the_user_clicks_on_the_binary_tree_traversals_button_for_btt() {
	   treepage.click_binaryTreeTraversals();
	}

	@Given("The user clicks on the Implementation of Binary Trees button for ibt")
	public void the_user_clicks_on_the_implementation_of_binary_trees_button_for_ibt() {
	   treepage.click_implementationOfBinaryTrees();
	}

	@Given("The user clicks on the Applications of Binary Trees button for abt")
	public void the_user_clicks_on_the_applications_of_binary_trees_button_for_abt() {
	    treepage.click_applicationsOfBinaryTrees();
	}

	@Given("The user clicks on the Binary Search Trees button for bst")
	public void the_user_clicks_on_the_binary_search_trees_button_for_bst() {
	  treepage.click_binarySearchTrees();
	}

	@Given("The user clicks on the Implementation of BST button for ibst")
	public void the_user_clicks_on_the_implementation_of_bst_button_for_ibst() {
	  treepage.click_implementationOfBST();
	}

	@When("The user clicks on the Practice Questions in Overview of Trees")
	public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {
	   treepage.click_practiceQuestion();
	}

	@Then("The user should be directed to Practice Questions of tree page Page")
	public void the_user_should_be_directed_to_practice_questions_of_tree_page_page() {
	  driver.getTitle();
	}

}
