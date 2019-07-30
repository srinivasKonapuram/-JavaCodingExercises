/**
 * 
 * author is srinu
 */

package com.java.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazanDemo extends BaseClassDemo {
	@Parameters("MyBrowser")
	@BeforeSuite
	public void intialChecingOfTitleForAmazan(String browser) {
		System.out.println(" name is by parameter " + browser);
		if (browser.equals(browser))
			mainDriverForAmazan();

		else {
			System.out.println(" firfox");
		}
	}

	@BeforeMethod
	public void propertyFileload() {

		File file = new File("dataFile.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileInput);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority=0)
	public void userRegistration() {
		Actions action = new Actions(driver);
		WebElement element = driver
				.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Account & Lists')]"));
		WebElement elemenToClick = driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][contains(text(),'Start here.')]"));
		action.moveToElement(element).click(elemenToClick).build().perform();
		action.clickAndHold();
		WebElement name = driver.findElement(By.xpath(" //input[@id='ap_customer_name']"));
		name.sendKeys(prop.getProperty("yourname"));

		WebElement usermobile = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		usermobile.sendKeys(prop.getProperty("mobile"));
		WebElement useremail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		useremail.sendKeys(prop.getProperty("email"));
		WebElement userpassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
		userpassword.sendKeys(prop.getProperty("pass"));
		WebElement subtn = driver.findElement(By.xpath("//input[@id='continue']"));
		subtn.click();
		System.out.println("In registartion method");
	}

	@Parameters({ "username", "pass" })
	@Test(priority=1)
	public void login(String username, String pass) {
		WebElement signin = driver.findElement(By.partialLinkText("Sign"));
		signin.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		/* email.sendKeys(prop.getProperty("email")); */
		email.sendKeys(username);
		WebElement continue_button = driver.findElement(By.xpath("//input[@id='continue']"));
		continue_button.click();
		WebElement userpassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
		/* userpassword.sendKeys(prop.getProperty("pass")) */;
		userpassword.sendKeys(pass);
		WebElement usersignbutton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		usersignbutton.click();
//		WebElement toGoHomePage = driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']"));
//		toGoHomePage.click();
		System.out.println(" in login method");
	}

	@Test(priority = 2)
	public void addToCart() {
		WebElement toGoHomePage = driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']"));
		toGoHomePage.click();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("redmi note 7 pro");
		WebElement searchBtton = driver
				.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
		searchBtton.click();
		WebElement imageFormpage = driver
				.findElement(By.xpath("//span[contains(text(),'Redmi Note 7 Pro (Space Black, 64GB, 4GB RAM)')]"));
		imageFormpage.click();
		WebElement addToCart = driver.findElement(By.name("submit.add-to-cart"));
		addToCart.click();
		System.out.println(" in cart method");

	}

	@AfterClass

	public void close() {
		System.out.println(" afte the addcart ");

	}

}