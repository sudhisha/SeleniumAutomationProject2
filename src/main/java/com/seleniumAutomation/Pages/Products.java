package com.seleniumAutomation.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.seleniumAutomation.Base.AutomationBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Products extends AutomationBase {
	By home = By.xpath(".//a[text()=\" Home\"]");
	By products = By.xpath(".//a[text()=\" Products\"]");
	By prdpage = By.xpath(".//h2[text()=\"Login to your account\"]");
	By vprd = By.xpath(".//a[text()=\"View Product\"]");
	By prdName = By.xpath(".//h2[text()=\"Blue Top\"]");
	By cat = By.xpath(".//p[text()=\"Category: Women > Tops\"]");
	By price = By.xpath(".//span[text()=\"Rs. 500\"]");
	By ava = By.xpath(".//p[text()=\" In Stock\"]");
	By cond = By.xpath(".//a[text()=\" New\"]");
	By brand = By.xpath(".//p[text()=\" Polo\"]");
	By search = By.name("search");
	By searchbutton = By.id("submit_search");
	By Searched_Products = By.xpath(".//h2[text()=\"Searched Products\"]");
	By frstPrd = By.xpath("(.//div[@class=\"single-products\"]/div/img)[1]");
	By fpname = By.xpath("(.//p)[3]");
	By addToCartButton = By.xpath("(.//a[text()=\"Add to cart\"])[1]");
	By viewCart = By.xpath(".//u[text()=\"View Cart\"]");
	By cntueshop = By.xpath(".//button[text()=\"Continue Shopping\"]");
	By secPrd = By.xpath("(.//div[@class=\"single-products\"]/div[@class=\"productinfo text-center\"]/img)[2]");
	By addToCartButton1 = By.xpath("(.//a[text()=\"Add to cart\"])[3]");
	By spname = By.xpath("(.//p)[5]");
	By fpname1 = By.xpath("(.//a)[14]");
	By spname1 = By.xpath("(.//a)[17]");
	By fpprice = By.xpath("(.//h2)[4]");
	By fpprice1 = By.xpath("(.//p)[4]");
	By fpqty = By.xpath("(.//button)[2]");
	By fptotal= By.xpath("(.//p[@class=\"cart_total_price\"])[1]");
	By spprice = By.xpath("(.//h2)[6]");
	By spprice1 = By.xpath("(.//p)[7]");
	By spqty = By.xpath("(.//button)[3]");
	By sptotal = By.xpath("(.//p[@class=\"cart_total_price\"])[2]");
	By viewpdt = By.xpath("(.//a[text()=\"View Product\"])[1]");
	By qty = By.name("quantity");
	By addToCart = By.xpath(".//button[@type=\"button\" and  @class=\"btn btn-default cart\"]");
	By viewCart1 = By.xpath(".//u[text()=\"View Cart\"]");
	By cartqty = By.xpath(".//button[@class=\"disabled\"]");
	By cart = By.xpath(".//a[text()=\" Cart\"]");
	By proceed = By.xpath(".//a[text()=\"Proceed To Checkout\"]");
	By regOrLogin = By.xpath(".//u[text()=\"Register / Login\"]");
	By name = By.name("name");
	By email = RelativeLocator.with(By.tagName("input")).below(name);
	By signUpButton = By.xpath(".//button[text()=\"Signup\"]");
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
	By desc = By.name("message");
	By placeOrder = By.xpath(".//a[text()=\"Place Order\"]");
	By successmsg = By.xpath("(.//div[@class=\"alert-success alert\"])[1]");
	By nameOnCard = By.name("name_on_card");
	By cardNo = By.name("card_number");
	By cvc = By.name("cvc");
	By expiry_month = By.name("expiry_month");
	By expiry_year = By.name("expiry_year");
	By confirmbtn = By.id("submit");
	By delAcct = By.xpath(".//a[text()=\" Delete Account\"]");
	By delConfn = By.xpath(".//b[text()=\"Account Deleted!\"]");
	By delCont = By.xpath(".//a[text()=\"Continue\"]");
	By signUp = By.xpath(".//a[text()=\" Signup / Login\"]");
	By pwd = By.name("password");
	By logemail = RelativeLocator.with(By.tagName("input")).above(pwd);
	By loginButton = By.xpath(".//button[text()=\"Login\"]");
	By poloBrand = By.xpath(".//a[text()=\"Polo\"]");
	By hmBrand = By.xpath(".//a[text()=\"H&M\"]");
	By brandsHead = By.xpath(".//h2[text()=\"Brands\"]");
	By xButton = By.xpath(".//a[@class=\"cart_quantity_delete\" and @data-product-id=\"1\"]");
	By catgry = By.xpath(".//h2[text()=\"Category\"]");
	By women = By.xpath(".//a[@href=\"#Women\"]");
	By dress = By.xpath(".//a[@href=\"/category_products/1\" and text()=\"Dress \"]");
	By catgryhead = By.xpath(".//h2[text()=\"Women - Dress Products\"]");
	By men = By.xpath(".//a[@href=\"#Men\"]");
	By tshirt = By.xpath(".//a[@href=\"/category_products/3\" and text()=\"Tshirts \"]");
	By brandspdts = By.xpath(".//h2[text()=\"Brand - Polo Products\"]");
	By brandspdts1 = By.xpath(".//h2[text()=\"Brand - H&M Products\"]");
	By prdlist = By.xpath("//div[@class='productinfo text-center']/p");
	By writeReview = By.xpath(".//a[text()=\"Write Your Review\"]");
	By rev_name = By.id("name");
	By rev_email = By.id("email");
	By review = By.id("review");
	By button_review = By.id("button-review");
	By rev_msg = By.xpath(".//span[text()=\"Thank you for your review.\"]");
//	By rev_name = By.id("name");

	public void closeAdIfPresent() {
        try {
            // Wait for the ad close button to appear
            WebElement adCloseButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(home));
            adCloseButton.click();
        } catch (Exception e) {
            // Ad close button not found within the timeout period, proceed without action
            System.out.println("No ad found or ad could not be closed.");
        }
    }
	public void clickPrdLink() {
		WebElement adCloseButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(products));
        adCloseButton.click();
