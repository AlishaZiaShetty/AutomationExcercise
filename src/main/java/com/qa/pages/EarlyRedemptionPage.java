package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EarlyRedemptionPage 
{
	public WebDriver driver;
	
	public EarlyRedemptionPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	By title= By.xpath("//*[text()='Early Redemption']");
	
	
	public WebElement getTitle2()
	{
		return driver.findElement(title);
	}


	
}
