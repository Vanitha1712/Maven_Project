Feature: Checking the hotel booking functionality of an Adactin application
Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The "<username>" in the Username Field
And user Enter The "<password>" in the Password Field
Then user Click The Login button and It Navigates To Search Hotel Page

Examples:
|username    | password|
|lkjh        |    d8709|
|kjhbh       |   sd9879|
|vanitha1712 | vani1712|

Scenario: User Search Hotel Using Multiple Options
When user Select The Location For The Hotel From Location Dropdown
And user Select The Hotel From Hotel Dropdown
And user Select The RoomType Of The Hotel From RoomType Dropdown
And user Select The NumberOfRooms Of The Hotel From NumberOfRooms Dropdown
And user Enter The CheckIn Date in the CheckIn Field
And user Enter The CheckOut Date in the CheckOut Field
And user Select The Number Of Adults Per Room From  Adults Per Room Dropdown
And user Select The Number Of Children Per Room From  Children Per Room Dropdown
Then user Click The Search button and It Navigates To Select Hotel Page

Scenario: User Select The Hotel
When user Click The Select button In Select Hotel Field
Then user Click The Continue button and It Navigates To Book a Hotel Page

Scenario: User Book a Hotel By Providing Essential Details
When user Enter The Firstname in the Firstname Field
And user Enter The Lastname in the Lastname Field
And Enter The Address in the Billing Address Field
And user Enter The Credit CardNo in the Credit CardNo Field
And user Select The Card Type From  Credit Card Type Dropdown
And user Select The Expiry Month From  Select Month Dropdown
And user Select The Expiry Year From  Select Year Dropdown
And user Enter The CV Number in the CV Number Field
Then user Click The Book button and It Navigates To Booking Confirmation Page

Scenario: User Rechecks The Details in The Booking Confirmation Page
Then user Click The LogOut button and It Navigates To LogOut Page

Scenario: User Got a LogOut Confirmation Message