//		driver.findElement(products).click();
	}
	public String getPrdPage() {
		return driver.getCurrentUrl();
	}
	public void click_viewPrdct() {
		driver.findElement(vprd).click();
	}
	public boolean verifyPrdDetails_name() {
		return driver.findElement(prdName).isDisplayed();
	}
	public boolean verifyPrdDetails_cat() {
		return driver.findElement(cat).isDisplayed();
	}
	public boolean verifyPrdDetails_price() {
		return driver.findElement(price).isDisplayed();
	}
	public boolean verifyPrdDetails_avail() {
		return driver.findElement(ava).isDisplayed();
	}
	public boolean verifyPrdDetails_condn() {
		return driver.findElement(cond).isDisplayed();
	}
	public boolean verifyPrdDetails_brand() {
		return driver.findElement(brand).isDisplayed();
	}
	public void enterSearch() {
		driver.findElement(search).sendKeys("shirt");;
	}
	public void click_search() {
		driver.findElement(searchbutton).click();
	}
	public boolean verifySearched_Products() {
		return driver.findElement(Searched_Products).isDisplayed();
	}
	public ArrayList<String> click_firstProduct() {
		String fname = driver.findElement(fpname).getText();
		String fprice = driver.findElement(fpprice).getText();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(frstPrd));
		driver.findElement(addToCartButton).click();
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add(fname);
		ar2.add(fprice);
		return ar2;
	}
	public void clickContinue() {
		driver.findElement(cntueshop).click();
	}
	public ArrayList<String> click_secondProduct() {
		String sname = driver.findElement(spname).getText();
		String sprice = driver.findElement(spprice).getText();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(secPrd));
		driver.findElement(addToCartButton1).click();
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add(sname);
		ar1.add(sprice);
		return ar1;
	}
	public void viewCart() {
		driver.findElement(viewCart).click();
	}
	public ArrayList<String> verifyCartProducts() {
		String fname1 = driver.findElement(fpname1).getText();
		String sname1 = driver.findElement(spname1).getText();
		String sprice1 = driver.findElement(spprice1).getText();
		String sqty = driver.findElement(spqty).getText();
		String stotal = driver.findElement(sptotal).getText();
		String fprice1 = driver.findElement(fpprice1).getText();
		String fqty = driver.findElement(fpqty).getText();
		String ftotal = driver.findElement(fptotal).getText();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(fname1);//0
		ar.add(sname1);//1
		ar.add(sprice1);//2
		ar.add(sqty);//3
		ar.add(stotal);//4
		ar.add(fprice1);//5
		ar.add(fqty);//6
		ar.add(ftotal);//7
		return ar;
	}
	public void clickViewPdt() {
		WebElement adCloseButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(viewpdt));
        adCloseButton.click();
