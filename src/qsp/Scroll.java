package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		
		JavascriptExecutor j= (JavascriptExecutor) driver;
		
		driver.get("https://www.bbc.com/news");
		
		//String c="window.scrollTo(0,document.body.scrollHeight)";
		//j.executeScript(c);
		
	   //String c1="window.scrollTo(0,2000)";
	    //j.executeScript(c1);
		
		j.executeScript("window.scrollTo(0,4000)");
		

}
}