package com.Marketlanicng.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Marketlancing.qa.base.TestBase;

public class HomePage extends TestBase {
	

	//page factory-Object Repository
	
	@FindBy(xpath="//a[@class='signup-link open-signup-modal']") WebElement join_us_xpath_link;
	
	@FindBy(xpath="//div[@class='input-group']//input[@id='user_email']") WebElement email_xpath;
	
	@FindBy(xpath="//div[@class='inner-form']//div[@class='form-group clearfix']//input[@id='user_login']") WebElement username_xpath;

	@FindBy(xpath="//div[@class='inner-form']//input[@id='user_pass']") WebElement password_xpath;
	
	@FindBy(xpath="//input[@id='repeat_pass']") WebElement confirm_password_xpath;
}



