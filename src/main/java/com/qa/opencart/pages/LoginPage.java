package com.qa.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.opencart.base.BaseClass;
import com.qa.opencart.util.ElementUtil;


public class LoginPage extends BaseClass
{
	ElementUtil elementUtil;
	WebDriver driver;
	private By login1 = By.xpath("//span[text()='My Account']");
	private By login2 = By.xpath("//a[contains(text(),'Login')]");
	private By username = By.xpath("//label[text()='E-Mail Address']/following::input");
	private By password = By.xpath("//input[@type='password']");
	private By submit = By.xpath("//input[@value='Login']");
	
	


	public LoginPage(WebDriver driver) 
	{
		super();
		
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}



	public void Login(String userName,String Password)
	{
		elementUtil.doClick(login1);
		elementUtil.doClick(login2);
		elementUtil.doSendKeys(username, userName);
		elementUtil.doSendKeys(password, Password);
		elementUtil.doClick(submit);
	}
	
}
