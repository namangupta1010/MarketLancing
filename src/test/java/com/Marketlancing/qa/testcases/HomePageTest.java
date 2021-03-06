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
	LoginPage login;
	HomePage homepage;

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		Initialization();
		login = new LoginPage();
		login.loginML(prop.getProperty("username"), prop.getProperty("password"));
		driver.navigate().to(prop.getProperty("Url"));
		homepage = new HomePage();

	}


	@Test
	public void SearchBoxTest() throws InterruptedException 
	{

		homepage.Searchjob(prop.getProperty("search_name"));
		System.out.println(driver.getTitle());
		Assert.assertEquals("You searched for testing class - Market Lancing", driver.getTitle());

	}

	@Test
	public void All_LinksTest() throws InterruptedException 
	{

		homepage.AllLinks();

	}


	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
