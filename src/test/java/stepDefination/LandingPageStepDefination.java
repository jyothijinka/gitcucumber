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
import utils.TestContextSetUp;

public class LandingPageStepDefination {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	TestContextSetUp testcontextsetup;
	public LandingPagePomClass landingpage;
	public LandingPageStepDefination(TestContextSetUp testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingPage();
	}
	 @Given("^User is on GreenKart Landing page$")
	    public void user_is_on_greenkart_landing_page() throws Throwable {
		 Assert.assertTrue(landingpage.getTitle().contains("GreenKart"));
	    
	 }
	    @When("^User Searched with short Name (.+) and extracted actual name of product$")
	    public void user_searched_with_short_name_something_and_extracted_actual_name_of_product(String shortname) throws Throwable {
	    
	    	Thread.sleep(2000);
	    	landingpage.searchItem(shortname);
	    	Thread.sleep(2000);
	    	testcontextsetup.landingpageproductname = landingpage.getProductName().split("-")[0].trim();
	    	System.out.println(testcontextsetup.landingpageproductname +"is extracted from home page");
	    
	    }
	    
	    @And("^Added \"([^\"]*)\" items of selected product to cart$")
	    public void added_something_items_of_selected_product_to_cart(String strArg1) throws Throwable {
	      
			landingpage.incrementItems(Integer.parseInt(strArg1));
	    	
		landingpage.addToCart(); 
			
	    }
	    @When("^User selected flight booking feature$")
	    public void user_selected_flight_booking_feature() throws Throwable {
	       landingpage.selectFlightBooking(); 
	     
	    }
	    
}

