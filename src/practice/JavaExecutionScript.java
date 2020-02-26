package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutionScript {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args){
		
	
	 WebDriver driver=new ChromeDriver();
	 
      //Creating the JavascriptExecutor interface object by Type casting		
      JavascriptExecutor js = (JavascriptExecutor)driver;		
      		
      //Launching the Site.		
      driver.get("http://moneyboats.com/");			
   
      //Maximize window		
      driver.manage().window().maximize();		
      		
      //Vertical scroll down by 600  pixels		
      js.executeScript("window.scrollBy(0,600)");	

}
}