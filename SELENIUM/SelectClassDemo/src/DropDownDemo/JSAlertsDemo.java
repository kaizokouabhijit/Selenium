package DropDownDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSAlertsDemo {

	
	
	
@Test

public void jsalert() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\SelectClassDemo\\ChromeBrowser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	String result = driver.findElement(By.cssSelector("#result")).getText();
//	System.out.println(result);
	Assert.assertEquals("You successfully clicked an alert", result);
	
	
	
	driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
	Alert alert2 = driver.switchTo().alert();
	alert2.dismiss();
	String result2 = driver.findElement(By.cssSelector("#result")).getText();
	Assert.assertEquals("You clicked: Cancel", result2);
	
	
	
	driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
	Alert alert3 = driver.switchTo().alert();
	alert3.sendKeys("Abhijit");
	alert3.accept();
	String result3 = driver.findElement(By.cssSelector("#result")).getText();
	Assert.assertEquals("You entered: Abhijit", result3);
	
	
	
	
	
	driver.quit();
	
	
}
}
