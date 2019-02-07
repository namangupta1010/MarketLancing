package com.Marketlancing.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
	
	LoginPage login;
	@BeforeMethod
	public void setup()
	{
		Initialization();
		login = new LoginPage();
		 log.info("browserLaunch");
		 
	}
	
	
	@Test
	public void loginTest() throws InterruptedException 
	{

		login.loginML(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("test_1 - Market Lancing"));

		Assert.assertEquals("test_1 - Market Lancing", driver.getTitle());
		log.info("testCase");
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
