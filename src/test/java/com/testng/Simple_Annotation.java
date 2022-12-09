package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Simple_Annotation {

	@BeforeSuite
	public void browserLaunch() {

		System.out.println("browserLaunch");
	}
	@BeforeClass
	public void urlLaunch() {

		System.out.println("urlLaunch");
	}
	@BeforeMethod
	public void login() {

		System.out.println("login");
	}
	@Test(priority = -1 ,invocationCount = 2)
	public void toys() {

		System.out.println("toys");
	}
	@Test(invocationCount = 2)
	public void mobilePhones() {

		System.out.println("mobilePhones");
	}
	@Test(priority = 0)
	public void clothes() {

		System.out.println("clothes");
	}
	@AfterMethod
	public void logout() {

		System.out.println("logout");
	}
	@AfterClass
	public void screenshot() {

		System.out.println("screenshot");
	}
	@AfterSuite
	public void close() {

		System.out.println("close");
	}
}
