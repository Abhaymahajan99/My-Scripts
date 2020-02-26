package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseEx {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		// opening the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//enter the URL
		driver.get("https://www.google.com/");
		//wait for 2 seconds
		Thread.sleep(2000);
		driver.navigate().to("https://mail.google.com/mail/u/0/?tab=wm&ogbl#inbox");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();

	}

}
