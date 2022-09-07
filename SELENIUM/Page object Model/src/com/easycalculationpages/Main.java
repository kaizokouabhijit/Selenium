package com.easycalculationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
	 
	casestudypom csp;
	LoginEasycalculation lec;
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\Page object Model\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
	@Test
		public void navigated()
		{
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
		csp = new casestudypom(driver);
		csp.login("Abhijit", "passworD@123");
		}
	}

}
