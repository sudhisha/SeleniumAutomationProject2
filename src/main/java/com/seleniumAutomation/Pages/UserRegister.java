package com.seleniumAutomation.Pages;

import com.seleniumAutomation.Base.AutomationBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;


public class UserRegister extends AutomationBase {
	By signUp = By.xpath(".//a[text()=\" Signup / Login\"]");
	By signUpHead = By.xpath(".//h2[text()=\"New User Signup!\"]");
	By name = By.name("name");
	By email = RelativeLocator.with(By.tagName("input")).below(name);
	By signUpButton = By.xpath(".//button[text()=\"Signup\"]");
	By accountInfoHead = By.xpath(".//b[text()=\"Enter Account Information\"]");
	By actTitle = By.id("id_gender2");
	By actName = By.name("name");
	By actEmail = By.name("email");
	By actpswd = By.name("password");
	By actDobDay = By.name("days");
	By actDobMonth = By.name("months");
	By actDobYear = By.name("years");
	By newsletter = By.name("newsletter");
	By optin = By.name("optin");
	By fname = By.name("first_name");
	By lname = By.name("last_name");
	By cmpny = By.id("company");
	By address = By.id("address1");
	By address2 = By.name("address2");
	By cntry = By.name("country");
	By state = By.id("state");
	By city = By.id("city");
	By zip = By.id("zipcode");
	By phone = By.name("mobile_number");
	By createbutton = By.xpath(".//button[text()=\"Create Account\"]");
	By sucmsg = By.xpath(".//b[text()=\"Account Created!\"]");
	By cntnue = By.xpath(".//a[text()=\"Continue\"]");
	By loggedin = By.xpath(".//a[text()=\" Logged in as \"]");
	By username = By.xpath("(.//b)");
	By delete = By.xpath(".//a[text()=\" Delete Account\"]");
	By delmsg = By.xpath(".//b[text()=\"Account Deleted!\"]");
	By cntnue1 = By.xpath(".//a[text()=\"Continue\"]");
	By emailmsg = By.xpath(".//p[text()=\"Email Address already exist!\"]");
	
	public void clickSignUpLink() {
		driver.findElement(signUp).click();
	}
	public boolean getSignUpHeading() {
		return driver.findElement(signUpHead).isDisplayed();
	}
	public void enterName(String uname) {
		driver.findElement(name).sendKeys(uname);
	}
	public void enterEmail(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	public void clickSignUpButton() {
		driver.findElement(signUpButton).click();
	}
	public boolean verifyAccInfoHeading() {
		return driver.findElement(accountInfoHead).isDisplayed();
	}
	public void fillTitle() {
		driver.findElement(actTitle).click();
	}
	public String fillName() {
		WebElement name = driver.findElement(actName);
		return name.getAttribute("value");
	}
	public String fillEmail() {
		WebElement email = driver.findElement(actEmail);
		return email.getAttribute("value");
	}
	public void fillPassword(String pwd) {
		driver.findElement(actpswd).sendKeys(pwd);
	}
	public void fillDob(String dd,String mm,String yy) {
		WebElement add = driver.findElement(actDobDay);
		Select s = new Select(add);
		s.selectByValue(dd);
		WebElement amm = driver.findElement(actDobMonth);
		Select s1 = new Select(amm);
		s1.selectByValue(mm);
		WebElement ayy= driver.findElement(actDobYear);
		Select s2 = new Select(ayy);
		s2.selectByValue(yy);
	}
	public void selectchkbox1() {
		driver.findElement(newsletter).click();
	}
	public void selectchkbox2() {
		driver.findElement(optin).click();
	}
	public void enterFirstname(String f_name) {
		driver.findElement(fname).sendKeys(f_name);
	}
	public void enterLastname(String l_name) {
		driver.findElement(lname).sendKeys(l_name);
	}
	public void enterCompany(String cmpny1) {
		driver.findElement(cmpny).sendKeys(cmpny1);
	}
	public void enterAdd(String add1) {
		driver.findElement(address).sendKeys(add1);
	}
	public void enterAdd2(String add2) {
		driver.findElement(address2).sendKeys(add2);
	}
	public void enterCountry(String ctry) {
		driver.findElement(cntry).sendKeys(ctry);
	}
	public void enterState(String ste) {
		driver.findElement(state).sendKeys(ste);
	}
	public void enterCity(String cty) {
		driver.findElement(city).sendKeys(cty);
	}
	public void enterZip(String zp) {
		driver.findElement(zip).sendKeys(zp);
	}
	public void enterPhone(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}
	public void clickCreateButton() {
		driver.findElement(createbutton).click();
	}
	public boolean verifySuccessMsg() {
		return driver.findElement(sucmsg).isDisplayed();
	}
	public void clickContinue() {
		driver.findElement(cntnue).click();
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
	public void clickContinue1() {
		driver.findElement(cntnue1).click();
	}
	public boolean verifyEmailMsg() {
		return driver.findElement(emailmsg).isDisplayed();
	}
	
	
	
	
	
	
}
