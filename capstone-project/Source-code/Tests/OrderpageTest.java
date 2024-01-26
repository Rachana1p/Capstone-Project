package com.sportyshoe.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sportyshoe.seleniumScripts.HomePage;
import com.sportyshoe.seleniumScripts.LoginPage;
import com.sportyshoe.seleniumScripts.RegisterPage;
import com.sportyshoe.seleniumScripts.OrderPage;

import com.sportyshoe.seleniumScripts.TestBase;

public class OrderpageTest  extends TestBase {
	
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	OrderPage op;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
		op = new OrderPage(driver);
	}

	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	
	@Test(priority='2')

	public void test_click_orders()
	{
		op.click_orderPage();
	}

	
	@Test(priority='3')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/orders";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}
	
}
