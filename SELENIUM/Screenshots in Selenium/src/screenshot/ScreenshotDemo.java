package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	
	
	
@Test

public void jsalert() throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\SelectClassDemo\\ChromeBrowser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.easycalculation.com/");
	
	driver.findElement(By.xpath("//span[.='Sign in']")).click();
	
	
	// code for screenshot
	
	TakesScreenshot ts = (TakesScreenshot ) driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(source, new File("./Screenshots/easycalculation.png"));
	
	
	System.out.println("Screenshot captured");
	
	driver.quit();
	
	
	

}
}
