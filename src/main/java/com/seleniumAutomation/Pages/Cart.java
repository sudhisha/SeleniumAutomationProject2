package com.seleniumAutomation.Pages;

import com.seleniumAutomation.Base.AutomationBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Cart extends AutomationBase {
	
	By cart = By.xpath(".//a[text()=\" Cart\"]");
	By subscptn = By.xpath(".//h2[text()=\"Subscription\"]");
	By sucmsg = By.xpath(".//div[text()=\"You have been successfully subscribed!\"]");
	By subscButton = By.id("subscribe");
	By susbscribe_email = By.id("susbscribe_email");
	By scrollUp = By.xpath("//i[@class='fa fa-angle-up']");
	By practiceWS = By.xpath("//h2[contains(text(), 'Full-Fledged practice website for Automation Engineers')]");
	By rec_items = By.xpath(".//h2[text()=\"recommended items\"]");
	By rec_addtocart = RelativeLocator.with(By.xpath(".//a[text()=\"Add to cart\"]")).below(rec_items);
	By rec_viewcart = By.xpath(".//u[text()=\"View Cart\"]");
	By rec_addtocart_pname = RelativeLocator.with(By.tagName("p")).below(rec_items);
	By rec_viewcart_pname = By.xpath(".//td[@class=\"cart_description\"]/h4/a");


	public void clickCart() {
		driver.findElement(cart).click();
	}
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
//	public boolean verifySubscription() {
//		return driver.findElement(By.xpath("//h2[text()='Subscription']")).isDisplayed();
//	}
	public void scrollUp() {
		driver.findElement(scrollUp).click();
	}
	public boolean verifyPracticeWebsite() {
		return  driver.findElement(practiceWS).isDisplayed();
	}
	public void scrollUp_JS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}
	public boolean verifyRecommendItems() {
		return driver.findElement(rec_items).isDisplayed();
	}
	public void clickAddtocartRecommended() {
		driver.findElement(rec_addtocart).click();
	}
	public void clickViewcartRecommended() {
		driver.findElement(rec_viewcart).click();
	}
	public String getAddcartItemName() {
		return driver.findElement(rec_addtocart_pname).getText();
	}
	public String getViewcartItemName() {
		return driver.findElement(rec_viewcart_pname).getText();
	}
}
