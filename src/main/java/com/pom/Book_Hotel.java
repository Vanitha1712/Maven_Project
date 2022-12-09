package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;

	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id ="last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditno;
	
	@FindBy(id ="cc_type")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id ="cc_cvv")
	private WebElement cv;
	
	@FindBy(id = "book_now")
	private WebElement book;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditno() {
		return creditno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCv() {
		return cv;
	}

	public WebElement getBook() {
		return book;
	}

	
	
	
}
