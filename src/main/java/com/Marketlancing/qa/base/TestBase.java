package com.Marketlancing.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase 
{
	 public static WebDriver driver;
	 public Properties prop ;
	
public void Initialization() 
{
	 try{
		  prop = new Properties();
			FileInputStream ip =new FileInputStream("C:\\Users\\HP\\git\\Lms-Checkout\\MarketLancingTest\\src\\main\\java\\com\\Marketlancing\\qa\\config\\config.properties");
			prop.load(ip);
		 }
		 catch(IOException e)
		 {		 
			 e.printStackTrace();
		 }
		
	String broswername =prop.getProperty("browser");
	if(broswername.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	if(broswername.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	 driver = new FirefoxDriver();
	}
	
	driver.get(prop.getProperty("Url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}



}
