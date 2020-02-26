package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://testngetjp.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton")).click();
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		driver.close();

}
}