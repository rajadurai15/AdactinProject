Feature: Hotel Booking In Adactin Application
@smokeTest
Scenario: User Login In The Web Application
Given user Launch The Url In Adactin Application
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigate To Search Hotel Page

Scenario: In This Page User Search Hotel
When user Select The Location
And user Select The Hotels
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click The Search Button And Its Navigate To The Selected Hotel Page
