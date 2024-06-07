package com.seleniumAutomation.testcases;

import com.seleniumAutomation.Pages.Footer;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FooterTest {

	Footer ft;
	@BeforeMethod
	public void browserSetUp() {
		ft = new Footer();
		ft.initialization();
		ft.verifyHomePage();
	}
	
	@Test
	public void verifySubscriptionHome() {
		ft.scrolldown();
		Assert.assertTrue(ft.verifySubscription());
		ft.enterEmail("sudhi123@gmail.com");
		ft.clickSubsButton();
		Assert.assertTrue(ft.verifySuccessMsg());
	}
	
	@AfterMethod
	public void closeDriver() {
		ft.tearDown();
	}
}
