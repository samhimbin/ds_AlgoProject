
package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.Basepage;

public class QueuePage extends Basepage {
	
	public QueuePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//a[text()='Queue']") WebElement queueele;
	@FindBy(linkText="Implementation of Queue in Python") WebElement queueinpythonele;
	@FindBy(linkText="Implementation using collections.deque") WebElement collectele;
	@FindBy(linkText="Implementation using array") WebElement queuearrayele;
	@FindBy(linkText="Queue Operations") WebElement queueopernele;
	@FindBy(linkText="Practice Questions") WebElement quesinqueueele;
	@FindBy(linkText="Try here>>>") WebElement tryherebtnele;
	//@FindBy(xpath="//span[@role='presentation']") WebElement textboxinqueueele;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement textboxinqueueele;
	@FindBy(xpath="//button[text()='Run']") WebElement queuerunbtnele;
	@FindBy(id="output") WebElement queueresuleele;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea ")
	WebElement codeMirror;
	
	
	
	public void selectqueue() {
		queueele.click();
	}
	public void  queuemenuselection(int menuindex) {
		switch (menuindex) {
		case 1:queueinpythonele.click();
			break;
		case 2:collectele.click();
			break;
		case 3:queuearrayele.click();
			break;
		case 4: queueopernele.click();
			break;
		case 5: quesinqueueele.click();
			break;
		default:
			break;
		}
	}
	
	public void queuetrybtnclk() {
		tryherebtnele.click();
	}
	
	public void queuereadcode(String pycode)	{
		textboxinqueueele.sendKeys(pycode);
	}
	
	public void queuerunbtnclk() throws InterruptedException {
		queuerunbtnele.click();
	}
	public String queuecompoutout() {
		return queueresuleele.getText();
	}
	public void excelPythonCode(String code, String output) {
		codeMirror.sendKeys(code);

	}
	
}
