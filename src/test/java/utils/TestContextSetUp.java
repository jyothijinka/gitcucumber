package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pom.PageObjectManager;

public class TestContextSetUp {
	public WebDriver driver;
     public String landingpageproductname;
     public PageObjectManager pageobjectmanager;
    public TestBaseClass testbase;
     public GenericUtils genericUtils;
     public TestContextSetUp() throws IOException {
    	 testbase=new TestBaseClass();
    	pageobjectmanager=new PageObjectManager(testbase.webDriverManager()); 
    	genericUtils=new GenericUtils(testbase.webDriverManager());
     }
}
