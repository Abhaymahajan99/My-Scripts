package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
		Thread.sleep(2000);
		WebElement destination = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Thread.sleep(2000);
        Actions a =new Actions(driver);
        a.dragAndDrop(source,destination).perform();
        Thread.sleep(2000);
        driver.close();
        
}}
