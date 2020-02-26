package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveTimeWidthEqualOrNot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension size = driver.findElement(By.name("username")).getSize();
		    
	    Dimension size2 = driver.findElement(By.name("pwd")).getSize();
	    
		int Width1= size.getWidth();
		int Width2 = size2.getWidth();
	

	
	if(Width1==Width2) {
		System.out.println("Pass");
		
	}else {
		System.out.println("Fail");
	}
	
	driver.close();
	
	}
	

}
