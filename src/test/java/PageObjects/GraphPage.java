<<<<<<< HEAD

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Basepage;


public class GraphPage extends Basepage {
	
	WebDriver driver;
	@FindBy(css="a[data-toggle='dropdown']") WebElement dropdown;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[contains(text(),'Graph')]") WebElement graphOption;
	
	@FindBy(xpath = "//a[@href='graph']") WebElement graphGraphpage;
	@FindBy(xpath = "//a[@class='btn btn-info']") WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement textarea;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement runbutton;
	@FindBy(xpath = "//pre[@id='output']") WebElement output;
	
	@FindBy(linkText = "Graph Representations") WebElement graphGraphRepresentations;
	@FindBy(css = ".btn.btn-info") WebElement grTryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement grTextarea;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement grRunbutton;
	@FindBy(xpath = "//pre[@id='output']") WebElement grOutput;
	
	@FindBy(xpath = "//a[contains(.,'Practice Questions')]") WebElement PracticeQuestions;
	@FindBy(xpath = "//a[contains(.,'NumpyNinja')]") WebElement numpyninja;
	
	
	public GraphPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HomepageDropdown()
	{
		dropdown.click();
	}
	
	public void dropdownOption()
	{
		graphOption.click();
	}
	
	public void graphHomepage()
	{
		graphGraphpage.click();
	}
	
	public void Tryhere()
	{
		tryhere.click();
	}
	
	public void Textarea()
	{
		//textarea.sendKeys(code);
	}
	
	public void run()
	{
		runbutton.click();
	}
	
	public String output()
	{
		return output.getText();	
	}
	
	public void navigateback()
	{
		driver.navigate().back();
	}
	
	public void ClickgraphRepresentations()
	{
		graphGraphRepresentations.click();
	}
	
	public void graphrepresentationsTryhere()
	{
		grTryhere.click();
	}
	
	public void graphrepresentationsTextarea()
	{
		//grTextarea.sendKeys(code);
	}
	
	public void graphrepresentationsRunbutton()
	{
		grRunbutton.click();
	}
	
	public String graphrepresentationsOutput()
	{
		return grOutput.getText();
	}
	
	public void navigateback1()
	{
		driver.navigate().back();
	}
	
	public void ClickpracticeQuestions()
	{
		PracticeQuestions.click();
	}
	
	public void clicknumpyninja()
	{
		numpyninja.click();
	}
	
}
=======
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Combase;

public class GraphPage extends Combase {
	
	WebDriver driver;
	@FindBy(css="a[data-toggle='dropdown']") WebElement dropdown;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[contains(text(),'Graph')]") WebElement graphOption;
	
	@FindBy(xpath = "//a[@href='graph']") WebElement graphGraphpage;
	@FindBy(xpath = "//a[@class='btn btn-info']") WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement textarea;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement runbutton;
	@FindBy(xpath = "//pre[@id='output']") WebElement output;
	
	@FindBy(linkText = "Graph Representations") WebElement graphGraphRepresentations;
	@FindBy(css = ".btn.btn-info") WebElement grTryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement grTextarea;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement grRunbutton;
	@FindBy(xpath = "//pre[@id='output']") WebElement grOutput;
	
	@FindBy(xpath = "//a[contains(.,'Practice Questions')]") WebElement PracticeQuestions;
	@FindBy(xpath = "//a[contains(.,'NumpyNinja')]") WebElement numpyninja;
	
	
	public GraphPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HomepageDropdown()
	{
		dropdown.click();
	}
	
	public void dropdownOption()
	{
		graphOption.click();
	}
	
	public void graphHomepage()
	{
		graphGraphpage.click();
	}
	
	public void Tryhere()
	{
		tryhere.click();
	}
	
	public void Textarea()
	{
		textarea.sendKeys(code);
	}
	
	public void run()
	{
		runbutton.click();
	}
	
	public String output()
	{
		return output.getText();	
	}
	
	public void navigateback()
	{
		driver.navigate().back();
	}
	
	public void ClickgraphRepresentations()
	{
		graphGraphRepresentations.click();
	}
	
	public void graphrepresentationsTryhere()
	{
		grTryhere.click();
	}
	
	public void graphrepresentationsTextarea()
	{
		grTextarea.sendKeys(code);
	}
	
	public void graphrepresentationsRunbutton()
	{
		grRunbutton.click();
	}
	
	public String graphrepresentationsOutput()
	{
		return grOutput.getText();
	}
	
	public void navigateback1()
	{
		driver.navigate().back();
	}
	
	public void ClickpracticeQuestions()
	{
		PracticeQuestions.click();
	}
	
	public void clicknumpyninja()
	{
		numpyninja.click();
	}
	
	
}
>>>>>>> 9c22b0036eb1ad4d1da73b4b973dd7459b39b844
