package com.maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	
	//BrowserLaunch
	public static WebDriver browserLaunching(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\firefox.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
				
		}
	
		return driver;
	}
	
	public static void getUrl(String url) {

		driver.get(url);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

	public static void forwardPage() {
		driver.navigate().forward();
	}
	
	public static void backPage() {
		driver.navigate().back();
	}
	
	public static void sendKeys(WebElement element , String input) {
		element.sendKeys(input);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void deleteInput(WebElement element) {
		element.clear();
	}
	
	public static void indexSelect(WebElement element , int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void visibleTextSelect(WebElement element , String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void takesScreenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(location);
		FileUtils.copyFile(source, destination);
	}
	


























}
