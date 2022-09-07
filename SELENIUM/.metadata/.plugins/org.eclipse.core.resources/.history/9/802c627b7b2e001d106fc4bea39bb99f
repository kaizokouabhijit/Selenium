import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class csvfilereaddemo {

	String path = "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\DDT using csvfile\\csv file\\CSVreadfile.csv";
	WebDriver driver;
	
	
	@BeforeTest
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\DDT using csvfile\\ChromeBrowser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
		
	}
	
	@Test
	
	public void Test() throws Exception {
		
		
		CSVReader reader = new CSVReader(new FileReader(path));
		String [] csvCell;
		
		while((csvCell = reader.readNext())!=null)
		{
			String Fname = csvCell[0];
			String Lname = csvCell[1];
			String Email= csvCell[2];
			String MNumb= csvCell[3];
			String Cname = csvCell[4];
			
			driver.findElement(By.name("FirstName")).sendKeys(Fname);
			driver.findElement(By.name("LastName")).sendKeys(Lname);
			driver.findElement(By.name("EmailID")).sendKeys(Email);
			driver.findElement(By.name("MobNo")).sendKeys(MNumb);
			driver.findElement(By.name("Company")).sendKeys(Cname);
			
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//form/input[@value='Submit']")).click();
			
			driver.switchTo().alert().accept();
		}
		reader.close();
	}
	@AfterTest
	
	public void wrapup() {
		driver.quit();
	}

}
