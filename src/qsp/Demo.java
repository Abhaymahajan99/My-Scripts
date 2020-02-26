package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		    
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.quit();
	}
}
