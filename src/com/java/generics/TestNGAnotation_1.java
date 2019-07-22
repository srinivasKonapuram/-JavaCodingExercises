package com.java.generics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNGAnotation_1 {

	@BeforeClass
	public void berforeClass() {
		System.out.println(" Initialize Selenium for class 1");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("opening Browser");
	}

	@Test
	public void Test1() {
		System.out.println(" inside test 1");
	}

	@Test
	public void test2() {
		System.out.println(" inside test2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" closig the browser");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" Destroy selenium class 1");
	}

}
