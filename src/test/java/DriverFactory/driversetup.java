package DriverFactory;

import java.time.Duration;
import java.util.ResourceBundle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;

public class driversetup {
	private static WebDriver driver;
	//public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	static ResourceBundle rb; // for reading properties file
	static String br; // to store browser name

	private static WebDriver getchromeDriver() {

		rb = ResourceBundle.getBundle("Config");
		br = rb.getString("browser");

		if (br.equals("CHROME")) {
			LoggerLoad.info("enter getchromedriver");
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * ".\\src/test/resources/drivers/chromedriver.exe"); ChromeOptions options=new
			 * ChromeOptions(); options.addArguments("--remote-allow-origins=*");
			 * options.addArguments("--incognito"); driver=new ChromeDriver(options);
			 */

			WebDriverManager.chromedriver().setup();
			//tlDriver.set(new ChromeDriver());
			driver= new ChromeDriver();
		}
		/*
		 * else if br.equals("FIREFOX"){ //Firefox
		 * WebDriverManager.firefoxdriver().setup(); tlDriver.set(new FirefoxDriver());
		 * } else if (br.equals("edge")) { //Edge
		 * System.setProperty("webdriver.msedge.driver",
		 * "C:/Users/sange/OneDrive/Desktop/Drivers/msedgedriver.exe"); WebDriver
		 * driver=new EdgeDriver(); }
		 */
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//return getDriver();
		return driver;
	}

	public static void openPage(String url) {
		getDriver().get(url);
	}

	public static String getTitle() {
		return getDriver().getTitle();
	}

	public static void NavBack() {
		getDriver().navigate().back();
	}

	public static WebDriver getDriver() {
		LoggerLoad.info("enter getdriver");
		//return tlDriver.get();
		return driver;
	}

	public static void setUpDriver() {
		if (getDriver() == null) {
			getchromeDriver();
		}
	}

	public static void tearDown() {
		if (getDriver() != null) {
			LoggerLoad.info("enter teardown");
			getDriver().close();
			getDriver().quit();
		}
		driver = null;
	}

}