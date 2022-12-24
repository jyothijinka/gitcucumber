package cucumberoptions;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="@target/failed-scenarios.txt",
		glue="stepDefination", monochrome=true,tags="@offers or @PlaceOrder",
		plugin= {"html:target/cucumber.html","json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNgfailedTestRunner extends AbstractTestNGCucumberTests {
@Override
	@DataProvider(parallel=true)
public Object[][] scenarios(){
	return super.scenarios();
}
}
