package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get the html source of the web page
		driver.get("https://www.google.com/");
		String html= driver.getPageSource();
		System.out.println(html);
		Thread.sleep(2000);
	 	driver.quit();
	}

}
