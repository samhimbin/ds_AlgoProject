<<<<<<< HEAD
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.Basepage;


public class StackPage extends Basepage{
	
	public StackPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//a[text()='Stack']") WebElement stackele;
	@FindBy (linkText="Operations in Stack") WebElement operinstack;
	@FindBy (linkText="Implementation") WebElement implemele;
	@FindBy(linkText="Applications") WebElement applele;
	@FindBy(linkText="Practice Questions") WebElement practquesele;
	@FindBy(linkText="Try here>>>") WebElement tryherebtn;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement textediboxele;
	//form[@id='answer_form']/div//div[6]//span//span
	////span[@role='presentation']
	@FindBy(xpath="//button[text()='Run']") WebElement runbtnele;
	@FindBy(id="output") WebElement resuleele;
	//@FindBy(xpath = "//pre[@id='output']") WebElement output;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea ")
	WebElement codeMirror;
	
	
	
	public void selectstack() {
		stackele.click();
	}
	public void  menuselection(int menuindex) {
		switch (menuindex) {
		case 1:operinstack.click();
			break;
		case 2:implemele.click();
			break;
		case 3: applele.click();
			break;
		case 4: practquesele.click();
			break;
		default:
			break;
		}
	}
	
	public void trybtnclk() {
		tryherebtn.click();
	}
	
	public void readcode(String pycode)	{
		textediboxele.sendKeys(pycode);
	}
	
	public void runbtnclk() throws InterruptedException {
		runbtnele.click();
		
		/*if (resuleele.getText()!=null) {
			return resuleele.getText();
		}
		else {
			return "";
		}*/
	}
	public String compoutout() {
		return resuleele.getText();
	}
	public void excelPythonCode(String code, String output) {
		codeMirror.sendKeys(code);

	}
}
=======
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import PageObjects.*;
import stepdefinitions.Combase;
import DriverFactory.*;


public class StackPage extends Combase{
	@FindBy (xpath="//a[text()='Stack']") WebElement stackele;
	@FindBy (linkText="Operations in Stack") WebElement operinstack;
	@FindBy (linkText="Implementation") WebElement implemele;
	@FindBy(linkText="Applications") WebElement applele;
	@FindBy(linkText="Practice Questions") WebElement practquesele;
	@FindBy(linkText="Try here>>>") WebElement tryherebtn;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement textediboxele;
	//form[@id='answer_form']/div//div[6]//span//span
	////span[@role='presentation']
	@FindBy(xpath="//button[text()='Run']") WebElement runbtnele;
	@FindBy(id="output") WebElement resuleele;
	//@FindBy(xpath = "//pre[@id='output']") WebElement output;
	
	
	public StackPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void selectstack() {
		stackele.click();
	}
	public void  menuselection(int menuindex) {
		switch (menuindex) {
		case 1:operinstack.click();
			break;
		case 2:implemele.click();
			break;
		case 3: applele.click();
			break;
		case 4: practquesele.click();
			break;
		default:
			break;
		}
	}
	
	public void trybtnclk() {
		tryherebtn.click();
	}
	
	public void readcode(String pycode)	{
		textediboxele.sendKeys(pycode);
	}
	
	public void runbtnclk() throws InterruptedException {
		runbtnele.click();
		
		/*if (resuleele.getText()!=null) {
			return resuleele.getText();
		}
		else {
			return "";
		}*/
	}
	public String compoutout() {
		return resuleele.getText();
	}
}
>>>>>>> 9c22b0036eb1ad4d1da73b4b973dd7459b39b844
