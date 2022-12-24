package stepDefination;


import org.testng.Assert;

import io.cucumber.java.en.Then;
import pom.GitPractice;
import utils.TestContextSetUp;

public class GitPracticeStepDefination {
public TestContextSetUp testcontextsetup;
public GitPractice gitpractice;

public GitPracticeStepDefination(TestContextSetUp testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
	this.gitpractice=testcontextsetup.pageobjectmanager.getFlightBookingPage();
}
@Then("^User moved to Flight Booking page$")
public void user_moved_to_flight_booking_page() throws Throwable {
	  Thread.sleep(2000);  
 Assert.assertTrue(gitpractice.getPageTitle().contains("QAClickJet"));
}



}
