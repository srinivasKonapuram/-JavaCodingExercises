package com.java.generics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Utility {
		public static void captureScreenshot(WebDriver driver,String screenshotName)
		{

	        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
	        Date date = new Date();
	       System.out.println(dateFormat.format(date));
		try 
		{
		TakesScreenshot ts=(TakesScreenshot)driver;

		File source=ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+"-"+dateFormat.format(date)+".png"));

		System.out.println("Screenshot taken");
		} 
		catch (Exception e)
		{

		System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
		}
}
