package com.qa.opencart.pagetest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseClass;
import com.qa.opencart.pages.Edit_account_details;
import com.qa.opencart.util.ReadExcel;

public class Edit_acccount_details_Test extends BaseClass
{
	Edit_account_details edit_accountpage;

	@Test(dataProvider = "accounts")
	public void editAccount_details(String firstName,String lastName,String email,String phoneNo)
	{
		edit_accountpage= new Edit_account_details(driver);
		edit_accountpage.editAccount(firstName, lastName, email, phoneNo);
	}
	
	
	@DataProvider(name="accounts")
	public String[][] sendData() throws IOException
	{
	return ReadExcel.readData("login_testData","editAccounts");
	}
}
