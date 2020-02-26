package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAllOptionInAssending {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium/ListBox.html");
		WebElement SingleListBox = driver.findElement(By.id("slv"));
		
		TreeSet<String> set=new TreeSet<String>();
		
		Select s=new Select(SingleListBox);
		
		List<WebElement> allOptions = s.getOptions();
		
		int count = allOptions.size();
		
		for(int i=0;i<count;i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
			set.add(text);
		}
		System.out.println("========");
		for(String Options:set) {
			
			System.out.println(Options);
			
		}
		
  }
}
