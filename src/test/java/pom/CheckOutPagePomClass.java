package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPagePomClass {

	public WebDriver driver;
    By promocodobutton=By.cssSelector(".promoBtn");
    By placeoderbutton=By.xpath("//button[text()='Place Order']");
    By proceedtocheckout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By selectcart=By.cssSelector("img[alt='Cart']");
    By addeditems=By.cssSelector("tbody td:nth-child(2)");

	CheckOutPagePomClass (WebDriver driver){
		this.driver=driver;

	}
	public Boolean promoCodeApply() {
	return driver.findElement(promocodobutton).isDisplayed();


	}
	public Boolean placeOrder() {
	return driver.findElement(placeoderbutton).isDisplayed();

	}
	public void proceedToCheckOutItems() {
		driver.findElement(selectcart).click();
		
		driver.findElement(proceedtocheckout).click();
	}
	public String getaddeditems() {
	return	driver.findElement(addeditems).getText();
		
	}
}
