package library;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {

	public static void capturedScreenshot(WebDriver driver, String string) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			System.out.println("Captured screenshot by selenium");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot"+ e.getMessage());
		}
		
	}
	
	

}
