package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision {

		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
			driver.findElement(By.id("policynumber")).sendKeys("123");
			driver.findElement(By.id("dob")).click();
			
			WebElement YearListBox = driver.findElement(By.className("ui-datepicker-year"));
			Select d=new Select(YearListBox);
			d.selectByValue("1995");
			WebElement MonthListBox = driver.findElement(By.className("ui-datepicker-month"));
			Select s=new Select(MonthListBox);
			s.selectByIndex(11);
			driver.findElement(By.linkText("10")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("alternative_number")).sendKeys("9425991999");
			Thread.sleep(2000);
			driver.findElement(By.id("renew_policy_submit")).click();
			Thread.sleep(2000);
			driver.close();
}
}