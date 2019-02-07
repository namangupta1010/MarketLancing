package com.Marketlanicng.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Marketlancing.qa.base.TestBase;

public class DashBoard extends TestBase {
	
	@FindBy(xpath="//div[@class='content-bio']") WebElement xpath_bio;
	
	@FindBy(xpath="//p[contains(text(),'namangupta1010@gmail.com')]") WebElement xpath_email;
	
	
	public DashBoard()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void GetBio()
	{
		System.out.println(xpath_bio.getText());
	}

	public String Getemail()
	{
		System.out.println(xpath_email.getText());
		return xpath_email.getText();
	}
}
