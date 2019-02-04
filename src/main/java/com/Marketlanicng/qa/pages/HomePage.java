package com.Marketlanicng.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Marketlancing.qa.base.TestBase;

public class HomePage extends TestBase {

	//page factory-Object Repository

	@FindBy(xpath="//input[@class='text-search-home']") WebElement search_input;

	@FindBy(xpath="//button[@class='btn-diplomat btn-find btn- waves-effect waves-light']") WebElement search_box;

	@FindBy(xpath="//a") List<WebElement> Links;


	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	public void Searchjob(String SN) 
	{

		search_input.sendKeys(SN);
		search_box.click();
		
	}

	public void AllLinks()
	{
		System.out.println(Links.size());
		for(int i=0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
		}
	}

}



