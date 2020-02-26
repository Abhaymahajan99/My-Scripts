package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		//find all the auto suggestion
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[text()='java']"));
		//get and print no of autosuggestion in it
		int count = allSugg.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			//get on suggestion and print the text of it
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		//click on first auto suggestion
		allSugg.get(0).click();
		//close the browser
		driver.close();
	}
}
