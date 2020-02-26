package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args)  {
		//disable the notification pop-up in the setting
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//open the browser in modified setting
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.cleartrip.com/");
}
}