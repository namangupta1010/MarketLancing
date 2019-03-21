package com.Marketlancing.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Marketlancing.qa.base.TestBase;
import com.Marketlancing.qa.util.TestUtil;
import com.Marketlanicng.qa.pages.LoginPage;


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


	@Test(dataProvider="MarketLancing Login Data")
	public void MarketLancingLogin(String UN, String PW) throws InterruptedException
	{
		login.loginML(UN, PW);
		try{
		
		String Message =driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
		if(Message.equalsIgnoreCase("The login information you entered were incorrect. Please try again!"))
		{
		System.out.println("Inavalid crdentials");
		}
		else
		{
			String Username =driver.findElement(By.xpath("//h4[@class='float-center']")).getText();
			Assert.assertTrue(UN.equalsIgnoreCase(Username));
		}
		
	}
	catch(Exception e)
	{
		
	}
	}
	 

	@DataProvider(name ="MarketLancing Login Data")
	public Object[][] testData() throws IOException 
	{

		//System.out.println(prop.getProperty("username"));
		TestUtil obj = new TestUtil();
		Object data[][]=obj.Generic_dataDriven("Sheet1");
		return data;
	}





	@Test
	public void loginTest() throws InterruptedException 
	{

		login.loginML(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("TestingExpert - Market Lancing"));

		Assert.assertEquals("TestingExpert - Market Lancing", driver.getTitle());
		log.info("testCase");

	}


	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
