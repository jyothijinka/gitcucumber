package stepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetUp;

public class Hooks {
	public TestContextSetUp testcontextsetup;
	public Hooks(TestContextSetUp testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
@After
public void afterScenario() throws IOException {
	testcontextsetup.testbase.webDriverManager().quit();
	
}
@AfterStep
public void addScreenShot(Scenario scenario) throws IOException {
	WebDriver driver=testcontextsetup.testbase.webDriverManager();
if(scenario.isFailed()) {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	byte[] filecontent = FileUtils.readFileToByteArray(src);
	scenario.attach(filecontent,"image/png", "image");
}
	
}
}
