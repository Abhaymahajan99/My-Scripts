package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authantication {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		//passing username and password in the url
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
 }  