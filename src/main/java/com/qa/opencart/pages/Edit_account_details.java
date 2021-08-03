package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.util.ElementUtil;

public class Edit_account_details 
{
	WebDriver driver;
	ElementUtil elementutil;
	
	private By Edit_Account = By.xpath("//a[contains(text(),'Edit your account information')]");
	private By Edit_Firstname = By.xpath("//input[@placeholder='First Name']");
	private By Edit_Lastname = By.xpath("//input[@placeholder='Last Name']");
	private By Edit_Email = By.xpath("//input[@placeholder='E-Mail']");
	private By Edit_Phoneno = By.xpath("//input[@type='tel']");
	public Edit_account_details(WebDriver driver) 
	{
		super();
		this.driver = driver;
		elementutil = new ElementUtil(driver);
	}
	
	
	public void editAccount(String firstname,String lastname, String email, String phoneno)
	{
		elementutil.doClick(Edit_Account);
		elementutil.doSendKeys(Edit_Firstname, firstname);
		elementutil.doSendKeys(Edit_Lastname, lastname);
		elementutil.doSendKeys(Edit_Email, email);
		elementutil.doSendKeys(Edit_Phoneno, phoneno);
		
	}

}
