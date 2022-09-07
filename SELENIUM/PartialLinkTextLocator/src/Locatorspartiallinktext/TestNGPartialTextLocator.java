package Locatorspartiallinktext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPartialTextLocator {
	
	WebDriver driver;
	@BeforeTest
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\Locators in Web Browsers\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void getInfo() {
		
		
		String url = "http://www.automationpractice.com/index.php";
		driver.navigate().to(url);
		
		System.out.println(driver.getTitle());
		System.out.println("Title Length: "+driver.getTitle().length());
		
		String pageUrl = driver.getCurrentUrl();
	//	System.out.println(pageUrl);
		//System.out.println(url);
		
		System.out.println(pageUrl==url?"URLs same":"URLs Not same");
//		System.out.println(driver.getPageSource());
	
		System.out.println("Page Source Length is : "+driver.getPageSource().length());
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement i:allLinks)
		{
			System.out.println(i);
		}
				
		System.out.println("Total number of links : "+allLinks.size());
		
		driver.quit();
		
				
				
				
				
				
				
				
		
	}
	

}
