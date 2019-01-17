package com.Marketlanicng.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Marketlancing.qa.base.TestBase;

//import com.Marketlancing.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//page factory-Object Repository
	
	@FindBy(xpath="//a[@class='signin-link open-signin-modal']") WebElement Login_click;
	
	@FindBy(xpath="//div[@class='inner-form signin-form']//input[@id='user_login']") WebElement login_username;
	
	@FindBy(xpath="//div[@class='inner-form signin-form']//input[@id='user_pass']") WebElement login_password;
	
	@FindBy(xpath="//button[contains(text(),'SIGN IN')]") WebElement login_button; 
	
	public  LoginPage()
	{
		//Page Factory is a way to initialize the web elements you want to 
		//interact with within the page object when you create an instance of it.
		//this all the elements with initialised with driver
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginValidation(String un,String pwd)
	{
		Login_click.click();
		login_username.sendKeys(un);
		
		login_password.sendKeys(pwd);
		login_button.click();
		
	}
}
