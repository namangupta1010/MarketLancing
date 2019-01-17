package com.Marketlancing.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Marketlancing.qa.base.TestBase;
import com.Marketlanicng.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage obj;
	@BeforeMethod
	public void setup()
	{
		Initialization();
		 obj = new LoginPage();
	}
	
	
	@Test
	public void loginTest() 
	{
		obj.loginValidation(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
