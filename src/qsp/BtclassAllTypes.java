package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtclassAllTypes {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
public static void main(String[] args) {
	


			WebDriver driver=new ChromeDriver();

			driver.get("file:///F:/Selenium/Abhay.html");
			
			//Find and click on the element using tegname locator
			driver.findElement(By.tagName("a")).click();
			driver.navigate().back();
			
			//Find and click on the element using id locator
			driver.findElement(By.id("d1")).click();
			driver.navigate().back();
			
			//find and click on element using name locator
			driver.findElement(By.name("n1")).clear();
			driver.navigate().back(); 
			
			//find and click on element using className locator
			driver.findElement(By.className("c1"));
			driver.navigate().back();

			//find and click on element using linkTextlocator
			driver.findElement(By.linkText("Google"));
			driver.navigate().back();



}
}
