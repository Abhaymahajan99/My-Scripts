package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAllignedOrNot {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 
		int X1 = driver.findElement(By.xpath("(//input[@name='sex'])[1]")).getLocation().getY();
		int X2 = driver.findElement(By.xpath("(//input[@name='sex'])[2]")).getLocation().getY();
		int X3 = driver.findElement(By.xpath("(//input[@name='sex'])[3]")).getLocation().getY();
		if((X1==X2)&&(X2==X3))
		{
			System.out.println("Pass");
	
		}else
		{
			System.out.println("Fail");
		}
		
		driver.close();
		
	}	
}
