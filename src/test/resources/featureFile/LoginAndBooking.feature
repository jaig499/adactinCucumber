Feature: To validate the Login and Booking functionality of adactin.com

Background: 
Given User has to be there in adactin.com login page

@login
Scenario: To verify user can able to login with valid login details

When User has to enter UN and PW
|jaig4999|74452Q|
And User has to enter login button 
Then User has to be navigated to adactin.com home page

@booking
Scenario: To verify user can able to fill the details and to book a hotel

When User has to login with valid username and password
And User has to fill the details asked
And User has to click the search button
And User has to click the hotel which they want to select 
And User has to enter the continue button 
And User has to fil the payment details 
|Jaiganesh|P|45, string street, Dublin. Ireland|1234567891234567|404|
And User has to click the booknow button 
Then User must be able to get the Order number in hand