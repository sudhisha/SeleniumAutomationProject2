package com.seleniumAutomation.Pages;

import com.seleniumAutomation.Base.AutomationBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Footer extends AutomationBase {
	
	By subscptn = By.xpath(".//h2[text()=\"Subscription\"]");
	By sucmsg = By.xpath(".//div[text()=\"You have been successfully subscribed!\"]");
	By subscButton = By.id("subscribe");
	By susbscribe_email = By.id("susbscribe_email");

	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public boolean verifySubscription() {
		return driver.findElement(subscptn).isDisplayed();
	}
	public void enterEmail(String email) {
		driver.findElement(susbscribe_email).sendKeys(email);
	}
	public void clickSubsButton() {
		driver.findElement(subscButton).click();
	}
	public boolean verifySuccessMsg() {
		return driver.findElement(sucmsg).isDisplayed();
	}	
}
