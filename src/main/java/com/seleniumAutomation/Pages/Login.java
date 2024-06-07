package com.seleniumAutomation.Pages;

import com.seleniumAutomation.Base.AutomationBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Login extends AutomationBase {
	By signUp = By.xpath(".//a[text()=\" Signup / Login\"]");
	By loginHead = By.xpath(".//h2[text()=\"Login to your account\"]");
	By pwd = By.name("password");
	By email = RelativeLocator.with(By.tagName("input")).above(pwd);
	By loginButton = By.xpath(".//button[text()=\"Login\"]");
	By loggedin = By.xpath(".//a[text()=\" Logged in as \"]");
	By username = By.xpath("(.//b)");
	By delete = By.xpath(".//a[text()=\" Delete Account\"]");
	By delmsg = By.xpath(".//b[text()=\"Account Deleted!\"]");
	By errmsg = By.xpath(".//p[text()=\"Your email or password is incorrect!\"]");
	By logout = By.xpath(".//a[text()=\" Logout\"]");
	
	public void clickLoginLink() {
		driver.findElement(signUp).click();
	}
	public boolean getloginHeading() {
		return driver.findElement(loginHead).isDisplayed();
	}
	public void enterPwd(String pswd) {
		driver.findElement(pwd).sendKeys(pswd);
	}
	public void enterEmail(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();;
	}
	public boolean verifyLoggedIn() {
		boolean flag = false;
		String uname = driver.findElement(username).getText();
		if(driver.findElement(loggedin).isDisplayed()) {
			if(uname.equalsIgnoreCase("Sudhi")) {
				flag = true;
			}
		}
		return flag;
	}
	public void clickDelete() {
		driver.findElement(delete).click();
	}
	public boolean verifyDeleteMsg() {
		return driver.findElement(delmsg).isDisplayed();
	}
	public boolean verifyErrorMsg() {
		return driver.findElement(errmsg).isDisplayed();
	}
	public void clickLogout() {
		driver.findElement(logout).click();
	}
	public String verifylogout() {
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
}
