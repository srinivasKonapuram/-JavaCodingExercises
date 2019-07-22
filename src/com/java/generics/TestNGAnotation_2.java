package com.java.generics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotation_2 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" starting TestNg");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" stoping TestNg");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Starting the test   Execution");
	}

	@BeforeClass
	public void berforeClass() {
		System.out.println(" Initialize Selenium for class 2");
	}

	@Test
	public void test3() {
		System.out.println(" inside test 3");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" Destroy selenium class 2");

	}

	@AfterTest
	public void afterTest() {
		System.out.println(" stop the testing");
	}

}
