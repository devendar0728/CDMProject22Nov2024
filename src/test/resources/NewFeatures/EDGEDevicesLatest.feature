@SheetEDGEDEVICESNEW
Feature: EdgeDevicesNew
#
#@Test
#Scenario: TC001_Verify Add New Edge Device page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then User clicks on the ADD New button at the top right and lands on the EDGE ADD screen
#And User verifies that all required text fields and dropdown with correct labels are present
#
#
#@Test
#Scenario: TC002_Verify Add New Edge Device
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then User clicks on the ADD New button at the top right and lands on the EDGE ADD screen
#And User enters valid values for all required text fields and selects right values from dropdown
#And user clicks on the save button
#And After landing on the EDGE Device List screen, the user verifies the list view
#And Verify that newly added device is displayed in the edge device list view
#
#@Test
#Scenario: TC003_search all columns of Edge Devices
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Choose inactive mode from status column
#Then scroll mouse toward left hand side 
#Then Click on EDGE ID name search icon i.e. three dots & enter one of the existing EDGE ID 
#Then Verify the row with the EDGE ID Provided is return
#Then Remove the EDGE ID name search field
#Then Click on EDGE Name search icon i.e. three dots & enter one of the existing EDGE Name 
#Then Verify the row with the EDGE Name Provided is return
#Then Remove the EDGE Name search field
#Then Click on EDGE Group name search icon i.e. three dots & enter one of the existing Edge Group Name
#Then Verify the row with the EDGE Group Name Provided is return
#Then Remove the Edge Group Name search field
#Then Click on APP Group name search icon i.e. three dots & enter one of the existing App Group Name
#Then Verify the row with the App Group Name Provided is return
#Then Remove the App Group name search field
#Then Click on Hardware name search icon i.e. three dots & enter one of the existing Hardware Name
#Then Verify the row with the Hardware Name Provided is return
#Then Remove the Hardware name search field
#
#
#
#@Test
#Scenario: TC004_Communication Status column Checkbox Functionality under Edge Device
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Choose inactive mode from status column
#Given I am on the Communication Status page
#When I check the "Connected" checkbox
#Then the "Connected" checkbox should be checked
#When I uncheck the "Connected" checkbox
#Then the "Connected" checkbox should be unchecked
#When I check the "Disconnected" checkbox
#Then the "Disconnected" checkbox should be checked
#When I uncheck the "Disconnected" checkbox
#Then the "Disconnected" checkbox should be unchecked
#When I check the "Edge Disconnected" checkbox
#Then the "Edge Disconnected" checkbox should be checked
#When I uncheck the "Edge Disconnected" checkbox
#Then the "Edge Disconnected" checkbox should be unchecked
#When I check the "Broker Disconnected" checkbox
#Then the "Broker Disconnected" checkbox should be checked
#When I uncheck the "Broker Disconnected" checkbox
#Then the "Broker Disconnected" checkbox should be unchecked

@Test
Scenario: TC005_Check pagination on Edge Device Page
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on EDGE Device module from side menu bar
And scroll horizontal to see status column
Then Choose inactive mode from status column
Then Click on Pagination is in footer Below left side
Then After pagination all default records will display in Next page.
Then check full backward functionality is working
Then After pagination all default records will display in Previous page. 
#
#@Test
#Scenario: TC006_Verification of error message verbaige for entering invalid details Under Identity accordion
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify error message verbaige for entering invalid details for EDGE Name Text field in ADD screen
#Then Verification of error message verbaige for entering invalid details for EDGE GROUP NAME
#Then Verification of error message verbaige for entering invalid details for Organisation
#Then Verification of error message verbaige for entering invalid details for Organisation
#Then Verification of error message verbaige for entering invalid details for Hardware Name
#Then close identity accordion
#
#
#@Test
#Scenario: TC007_Verification of error message without entering details Under Identity accordion
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify error message verbaige for not entering details for EDGE ID Text field in ADD screen
#Then verify error message verbaige for not entering details for EDGE Name Text field in ADD screen
#Then Verification of error message verbaige for not selecting details for EDGE GROUP NAME
#Then Verification of error message verbaige for not selecting details for Organisation
#Then Verification of error message verbaige for not selecting details Hardware Name
#
#@Test
#Scenario: TC007_Verification of error message by entering invalid details Under Identity accordion
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify error message verbaige for entering invalid details for EDGE ID Text field in ADD screen
#Then verify error message verbaige for entering invalid details for EDGE Name Text field in ADD screen
#
#
