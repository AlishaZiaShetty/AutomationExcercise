package com.qa.testsuites.automationexercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.automationexercise.Base;
import com.qa.pages.LandingPage;
import com.qa.pages.LoginPage;
import com.qa.pages.RedemptionPage;
import com.qa.utils.CompareData;

import java.util.stream.Collectors;

public class RedemptionHomePageTestCases extends Base
{
	RedemptionPage redemptionPage = new RedemptionPage(driver);
	String[] expectedHeaderArray=new String[] {"Issuer name","issuer Country", "Paying Agent", "Lead Admin Location", "NominalValue"};
	List<String> expectedHeaderList ;
	
	public RedemptionHomePageTestCases() throws IOException
	{
		super();
	}

	@Test(dataProvider="getData")
	public void basepageNavigation(String userName, String password) throws IOException
	{
		driver = initializeDriver();	
		LandingPage  landingPage = new LandingPage(driver);		
		landingPage.getLogin().click(); 
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(userName);
		loginPage.getPassword().sendKeys(password);
		loginPage.getLoginBtn().click();
	}
	


	public void verifyTitle()
	{
		Assert.assertEquals(redemptionPage.getTitle(), "Redemption Screen");
	}
	
	public void verifyTable()
	{
		//Get the list of webelement with all the headers
		List<WebElement> allHeaders = redemptionPage.getAllHeaders();
		
		//Get the size
		int actualCount = allHeaders.size();
		
		//verify if the count of headers matches with the expected list, else display count mismatch
		Assert.assertEquals(actualCount, expectedHeaderList.size(), "Count mismatch");
		
		//Created a List of type String to store the text value for each header
		List<String> actualHeaderList=new ArrayList<String>();
		
		//Iterating through all the elements 
		boolean status = false;
		for(WebElement element:allHeaders)
		{
			String value = element.getText();
			if(value.contains("issuer Country"))
			{
				status = true; // The loop would continue only till issue country is found
				break;
			}
		}
		Assert.assertTrue(status , "Header is not present");
			
		// use Array.asList to store the values from the expected list array into a list
		expectedHeaderList = Arrays.asList(expectedHeaderArray);
				
		if(CompareData.isEqualIgnoringOrder(actualHeaderList, expectedHeaderList)) 
		  {
		  System.out.println("Test Pass"); }
		  
		 else { Assert.fail("Test failed"); }
		
		
		System.out.println("===============================================");
		
		//Get the list of webelement with all the rows
		List<WebElement> numberOfRows = redemptionPage.getAllRows();
		
		Assert.assertEquals(numberOfRows.size(), 8, "Row count mismatch");
		
		List<WebElement> allData = redemptionPage.getAllData();
		
		boolean dataStatus = false;
		
		for(WebElement element:allData)
		{
			String value = element.getText();
			if(value.contains("Emirates"))
			{
				dataStatus = true; // The loop would continue only till Share is found
				break;
			}
		}
		Assert.assertTrue(status , "Record is not present");
		
		System.out.println("===============================================");
		
		//Get the list of redemption Mode for all the rows
		List<WebElement> getAllModes = redemptionPage.getAllModes();
			
		boolean modeTypes = false;
		
		for(WebElement element:getAllModes)
		{
			String value = element.getText();
			if(value.contains("Cash & Shares"))
			{
				modeTypes = true; // The loop would continue only till Share is found
				break;
			}
		}
		Assert.assertTrue(status , "Share is not present");
		
	}
}
