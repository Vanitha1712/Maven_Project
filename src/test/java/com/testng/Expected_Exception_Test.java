package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expected_Exception_Test {

	@Test(expectedExceptions = ArithmeticException.class)
	public void data() {

		int a =10;
		System.out.println(a/0);
	}
	
//	@Test(timeOut = 9000, expectedExceptions = TimeOutException.class)
//	public void credencials() throws InterruptedException {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TESTUSER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
//	
//	driver.get("https://adactinhotelapp.com/");
//	driver.manage().window().maximize();
//	
//	Thread.sleep(2000);
//	WebElement username = driver.findElement(By.id("username"));
//	username.sendKeys("vanitha1712");
//	
//	Thread.sleep(1000);
//	WebElement password = driver.findElement(By.id("password"));
//	password.sendKeys("vani1712");
//	
//	Thread.sleep(2000);
//	WebElement login = driver.findElement(By.id("login"));
//	login.click();
//	
//	}
	
	
}
