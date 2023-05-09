package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Basepage;
import utilities.LoggerLoad;

public class DataStructuresPage extends Basepage{

	public DataStructuresPage(WebDriver driver) {
		LoggerLoad.info("We are in Datastructures Page");
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Get Started")
	WebElement getStartedOfDatastructures;
	@FindBy(linkText = "Time Complexity")
	WebElement timecmplx;
	@FindBy(linkText = "Try here>>>")
	WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea ")
	WebElement codeMirror;
	@FindBy(xpath = "//pre[@id=\"output\"]")
	WebElement output;
	@FindBy(xpath = "//button[text()=\"Run\"]")
	WebElement runButton;
	@FindBy(linkText = "Practice Questions") WebElement practiesQuestions;
	
	public void clickGetStarted() {
		getStartedOfDatastructures.click();
	}
	public void selectTimecomplexity() {
		timecmplx.click();
	}
	public void clkTryHere() {
		tryhere.click();
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
	public void practicequestions() {
		 practiesQuestions.click();
	 }
}
