package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(id="username")
	private WebElement untbx; 

	@FindBy(name="pwd")
	private WebElement pwtbx;                              
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn; 
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogin() 
	{
		untbx.sendKeys("admin");        
		pwtbx.sendKeys("manager"); 
		lgbtn.click(); 
	}

	
    

}
