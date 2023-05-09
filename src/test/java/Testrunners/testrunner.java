package Testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Ds-algo.html",  //cucumber reports
				"json:target/Ds-algo.json",
				"rerun:target/rerun.txt"  ,//mandatory for capture failures 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", //Extent Reports
				//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"		
		},//reporting purpose-- html reports are created
		monochrome=true,  //console output color and eliminate junk characters
		//dryRun=false, // (=true)->compilation purpose mostly to chk stepdefinitions are implemented or not
		tags = "@login",		
		features = {"src/test/resources/Features/"}, //location of feature files, we can give this way-->".//features//"
		glue= {"stepdefinitions","Allhooks"}) //location of step definition files, gives granural level of info in test result

public class testrunner  {

}
