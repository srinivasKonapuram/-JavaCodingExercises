package com.java.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentDemo {
	protected WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver","chromedriver"
			+ "" );
	driver = new ChromeDriver();
	driver.get("https://www.google.com" );
	driver.manage().window().maximize() ;
driver.findElement(By.id("fakebox-input")).sendKeys("Abcd");
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(30, TimeUnit.SECONDS).
			pollingEvery(5, TimeUnit.SECONDS).
			ignoring(NoSuchElementException.class).withMessage("time expried");						
			/*.withTimeout(30, TimeUnit.SECONDS) 			
			.pollingEvery(5, TimeUnit.SECONDS) 			
			.ignoring(NoSuchElementException.class);*/
	WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver ) {
			return driver.findElement(By.partialLinkText("Microsoft Azure Cert"));
			//return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
		}
	});
	clickseleniumlink.click();
		driver.close() ;
	}

}
