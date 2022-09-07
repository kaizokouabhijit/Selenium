package assertionsusingtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	WebDriver driver;
	
	@Test
	
	public void chrome()
	{
		String WebUrl = "https://automationpractice.com/index.php";
		String expectedTitle = "My Store45";
		String actualTitle = "";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\CaseStudy for Test Suites\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(WebUrl);
		driver.manage().window().maximize();
		
		actualTitle = driver.getTitle();
		
		System.out.println("Actual title of the page is "+actualTitle);
		driver.findElement(By.id("abc"));
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Testcase successfull");
		}
		else
		{
			System.out.println("Not successfull");
		}
		
	}
	
	@AfterTest()
	
	public void wrapup() {
		driver.quit();
	}
	

}
