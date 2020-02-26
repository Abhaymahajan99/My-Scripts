package PageObjectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		WebElement untbx;//Declaration
		
	    untbx = driver.findElement(By.id("username"));//initialization
	    
		untbx.sendKeys("admin");//utilization
		
		
	}
	

}
