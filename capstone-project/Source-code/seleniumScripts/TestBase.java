package com.sportyshoe.seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
		
		public static WebDriver driver;

		public static void  OpenBrowser(String browser)
		{
			if(browser == "Chrome")
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			if(browser == "FireFox")
			{
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://localhost:9010/");
			
		}
		
		public static void closebrowser()
		{
			driver.close();
		}
}
