package com.qa.automationexercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static Properties prop;
	public static WebDriver driver;
	
	public Base() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\91953\\eclipse-workspace\\E2EProject\\src\\main\\java\\Resources\\config.properties");
	
		prop.load(fis);
	}
		
	
	public WebDriver initializeDriver() throws IOException
	{
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(browserName.equals("firefox"))
		{
			
		}
		
		if(browserName.equals("ie"))
		{
			
		}
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//add property , pick from config
		driver.get("www.xyzredemption.com");
		return driver;
			
	}

}
