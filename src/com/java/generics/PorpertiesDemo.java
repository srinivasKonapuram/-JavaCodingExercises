package com.java.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PorpertiesDemo {

	public static void main(String[] args) {

		File file = new File("dataFile.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com";
		driver.get(baseUrl);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys(prop.getProperty("firstname"));
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys(prop.getProperty("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys(prop.getProperty("username"));
		WebElement conemail = driver.findElement(By.name("reg_email_confirmation__"));
		conemail.sendKeys(prop.getProperty("username"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(prop.getProperty("password"));
		Select drpday = new Select(driver.findElement(By.name("birthday_day")));
		drpday.selectByValue(prop.getProperty("day"));
		Select drpmonth = new Select(driver.findElement(By.name("birthday_month")));
		drpmonth.selectByVisibleText(prop.getProperty("month"));
		Select drpyear = new Select(driver.findElement(By.name("birthday_year")));
		drpyear.selectByValue(prop.getProperty("year"));
		List<WebElement> radioButton = driver.findElements(By.xpath("//label[contains(text(),'Female')]"));
		for (WebElement webElement : radioButton) {
			System.out.println(webElement.getText());
			if (webElement.equals(prop.getProperty("radio1")))
				;
			webElement.click();
		}
		WebElement submitbutton = driver.findElement(By.name("websubmit"));
		submitbutton.click();
	}

}
