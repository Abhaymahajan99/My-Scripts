package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertValidation {
	@Test
	public void testGoogle() {
		 String etitle = "Google";//Google123
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String atitle = driver.getTitle();
		/*if(atitle.equals(etitle))                  
		       {                                      .                                        .
			Reporter.log("pass",true);}             .  //Assert.assertEquals(atitle, etitle);   .
			else {                                    .                                        .
				Reporter.log("pass",true);	
		         }*/
	//  Assert.assertEquals(atitle, etitle);
	
	SoftAssert s= new SoftAssert();
   s.assertEquals(atitle, etitle);
	driver.close();
	s.assertAll();
		}
	   

}
