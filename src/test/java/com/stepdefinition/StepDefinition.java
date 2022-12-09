package com.stepdefinition;

import java.io.IOException;

import com.maven.Base_Class;
import com.sdp.Page_Object_Manager_Main;

import io.cucumber.java.en.*;


public class StepDefinition extends Base_Class{
	
	public static Page_Object_Manager_Main pom = new Page_Object_Manager_Main(driver);
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		
		getUrl("https://adactinhotelapp.com/");	
	}

	@When("user Enter The {string} in the Username Field")
	public void user_enter_the_in_the_username_field(String username) throws IOException {

	    sendKeys(pom.getInstanceLogin().getUsername(), username);
	}

	@When("user Enter The {string} in the Password Field")
	public void user_enter_the_in_the_password_field(String password) throws IOException {
		
			sendKeys(pom.getInstanceLogin().getPassword(), password);		
	}

	@Then("^user Click The Login button and It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_button_and_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLogin());
	}
	@When("user Select The Location For The Hotel From Location Dropdown")
	public void user_select_the_location_for_the_hotel_from_location_dropdown() {

		indexSelect(pom.getInstanceSearch().getLocation(),5);
	}

	@When("user Select The Hotel From Hotel Dropdown")
	public void user_select_the_hotel_from_hotel_dropdown() {
	
		indexSelect(pom.getInstanceSearch().getHotelName(),2);
		}

	@When("user Select The RoomType Of The Hotel From RoomType Dropdown")
	public void user_select_the_room_type_of_the_hotel_from_room_type_dropdown() {
		visibleTextSelect(pom.getInstanceSearch().getRoom(), "Standard");	
	}

	@When("user Select The NumberOfRooms Of The Hotel From NumberOfRooms Dropdown")
	public void user_select_the_number_of_rooms_of_the_hotel_from_number_of_rooms_dropdown() {

		indexSelect(pom.getInstanceSearch().getNumberOfRooms(), 3);
	}
	@When("user Enter The CheckIn Date in the CheckIn Field")
	public void user_enter_the_check_in_date_in_the_check_in_field() {
	
		deleteInput(pom.getInstanceSearch().getCheckIn());
		sendKeys(pom.getInstanceSearch().getCheckIn(), "10/10/2023");
	}

	@When("user Enter The CheckOut Date in the CheckOut Field")
	public void user_enter_the_check_out_date_in_the_check_out_field() {
	
		deleteInput(pom.getInstanceSearch().getCheckOut());
		sendKeys(pom.getInstanceSearch().getCheckOut(), "15/10/2023");
	}

	@When("user Select The Number Of Adults Per Room From  Adults Per Room Dropdown")
	public void user_select_the_number_of_adults_per_room_from_adults_per_room_dropdown() {
	
		indexSelect(pom.getInstanceSearch().getAdultRoom(),  2);
	}

	@When("user Select The Number Of Children Per Room From  Children Per Room Dropdown")
	public void user_select_the_number_of_children_per_room_from_children_per_room_dropdown() {
	
		indexSelect(pom.getInstanceSearch().getChildRoom(), 1);
	}

	@Then("user Click The Search button and It Navigates To Select Hotel Page")
	public void user_click_the_search_button_and_it_navigates_to_select_hotel_page() {
	
		clickOnElement(pom.getInstanceSearch().getSearch());
	}

	@When("user Click The Select button In Select Hotel Field")
	public void user_click_the_select_button_in_select_hotel_field() {
	
		clickOnElement(pom.getInstanceSelect().getSelect());
	}

	@Then("user Click The Continue button and It Navigates To Book a Hotel Page")
	public void user_click_the_continue_button_and_it_navigates_to_book_a_hotel_page() {
	
		clickOnElement(pom.getInstanceSelect().getContinueButton());
	}

	@When("user Enter The Firstname in the Firstname Field")
	public void user_enter_the_firstname_in_the_firstname_field() {
	
		sendKeys(pom.getInstanceBook().getFirstname(), "vanitha");
	}

	@When("user Enter The Lastname in the Lastname Field")
	public void user_enter_the_lastname_in_the_lastname_field() {
	
		sendKeys(pom.getInstanceBook().getLastname(), "S");
	}

	@When("Enter The Address in the Billing Address Field")
	public void enter_the_address_in_the_billing_address_field() {
	
		sendKeys(pom.getInstanceBook().getAddress(), "3,venkateshwara nagar,chennai");
	}

	@When("user Enter The Credit CardNo in the Credit CardNo Field")
	public void user_enter_the_credit_card_no_in_the_credit_card_no_field() {
	
		sendKeys(pom.getInstanceBook().getCreditno(), "1234567891234567");
	}

	@When("user Select The Card Type From  Credit Card Type Dropdown")
	public void user_select_the_card_type_from_credit_card_type_dropdown() {
	
		indexSelect(pom.getInstanceBook().getCardtype(), 2);
	}

	@When("user Select The Expiry Month From  Select Month Dropdown")
	public void user_select_the_expiry_month_from_select_month_dropdown() {
	
		indexSelect(pom.getInstanceBook().getExpmon(), 2);
	}

	@When("user Select The Expiry Year From  Select Year Dropdown")
	public void user_select_the_expiry_year_from_select_year_dropdown() {
	
		visibleTextSelect(pom.getInstanceBook().getExpyear(), "2014");
	}

	@When("user Enter The CV Number in the CV Number Field")
	public void user_enter_the_cv_number_in_the_cv_number_field() {
	
		sendKeys(pom.getInstanceBook().getCv(), "7653");
	}

	@Then("user Click The Book button and It Navigates To Booking Confirmation Page")
	public void user_click_the_book_button_and_it_navigates_to_booking_confirmation_page() {
	
		clickOnElement(pom.getInstanceBook().getBook());
	}

	@Then("user Click The LogOut button and It Navigates To LogOut Page")
	public void user_click_the_log_out_button_and_it_navigates_to_log_out_page() throws InterruptedException {

		Thread.sleep(6000);
		clickOnElement(pom.getInstanceLogOut().getLogout());
	}

}
