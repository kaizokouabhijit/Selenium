package com.easycalculationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;

public class LoginEasycalculation {
	
	WebDriver driver;
	public LoginEasycalculation(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(id="log_email")
	
	WebElement email;
	
	@FindBy(name = "log_password")
	 WebElement password;
	
	@FindBy(xpath = "//input[@name='log_submit']")
	
	WebElement submit;
	
	public void login(String uname, String pass)
	{
		email.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
	}
	
}

