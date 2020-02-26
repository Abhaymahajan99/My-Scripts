package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgStartup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
		

	public static void main(String[] args) {
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("http://demo.actitime.com/login.do");
		
	/*int hight1 = driver.findElement(By.id("username")).getSize().getHeight();
	int width1 = driver.findElement(By.id("username")).getSize().getWidth();*/
		
	Dimension size = driver.findElement(By.id("username")).getSize();
	int hight1= size.getHeight();
	int width1 = size.getWidth();
	System.out.println("height= "+hight1);
	System.out.println("width= "+width1);
	driver.close();
	
	}
}
