package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserForAll {
	
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

		public static void main(String[] args){
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com/");
			
			String window = driver.getWindowHandle();
			System.out.println( window);
			
			//get the session id or windows handles of all the browser
			
			Set<String> allwindows = driver.getWindowHandles();
			int count= allwindows.size();
			for(String window1:allwindows) {
				System.out.println(window1);
				
			}
			driver.quit();

}}