//		driver.findElement(viewpdt).click();
	}
	public void enterQuantity() {
		driver.findElement(qty).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		driver.findElement(qty).sendKeys("4");
	}
	public void clickAddToCart() {
		driver.findElement(addToCart).click();
	}
	public void clickViewCart() {
		driver.findElement(viewCart1).click();
	}
	public String verifyCartQty() {
		return driver.findElement(cartqty).getText();
	}
	public void clickCart() {
		driver.findElement(cart).click();
	}
	public String getCartPage() {
		return driver.getCurrentUrl();
	}
	public void clickProceedToCheckOut() {
		driver.findElement(proceed).click();
	}
	public void clickRegLog() {
		driver.findElement(regOrLogin).click();
	}
	public void enterName(String uname) {
		driver.findElement(name).sendKeys(uname);
	}
	public void enterEmail(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	public void clickSignUpButton() {
		driver.findElement(signUpButton).click();;
	}
	public boolean fillDetails() {
		driver.findElement(actTitle).click();
		driver.findElement(actpswd).sendKeys("nidhi123");
		WebElement add = driver.findElement(actDobDay);
		Select s = new Select(add);
		s.selectByValue("1");
		WebElement amm = driver.findElement(actDobMonth);
		Select s1 = new Select(amm);
		s1.selectByValue("3");
		WebElement ayy= driver.findElement(actDobYear);
		Select s2 = new Select(ayy);
		s2.selectByValue("1996");
		driver.findElement(newsletter).click();
		driver.findElement(optin).click();
		driver.findElement(fname).sendKeys("nidhi");
		driver.findElement(lname).sendKeys("p");
		driver.findElement(cmpny).sendKeys("meesho");
		driver.findElement(address).sendKeys("chennai");
		driver.findElement(address2).sendKeys("thamilnadu");
		driver.findElement(cntry).sendKeys("india");
		driver.findElement(state).sendKeys("thamilnadu");
		driver.findElement(city).sendKeys("chennai");
		driver.findElement(zip).sendKeys("565434");
		driver.findElement(phone).sendKeys("9878909890");
		WebElement adCloseButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(createbutton));
        adCloseButton.click();
//		driver.findElement(createbutton).click();
        WebElement adCloseButton1 = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(cntnue));
        adCloseButton1.click();
//		driver.findElement(cntnue).click();
		boolean flag = false;
		String uname = driver.findElement(username).getText();
		if(driver.findElement(loggedin).isDisplayed()) {
			if(uname.equalsIgnoreCase("nidhi")) {
				flag = true;
			}
		}
		return flag;	
	}
	public void enterDesc() {
		driver.findElement(desc).click();
	}
	public void clickPlaceOrder() {
		WebElement adCloseButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(placeOrder));
        adCloseButton.click();
