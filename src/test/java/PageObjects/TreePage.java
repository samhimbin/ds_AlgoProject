package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.driversetup;
import stepdefinitions.Basepage;

public class TreePage extends Basepage{

	WebDriver driver;

	// Homepage
	@FindBy(xpath = "//a[@href='data-structures-introduction']") WebElement getstart_datastructures;
	@FindBy(xpath = "//a[@href='tree']") WebElement getstart_tree;
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]//a[contains(text(), 'Data Structures')]") WebElement dropdown;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(@href, '/tree')]") WebElement dropdown_tree;

	@FindBy(linkText = "Overview of Trees") WebElement overviewOfTreesLink; //1
	@FindBy(linkText="Terminologies") WebElement terminologiesLink; //2
	@FindBy(linkText = "Types of Trees") WebElement typesoftreesLink; //3
	@FindBy(linkText = "Tree Traversals") WebElement treetraversalsLink; //4
	@FindBy(linkText =  "Traversals-Illustration") WebElement trav_illustrationsLink; //5
	@FindBy(linkText = "Binary Trees") WebElement binarytreesLink; //6
	@FindBy(linkText = "Types of Binary Trees") WebElement typesofBinaryTreesLink; //7
	@FindBy(linkText = "Implementation in Python") WebElement implementationInPythonLink; //8
	@FindBy(linkText = "Binary Tree Traversals") WebElement binaryTreeTraversalsLink; //9
	@FindBy(linkText = "Implementation of Binary Trees") WebElement implementationOfBinaryTreesLink; //10
	@FindBy(linkText = "Applications of Binary trees") WebElement applicationsOfBinaryTreesLink; //11
	@FindBy(linkText = "Binary Search Trees") WebElement binarySearchTreesLink; //12
	@FindBy(linkText = "Implementation Of BST") WebElement implementationOfBSTLink; //13
	@FindBy(linkText = "Practice Questions") WebElement practiceQuestionLink; //14

	@FindBy(xpath = "//a[@href='/tryEditor']") WebElement TryHereLink;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement editorInput;
	@FindBy(xpath = "//*[@id='answer_form']/button") WebElement runButton;
	@FindBy(id = "output") static WebElement output;

	public TreePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void dropdown() {
		dropdown.click();
		
	}
public void dropdown_tree() {
	dropdown_tree.click();
}
	public String getTreePageTitle() {
		String title = driversetup.getTitle();
		return title;
	}

	public void clickOnoverviewOfTreesPage() { //1
		overviewOfTreesLink.click();
	}

	public void click_Tryhere() {
		TryHereLink.click();
	}

	public void userInput(String pythoncode, String output) {
		editorInput.sendKeys(pythoncode);
	}

	public void clickOnRun() {
		runButton.click();
	}
	
	public static String output()
	{
		return output.getText();	
	}

	public void clickOnTerminologiesLink() { //2
		terminologiesLink.click();
	}
	
	public void click_Tryhere_tl() {
		TryHereLink.click();
	}

	

	public void clickOnRun_tl() {
		runButton.click();
	}

	public void clickOnTypesOfTreesPage() { //3
		typesoftreesLink.click();
	}
	
	public void click_Tryhere_ttp() {
		TryHereLink.click();
	}

	
	public void clickOnRun_ttp() {
		runButton.click();
	}

	public void clickOnTreeTraversalsLink() { //4
		treetraversalsLink.click();
	}
	
	public void click_Tryhere_ttl() {
		TryHereLink.click();
	}

	
	

	public void clickOnRun_ttl() {
		runButton.click();
	}

	public void clickOnTrav_illus_Link() { //5
		trav_illustrationsLink.click();
	}
	
	public void click_Tryhere_ti() {
		TryHereLink.click();
	}

	

	public void clickOnRun_ti() {
		runButton.click();
	}

	public void clickOnBinaryTreesLink() { //6
		binarytreesLink.click();
	}
	
	public void click_Tryhere_btl() {
		TryHereLink.click();
	}

	

	public void clickOnRun_btl() {
		runButton.click();
	}

	public void clickOnTypesOfBTLink() { //7
		typesofBinaryTreesLink.click();
	}
	
	public void click_Tryhere_tbt() {
		TryHereLink.click();
	}

	

	public void clickOnRun_tbt() {
		runButton.click();
	}

	public void click_implementationinPython() { //8
		implementationInPythonLink.click();
	}
	
	public void click_Tryhere_ip() {
		TryHereLink.click();
	}

	

	public void clickOnRun_ip() {
		runButton.click();
	}

	public void click_binaryTreeTraversals() { //9
		binaryTreeTraversalsLink.click();
	}
	
	public void click_Tryhere_btt() {
		TryHereLink.click();
	}

	

	public void clickOnRun_btt() {
		runButton.click();
	}

	public void click_implementationOfBinaryTrees() { //10
		implementationOfBinaryTreesLink.click();
	}
	
	public void click_Tryhere_ibt() {
		TryHereLink.click();
	}

	

	public void clickOnRun_ibt() {
		runButton.click();
	}

	public void click_applicationsOfBinaryTrees() { //11
		applicationsOfBinaryTreesLink.click();
	}
	
	public void click_Tryhere_abt() {
		TryHereLink.click();
	}

	

	public void clickOnRun_abt() {
		runButton.click();
	}

	public void click_binarySearchTrees() { //12
		binarySearchTreesLink.click();
	}
	
	public void click_Tryhere_bst() {
		TryHereLink.click();
	}

	

	public void clickOnRun_bst() {
		runButton.click();
	}

	public void click_implementationOfBST() { //13
		implementationOfBSTLink.click();
	}
	
	public void click_Tryhere_ibst() {
		TryHereLink.click();
	}

	
	public void clickOnRun_ibst() {
		runButton.click();
	}

	public void click_practiceQuestion() { //14
		practiceQuestionLink.click();
	}
	
	public void click_Tryhere_pq() {
		TryHereLink.click();
	}

	
	public void clickOnRun_pq() {
		runButton.click();
	}



}
