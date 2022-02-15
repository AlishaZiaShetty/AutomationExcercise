package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver; 
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
		
	By email= By.xpath("//input[@id='user_email']");
	
	By password = By.id("user_password");
	
	By submitBtn = By.cssSelector("input[value= 'Log In']");
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLoginBtn()
	{
		return driver.findElement(submitBtn);
	}

}
