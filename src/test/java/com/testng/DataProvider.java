package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {


	@Test(dataProvider = "data")
	public void browserLaunch(String user,String pass) throws InterruptedException {
	
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
	
	@org.testng.annotations.DataProvider
	public Object[][] data() {

		return new Object[][] {
			
			{"sff","132"} , {"kasj","564"} , {"vanitha1712","vani1712"}
		};
	}
		
}
