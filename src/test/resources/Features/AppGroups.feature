@SheetAPPGROUPS
Feature: APPGROUPS

#@Test
#Scenario: TC001_Verify all tooltips on App Groups List page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page 
#Then verify all tooltips on App Groups List page
#
#@Test
#Scenario: TC002_Verify all tooltips on App Groups Add page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on add button to navigate on Add page of app groups
#Then verify all tooltips on App Groups Add page


#@Test
#Scenario: TC003_Verify add functionality of App Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#When the user enters valid details for the new App Group
#And clicks on the Save button
#And verify display a success message "App Group added successfully"
#And verify the newely added App Group should appear in the list of App Groups

#@Test
#Scenario: TC004_Verification of redirection functionality for Cancel icon in Add screen of App Groups module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#When the user enters valid details for the new App Group
#Then verify Cancel icon should be visible on add screen of App Groups page

#
#@Test
#Scenario: TC005_Verification of Validation error message for a blank input text field of AppGroupName under Identity section of User Add screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#Then User leaves the input text field blank for App Group Name
#And clicks on the Save button
#Then verify validation message should appear for the blank input field for App Group Name


#@Test
#Scenario: TC006_Verification of Validation error message for a blank input text field of AppGroup Display Name under Identity section of User Add screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#Then User leaves the input text field blank for App Group Display Name 
#And clicks on the Save button
#Then verify validation message should appear for the blank input field for App Group Display Name

#
#@Test
#Scenario: TC007_Verify search functionality for App Group Name invalid search query
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#When user click on the kebab menu next to the App Group Name
#And user type invalid search query in the search bar of App Group Name
#Then verify user should see a message saying "No results found" for app Groups

#@Test
#Scenario: TC008_Verify search functionality for App Group Display Name invalid search query
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#When user click on the kebab menu next to the App Group Display Name
#And user type invalid search query in the search bar of App Group Display Name
#Then verify user should see a message saying "No results found" for app Group Display Name

#@Test
#Scenario: TC009_Verify labels on app groups add page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#And User verifies that all required text fields with correct labels are present


#
#@Test
#Scenario: TC010_Validation of error message for entering Minimum character limit less than 2 for App Group Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#Then User enters a value for entering Minimum character limit inside App Group Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 32 are allowed ! on App group add page




#@Test
#Scenario: TC011_Validation of error message for entering Minimum character limit less than 2 for App Group Display Name on Add page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#Then User enters a value for entering Minimum character limit inside App Group Display Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 32 are allowed ! for App Group Display name

#@Test
#Scenario: TC012_Validation of error message for entering invalid App Group Name on Add Page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#Then User enters invalid value under App Group Name  under Identity section 
#Then user clicks on the save button
#Then verify validation message should say Please enter a valid App Group Name!


#@Test
#Scenario: TC013_Validation of error message for entering invalid App Group Display Name on Add page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on the add button to navigate to the Add page of App Groups
#Then User enters invalid value under App Group Display Name  under Identity section 
#Then user clicks on the save button
#Then verify validation message should say Please enter a valid App Group Display Name!


#
#@Test
#Scenario: TC014_Validation of error message for entering Minimum character limit less than 2 for App Group Display Name on Edit page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then remove existing text for App Group Name
#Then User enters a value for entering Minimum character limit inside App Group Display Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 32 are allowed ! on edit page of App Groups

#@Test
#Scenario: TC015_Validation of error message for entering invalid App Group Name on Edit Page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then remove existing text for App Group Name
#Then User enters a value for entering Minimum character limit inside App Group Name input field
#Then user clicks on the save button
#Then verify validation message should say Please enter a valid App Group Name!on edit page of App Groups
#
#
#@Test
#Scenario: TC016_Validation of error message for entering invalid App Group Display Name on Edit page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then remove existing text for App Group Name
#Then User enters invalid value under App Group Display Name  under Identity section 
#Then user clicks on the save button
#Then verify validation message should say Please enter a valid App Group Display Name!
#
#
#@Test
#Scenario: TC017_Verify labels on app groups edit page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then click on Edit button 
#And User verifies that all required text fields with correct labels are present on Edit page

