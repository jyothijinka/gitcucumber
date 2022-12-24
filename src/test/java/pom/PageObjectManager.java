package pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
public LandingPagePomClass landingpage;
public OfferPagePomClass offerpage;
public CheckOutPagePomClass checkoutpage;
public WebDriver driver;
public PageObjectManager(WebDriver driver) {
	this.driver=driver;
}
public LandingPagePomClass getLandingPage()
{
	landingpage=new LandingPagePomClass(driver);
	return landingpage;
}
public  OfferPagePomClass getOfferPage() {
	offerpage=new OfferPagePomClass(driver);
	return offerpage;
}
public CheckOutPagePomClass getCheckOutPage() {
	checkoutpage = new CheckOutPagePomClass(driver);
	return checkoutpage;
}
}
