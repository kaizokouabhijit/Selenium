package scrolldown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDownDemo {
	WebDriver driver;
	
	@BeforeTest
	
	public void setup ()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\handling Scrolldown\\ChromeBrowser\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
		
		@Test
		
		public void ScrollDownTest() throws InterruptedException {
		driver.get("https://www.spicejet.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-900)"," ");
		
		Thread.sleep(5000);
		
		js.executeScript("scroll(0,1200)");
		}
		
		
		@AfterTest
		public void wrapUp() {
			driver.quit();
		}
		
		
		
		
		
		
	}


