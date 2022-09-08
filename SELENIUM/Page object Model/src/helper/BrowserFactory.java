package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver BrowserOptions(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\git\\Selenium\\Selenium\\SELENIUM\\Page object Model\\ChromeBrowser\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}
	
	

}
