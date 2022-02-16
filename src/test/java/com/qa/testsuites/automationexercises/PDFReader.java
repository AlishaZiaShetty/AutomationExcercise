package com.qa.testsuites.automationexercises;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReader 
{
	@Test
	public void readPDFTest() throws IOException
	{

		//Give the path of the file which has pdf
		
		// If the pdf should be downloaded from the web -->
		
		// Set up the driver which needs to be used
		
		//Create driver instance for the related browser class 
		
		//driver.get (pass the below url")
		
		URL url = new URL("file:///C://Users//91953//eclipse-workspace//E2EProject//src//main//java//com//qa//resources//gcp.pdf");
			
		InputStream  is = url.openStream();
		
		BufferedInputStream fileParse = new BufferedInputStream(is);
		
		PDDocument document = null;
		
		document = PDDocument.load(fileParse);
		
		String pdfContent= new PDFTextStripper().getText(document);
		
		System.out.println("pdfContent: "+pdfContent);
		
		Assert.assertTrue(pdfContent.contains("Dan"), "The file contains Dan");
		
		
	}
	

} 
