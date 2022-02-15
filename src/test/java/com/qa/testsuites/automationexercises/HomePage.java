package com.qa.testsuites.automationexercises;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.automationexercise.Base;
import com.qa.pages.LandingPage;
import com.qa.pages.LoginPage;

public class HomePage extends Base
{

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider="getData")
	public void basepageNavigation(String userName, String password) throws IOException
	{
		driver = initializeDriver();
		driver.get("www.xyzredemption.com");
	
		
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.getLogin().click(); 
	
		LoginPage 	loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(userName);
		loginPage.getPassword().sendKeys(password);
		//System.out.println(text);
		loginPage.getLoginBtn().click();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//Row stands for how many different data types test should be executed
		//column stands for how many values per each test
		
		Object[][] data = new Object[2][2]; //At 0th index first set of data will be there
		data[0][0] = "nonrestricteduser@gmail.com";
		data[0][1] = "IamthePassword";
		//data[0][2] = "I am non restricted user";
		
		// data[0][2] = "Non restricted User"; 
		 data[1][0] = "testuser1";
		 data[1][1] = "IamtheOtehrpassword";
		// data[1][2] = "pass123";
		
		return data;
	}
}
