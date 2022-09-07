package Locatorspartiallinktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\PartialLinkTextLocator\\ChromeBrowser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\partialLink.html");
		
		driver.findElement(By.partialLinkText("here")).click();
		
		System.out.println("The driver title is :" + driver.getTitle());
		
		driver.quit();
		

	}

}
