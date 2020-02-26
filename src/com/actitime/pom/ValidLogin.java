package com.actitime.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLogin {
	
	@Test
	public void testvalidlogin() {
		
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		
		LoginPage l=new LoginPage(driver);
        
		l.setLogin();
		
		EnterTimeTrack e=new EnterTimeTrack(driver);
		
		e.logoutclick();
		
		  driver.close();
		
	}

}
