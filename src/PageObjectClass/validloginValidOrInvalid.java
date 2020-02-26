package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validloginValidOrInvalid {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		LoginPageWithInvalid l=new LoginPageWithInvalid(driver);
		
		l.setuser("abc","xyz");
		Thread.sleep(3000);
	
		l.setuser("admin","manager");

}
}