package Testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/hima.html", //cucumber report
		//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		}, // reporting purpose
		monochrome = false, // console output color
				tags="@portal or @login or @dstruct",
				features = {"src/test/resources/Features"},
						glue= {"stepdefinitions","Allhooks"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
