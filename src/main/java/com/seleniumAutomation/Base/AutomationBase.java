package com.seleniumAutomation.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class AutomationBase {

	public static WebDriver driver;
	public void initialization() {
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void verifyHomePage() {
		String actTitle = driver.getTitle();
		String expTitle = "Automation Exercise";
		Assert.assertEquals(actTitle, expTitle);
//		assertEquals();
	}
	
	public void tearDown() {
//		driver.quit();
	}
		
}
