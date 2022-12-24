package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPagePomClass {
By search=By.xpath("//input[@type='search']");
By product=By.cssSelector("tr td:nth-child(1)");
public WebDriver driver;
public OfferPagePomClass (WebDriver driver) {
	this.driver=driver;
}
public void searchItem(String name) {
	driver.findElement(search).sendKeys(name);
}
public String getSearchText() {
	return driver.findElement(search).getText();
}
public String getProductName() {
	return driver.findElement(product).getText();
}
}
