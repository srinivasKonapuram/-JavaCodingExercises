package com.java.generics;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClassDemo {
	Properties prop = new Properties();
	WebDriver driver;

	
	public void mainDriverForAmazan() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.in";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = "";
		actualTitle = driver.getTitle();
		System.out.println(" title from the site " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "testpassed");
	}
	public void mainDriverForFacebook() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = "";
		actualTitle = driver.getTitle();
		System.out.println(" title from the site " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "testpassed");

	}
	
	 
}
