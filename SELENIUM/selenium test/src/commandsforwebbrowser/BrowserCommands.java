package commandsforwebbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Chrome/chromedriver.exe");
		// used . operator for relative path instead of absolute path C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\selenium test\\....
		
		
		// Set Chrome Browser path "Key" and "values"
		WebDriver driver = new ChromeDriver(); // Create intance for driver
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		String currentURL = driver.getCurrentUrl();
		
		String pageSource = driver.getPageSource();
		
		System.out.print(title);
		
		//System.out.print(pageSource);
		
		System.out.print(currentURL);
		
		driver.quit();

	}

}
