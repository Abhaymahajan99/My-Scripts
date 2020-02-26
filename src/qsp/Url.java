package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/Selenium/Abhay.html");
		//final the element using tagname locaion
		
		WebElement e=driver.findElement(By.tagName("a"));
		
		//click on google link
		e.click();
	}

}
