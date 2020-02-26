package com.actitime.generics;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
	}
	@Parameters("browser")
	@BeforeTest
	public void OpenBrowser(String browser)
  {
		//Scanner sc=new Scanner(System.in);
		//String browser = sc.nextLine();
		if(browser.equals("chrome")) 
		{
			driver= new ChromeDriver();	
		}
		else if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();	
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
	@AfterTest
	public void CloseBrowser() 
	   {
	driver.close();
	    }
	
	@BeforeMethod 
	public void login() throws IOException
	   {
		FileLib f=new FileLib();
		
		driver.get(f.getPropertyData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	   }
	
	@AfterMethod
	public void logout() 
	   {
		driver.findElement(By.id("logoutLink")).click();
	   }

}
