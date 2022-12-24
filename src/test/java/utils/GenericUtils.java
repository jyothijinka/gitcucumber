package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pom.LandingPagePomClass;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void switchWindowToChild() {
   
	   Set<String> allwh =driver.getWindowHandles();
	  Iterator <String> i=allwh.iterator();
	  String parentwindow = i.next();
	  String childwindow = i.next();
	  driver.switchTo().window(childwindow);
    }
}
