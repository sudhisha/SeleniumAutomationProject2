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

import static org.testng.Assert.assertEquals;
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
		pd.clickPrdLink();
		pd.click_firstProduct();
		pd.clickContinue();
		pd.click_secondProduct();
		pd.viewCart();
		pd.verifyCartProducts1();
		pd.verifyCartProducts2();
		assertEquals(pd.verifyCartProducts3(), "Rs. 500", "First product price is incorrect");
		assertEquals(pd.verifyCartProducts4(), "Rs. 400", "Second product price is incorrect");
		assertEquals(pd.verifyCartProducts5(), "1", "First product quantity is incorrect");
		assertEquals(pd.verifyCartProducts6(), "1", "Second product quantity is incorrect");
		assertEquals(pd.verifyCartProducts7(), "Rs. 500", "First product total price is incorrect");
		assertEquals(pd.verifyCartProducts8(), "Rs. 400", "Second product total price is incorrect");
	}
	
	@Test
	public void verifyPproductQty() {
		pd.clickViewPdt();
		assertTrue(pd.getPrdPage().contains("product_details"));
		pd.enterQuantity();
		pd.clickAddToCart();
		pd.clickViewCart();
		String qty = pd.verifyCartQty();
		assertEquals("4", qty);
	}
	
	@Test
	public void placeOrderRegisterWhileCheckout() {
		productsAddToCart();
		pd.clickCart();
		assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
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
		assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
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
		assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
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
		assertEquals(pd.getCartPage(),"https://automationexercise.com/view_cart");
		pd.clickXButton();
//		Assert.assertFalse(pd.verifyPrdRemoval());
	}
	
	@Test
	public void viewCategoryProducts() {
		assertTrue(pd.verifyCategory());
		pd.clickWomen();
		pd.clickDress();
		assertEquals(pd.getCartPage(),"https://automationexercise.com/category_products/1");
		assertTrue(pd.verifyCategoryheading());
		pd.clickMen();
		pd.clicktshirt();
		assertEquals(pd.verifyCategoryheading2(),"https://automationexercise.com/category_products/3");
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
		assertEquals(pd.verifyBrandspage(),"https://automationexercise.com/products");
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
		assertEquals(pd.verifyBrandspage(),"https://automationexercise.com/products");
		pd.clickViewPdt();
		assertTrue(pd.verifyWriteReviewHead());
		pd.EnterReviewName("Nidhi");
		pd.EnterReviewEmail("nidhi123@gmail.com");
		pd.EnterReviewReview("Good Product...");
		pd.clickReviewButton();
		assertTrue(pd.verifySuccessReviewMsg());
	}

	@Test
	public void verifyAddressDetailsInCheckoutPage(){
		pd.clickSignUpLink();
		pd.enterName("Nidhin");
		pd.enterEmail("nidhinp123@gmail.com");
		pd.clickSignUpButton();
		pd.fillDetails1();
		assertTrue(pd.verifyAccountCreated(), "Account creation message not visible");
		pd.clickContinueAccout();
		assertTrue(pd.verifyLoggedIn1(), "Logged in as username message not visible");
		pd.prdAddCart();
		pd.clickViewCart();
		assertTrue(pd.verifyCart(), "Cart page is not displayed");
		pd.clickProceedToCheckOut();
		assertTrue(pd.verifydeliveryaddressName().contains("Mr. nidhi p"), "Delivery address name is incorrect");
		assertTrue(pd.verifydeliveryaddressAdd1().contains("chennai"), "Delivery address line 1 is incorrect");
		assertTrue(pd.verifybillingaddressName().contains("Mr. nidhi p"), "Billing address name is incorrect");
		assertTrue(pd.verifybillingaddressAdd1().contains("chennai"), "Billing address line 1 is incorrect");
		pd.clickdelAccount();
		assertTrue(pd.verifyDelMsg(), "Account deletion message not visible");
		pd.clickdelAccountContinue();
	}

	@Test
	public void download_Invoice_after_purchase_order() throws InterruptedException {
		pd.prdAddCart();
		pd.clickViewCart();
		assertTrue(pd.verifyCart(), "Cart page is not displayed");
		pd.clickProceedToCheckOut();
		pd.clickRegLog();
		pd.enterName("Nidhin");
		pd.enterEmail("nidhinp123@gmail.com");
		pd.clickSignUpButton();
		pd.fillDetails1();
		assertTrue(pd.verifyAccountCreated(), "Account creation message not visible");
		Thread.sleep(2000);
		pd.clickContinueAccout();
		assertTrue(pd.verifyLoggedIn1(), "Logged in as username message not visible");
		pd.clickCart();
		pd.clickProceedToCheckOut();
		pd.verifyaddressdetails();
		pd.verifyreviewyourorder();
		pd.enterDesc();
		pd.clickPlaceOrder();
		pd.enternameoncard("Nidhin");
		pd.entercardno("321456786709");
		pd.entercvc("999");
		pd.enterexpmm("09");
		pd.enterexpyy("2026");
		pd.clickPlaceOrderButton();
		pd.click_Download_Invoice();
		Thread.sleep(5000);
		pd.clickContinueDI();
		pd.clickdelAccount();
		pd.verifyDelMsg();
		pd.clickdelAccountContinue();
	}

	@AfterMethod
	public void closeDriver() {
		pd.tearDown();
	}
}










