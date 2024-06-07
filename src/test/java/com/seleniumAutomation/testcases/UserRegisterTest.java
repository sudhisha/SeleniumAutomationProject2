package com.seleniumAutomation.testcases;

import com.seleniumAutomation.Pages.UserRegister;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class UserRegisterTest {

	UserRegister ur;
	@BeforeMethod
	public void browserSetUp() {
		ur = new UserRegister();
		ur.initialization();
		ur.verifyHomePage();
	}

	@Test
	public void SignUp() {
		ur.clickSignUpLink();
		Assert.assertTrue(ur.getSignUpHeading());
		ur.enterName("Sudhi");
		ur.enterEmail("sudhi123@gmail.com");
		ur.clickSignUpButton();
		Assert.assertTrue(ur.verifyAccInfoHeading());
		ur.fillTitle();
		Assert.assertEquals("Sudhi", ur.fillName());
		Assert.assertEquals("sudhi123@gmail.com", ur.fillEmail());
		ur.fillPassword("sudhi123");
		ur.fillDob("1", "3", "1996");
		ur.selectchkbox1();
		ur.selectchkbox2();
		ur.enterFirstname("Sudhi");
		ur.enterLastname("K");
		ur.enterCompany("TCS");
		ur.enterAdd("Sudhi Nivas");
		ur.enterAdd2("PO Iritty");
		ur.enterCountry("India");
		ur.enterState("Karnataka");
		ur.enterCity("Chennai");
		ur.enterZip("432432");
		ur.enterPhone("8765645555");
		ur.clickCreateButton();
		Assert.assertTrue(ur.verifySuccessMsg());
		ur.clickContinue();
		Assert.assertTrue(ur.verifyLoggedIn());
		ur.clickDelete();
		Assert.assertTrue(ur.verifyDeleteMsg());
		ur.clickContinue1();
	}
	
	@Test
	public void SignUp_withExistingEmail() {
		ur.clickSignUpLink();
		Assert.assertTrue(ur.getSignUpHeading());
		ur.enterName("Sudhi");
		ur.enterEmail("sudhi123@gmail.com");
		ur.clickSignUpButton();
		Assert.assertTrue(ur.verifyEmailMsg());
	}
	
	@AfterMethod
	public void closeDriver() {
		ur.tearDown();
	}
}
