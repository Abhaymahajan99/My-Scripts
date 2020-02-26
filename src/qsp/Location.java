package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("http://demo.actitime.com/login.do");

		int X1value = driver.findElement(By.id("username")).getLocation().getX();
		int X2value = driver.findElement(By.name("pwd")).getLocation().getX();

		if(X1value==X2value) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

		driver.close();
	}
	}