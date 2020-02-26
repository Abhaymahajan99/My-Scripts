package com.actitime.test;


import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Demo {
	@BeforeMethod 
	public void login(){
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	 @Test
	 public void CreateCustomer() {
		 
		 Reporter.log("CreateCustomer",true);
		
	 }

	 @Test 
	 public void DeleteCustomer() {
		 Reporter.log("DeleteCustomer",true);
		 
	 }
}
