package DropDownDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownCaseStudy {
	
	
	@Test
	
	public void CaseStudy() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\SelectClassDemo\\ChromeBrowser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		String url = "https://www.facebook.com/campaign/landing.php";
		String actualurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, url, "Actual page is not the same as expected");
		
		
		
		WebElement fbDayField = driver.findElement(By.id("day"));
		
		Select day = new Select(fbDayField);
		
		day.selectByIndex(5);
		
		
		
		
		
		WebElement fbYearField = driver.findElement(By.id("year"));
		
		Select year = new Select(fbYearField);
		
		year.selectByValue("1994");
		
		
	
		
		List<WebElement> listYear = year.getOptions();
		
		List<WebElement> listDay = day.getOptions();
		
		
		for(WebElement ele : listYear)
		{
			System.out.println(ele.getText());
		}
		System.out.println("Total number of years:"+listYear.size());
		
		
		
		for(WebElement ele : listDay)
		{
			System.out.println(ele.getText());
		}
		
		
		System.out.println("Total number of Days:"+listDay.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
