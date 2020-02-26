package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {
	

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("http://demo.actitime.com/login.do");
		
	
		if(driver.findElement(By.className("atProductName")).isDisplayed()==true) {
			System.out.println("pass");
			}
		else {
			System.out.println("fail");
		}
    driver.close();
}
}
