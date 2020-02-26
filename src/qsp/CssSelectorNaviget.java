package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorNaviget {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/Selenium/Abhay2.html ");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		//find and click on the element using linkText locator
		driver.findElement(By.cssSelector("a[href='http://www.jspiders.com/']")).click();
		
		//close the browser
		
		//driver.quit();
	}

}
