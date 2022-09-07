package screenshot;

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
import org.testng.annotations.Test;



public class CaseStudyScreenshot {
	
	
	@Test

	public void jsalert() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\SelectClassDemo\\ChromeBrowser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://store.webkul.com/");
		
		System.out.println("The website title is :" + driver.getTitle());
		
		TakesScreenshot ts = (TakesScreenshot ) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshots/webkul.png"));
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		System.out.println("Total number of links :" + alllinks.size());
		
		for(WebElement ele:alllinks)
		{
			System.out.println(ele.getText());
		}
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		

}
}
