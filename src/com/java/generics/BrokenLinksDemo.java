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

public class BrokenLinksDemo {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		/*
		 * WebDriver driver = new ChromeDriver();
		 * System.setProperty("WebDriver.chrome.drievr", "chromeDriver"); String baseUrl
		 * = "http://www.zlti.com"; driver.get(baseUrl);
		 * driver.manage().window().maximize(); System.out.println(driver.getTitle());
		 * String url = ""; HttpURLConnection huc = null; List<WebElement> links =
		 * driver.findElements(By.tagName("a")); System.out.println(links.size());
		 * Iterator<WebElement> it = links.iterator(); while (it.hasNext()) { url =
		 * it.next().getAttribute("href"); try { huc = (HttpURLConnection) (new
		 * URL(url).openConnection()); huc.setConnectTimeout(4000);
		 * huc.setRequestMethod("HEAD"); huc.connect(); if (huc.getResponseCode() ==
		 * 200) { System.out.println(url + "-" + huc.getResponseMessage());
		 * 
		 * } if (huc.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
		 * System.out.println(url + "-" + huc.getResponseMessage() + "-" +
		 * HttpURLConnection.HTTP_NOT_FOUND); }
		 * 
		 * } catch (MalformedURLException e) {
		 * 
		 * e.printStackTrace(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); } }
		 */
		String homePage = "http://www.zlti.com";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                	System.out.println(url + "-" + huc.getResponseMessage());
                }
                
                if (huc.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
           		  System.out.println(url + "-" + huc.getResponseMessage() + "-" +
           		 HttpURLConnection.HTTP_NOT_FOUND); }
               
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        

	}
}
