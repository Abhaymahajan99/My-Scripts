package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDateofBirth {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		WebElement DaylistBox = driver.findElement(By.id("day"));
		Select d=new Select(DaylistBox);
		d.selectByValue("6");
		WebElement MonthListBox = driver.findElement(By.id("month"));
		Select s=new Select(MonthListBox);
		s.selectByIndex(11);
		WebElement YearListBox = driver.findElement(By.id("year"));
		Select y=new Select(YearListBox);
		y.selectByVisibleText("1995");
		
		driver.close();
		
		
	}
}
