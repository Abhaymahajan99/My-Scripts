package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScript {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	     
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 10x"+Keys.ENTER);
		
		driver.findElement(By.xpath("//div[.='Apple iPhone X (Space Gray, 256 GB)']")).click();

		
		
       Set<String> allwh = driver.getWindowHandles();
       Iterator<String> itr = allwh.iterator();
       String parentwh = itr.next();
      String childwh = itr.next();
      driver.switchTo().window(childwh);
      driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
      Thread.sleep(2000);
      driver.close();
      driver.switchTo().window(parentwh);
      Thread.sleep(2000);
      driver.close();
}
}