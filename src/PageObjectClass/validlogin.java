package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validlogin {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		loginPage l=new loginPage(driver);

		Thread.sleep(3000);
	
		l.setuser("admin","manager");
	
		
	}
}
