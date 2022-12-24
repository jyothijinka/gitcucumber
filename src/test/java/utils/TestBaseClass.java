package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseClass {
public WebDriver driver;
public WebDriver webDriverManager() throws IOException {
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("QAUrl");
	String browser_properties=p.getProperty("browser");
	String browser_maven = System.getProperty("browser");
	 String browser = browser_maven!=null ? browser_maven : browser_properties; 
	if(driver==null)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
	 System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
	 driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
	 System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
		driver=new FirefoxDriver();
	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
}
	 return driver;
	
}
}
