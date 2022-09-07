package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import library.Reusability;

public class ReusabilityDemo {
	
	
	@Test
	
	public void Browser() throws Exception {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\SelectClassDemo\\ChromeBrowser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easycalculation.com/");
		
		Reusability.capturedScreenshot(driver, "Launch Application");
		
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		
		Reusability.capturedScreenshot(driver, "Click sign in button");
		driver.quit();
		
	}

}
