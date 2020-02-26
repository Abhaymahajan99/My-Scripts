package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
	
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y=new Select(year);
		y.selectByVisibleText("1995");
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select m=new Select(month);
		m.selectByIndex(11);
		
		 driver.findElement(By.xpath("//a[.='21']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9425991993");
		driver.findElement(By.id("renew_policy_submit")).click();
		
		
		driver.quit();
		

}}
