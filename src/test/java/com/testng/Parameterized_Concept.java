package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {

	@Test
	@Parameters({"user","pass"})
	public void browserLaunch(@Optional("vanitha1712")String user,String pass) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TESTUSER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();

	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys(user);
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys(pass);
	
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	
	}
}
