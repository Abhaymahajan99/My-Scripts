package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/Selenium/page1.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("manager");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("manager");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("admin");
}

}
