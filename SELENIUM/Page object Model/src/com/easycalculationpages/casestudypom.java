package com.easycalculationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;

public class casestudypom {
	
	WebDriver driver;
	public casestudypom(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(id="Username")
	
	WebElement username;
	
	@FindBy(name = "Password")
	 WebElement password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	
	WebElement submit;
	
	public void login(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
	}
	
	
	
}