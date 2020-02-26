package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Actions a =new Actions(driver);
		
		WebElement ResourcesDD = driver.findElement(By.xpath("//a[contains(.,'Resources')]"));
		
		a.moveToElement(ResourcesDD).build().perform();
		
		driver.findElement(By.xpath("//h6[contains(text(),'Contact')]")).click();
		
		String text = driver.findElement(By.xpath("//p[.='India (Bangalore)']/../../../div[2]/span/p[1]")).getText();
		
		System.out.println(text);
		
		driver.quit();
		
}}
