package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement1 {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 
			
			
			
			//opening the chrome browser
			WebDriver driver=new ChromeDriver();
			 
			driver.get("https://www.google.com/");
			
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
