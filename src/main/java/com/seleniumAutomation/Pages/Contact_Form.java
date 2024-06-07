package com.seleniumAutomation.Pages;

import com.seleniumAutomation.Base.AutomationBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Contact_Form extends AutomationBase {
	By ctbutton = By.xpath(".//a[text()=\" Contact us\"]");
	By GIT = By.xpath(".//h2[text()=\"Get In Touch\"]");
	By name = By.name("name");
	By email = By.name("email");
	By sub = By.name("subject");
	By msg = By.id("message");
	By upldfile = By.name("upload_file");
	By submitButton = By.name("submit");
	By sucmsg = RelativeLocator.with(By.tagName("div")).below(GIT);
	By homebutton = By.xpath(".//a[text()=\" Home\"]");

	public void clickContactButton() {
		driver.findElement(ctbutton).click();
	}
	public boolean verifyGetInTouch() {
		return driver.findElement(GIT).isDisplayed();
	}
	public void enterName(String name1) {
		driver.findElement(name).sendKeys(name1);
	}
	public void enterEmail(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	public void enterSubject(String sub1) {
		driver.findElement(sub).sendKeys(sub1);
	}
	public void enterMsg(String msg1) {
		driver.findElement(msg).sendKeys(msg1);
	}
	public void uploadFile(String fpath) {
		driver.findElement(upldfile).sendKeys(fpath);
	}
	public void clickSubmitButton() {
		driver.findElement(submitButton).click();
	}
	public void clickOK() {
		driver.switchTo().alert().accept();
	}
	public boolean verifySuccessMsg() {
		return driver.findElement(sucmsg).isDisplayed();
	}
	public void clickHome() {
		driver.findElement(homebutton).click();
	}
	public String verifyHome() {
		return driver.getCurrentUrl();
	}
	
}
