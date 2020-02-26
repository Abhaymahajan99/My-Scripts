package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/Selenium/page1.html");
	    //switch to frame by index
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("j");
		Thread.sleep(5000);
		//switch to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("q");
		Thread.sleep(5000);
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("s");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("s");
		Thread.sleep(5000);
		WebElement freamWE =driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(freamWE);
		driver.findElement(By.id("t2")).sendKeys("p");
		Thread.sleep(5000);
		
		driver.close();
		
}
}
