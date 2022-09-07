package Locatorspartiallinktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\PartialLinkTextLocator\\ChromeBrowser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easycalculation.com/");
		
		driver.findElement(By.partialLinkText("Budget")).click();
		
		System.out.println("The driver title is :" + driver.getTitle());
		
		//driver.quit();
		

	}

}
