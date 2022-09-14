package locatordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDEExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\git\\Selenium\\Selenium\\SELENIUM\\Locators in Web Browsers\\ChromeBrowser\\chromedriver.exe");
		// Set Chrome Browser path "Key" and "values"
		WebDriver driver = new ChromeDriver(); // Create intance for driver
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	//	driver.findElement(By.name("username")).sendKeys("Abhijit");
		
	//	driver.findElement(By.xpath(null)
		
	
		
		//		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
//		driver.findElement(By.id("xreg_email")).sendKeys("988061454");
//		
//		driver.findElement(By.id("xreg_cnt")).sendKeys("Argentina");
//		
//		driver.findElement(By.name("name")).sendKeys("Abhijit");// name locator
//		
////		driver.findElement(By.className("css-76zvg2 r-jwli3a r-n6v787 r-majxgm r-q4m81j")).click(); // for checkbox
//		
//		
//		//locator xpath - xml path - absolute and relative
//		
//		//absolute represented by //    //*[@id="xreg_pass"]   /html/body/div[1]/div[1]/div/form/div[4]/input
//		
//		
//		driver.findElement(By.xpath("")).sendKeys("Abhijit");
//		
		
		String Title = driver.getTitle();
		
		String pageSource = driver.getPageSource();
		
		int pageSourceLength = pageSource.length();
		
		
		System.out.println(Title);
		System.out.println(pageSource);
		System.out.println(pageSourceLength);
		
		
		
		
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.quit();

	}

}
