package com.seleniumAutomation.testcases;


import com.seleniumAutomation.Pages.Cart;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class CartTest {

	Cart ct;
	@BeforeMethod
	public void browserSetUp() {
		ct = new Cart();
		ct.initialization();
		ct.verifyHomePage();
	}
	
	@Test
	public void verifySubscriptionCart() {
		ct.clickCart();
		ct.scrolldown();
		Assert.assertTrue(ct.verifySubscription());
		ct.enterEmail("sudhi123@gmail.com");
		ct.clickSubsButton();
		Assert.assertTrue(ct.verifySuccessMsg());
	}
	
	@AfterMethod
	public void closeDriver() {
		ct.tearDown();
	}
}
