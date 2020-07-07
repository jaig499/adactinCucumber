Feature: To validate hotel cancelling functionality
Scenario: To verify user can able to cancel the booking order

Given User has to be there on adactin login page
When User has to click on Booked Itinerary
And User has to copy and paste the order Id in search order ID
And User has to click on go
And User need to click on check box for cancelling an order 
And User need to click on Cancel Selected button 
And User need to handle the pop up to selecting either OK or Cancel
Then User should be navigated back to Booked Itinerary page 