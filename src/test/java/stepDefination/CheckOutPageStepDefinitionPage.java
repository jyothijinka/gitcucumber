package stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pom.CheckOutPagePomClass;
import utils.TestContextSetUp;

public class CheckOutPageStepDefinitionPage {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	public TestContextSetUp testcontextsetup;
	public CheckOutPagePomClass checkoutpage;
	public String cartitem;
	public CheckOutPageStepDefinitionPage (TestContextSetUp testcontextsetup){
		this.testcontextsetup=testcontextsetup;
		this.checkoutpage = testcontextsetup.pageobjectmanager.getCheckOutPage();
	}
	
	@Then("^User proceeds to check out and validate the (.+) items in checkout page$")
    public void user_proceeds_to_check_out_and_validate_the_items_in_checkout_page(String name) throws Throwable {
		checkoutpage.proceedToCheckOutItems();
		Thread.sleep(1000);
		String cartitem = checkoutpage.getaddeditems().split("-")[0].trim();
		Assert.assertEquals(cartitem,testcontextsetup.landingpageproductname);
		
	}
	
      
	 @Then("^verify user has ability to enter promo code and place the order$")
	    public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable {
		
		 Assert.assertTrue(checkoutpage.promoCodeApply());
	      Assert.assertTrue(checkoutpage.placeOrder());
	
	 }
}
