package com.seleniumAutomation.testcases;

import java.util.ArrayList;

import com.seleniumAutomation.Pages.Products;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



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
		Assert.assertTrue(pd.getPrdPage().contains("products"));
		pd.click_viewPrdct();
		Assert.assertTrue(pd.getPrdPage().contains("product_details"));
		Assert.assertTrue(pd.verifyPrdDetails_name());
		Assert.assertTrue(pd.verifyPrdDetails_cat());
		Assert.assertTrue(pd.verifyPrdDetails_price());
		Assert.assertTrue(pd.verifyPrdDetails_avail());
		Assert.assertTrue(pd.verifyPrdDetails_condn());
		Assert.assertTrue(pd.verifyPrdDetails_brand());
	}
	
	@Test
	public void searchProducts() {
		pd.clickPrdLink();
		pd.closeAdIfPresent();
		Assert.assertTrue(pd.getPrdPage().contains("products"));
		pd.enterSearch();
		pd.click_search();
		Assert.assertTrue(pd.verifySearched_Products());
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
		Assert.assertTrue(pd.getPrdPage().contains("product_details"));
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
		Assert.assertTrue(pd.fillDetails());
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
		Assert.assertTrue(pd.verifyDelMsg());
		pd.clickdelAccountContinue();
	}
	
	@Test
	public void placeOrderRegisterBeforeCheckout() {
		pd.clickSignUpLink();
		pd.enterName("Nidhi");
		pd.enterEmail("nidhi123@gmail.com");
		pd.clickSignUpButton();
		Assert.assertTrue(pd.fillDetails());
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
		Assert.assertTrue(pd.verifyDelMsg());
		pd.clickdelAccountContinue();
	}
	
	@Test
	public void placeOrderLoginBeforeCheckout() {
		pd.clickSignUpLink();
		pd.enterlogEmail("nidhi123@gmail.com");
		pd.enterPwd("nidhi123");
		pd.clickLoginButton();
		Assert.assertTrue(pd.verifyLoggedIn());
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
		Assert.assertTrue(pd.verifyDelMsg());
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
		Assert.assertTrue(pd.verifyCategory());
		pd.clickWomen();
		pd.clickDress();
		Assert.assertEquals(pd.getCartPage(),"https://automationexercise.com/category_products/1");
		Assert.assertTrue(pd.verifyCategoryheading());
		pd.clickMen();
		pd.clicktshirt();
		Assert.assertEquals(pd.verifyCategoryheading2(),"https://automationexercise.com/category_products/3");
	}
	
	@AfterMethod
	public void closeDriver() {
		pd.tearDown();
	}
}







