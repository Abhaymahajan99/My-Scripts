package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecution_Scroll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bbc.com/news");
		
		JavascriptExecutor j= (JavascriptExecutor) driver;
		
		String c="window.scrollTo(0,document.body.scrollHeight)";
		
		j.executeScript(c);

}
}