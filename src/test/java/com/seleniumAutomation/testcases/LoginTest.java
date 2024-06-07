package com.seleniumAutomation.testcases;

import com.seleniumAutomation.Pages.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {

	Login lp;
	@BeforeMethod
	public void browserSetUp() {
		lp = new Login();
		lp.initialization();
		lp.verifyHomePage();
	}
	
	@Test
	public void verifyLogin_with_Valid_Inputs() {
		lp.clickLoginLink();
		Assert.assertTrue(lp.getloginHeading());
		lp.enterEmail("sudhi123@gmail.com");
		lp.enterPwd("sudhi123");
		lp.clickLoginButton();
		Assert.assertTrue(lp.verifyLoggedIn());
		lp.clickDelete();
		Assert.assertTrue(lp.verifyDeleteMsg());
	}
	
	@Test
	public void verifyLogin_with_InValid_Inputs() {
		lp.clickLoginLink();
		Assert.assertTrue(lp.getloginHeading());
		lp.enterEmail("abcfdr@gmail.com");
		lp.enterPwd("22222");
		lp.clickLoginButton();
		Assert.assertTrue(lp.verifyErrorMsg());
	}
	
	@Test
	public void verifyLogOut() {
		lp.clickLoginLink();
		Assert.assertTrue(lp.getloginHeading());
		lp.enterEmail("sudhi123@gmail.com");
		lp.enterPwd("sudhi123");
		lp.clickLoginButton();
		Assert.assertTrue(lp.verifyLoggedIn());
		lp.clickLogout();
		Assert.assertTrue(lp.verifylogout().contains("login"));
	}
	
	@AfterMethod
	public void closeDriver() {
		lp.tearDown();
	}
}
