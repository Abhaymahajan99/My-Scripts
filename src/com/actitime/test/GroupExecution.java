package com.actitime.test;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class GroupExecution {
	
	
	 @Test(groups= {"regression","smoke"})
	 public void CreateCustomer() {
		 
		 Reporter.log("CreateCustomer",true);
		
	 }

	 @Test (groups= {"regression"})
	 public void DeleteCustomer() {
		 Reporter.log("DeleteCustomer",true);
	 }
		 @Test(groups= {"regression"})
		 public void EditCustomer() 
		    {
			 Reporter.log("EditCustomer",true);
		 
	 }

}
