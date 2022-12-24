package cucumberoptions;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefination", monochrome=true,tags="@offers",
		plugin= {"html:target/cucumber.html","json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed-scenarios.txt"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
@Override
	@DataProvider(parallel=true)
public Object[][] scenarios(){
	return super.scenarios();
}
}
