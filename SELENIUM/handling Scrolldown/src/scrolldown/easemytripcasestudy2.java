package scrolldown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class easemytripcasestudy2 {
	
@Test
	
	
	public void EasyMytrip() throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\handling Scrolldown\\ChromeBrowser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		
		WebElement elem = driver.findElement(By.xpath("//span[@id='spnMyAcc']"));
	
		Actions act = new Actions(driver);
		act.moveToElement(elem).build().perform();
		
		List<WebElement> lst= driver.findElements(By.tagName("a"));
		
		
		driver.findElement(By.xpath("//a[@href='https://mybookings.easemytrip.com']")).click();
		driver.findElement(By.id("txtEmailNew")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("shwotp")).click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./screenshots/easemytripBookingpostemailsubmission2.png"));
		
		System.out.println("Screenshot captured");
		
		driver.quit();
		

}}
