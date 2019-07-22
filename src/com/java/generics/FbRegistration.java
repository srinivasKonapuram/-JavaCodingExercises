package com.java.generics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class FbRegistration {
	String useremailid = "teju1@gmail.com";
	String userpassword = "teju23@##";
	WebDriver driver;
	String baseUrl;
	public void baseCode() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
	baseUrl = "https://www.facebook.com";
	//	baseUrl="http://demo.guru99.com/test/delete_customer.php";
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	public void userRegistration() {
		
		/*
		 * driver.findElement(By.name("cusid")).sendKeys("53920");
		 * driver.findElement(By.name("submit")).submit();
		 * 
		 * // Switching to Alert Alert alert = driver.switchTo().alert();
		 * 
		 * // Capturing alert message. String alertMessage=
		 * driver.switchTo().alert().getText();
		 * 
		 * // Displaying alert message System.out.println(alertMessage);
		 * Thread.sleep(5000);
		 * 
		 * // Accepting alert alert.accept();
		 */
		
		
		  String expectedTitle = "Facebook – log in or sign up"; String actualTitle =
		  ""; actualTitle = driver.getTitle(); System.out.println(actualTitle); if
		  (actualTitle.contentEquals(expectedTitle)) {
		  System.out.println("Test Passed!"); } else {
		  System.out.println("Test Failed"); } WebElement firstname =
		  driver.findElement(By.name("firstname")); firstname.sendKeys("srinu");
		  WebElement surname = driver.findElement(By.name("lastname"));
		  surname.sendKeys("konapuram"); WebElement email =
		  driver.findElement(By.name("reg_email__")); email.sendKeys(useremailid);
		  WebElement conemail =
		  driver.findElement(By.name("reg_email_confirmation__"));
		  conemail.sendKeys(useremailid); WebElement password =
		  driver.findElement(By.name("reg_passwd__")); password.sendKeys(userpassword);
		  Select drpday = new Select(driver.findElement(By.name("birthday_day")));
		  drpday.selectByValue("11"); Select drpmonth = new
		  Select(driver.findElement(By.name("birthday_month")));
		  drpmonth.selectByVisibleText("Sept"); Select drpyear = new
		  Select(driver.findElement(By.name("birthday_year")));
		  drpyear.selectByValue("1998"); List<WebElement> gender =
		  driver.findElements(By.xpath("//label[contains(text(),'Female')]")); for
		  (WebElement webElement : gender) { System.out.println(webElement.getText());
		  if (webElement.equals("female")) ; webElement.click(); } WebElement
		  submitbutton = driver.findElement(By.name("websubmit"));
		  submitbutton.click();
		 
	}
	public void userLogin() {
		WebElement useremail = driver.findElement(By.name("email"));
		useremail.sendKeys(useremailid);
		WebElement Userpassword = driver.findElement(By.name("pass"));
		Userpassword.sendKeys(userpassword);
		WebElement lgnbtn = driver.findElement(By.id("loginbutton"));
		lgnbtn.click();
		String expectedEmailId = "teju1@gmail.com";
		String actualEmailId = driver.findElement(By.name("email")).getAttribute("value");
		System.out.println(" Email id to validate the page " + actualEmailId);
		if (actualEmailId.contentEquals(expectedEmailId)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
	}

}
