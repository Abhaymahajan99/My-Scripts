package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException 
	{
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techmahindra.com/");
		driver.get("https://www.youtube.com/");
		driver.get("https://www.naukri.com/");

		Thread.sleep(2000);
		//close all the browser including child browser
		driver.quit();  //driver.close();
		
	}

}
