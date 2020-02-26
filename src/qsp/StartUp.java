package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		
		
		
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		 
		driver.get("file:///F:/Selenium/TextButton.html");
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys(Keys.CONTROL+"ac");
		
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text' and @value='B']"));
		textbox2.clear();
		textbox2.sendKeys(Keys.CONTROL+"v");
				
	}
}
