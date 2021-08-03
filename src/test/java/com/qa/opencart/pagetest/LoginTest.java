package com.qa.opencart.pagetest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseClass;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.util.*;


public class LoginTest extends BaseClass
{
WebDriver driver;
LoginPage LoginPage;


@Test(dataProvider = "login")
public void Login_Test(String userID,String pass)
{
	LoginPage = new LoginPage(driver);
	LoginPage.Login(userID, pass);
	
	
}
	
@DataProvider(name="login")
public String[][] sendData() throws IOException
{
return ReadExcel.readData("login_testData","login");
}
}