#
#@Test
#Scenario: TC018_Validation of error message for entering Minimum character limit less than 2 for App Group Name on Edit page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then remove existing text for App Group Name
#Then User enters a value for entering Minimum character limit inside App Group Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 32 are allowed ! on edit page
#
#
#
#
#@Test
#Scenario: TC019_Validation of error message for entering Minimum character limit less than 2 for App Group Display Name on Edit page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then remove existing text for App Group Name
#Then User enters a value for entering Minimum character limit inside App Group Display Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 32 are allowed !on edit page for AppGroupDisplayName
#
#
#@Test
#Scenario: TC020_Verification of switching between inputs fields using TAB
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then verify switching between input field using TAB

#
#
#@Test
#Scenario: TC021_Verification of sorting feature on App groupName
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verify sorting on App Group Name



#@Test
#Scenario: TC022_Verification of sorting feature on App GroupDisplayName
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verify sorting on App Group Display Name

#
#@Test
#Scenario: TC023_Verification of sorting feature on status
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verify sorting on status

#
#@Test
#Scenario: TC024_Verification of reduction in the number of records in pagination section of App Groups details screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verification of Click on App Groups pagination it will display records will display
#
#@Test
#Scenario: TC025_Verification of changing the items per page functionality in the App Groups List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verification of Click on App Groups pagination it will display records will display
#
#@Test
#Scenario: TC026_Verification of displaying the items per page by default i.e. 25 per page in the App Groups List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verification of Click on App Groups pagination it will display records will display
#
#@Test
#Scenario: TC027_Verification of displaying the total number of records with pagination icons in the App Groups List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verification of Click on deployment pagination it will display records will display

#@Test
#Scenario: TC028_Verification of displaying the First page (Full Backward arrow) button in the App Groups List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verify to Click on pagination to check functionality of Full Backward arrow

#@Test
#Scenario: TC029_Verification of displaying the Last page (Full Forward arrow button in the App Groups List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verify to Click on App Groups pagination to check full forward arrow
#
#@Test
#Scenario: TC030_Verification of displaying the Next page (Forward arrow button in the App Groups List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then verify Click on App Groups pagination it will display records will display

#@Test
#Scenario: TC031_Verification of edit functionality of App Groups page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on Edit button 
#Then User enters a value for App Group and App Group Display Name input field
#Then user clicks on the save button
#Then verify display a success message "App Group updated successfully" while editing app groups


#@Test
#Scenario: TC032_Verification of delete functionality of App Groups page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then search for App name and click on delete button 
#Then user will accept confirmation message saying "Are you sure you want to delete this item" and click on "Yes" button
#Then verify display a success message "App Group deleted successfully" while deleting app groups

#
#@Test
#Scenario: TC033_Verification of download functionality of App Groups page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on download button 
#Then verify display a success message "Downloading successful" while downloading app groups


#@Test
#Scenario: TC033_Verification of download functionality of App Groups page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on download button 
#Then verify display a success message "Downloading successful" while downloading app groups

#@Test
#Scenario: TC034_Verification of refresh functionality of App Groups page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on refresh button 
#Then the page or list should be refreshed successfully


#@Test
#Scenario: TC035_Verification of sorting feature on select column on Add Applications page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on Add application icon from the action column
#Then verify sorting on select column
#
#
#@Test
#Scenario: TC036_Verification of sorting feature on application column on Add Applications page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on Add application icon from the action column
#Then verify sorting on application column


#@Test
#Scenario: TC037_Verification of sorting feature on architecture column on Add Applications page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on Add application icon from the action column
#Then verify sorting on architecture column


#@Test
#Scenario: TC038_Verification of sorting feature on version/Tag column on Add Applications page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on Add application icon from the action column
#Then verify sorting on version column


#
#@Test
#Scenario: TC039_Verification of sorting feature on status column on Add Applications page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on Add application icon from the action column
#Then verify sorting on status column

#@Test
#Scenario: TC040_Verification of all tooltips on Add Applications page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user on the App Groups page
#Then click on Add application icon from the action column
#Then verify all tooltips on Add Application page


@Test
Scenario: TC041_verification of mapping application on App Group page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Given the user on the App Groups page
Then click on Add application icon from the action column
Then user search for the application by name
Then user select the application that the user needs
Then user click on the "Save" button
Then user should see a "Mapping save successfully" message



