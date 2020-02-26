package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeClass
	public void OpenBrowser()
	    {
		Reporter.log("openBrowser",true);
	    }
	@AfterClass
	public void CloseBrowser() 
	   {
		Reporter.log("closeBrowser",true);
	    }
	
	@BeforeMethod 
	public void login()
	   {
		Reporter.log("login",true);
	   }
	
	@AfterMethod
	public void logout() 
	   {
		Reporter.log("logout",true);
	   }
	 @Test
	 public void RegisterCustomer() 
	    {
	    Reporter.log("RegisterCustomer",true);
		}

	 @Test
	 public void DeleteCustomer()
	    {
		 Reporter.log("DeleteCustomer",true);
	    }
	 @Test(priority=2,invocationCount=2)
	 public void EditCustomer() 
	    {
		 Reporter.log("EditCustomer",true);
	    }

}
