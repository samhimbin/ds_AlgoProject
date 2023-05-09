package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Basepage;
import utilities.LoggerLoad;

public class Lnklist extends Basepage {
	
	public Lnklist(WebDriver driver) {
		LoggerLoad.info("Entered into LinkedList Module");
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath = "//h5[text()=\"Linked List\"]/../a")
	WebElement linkedlistGetStarted;
	@FindBy(xpath = "//body/div[2]/ul/a")
	WebElement linkIntro;
	@FindBy(xpath = "//a[text()=\"Try here>>>\"]")
	WebElement tryHere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea ")
	WebElement codeMirror;

	@FindBy(xpath = "//button[text()=\"Run\"]")
	WebElement runButton;
	@FindBy(xpath = "//pre[@id=\"output\"]")
	WebElement output;
	// creating Linkedlist
	@FindBy(linkText = "Creating Linked LIst")
	WebElement createList;
	// Types of linkedlist
	@FindBy(linkText = "Types of Linked List")
	WebElement typesOflinklist;
	// implement linked list
	@FindBy(linkText = "Implement Linked List in Python")
	WebElement implementlist;
	// Traversal
	@FindBy(linkText = "Traversal")
	WebElement traversal;
	// Insertion
	@FindBy(linkText = "Insertion")
	WebElement insertion;
	// Deletion
	@FindBy(linkText = "Deletion")
	WebElement deletion;
	// Practice questions
	@FindBy(linkText = "Practice Questions")
	WebElement practiceQs;

	public void clkLinkedlistGetStarted() {
		linkedlistGetStarted.click();
	}

	public void introOfLinkedlist() {
		linkIntro.click();
	}

	public void tryHereLink() {
		tryHere.click();
	}

	public void codeMirrorText() {
		codeMirror.sendKeys("print 'Hello'");
	}

	public void invalidPythonCode() {
		codeMirror.sendKeys("print Hi");
	}

	public String codeOutput() {
		return output.getText();
	}

	public void clickRunButton() {
		runButton.click();
	}

	public void excelPythonCode(String code, String output) {
		codeMirror.sendKeys(code);

	}

	// creatingLinkList
	public void createLnkList() {
		createList.click();
	}

	// types of Linkedlist
	public void typesOfLinkedList() {
		typesOflinklist.click();
	}

	// implement linkedlist
	public void implementLinkedlist() {
		implementlist.click();
	}

	// Traversal
	public void traversalLink() {
		traversal.click();
	}

	// Insertion
	public void insertionLink() {
		insertion.click();
	}

	// Deletion
	public void deletionLink() {
		deletion.click();
	}

	// Practice questions
	public void practiceQuestionsLink() {
		practiceQs.click();
	}
}
