package PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithInvalid {
	
	//decalaring the element for username textbox
	@FindBy(id="username")
	private WebElement untbx; 
	//decalring the element for password textbox
	@FindBy(name="pwd")
	private WebElement pwtbx;                               //Declaration
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn; 
	
	public LoginPageWithInvalid(WebDriver driver)
	{
    // initialization the element during the runtime by using initElements method
		PageFactory.initElements(driver, this);
	}
    
	// business logic method
	public void setuser(String username,String password) 
	{
		untbx.sendKeys(username);         //Utilization
		pwtbx.sendKeys(password); 
		lgbtn.click(); 
	}
	

}
