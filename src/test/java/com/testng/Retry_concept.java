package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_concept {

	@Test
	public void credencials() throws InterruptedException {
	
		String exp = "vanitha";
		String act = "vanitha";
		
		Assert.assertEquals(act, exp);
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TESTUSER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("vanitha1712");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("vani1712");
	
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	
	}
	
	@Test(retryAnalyzer = Rerun.class)
	public void login() throws InterruptedException {
	
		String exp = "vanitha";
		String act = "vanitha17";
		
		Assert.assertEquals(act, exp);
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TESTUSER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("vanitha1712");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("vani1712");
	
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	
	}
	
}
