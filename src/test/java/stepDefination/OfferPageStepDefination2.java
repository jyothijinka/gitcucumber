package stepDefination;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LandingPagePomClass;
import pom.OfferPagePomClass;
import utils.TestContextSetUp;

public class OfferPageStepDefination2 {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	TestContextSetUp testcontextsetup;
	public OfferPageStepDefination2(TestContextSetUp testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	    
	    @Then("^User Searched for (.+) shortName in offers page to check if product exist with same name$")
	    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws Throwable {
	    	switchToOfferPage();
	  OfferPagePomClass op=testcontextsetup.pageobjectmanager.getOfferPage();
	  op.searchItem(shortname);
  	Thread.sleep(2000);
  	offerpageproductname = op.getProductName();
  	System.out.println(offerpageproductname +"is extracted from offer page");
	    }
	    public void switchToOfferPage() throws InterruptedException {
	    	LandingPagePomClass lp=testcontextsetup.pageobjectmanager.getLandingPage();
	    	lp.setTopDeals();
		    Thread.sleep(1000);
		   testcontextsetup.genericUtils.switchWindowToChild();
	    }
	    
	    
	    @Then("^Validate product name in offers page matches with landing page$")
	    public void validate_product_name_in_offers_page(){
	   Assert.assertEquals(offerpageproductname, testcontextsetup.landingpageproductname);
	    
}
}
