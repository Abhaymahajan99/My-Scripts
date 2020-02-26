package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium/ListBox.html");
		
		WebElement multibox = driver.findElement(By.id("mtr"));
		Select s=new Select(multibox);
		
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		
		for(int i=1;i<=count;i++) {
			
			String text = alloption.get(i).getText();
			System.out.println(text);
			s.selectByIndex(i);
		
		}

		driver.quit();

	}

}
