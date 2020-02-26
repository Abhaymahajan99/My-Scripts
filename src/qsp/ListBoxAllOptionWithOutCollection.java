package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAllOptionWithOutCollection {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium/ListBox.html");
		WebElement SingleListBox = driver.findElement(By.id("slv"));
	
		Select s=new Select(SingleListBox);
		
		WebElement allOptions = s.getWrappedElement();
		
		String text = allOptions.getText();
		System.out.println(text);
		driver.close();
	
	}
}
 