//		driver.findElement(placeOrder).click();
	}
	public void enternameoncard(String name) {
		driver.findElement(nameOnCard).sendKeys(name);
	}
	public void entercardno(String cno) {
		driver.findElement(cardNo).sendKeys(cno);
	}
	public void entercvc(String cvv) {
		driver.findElement(cvc).sendKeys(cvv);
	}
	public void enterexpmm(String mm) {
		driver.findElement(expiry_month).sendKeys(mm);
	}
	public void enterexpyy(String yy) {
		driver.findElement(expiry_year).sendKeys(yy);
	}
	public boolean verifySuccessMsg() {
		return driver.findElement(successmsg).isDisplayed();
	}
	public void clickPlaceOrderButton() {
		driver.findElement(confirmbtn).click();
	}
	public void clickdelAccount() {
		driver.findElement(delAcct).click();
	}
	public boolean verifyDelMsg() {
		return driver.findElement(delConfn).isDisplayed();
	}
	public void clickdelAccountContinue() {
		driver.findElement(delCont).click();
	}
	public void clickSignUpLink() {
		driver.findElement(signUp).click();
	}
	public boolean verifySuccessMsgAccount() {
		return driver.findElement(sucmsg).isDisplayed();
	}
	public void clickContinueAccout() {
		driver.findElement(cntnue).click();
	}
	public boolean verifyLoggedIn() {
		boolean flag = false;
		String uname = driver.findElement(username).getText();
		if(driver.findElement(loggedin).isDisplayed()) {
			if(uname.equalsIgnoreCase("Nidhi")) {
				flag = true;
			}
		}
		return flag;
	}
	public void enterPwd(String pswd) {
		driver.findElement(pwd).sendKeys(pswd);
	}
	public void enterlogEmail(String emailid) {
		driver.findElement(logemail).sendKeys(emailid);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();;
	}
	public void clickXButton() {
		driver.findElement(xButton).click();;
	}
//	public boolean verifyPrdRemoval() {
//		return driver.findElement(xButton).isDisplayed();
//	}
	public boolean verifyCategory() {
		return driver.findElement(catgry).isDisplayed();
	}
	public void clickWomen() {
		driver.findElement(women).click();;
	}
	public void clickDress() {
		driver.findElement(dress).click();;
	}
	public boolean verifyCategoryheading() {
		return driver.findElement(catgryhead).isDisplayed();
	}
	public void clickMen() {
		driver.findElement(men).click();;
	}
	public void clicktshirt() {
		driver.findElement(tshirt).click();;
	}
	public boolean verifyCategoryheading2() {
		return driver.findElement(catgryhead).isDisplayed();
	}
	public boolean verifyBrandsheading() {
		return driver.findElement(brandsHead).isDisplayed();
	}
	public void clickpolo() {
		driver.findElement(poloBrand).click();;
	}
	public void clickHM() {
		driver.findElement(hmBrand).click();;
	}
	public String verifyBrandspage() {
		return driver.getCurrentUrl();
	}
	public boolean verifyBrandsproducts() {
		return driver.findElement(brandspdts).isDisplayed();
	}
	public boolean verifyBrandsproducts1() {
		return driver.findElement(brandspdts1).isDisplayed();
	}
	public void enterSearchInput(String input) {
		driver.findElement(search).sendKeys(input);;
	}
	public void verifyProductsInPage(String pdt,String pdt1) {
		if (driver.findElements(prdlist).isEmpty()) {
			System.out.println("No products are available based on search results");
		}
		else {
			List<WebElement> pl = driver.findElements(prdlist);
			for (WebElement p : pl) {
				String pd = p.getText();
				System.out.println("pd - " + pd);
				if (pd.contains(pdt) || pd.contains(pdt1)) {
					System.out.println("Products are displayed based on the searched results");
					By addToCartSearch = RelativeLocator.with(By.tagName("a")).below(p);
					driver.findElement(addToCartSearch).click();
					clickContinue();
				}
				else{
					System.out.println("No matching keywords!");
				}
			}
		}
	}
	public boolean verifyWriteReviewHead() {
		return driver.findElement(writeReview).isDisplayed();
	}
	public void EnterReviewName(String name) {
		driver.findElement(rev_name).sendKeys(name);
	}
	public void EnterReviewEmail(String email) {
		driver.findElement(rev_email).sendKeys(email);
	}
	public void EnterReviewReview(String rev) {
		driver.findElement(review).sendKeys(rev);
	}
	public void clickReviewButton() {
		driver.findElement(button_review).click();
	}
	public boolean verifySuccessReviewMsg() {
		return driver.findElement(rev_msg).isDisplayed();
	}

}




