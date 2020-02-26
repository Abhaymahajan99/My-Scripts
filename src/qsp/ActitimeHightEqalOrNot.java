package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeHightEqalOrNot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension size = driver.findElement(By.name("username")).getSize();
		    
	    Dimension size2 = driver.findElement(By.name("pwd")).getSize();
	    
		int hight1= size.getHeight();
		int hight2 = size2.getHeight();
		System.out.println("height= "+hight1);
		System.out.println("hight= "+hight2);

	
	if(hight1==hight2) {
		System.out.println("Pass");
		
	}else {
		System.out.println("Fail");
	}
	
	driver.close();
	
	}
	
	

}
