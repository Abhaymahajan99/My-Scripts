package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxWithOnlyDuplicat {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium/ListBox.html");
		
		WebElement SingleListBox = driver.findElement(By.id("slv"));
		
		HashSet<String> set=new HashSet<String>();
		
		Select s=new Select(SingleListBox);
		
		List<WebElement> allOptions = s.getOptions();
		
		int count = allOptions.size();
		
		for(int i=0;i<count;i++) {
			String text = allOptions.get(i).getText();
			
			//given true for without duplicate
			
			if(set.add(text)==false) {
				System.out.println(text);
			}
			
			}
		driver.close();	
	}
}
