package Locatorspartiallinktext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\PartialLinkTextLocator\\ChromeBrowser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.opencart.com/");
		
		WebElement allLink = driver.findElement(By.tagName("a"));
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLink.isDisplayed());
		System.out.println(allLink.isEnabled());
		System.out.println(allLink.getAttribute("href"));
		
		//System.out.println(allLinks.get(3));
		
		
		
		
		
		
		
		
		
	}

}
