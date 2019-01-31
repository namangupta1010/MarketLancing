package com.Marketlancing.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Marketlancing.qa.base.TestBase;
import com.Marketlanicng.qa.pages.LoginPage;
import com.qa.Listener.CustomListener;

@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {
	
	Logger log =Logger.getLogger(LoginPageTest.class);
	
	LoginPage obj;
	@BeforeMethod
	public void setup()
	{
		Initialization();
		 obj = new LoginPage();
		 log.info("browserLaunch");
		 
	}
	
	
	@Test
	public void loginTest() throws InterruptedException 
	{

		obj.loginValidation(prop.getProperty("username"), prop.getProperty("password"));
		//Logger log = Logger.getLogger(LoginPageTest.class);
		//Logger logger = Logger.getLogger("LoginPageTest");
		log.info("testCase");
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
