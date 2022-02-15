package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedemptionPage 
{
	public WebDriver driver; // no life no relevance at this point
	
	public RedemptionPage(WebDriver driver)
	{
		this.driver =driver;
	}
		
	By title= By.xpath("//*[text()='Redemption Screen']");
	
	By table = By.xpath("//table[@id ='Redemptions']");
	
	//All headers
	By allHeaders = By.xpath("//table[@id ='Redemptions']//th");
	
	//All rows 	
	By allRows = By.xpath("//table[@id ='Redemptions']//tr");
			
	//All data		
	By allData = By.xpath("//table[@id ='Redemptions']//td");
	
	// All the rows ,10th column
	By allMode = By.xpath("//table[@id ='Redemptions']//tr//td[10]");
	
	//RedemptionButton for Mode - Cash
	By btnCash = By.xpath("//td[text() ='Cash']//following::");
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public List<WebElement> getAllHeaders()
	{
	List<WebElement> headers = driver.findElements(allHeaders);
	
	return headers;
	}
	
	public List<WebElement> getAllRows()
	{
		List<WebElement> rows = driver.findElements(allRows);
		return rows;
	}
	
	public List<WebElement> getAllData()
	{
		List<WebElement> data = driver.findElements(allData);
		return data;
	}
	
	public List<WebElement> getAllModes()
	{
		List<WebElement> modes = driver.findElements(allMode);
		return modes;
	}
}
