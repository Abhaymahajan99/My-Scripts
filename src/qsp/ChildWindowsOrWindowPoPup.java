package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowsOrWindowPoPup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//	get the session id or windows handles of all te browsers
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
	    System.out.println(count);
	    driver.quit(); 
		
	}
}
