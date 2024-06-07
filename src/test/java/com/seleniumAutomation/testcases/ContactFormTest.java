package com.seleniumAutomation.testcases;

import com.seleniumAutomation.Pages.Contact_Form;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ContactFormTest {

	Contact_Form ct;
	@BeforeMethod
	public void browserSetUp() {
		ct = new Contact_Form();
		ct.initialization();
		ct.verifyHomePage();
	}
	
	@Test
	public void verifyContactUs() {
		ct.clickContactButton();
		Assert.assertTrue(ct.verifyGetInTouch());
		ct.enterName("Sudhi");
		ct.enterEmail("sudhi123@gmail.com");
		ct.enterSubject("Complaint");
		ct.enterMsg("Not Good service!");
		String path = "D:\\Sudhi\\works\\Software testing\\Projects\\Automation testing\\Project 1\\SeleniumAutomationProject2\\src\\main\\java\\com\\seleniumAutomation\\resources\\PROFILE PIC.png";
		ct.uploadFile(path);
		ct.clickSubmitButton();
		ct.clickOK();
		Assert.assertTrue(ct.verifySuccessMsg());
		ct.clickHome();
		Assert.assertEquals(ct.verifyHome(),"https://automationexercise.com/");
	}
	
	@AfterMethod
	public void closeDriver() {
		ct.tearDown();
	}
}
