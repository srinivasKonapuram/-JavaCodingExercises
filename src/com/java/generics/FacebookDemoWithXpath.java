package com.java.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests;
import org.testng.annotations.Test;

public class FacebookDemoWithXpath extends BaseClassDemo {
	/*
	 * @Parameters("MyBrowser")
	 * 
	 * @BeforeSuite public void intialChecingOfTitle(String MyBrowser) {
	 * System.out.println(" name is :" + MyBrowser); assert
	 * "chrome".equals(MyBrowser); mainDriverForFacebook(); //
	 * System.out.println(" firfox"); }
	 */

	@BeforeSuite
	@Parameters({ "MyBrowser" })
	public void t1(String s) {
		System.out.println(" name is :" + s);
		assert "chrome".equals(s);
		mainDriverForFacebook();
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
		System.out.println(" loading of data ");
	}
	/*
	 * @Test(priority = 1) public void userRegistrationWithXpath() {
	 * System.out.println("In userregistartions "); WebElement firstname =
	 * driver.findElement(By.xpath("//input[@id='u_0_l']"));
	 * firstname.sendKeys(prop.getProperty("firstname")); WebElement surname =
	 * driver.findElement(By.xpath("//input[@id='u_0_n']"));
	 * surname.sendKeys(prop.getProperty("lastname")); WebElement email =
	 * driver.findElement(By.xpath("//input[@id='u_0_q']"));
	 * email.sendKeys(prop.getProperty("username")); WebElement conemail =
	 * driver.findElement(By.xpath("//input[@id='u_0_t']"));
	 * conemail.sendKeys(prop.getProperty("username")); WebElement password =
	 * driver.findElement(By.xpath("//input[@id='u_0_x']"));
	 * password.sendKeys(prop.getProperty("password")); Select drpday = new
	 * Select(driver.findElement(By.xpath("//select[@id='day']")));
	 * drpday.selectByValue(prop.getProperty("day")); Select drpmonth = new
	 * Select(driver.findElement(By.xpath("//select[@id='month']")));
	 * drpmonth.selectByVisibleText(prop.getProperty("month")); Select drpyear = new
	 * Select(driver.findElement(By.xpath("//select[@id='year']")));
	 * drpyear.selectByValue(prop.getProperty("year")); List<WebElement> radioButton
	 * = driver.findElements(By.xpath("//label[contains(text(),'Female')]")); for
	 * (WebElement webElement : radioButton) { if
	 * (webElement.equals(prop.getProperty("radio1"))) webElement.click(); }
	 * WebElement submitbutton = driver.findElement(By.name("websubmit"));
	 * submitbutton.click();
	 * 
	 * }
	 */

	@Test(priority = 0)
	public void login() {
		System.out.println(" in login method");
		WebElement useremailId = driver.findElement(By.xpath("//input[@id='email1']"));
		useremailId.sendKeys(prop.getProperty("username"));
		WebElement useremailid = driver.findElement(By.name("email"));
		useremailid.sendKeys(prop.getProperty("username"));
		WebElement userpassword = driver.findElement(By.xpath("//input[@id='pass']"));
		userpassword.sendKeys(prop.getProperty("password"));
		WebElement submitbutto = driver.findElement(By.xpath("//input[@id='u_0_2']"));
		submitbutto.click();
		System.out.println(" in login method");

	}	
	  @AfterMethod
	  public void tearDown(ITestResult result) {
	  System.out.println(" After method  "); 
		/*
		 * DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss"); Date dateobj = new
		 * Date(); System.out.println(df.format(dateobj));
		 */
	  if (ITestResult.FAILURE ==result.getStatus()) { 
		  
	  Utility.captureScreenshot(driver,result.getName()); }
	  }
}
