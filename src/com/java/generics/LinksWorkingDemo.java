package com.java.generics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksWorkingDemo {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		// String homePage = "http://www.zlti.com";
		String homePage = "https://www.guru99.com/";
		String url = "";
		HttpURLConnection huc = null;
		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				if (huc.getResponseCode() == 200) {
					System.out.println(url + "-" + huc.getResponseMessage());
				}

				if (huc.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(url + "-" + huc.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);
				}

			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
