package com.Marketlancing.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Marketlancing.qa.base.TestBase;
import com.Marketlanicng.qa.pages.DashBoard;
import com.Marketlanicng.qa.pages.LoginPage;

public class DashBoardTest extends TestBase  {

	DashBoard dashboard;
	
	LoginPage login;
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		Initialization();
		dashboard = new DashBoard();
		login = new LoginPage();
		login.loginML(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Test
	public void GetBioTest() throws InterruptedException 
	{
		dashboard.GetBio();
	}

	@Test
	public void GetemailTest()  
	{
		String email =dashboard.Getemail();
		Assert.assertEquals( email,"namangupta1010@gmail.com");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}