package com.sportyshoe.SeleniumCucumberscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setupcheck {
	
		 WebDriver driver;
@Test
		    public  void Amazonsteps() {
		        // Initialize your WebDriver instance, e.g., ChromeDriver
		    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://localhost:9010/");
	}

}
