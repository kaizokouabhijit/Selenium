package DropDownDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemoClass {

	
	@Test
	
	public void testDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\SelectClassDemo\\ChromeBrowser\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		
		month_dd.selectByIndex(4);
		
		Thread.sleep(3000);
		
		month_dd.selectByValue("12");
		
		
		
		
		
	
		
		
		month_dd.selectByVisibleText("Jan");
		
		
List <WebElement> firstvalue = month_dd.getOptions();
		
		for(WebElement ele:firstvalue)
		{
			System.out.println(ele.getText());
		}
		
		
		
		driver.quit();
		
		
		
		
	}
}
