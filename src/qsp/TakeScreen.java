package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreen {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		//type the object the TakeScreenShots interface
		
		TakesScreenshot t=(TakesScreenshot) driver;
		//take the screen shot by pressing printsrc button the store it  in
		
		File src = t.getScreenshotAs(OutputType.FILE);
		//create an empty file in the below location
		
		File dest=new File("./ss/Screenshots.png");
		//copy the file from src to dest and save it
		
		FileUtils.copyFile(src, dest);
		driver.close();
	}
}