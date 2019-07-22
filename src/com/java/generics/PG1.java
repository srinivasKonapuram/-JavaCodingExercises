package com.java.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class PG1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.marionette", "\\Documents\\FirFoxdriver\\geckodriver");
		//WebDriver driver = new FirefoxDriver();
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		 WebDriver driver = new ChromeDriver();

		String baseUrl = "https://demo.guru99.com";
		String expectedTitle = "Guru99 Bank Home Page";
		String actualTitle = "";

		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		// close Fire fox
		//driver.close();

	}

}
