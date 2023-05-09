package Allhooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import DriverFactory.driversetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.LoggerLoad;

public class Hooks {

	@Before(order = 0)
	public static void setUp() {
		driversetup.setUpDriver();
		LoggerLoad.info("driver setup");
	}

	@Before(order = 1)
	public static void setup2() {
		driversetup.getDriver();
		LoggerLoad.info("getdriver");
	}

	@After
	public static void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driversetup.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}

		// driversetup.tearDown();
	}
}
