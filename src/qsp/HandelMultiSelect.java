package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelMultiSelect {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium/ListBox.html");
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select mtrSelect= new Select(mtrListBox);
		
		mtrSelect.selectByIndex(0);
		Thread.sleep(2000);
		
		mtrSelect.selectByValue("d");
		Thread.sleep(2000);
		
		mtrSelect.selectByVisibleText("Poori");
		Thread.sleep(2000);
		
		if (mtrSelect.isMultiple())
		{
		mtrSelect.deselectByIndex(0);
		Thread.sleep(2000);
			
		mtrSelect.deselectByValue("d");
		Thread.sleep(2000);
		
		mtrSelect.deselectByVisibleText("Poori");
		Thread.sleep(2000);
	     }
	
	else {
		System.out.println("listBox is not multiselect");
		
	     }
		driver.quit();
	}
}
