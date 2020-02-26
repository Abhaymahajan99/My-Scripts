package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//find the active element on the Web site
		WebElement e =driver.switchTo().activeElement();

		//type java on the text box
		e.sendKeys("java");
		Thread.sleep(2000);
		//close the browser
		driver.quit();


	}

}
