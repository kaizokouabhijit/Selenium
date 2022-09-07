package locatordemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTestLocator {
	
	WebDriver driver;
	int Total = 0;

	@BeforeTest
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\Locators in Web Browsers\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
	}

	
	@Test
	
	
	public void findElementById() {
		driver.navigate().to("https://www.easycalculation.com/");
		
		driver.findElement(By.linkText("Calculators")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkcount = links.size();
		Total = Total + links.size();
		
		System.out.println("Total number of links:" + linkcount);
		
		for(WebElement i:links)
		{
			System.out.println(i.getText());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
