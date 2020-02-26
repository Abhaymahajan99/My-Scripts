package com.actitime.test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;



@Listeners(com.actitime.generics.ListenerImplimentation.class)
public class Modifycustomer extends BaseClass{

	@Test
	public void modifycustomer() {
		Reporter.log("Modifycustomer",true);
	}
		/*Assert.fail();

	}

	@Test
	public void Editcustomer() {
		Reporter.log("Editcustomer",true);

	}

	@Test
	public void createcustomer() {
		Reporter.log("createcustomer",true);
*/


	}




