package com.java.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTipDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String expectedTooltip = "What's new in 3.2";
		String actualTitle = "";
		actualTitle = driver.getTitle();
		System.out.println(" title from the site " + actualTitle);
		WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
		Actions builder = new Actions(driver);
		builder.clickAndHold().moveToElement(download);
		builder.moveToElement(download).build().perform();
		WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
		String actualTooltip = toolTipElement.getText();
		System.out.println("Actual Title of Tool Tip  " + actualTooltip);
		Assert.assertEquals(actualTooltip, expectedTooltip, "testpassed");
		System.out.println("passed");
	}

}
