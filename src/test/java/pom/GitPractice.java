package pom;

import org.openqa.selenium.WebDriver;

public class GitPractice {
public WebDriver driver;

public GitPractice(WebDriver driver){
	this.driver=driver;
}
public String getPageTitle() throws InterruptedException {
	Thread.sleep(1000);
String title = driver.getTitle();
System.out.println(title);
return title;
}

}
