package com.seleniumAutomation.Pages;

import com.seleniumAutomation.Base.AutomationBase;
import org.openqa.selenium.By;


public class TestCasePage extends AutomationBase {
	By testcases = By.xpath(".//a[text()=\" Test Cases\"]");
	
	public void clickTestCases() {
		driver.findElement(testcases).click();
	}
	public String getTestCasesPage() {
		return driver.getCurrentUrl();
	}	
}
