package com.seleniumAutomation.testcases;

import com.seleniumAutomation.Pages.TestCasePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestCases_Test {

	TestCasePage tp;
	@BeforeMethod
	public void browserSetUp() {
		tp = new TestCasePage();
		tp.initialization();
		tp.verifyHomePage();
	}
	
	@Test
	public void verifyTestCasePage() {
		tp.clickTestCases();
		Assert.assertTrue(tp.getTestCasesPage().contains("test_cases"));
	}
	
	@AfterMethod
	public void closeDriver() {
		tp.tearDown();
	}
}
