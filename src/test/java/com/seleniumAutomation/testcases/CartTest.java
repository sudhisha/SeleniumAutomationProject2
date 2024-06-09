package com.seleniumAutomation.testcases;


import com.seleniumAutomation.Pages.Cart;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


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

	@Test
	public void verifyScrollUp_and_Down() throws InterruptedException {
		ct.scrolldown();
		Thread.sleep(2000);
		assertTrue(ct.verifySubscription(), "'SUBSCRIPTION' section is not visible");
		ct.scrollUp();
		Thread.sleep(2000); // Wait for the page to scroll up
		assertTrue(ct.verifyPracticeWebsite(), "'Full-Fledged practice website for Automation Engineers' text is not visible");
	}
	@Test
	public void verifyScrollUp_and_Down_withoutArrow() throws InterruptedException {
		ct.scrolldown();
		Thread.sleep(2000);
		assertTrue(ct.verifySubscription(), "'SUBSCRIPTION' section is not visible");
		ct.scrollUp_JS();
		Thread.sleep(2000);
		assertTrue(ct.verifyPracticeWebsite(), "'Full-Fledged practice website for Automation Engineers' text is not visible");
	}
	@Test
	public void Add_to_cart_from_Recommended_items() {
		ct.scrolldown();
		assertTrue(ct.verifyRecommendItems());
		String c_pname = ct.getAddcartItemName();
		ct.clickAddtocartRecommended();
		ct.clickViewcartRecommended();
		String vc_pname = ct.getViewcartItemName();
		Assert.assertEquals(c_pname,vc_pname);
	}

	@AfterMethod
	public void closeDriver() {
		ct.tearDown();
	}
}
