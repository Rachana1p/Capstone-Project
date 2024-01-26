package com.sportyshoe.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sportyshoe.seleniumScripts.HomePage;
import com.sportyshoe.seleniumScripts.LoginPage;
import com.sportyshoe.seleniumScripts.RegisterPage;
import com.sportyshoe.seleniumScripts.TestBase;

public class LoginPageTest extends TestBase {
	
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
	}

	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}

	
	@Test(priority='2')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/login";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}
	
@Test(priority='3')
	
	public void Test_validate_registration_Text()
	{
		String expected = "Hello veera !";
		String actualText = rp.validate_registration_Text();
		Assert.assertEquals(actualText, expected);
	}

@Test(priority='4')

public void test_click_cart()
{
	lp.click_cart();
}


}
