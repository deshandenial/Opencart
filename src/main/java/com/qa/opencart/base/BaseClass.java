package com.qa.opencart.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass 
{

	public WebDriver driver;
	LoginPage loginpage;
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void precondition(String url,String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		
			driver.get(url);
		
			driver.manage().window().maximize();
		 
		
		}
		
	}
}
