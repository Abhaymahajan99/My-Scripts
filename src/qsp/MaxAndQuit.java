package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxAndQuit {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		 
			
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			driver.quit();

	}
}

	
