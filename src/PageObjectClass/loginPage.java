package PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//managing the variable
public class loginPage {
    

	private WebElement untbx; 
	
	private WebElement pwtbx;                              //Declaration
	
	private WebElement lgbtn; 
	
	public loginPage(WebDriver driver)
	{

		untbx = driver.findElement(By.id("username"));//Initialization
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
    
	public void setuser(String username,String password) 
	{
		untbx.sendKeys(username);         //Utilization
		pwtbx.sendKeys(password); 
		lgbtn.click(); 
	}

	
}
