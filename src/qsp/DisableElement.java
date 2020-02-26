package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium/Desable%20Element.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		
		JavascriptExecutor j= (JavascriptExecutor) driver;
		 String c="document.getElementById('t2').value='manager'";
		 j.executeScript(c);
		 String s="document.getElementById('t3').click";
		 j.executeScript(s);
		 Thread.sleep(2000);
		 driver.close();

}
}