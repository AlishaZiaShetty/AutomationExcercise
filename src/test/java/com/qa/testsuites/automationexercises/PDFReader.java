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

import com.qa.automationexercise.Base;

public class PDFReader 
{

	@Test
	public void readPDFTest() throws IOException
	{	
		URL url = new URL("file:///C://Users//91953//eclipse-workspace//E2EProject//src//main//java//com//qa//resources");
				InputStream  is = url.openStream();
		
		BufferedInputStream fileParse = new BufferedInputStream(is);
		
		PDDocument document = null;
		
		document = PDDocument.load(fileParse);
		
		String pdfContent= new PDFTextStripper().getText(document);
		
		System.out.println("pdfContent: "+pdfContent);
		
		Assert.assertTrue(pdfContent.contains("Dan"), "The file contains Dan");
		
	}
} 
