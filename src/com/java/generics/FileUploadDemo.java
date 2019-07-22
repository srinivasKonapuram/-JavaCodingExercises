package com.java.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo {
 
	@Test
	public void fileDemoWithDrivers() {
	WebDriver  driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	String homePage = "http://demo.guru99.com/test/upload/";
	driver.get(homePage);
	driver.manage().window().maximize();
	WebElement uploadElement= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	//uploadElement.sendKeys("./Generic/dataFile.properties/srinuResume.docx");
	uploadElement.sendKeys("/home/srinivask/Documents/srinuResume.docx");
	 driver.findElement(By.id("terms")).click();
	 driver.findElement(By.name("send")).click();
	}
	
}
