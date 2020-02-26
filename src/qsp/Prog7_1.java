package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7_1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
		

	public static void main(String[] args) throws InterruptedException {
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("http://demo.opensourcebilling.org/");
		
		//find the element and clear the text present in textbox
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.close();
		

	}

}
