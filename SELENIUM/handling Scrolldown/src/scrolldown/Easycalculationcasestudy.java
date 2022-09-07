package scrolldown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Easycalculationcasestudy {

WebDriver driver;
	
	@BeforeTest
	
	public void setup ()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\handling Scrolldown\\ChromeBrowser\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
		
		@Test
		
		public void ScrollDownTest() throws InterruptedException, IOException {
		driver.get("https://www.easycalculation.com/");
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,950)"," ");
//		
//		driver.findElement(By.partialLinkText("Area Tutorials")).click();
//		
//		TakesScreenshot ts = (TakesScreenshot ) driver;
//		
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(source, new File("./screenshots/easycalc.png"));
//		
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='#']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		List<WebElement> lst= driver.findElements(By.tagName("a"));
		
		System.out.println("Number of Links:"+ lst.size());
		
		
		
		for(WebElement elem:lst)
		{
			System.out.println(elem.getText());
		}
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[@href='//www.easycalculation.com/calculator-download.php']")).click();
		
		System.out.println(driver.getCurrentUrl());
		
	
		
		
		
		}
		
		
		@AfterTest
		public void wrapUp() {
			driver.quit();
		}
}
