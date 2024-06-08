package com.seleniumAutomation.Base;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class AutomationBase {

	public static WebDriver driver;
	public void initialization() {
		Path extensionPath = Paths.get("D:\\Sudhi\\works\\Software testing\\Projects\\Automation testing\\Project 1\\SeleniumAutomationProject2\\src\\main\\java\\com\\seleniumAutomation\\resources\\uBlock0.chromium");

		// Set Chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("load-extension=" + extensionPath.toAbsolutePath().toString());
		driver = new ChromeDriver(options);
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void verifyHomePage() {
		String actTitle = driver.getTitle();
		String expTitle = "Automation Exercise";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	public void tearDown() {
//		driver.quit();
	}
		
}
