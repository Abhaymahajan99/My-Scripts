package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		//opening the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("file:///F:/Selenium/Abhay2.html");
		//find all the links present the Web page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//get the count of all the link and print it
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
	    //get the one element out side
		WebElement link1 = allLinks.get(i);
		//get the next of one element and print it
		String text = link1.getText();
		System.out.println(text);
		}
		driver.close();
	}
}
