package com.EasyCal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.easycalculationpages.LoginEasycalculation;

import helper.BrowserFactory;

public class VerifyLogin {
	
	WebDriver driver;
	@Test
	
	public void CheckValidUser() {
		driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
	
		LoginEasycalculation loginpage = PageFactory.initElements(driver,LoginEasycalculation.class);
		loginpage.login("Abhijit", "Password@123");
	
	
	}
	
	@AfterTest
	
	public void wrapUp() {
		driver.quit();
	}
	
	
}
