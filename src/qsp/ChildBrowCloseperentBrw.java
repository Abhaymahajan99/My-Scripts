package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowCloseperentBrw {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args){
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//get the title fo perent browser
		String ExpTitle=driver.getTitle();
		//get the session id or windows handles of all the browser
		Set<String> allwh = driver.getWindowHandles();
		int count= allwh.size();
       //enhance forloop
		for(String wh : allwh) {
			//transfer the driver control to all the browser one by one
			driver.switchTo().window(wh);
			String ActualTitle = driver.getTitle();
			if(ExpTitle.equals(ActualTitle)) 
			{
			driver.close();
		     }
			else {
            }
		}
	}
}
