package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id ="hotels")
	private WebElement hotelName;
	
	@FindBy(id = "room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(id ="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id ="child_room")
	private WebElement childRoom;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	public Search_Hotel(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	
}
