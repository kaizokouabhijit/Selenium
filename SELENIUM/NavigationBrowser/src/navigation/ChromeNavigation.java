package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\selenium test\\Chrome/chromedriver.exe");
		// Set Chrome Browser path "Key" and "values"
		WebDriver driver = new ChromeDriver(); // Create intance for driver
		
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
		
		
		driver.navigate().to("https://yahoo.com");
String URL1 = driver.getCurrentUrl();
		
		System.out.println(URL1);
		
		driver.navigate().back();
		String URL2 = driver.getCurrentUrl();
				
				System.out.println(URL2);
				
				driver.navigate().forward();
				String URL3 = driver.getCurrentUrl();
						
						System.out.println(URL3);

						driver.navigate().refresh();
						String URL4 = driver.getCurrentUrl();
								
								System.out.println(URL4);
								
								//driver.quit();
								//driver.close(); -- closes a specific browser
	}

}
