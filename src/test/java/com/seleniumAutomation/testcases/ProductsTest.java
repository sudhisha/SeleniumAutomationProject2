package com.seleniumAutomation.testcases;

import java.util.ArrayList;
import java.util.List;

import com.seleniumAutomation.Pages.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ProductsTest {

	Products pd;
	@BeforeMethod
	public void browserSetUp() {
		pd = new Products();
		pd.initialization();
		pd.verifyHomePage();
		pd.closeAdIfPresent();
	}
	
	
	@Test
	public void verifyProducts() {
		pd.clickPrdLink();
		pd.closeAdIfPresent();
		assertTrue(pd.getPrdPage().contains("products"));
		pd.click_viewPrdct();
		assertTrue(pd.getPrdPage().contains("product_details"));
		assertTrue(pd.verifyPrdDetails_name());
		assertTrue(pd.verifyPrdDetails_cat());
		assertTrue(pd.verifyPrdDetails_price());
		assertTrue(pd.verifyPrdDetails_avail());
		assertTrue(pd.verifyPrdDetails_condn());
		assertTrue(pd.verifyPrdDetails_brand());
	}
	
	@Test
	public void searchProducts() {
		pd.clickPrdLink();
		pd.closeAdIfPresent();
		assertTrue(pd.getPrdPage().contains("products"));
		pd.enterSearch();
		pd.click_search();
		assertTrue(pd.verifySearched_Products());
	}
	
	@Test
	public void productsAddToCart() {
		ArrayList<String> ar2 = pd.click_firstProduct();
		pd.clickContinue();
		ArrayList<String> ar1 = pd.click_secondProduct();
		pd.viewCart();
		ArrayList<String> ar= pd.verifyCartProducts();
//		Assert.assertEquals(ar2.get(0),ar.get(0));
//		Assert.assertEquals(ar1.get(0),ar.get(1));
//		Assert.assertEquals(ar1.get(1),ar.get(2));
//		Assert.assertEquals(ar2.get(1),ar.get(5));
//		Assert.assertEquals("1",ar.get(3));
//		Assert.assertEquals("1",ar.get(6));
//		Assert.assertEquals("Rs. 400",ar.get(4));
//		Assert.assertEquals("Rs. 500",ar.get(7));
	}
	
	@Test
	public void verifyPproductQty() {
		pd.clickViewPdt();
		assertTrue(pd.getPrdPage().contains("product_details"));
		pd.enterQuantity();
		pd.clickAddToCart();
		pd.clickViewCart();
		String qty = pd.verifyCartQty();
		Assert.assertEquals("4", qty);
	}
	
	@Test
	public void placeOrderRegisterWhileCheckout() {
		productsAddToCart();
		pd.clickCart();
		Assert.assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
		pd.clickProceedToCheckOut();
		pd.clickRegLog();
		pd.enterName("Nidhi");
		pd.enterEmail("nidhi123@gmail.com");
		pd.clickSignUpButton();
		assertTrue(pd.fillDetails());
		pd.clickCart();
		pd.clickProceedToCheckOut();
		pd.enterDesc();
		pd.clickPlaceOrder();
		pd.enternameoncard("Nidhi");
		pd.entercardno("342156789876");
		pd.entercvc("677");
		pd.enterexpmm("03");
		pd.enterexpyy("2025");
		pd.clickPlaceOrderButton();
		pd.verifySuccessMsg();
		pd.clickdelAccount();
		assertTrue(pd.verifyDelMsg());
		pd.clickdelAccountContinue();
	}
	
	@Test
	public void placeOrderRegisterBeforeCheckout() {
		pd.clickSignUpLink();
		pd.enterName("Nidhi");
		pd.enterEmail("nidhi123@gmail.com");
		pd.clickSignUpButton();
		assertTrue(pd.fillDetails());
		pd.verifySuccessMsgAccount();
		pd.clickContinueAccout();
		pd.verifyLoggedIn();
		productsAddToCart();
		pd.clickCart();
		Assert.assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
		pd.clickProceedToCheckOut();
		pd.enterDesc();
		pd.clickPlaceOrder();
		pd.enternameoncard("Nidhi");
		pd.entercardno("342156789876");
		pd.entercvc("677");
		pd.enterexpmm("03");
		pd.enterexpyy("2025");
		pd.clickPlaceOrderButton();
		pd.verifySuccessMsg();
		pd.clickdelAccount();
		assertTrue(pd.verifyDelMsg());
		pd.clickdelAccountContinue();
	}
	
	@Test
	public void placeOrderLoginBeforeCheckout() {
		pd.clickSignUpLink();
		pd.enterlogEmail("nidhi123@gmail.com");
		pd.enterPwd("nidhi123");
		pd.clickLoginButton();
		assertTrue(pd.verifyLoggedIn());
		productsAddToCart();
		pd.clickCart();
		Assert.assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
		pd.clickProceedToCheckOut();
		pd.enterDesc();
		pd.clickPlaceOrder();
		pd.enternameoncard("Nidhi");
		pd.entercardno("342156789876");
		pd.entercvc("677");
		pd.enterexpmm("03");
		pd.enterexpyy("2025");
		pd.clickPlaceOrderButton();
		pd.verifySuccessMsg();
		pd.clickdelAccount();
		assertTrue(pd.verifyDelMsg());
		pd.clickdelAccountContinue();
	}
	
	@Test
	public void removeProducts_cart() {
		productsAddToCart();
		pd.clickCart();
		Assert.assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
		pd.clickXButton();
//		Assert.assertFalse(pd.verifyPrdRemoval());
	}
	
	@Test
	public void viewCategoryProducts() {
		assertTrue(pd.verifyCategory());
		pd.clickWomen();
		pd.clickDress();
		Assert.assertEquals(pd.getCartPage(),"https://automationexercise.com/category_products/1");
		assertTrue(pd.verifyCategoryheading());
		pd.clickMen();
		pd.clicktshirt();
		Assert.assertEquals(pd.verifyCategoryheading2(),"https://automationexercise.com/category_products/3");
	}

	@Test
	public void view_Cart_BrandProducts() {
		pd.clickPrdLink();
		assertTrue(pd.verifyBrandsheading());
		pd.clickpolo();
		assertTrue(pd.verifyBrandsproducts());
		assertTrue(pd.verifyBrandspage().contains("brand_products"));
		pd.clickHM();
		assertTrue(pd.verifyBrandspage().contains("brand_products"));
		assertTrue(pd.verifyBrandsproducts1());
	}

	@Test
	public void Search_Products_and_Verify_Cart_After_Login() {
		pd.clickPrdLink();
		String prdct = "shirt";
		String prdct1 = "Shirt";
		Assert.assertEquals(pd.verifyBrandspage(),"https://automationexercise.com/products");
		pd.enterSearchInput(prdct);
		pd.click_search();
		assertTrue(pd.verifySearched_Products());
		pd.verifyProductsInPage(prdct,prdct1);
		pd.clickCart();
		pd.clickSignUpLink();
		pd.enterlogEmail("nidhi123@gmail.com");
		pd.enterPwd("nidhi123");
		pd.clickLoginButton();
		pd.clickCart();
	}

	@Test
	public void add_review_Products() {
		pd.clickPrdLink();
		Assert.assertEquals(pd.verifyBrandspage(),"https://automationexercise.com/products");
		pd.clickViewPdt();
		assertTrue(pd.verifyWriteReviewHead());
		pd.EnterReviewName("Nidhi");
		pd.EnterReviewEmail("nidhi123@gmail.com");
		pd.EnterReviewReview("Good Product...");
		pd.clickReviewButton();
		assertTrue(pd.verifySuccessReviewMsg());
	}

	@Test
	public void Add_to_cart_from_Recommended_items() {
		pd.scrolldown();
		assertTrue(pd.verifyRecommendItems());
		String c_pname = pd.getAddcartItemName();
		pd.clickAddtocartRecommended();
		pd.clickViewcartRecommended();
		String vc_pname = pd.getViewcartItemName();
		Assert.assertEquals(c_pname,vc_pname);
	}



	@Test
	public void verifyScrollUp_and_Down() throws InterruptedException {
		pd.scrolldown();
		Thread.sleep(2000);
		assertTrue(pd.verifySubscription(), "'SUBSCRIPTION' section is not visible");
		pd.scrollUp();
		Thread.sleep(2000); // Wait for the page to scroll up
		assertTrue(pd.verifyPracticeWebsite(), "'Full-Fledged practice website for Automation Engineers' text is not visible");
	}
	@Test
	public void verifyScrollUp_and_Down_withoutArrow() throws InterruptedException {
		pd.scrolldown();
		Thread.sleep(2000);
		assertTrue(pd.verifySubscription(), "'SUBSCRIPTION' section is not visible");
		pd.scrollUp_JS();
		Thread.sleep(2000);
		assertTrue(pd.verifyPracticeWebsite(), "'Full-Fledged practice website for Automation Engineers' text is not visible");
	}
	@AfterMethod
	public void closeDriver() {
		pd.tearDown();
	}
}








