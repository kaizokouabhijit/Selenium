package com.easycalculationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
	 
	casestudypom csp;
	LoginEasycalculation lec;
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\git\\Selenium\\Selenium\\SELENIUM\\Page object Model\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
		
	}
	
	@Test
	
	public void navigat() throws InterruptedException {
		csp = new casestudypom(driver);
		csp.login("Abhijit", "Password@123");
		
		Thread.sleep(8000);
		
	}
	
	
	
	@AfterTest
	
	public void wrapUp() {
		driver.quit();
	}

}
