package com.Marketlancing.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Marketlancing.qa.base.TestBase;
import com.Marketlanicng.qa.pages.HomePage;
import com.Marketlanicng.qa.pages.LoginPage;

public class HomePageTest extends TestBase 
{
	LoginPage obj;
	HomePage obj1;

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		Initialization();
		 obj = new LoginPage();
		obj.loginML(prop.getProperty("username"), prop.getProperty("password"));
		driver.navigate().to(prop.getProperty("Url"));
		obj1 = new HomePage();

	}


	@Test
	public void SearchBoxTest() throws InterruptedException 
	{

		obj1.Searchjob(prop.getProperty("search_name"));
		System.out.println(driver.getTitle());
		Assert.assertEquals("You searched for testing class - Market Lancing", driver.getTitle());

	}

	@Test
	public void All_LinksTest() throws InterruptedException 
	{

		obj1.AllLinks();

	}


	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
