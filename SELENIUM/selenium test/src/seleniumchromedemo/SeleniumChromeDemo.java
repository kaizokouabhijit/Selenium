package seleniumchromedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeDemo {
	
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\selenium test\\Chrome/chromedriver.exe");
		// Set Chrome Browser path "Key" and "values"
		WebDriver driver = new ChromeDriver(); // Create intance for driver
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
