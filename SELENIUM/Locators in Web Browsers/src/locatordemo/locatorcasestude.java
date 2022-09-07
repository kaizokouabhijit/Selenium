package locatordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorcasestude {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\Locators in Web Browsers\\ChromeBrowser\\chromedriver.exe");
		// Set Chrome Browser path "Key" and "values"
		WebDriver driver = new ChromeDriver(); // Create intance for driver
//		driver.manage().window().maximize();
		driver.navigate().to("https://www.easycalculation.com/");
		
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		
		driver.findElement(By.className("search_button")).click();
		
		
		

		
		
		
		
		String Title = driver.getTitle();
		
		String pageSource = driver.getPageSource();
		
		int pageSourceLength = pageSource.length();
		
		
		System.out.println(Title);
		System.out.println(pageSource);
		System.out.println(pageSourceLength);
	}

}
