package commandsforwebbrowser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumForEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\selenium test\\Chrome\\msedgedriver.exe");
		// used . operator for relative path instead of absolute path C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\SELENIUM\\selenium test\\....
		
		
		// Set Chrome Browser path "Key" and "values"
		WebDriver driver = new EdgeDriver(); // Create intance for driver
		
		driver.get("https://www.google.com/");

	}

}
