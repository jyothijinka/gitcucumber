package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPagePomClass {
By search=By.xpath("//input[@type='search']");
By product=By.cssSelector("h4[class='product-name']");
By topdeals=By.linkText("Top Deals");
By incrementItem=By.linkText("+");
By addtocart=By.cssSelector(".product-action button");
By flightbooking=By.linkText("Flight Booking");

public WebDriver driver;
public LandingPagePomClass(WebDriver driver){
	this.driver=driver;
}

public void searchItem(String name) {
	driver.findElement(search).sendKeys(name);
}
public void getSearchText() {
driver.findElement(search).getText();
}
public String getProductName() {
	String text=driver.findElement(product).getText();
	return text;
}
public void setTopDeals() {
	driver.findElement(topdeals).click();
}
public void incrementItems(int quantity) {
	int i=quantity-1;
	while(i>0) {
	driver.findElement(incrementItem).click();
	i--;
	}
}
public void addToCart() {
	driver.findElement(addtocart).click();
}

public String getTitle() {
	 return driver.getTitle();
}
public void selectFlightBooking() {
	driver.findElement(flightbooking).click();
}
}