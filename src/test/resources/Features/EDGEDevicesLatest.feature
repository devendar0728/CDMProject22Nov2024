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
#Then Choose inactive checkbox from status column
#Then scroll mouse toward left-hand side 
#Then Click on EDGE ID name search icon i.e. three dots & enter Valid inputs into search text field 
#Then Verify all the rows having the EDGE ID Provided are returned
#Then Remove the EDGE ID name search field
#Then Click on EDGE Name search icon i.e. three dots & enter one of the existing EDGE Name
#Then Verify all the rows with the EDGE Name Provided are returned
#Then Remove the EDGE Name search field
#Then Click on EDGE Group name search icon i.e. three dots & enter one of the existing Edge Group Name
#Then Verify all the rows with the EDGE Group Name Provided are returned
#Then Remove the Edge Group Name search field
#Then Click on APP Group name search icon i.e. three dots & enter one of the existing App Group Name
#Then Verify all the rows with the App Group Name Provided are returned
#Then Remove the App Group name search field
#Then Click on Hardware name search icon i.e. three dots & enter one of the existing Hardware Name
#Then Verify all the rows with the Hardware Name Provided are returned
#Then Remove the Hardware name search field
#

#@Test
#Scenario: TC004_Verification of the search functionality for Communication status column (Valid Communication status with Connected entry) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Given user is on the Communication Status page
#When user select the checkbox for a valid Communication Status entry "Connected"
#Then verify only devices with the "Connected" Communication Status should be displayed in the list
    
#@Test
#Scenario: TC005_Verification of the search functionality for Communication status column (Valid Communication status Disconnected entry) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Given user is on the Communication Status page
#When user select the checkbox for a valid Communication Status entry "Disconnected"
#Then verify only devices with the "Disconnected" Communication Status should be displayed in the list
#
#@Test
#Scenario: TC006_Verification of the search functionality for Communication status column (Valid Communication Edge Disconnected status entry) in the EDGE Device List screen by Super admin/Admin users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Given user is on the Communication Status page
#When user select the checkbox for a valid Communication Status entry "Edge Disconnected"
#Then verify only devices with the "Edge Disconnected" Communication Status should be displayed in the list    
#
#@Test
#Scenario: TC007_Verification of the search functionality for Communication status column (Valid Communication Broker Disconnected status entry) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Given user is on the Communication Status page
#When user select the checkbox for a valid Communication Status entry "Broker Disconnected"
#Then verify only devices with the "Broker Disconnected" Communication Status should be displayed in the list 
#
#
#@Test
#Scenario: TC08_Verification of tooltip functionality for Edit icon in Actions column of the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see action column
#When User mousehovers on the EDIT icon button
#Then verify Tooltip should appear for Edit icon
#
#
#@Test
#Scenario: TC009_Display icons based on checkbox selection on status column of Edge Device List Page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see action column
#And deselect checkbox for Active
#When user select the "Inactive" checkbox in the status column
#Then should see 3 icons in the action column
#
#@Test
#Scenario: TC010_Verification of the removal of search results and text for EDGE ID column in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Given User has applied a search filter on the EDGE ID column
#And The search results are displayed on the EDGE Device List screen
#When User clears the search filter
#Then verify EDGE Device List screen should be reset to show with all Edge ID
#
#@Test
#Scenario: TC011_Verification of the removal of search results and text for EDGE Name column in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Given User has applied a search filter on the EDGE Name column
#And The search results are displayed on the EDGE Device List screen
#When User clears the search filter on Edge Name
#Then verify EDGE Device List screen should be reset to show with all Edge Name
#@Test
#Scenario: TC012_Verification of the removal of search results and text for EDGE Group Name column in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Given User has applied a search filter on the EDGE Group Name column
#And The search results are displayed on the EDGE Device List screen
#When User clears the search filter on Edge Group Name
#Then verify EDGE Device List screen should be reset to show all devices with all the Edge Group Name
#
#
#@Test
#Scenario: TC013_Verification of the removal of search results and text for App Group Name column in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Given User has applied a search filter on the App Group Name column
#And The search results are displayed on the EDGE Device List screen
#When User clears the search filter on App Group Name
#Then verify EDGE Device List screen should be reset to show all devices with app groups


#@Test
#Scenario: TC014_Verification of the removal of search results and text for Hardware Name column in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Given User has applied a search filter on the Hardware Name column
#And The search results are displayed on the EDGE Device List screen
#When User clears the search filter on hardware name
#Then verify EDGE Device List screen should be reset to show all devices with hardware
#
#
#@Test
#Scenario: TC015_ Verify the presence of the Refresh button, Add button, Bulk Upload, Bulk Download, Bulk Application Configuration icons on top right side of EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then verify Refresh button should be visible on the top right side of the screen
#Then verify Add button should be visible on the top right side of the screen
#Then verify Bulk Upload button should be visible on the top right side of the screen
#Then verify Bulk Download button should be visible on the top right side of the screen
#Then verify Bulk Application Configuration button should be visible on the top right side of the screen

#
#@Test
#Scenario: TC016_Verification of all button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#When user clicks on Bulk Download button at the top right side of the screen
#Then verify user see download successful message and file should get downloaded
#When user clicks on Bulk Application Configuration button at the top right side of the screen
#Then verify user should be redirected to the Bulk Application Configuration Device screen
#When user clicks on Add button at the top right side of the screen
#Then verify user should be redirected to the Add EDGE Device screen
#When user clicks on Bulk upload button at the top right side of the screen
#When user upload csv file and click on upload button
#Then verify user should see popup screen for Bulk upload
#Then click on cancel button from the popup of EDGE Device Bulk Upload
#When user clicks on Refresh button at the top right side of the screen
#Then verify Edge Device List should get refreshed

#@Test
#Scenario: TC017_Verification of all tooltip functionality under action columns of Edge Device List 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see actions column
#When User hovers over the Edit icon under the Action column 
#Then verify tooltip should be displayed for Edit button
#When User hovers over the Delete icon under the Action column 
#Then verify tooltip should be displayed for Delete button
#When User hovers over the Config Apps icon under the Action column 
#Then verify tooltip should be displayed for Config Apps button
#When User hovers over the Info icon under the Action column 
#Then verify tooltip should be displayed for Info button
#When User hovers over the Deploy Apps icon under the Action column 
#Then verify tooltip should be displayed for Deploy Apps button

#
#@Test
#Scenario: TC18_Verification of sorting feature on all column of EDGE Device List page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then verify Edge ID sorting
#Then verify EDGE Name sorting
#Then verify EDGE Group Name sorting
#Then verify App Groups sorting
#Then verify Hardware Name sorting
#Then verify Communication Status sorting
#Then verify Status sorting


#
#@Test
#Scenario: TC019_Verification of redirection functionality for Cancel icon in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then verify Cancel icon should be visible on add screen of Edge Device page
#And verify Cancel icon should be clickable and page should be redirected on Edge Device List page 
#
#@Test
#Scenario: TC020_Verification of Validation error message for a blank input text field of EDGE ID under Identity section of User Add screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User leaves the input text field blank
#Then user clicks on the save button
#Then verify validation message should appear for the blank input field
#
#@Test
#Scenario: TC021_Validation of error message for exceeding character limit for Edge ID
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User enters a value exceeding the maximum character limit inside Edge ID input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 64 are allowed !
#
#@Test
#Scenario: TC022_Validation of error message for entering invalid Edge ID
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User enters invalid value under Edge ID under Identity section 
#Then user clicks on the save button
#Then verify validation message should say Please enter a valid Edge ID!


#@Test
#Scenario: TC023_Validation of error message for entering invalid Edge Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User enters invalid value under Edge ID under Identity section 
#Then user clicks on the save button
#Then verify validation message should say Please enter a valid Edge Name!

#@Test
#Scenario: TC024_Validation of error message for exceeding character limit for Edge Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User enters a value exceeding the maximum character limit inside Edge Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 64 are allowed !


#@Test
#Scenario: TC025_Verification of Validation error message for a blank input text field of EDGE ID under Identity section of User Add screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User leaves the input text field blank
#Then user clicks on the save button
#Then verify validation message should appear for the blank input field
#
#@Test
#Scenario: TC026_Validation of error message for exceeding character limit for Edge Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User enters a value exceeding the maximum character limit inside Edge Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 64 are allowed !

#@Test
#Scenario: TC027_Verification of Validation error message for a blank input text field of EDGE Name under Identity section of User Add screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User leaves the input text field blank
#Then user clicks on the save button
#Then verify validation message should appear for the blank input field

#@Test
#Scenario: TC028_Validation of error message for entering Minimum character limit less than 2 for Edge Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then User enters a value for entering Minimum character limit inside Edge ID input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 64 are allowed !

#@Test
#Scenario: TC029_Validation of error message if user leaves the mandatory organization dropdown field unselected under identity accordion
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#When User does not select any value from the organization mandatory dropdown field
#Then user clicks on the save button
#Then A validation message should appear for the mandatory organization dropdown field


#@Test
#Scenario: TC030_Validation of error message if user leaves the mandatory Edge Group Name dropdown field unselected under identity accordion
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#When User does not select any value from the mandatory Edge Group Name dropdown field
#Then user clicks on the save button
#Then A validation message should appear for the mandatory Edge Group Name dropdown field


#@Test
#Scenario: TC031_Validation of error message if user leaves the mandatory Hardware Name dropdown field unselected under identity accordion
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#When User does not select any value from the mandatory Hardware Name dropdown field
#Then user clicks on the save button
#Then A validation message should appear for the mandatory Hardware Name dropdown field


#@Test
#Scenario: TC032_Validation of error message if user leaves the mandatory App Group Name dropdown field unselected under deployment accordion
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#When User does not select any value from the mandatory App Group Name dropdown field
#Then user clicks on the save button
#Then A validation message should appear for the mandatory App Group Name dropdown field
#
#
#@Test
#Scenario: TC033_Verification of entry of valid data for all the text fields (Mandatory & Optional) in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#When user enters valid data in all mandatory and optional text fields under identity accordion 
#When user enters valid data in serial number, onboarding key ,image version as optional field under registration accordion
#When user select App group dropdown value under deployment accordion
#When user enters valid data in Edge username and Edge password under the well mapping accordion
#Then user clicks on the save button
#And verify success message should be displayed


#@Test
#Scenario: TC034_Verification of Validation error message for a blank input text field of EDGE Name under Identity section of User Edit screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then search Edge Name from existing Edge device and click on Edit button from the action column
#When User clears the EDGE Name field under the Identity section
#Then user clicks on the save button
#Then verify validation message should appear for the blank input field of Edge Name

#@Test
#Scenario: TC035_Verification of no validation error message for a blank input text field of Edge Username,password under well mapping of User Edit screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then search Edge Name from existing Edge device and click on Edit button from the action column
#When User clears the edge username and password
#Then user clicks on the save button
#Then verify no validation error message should be displayed for Edge Username, password under well mapping of User Edit screen


#@Test
#Scenario: TC036_Verification of no validation error message for a blank input text field of Location and Description under identity accordion of User Edit screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then search Edge Name from existing Edge device and click on Edit button from the action column
#When User clears the Location and Description field under identity
#Then user clicks on the save button
#Then verify no validation error message should be displayed for Location and Description of User Edit screen

#
#@Test
#Scenario: TC037_Validation of error message for exceeding character limit for Edge Name under Identity section of User Edit screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then search Edge Name from existing Edge device and click on Edit button from the action column
#When User clears the EDGE Name field under the Identity section
#Then User enters a value exceeding the maximum character limit inside Edge Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 64 are allowed !


#@Test
#Scenario: TC038_Validation of error message for entering invalid Edge Name under Identity section of User Edit screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then search Edge Name from existing Edge device and click on Edit button from the action column
#When User clears the EDGE Name field under the Identity section
#Then User enters invalid value under Edge Name under Identity section 
#Then user clicks on the save button
#Then User enters invalid value under Edge Name under Identity section
#
#@Test
#Scenario: TC039_Validation of error message for entering Minimum character limit less than 2 for Edge Name under Identity section of User Edit screen 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on Edit button from the action column
#When User clears the EDGE Name field under the Identity section
#Then User enters a value for entering Minimum character limit inside Edge Name input field
#Then user clicks on the save button
#Then verify The validation message should say Alphanumeric of length Min = 2, Max = 64 are allowed !


#@Test
#Scenario: TC040_verify all tooltips on Edge Edit screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on Edit button from the action column
#Then verify all tooltips on Edge Edit screen


#@Test
#Scenario: TC041_verify all tooltips on Edge Add screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then User clicks on the ADD New button at the top right and lands on the EDGE ADD screen
#Then verify all tooltips on Edge Add screen


#@Test
#Scenario: TC042_Verify user is landing on application selection for deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device to deply app
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then Select the check box next to the name of each application you want to deploy to the EDGE.

#@Test
#Scenario: TC043_Verify each application has three actions available having Restart, Purge, Activate
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device to deply app
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify each application has three actions available having Restart, Purge


#@Test
#Scenario: TC044_Verify user should be able to proceed with the deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device to deply app
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then Select the check box next to the name of each application you want to deploy to the EDGE.
#When User clicks on the "Next" button at step 4 (App Name)
#Then The user should be navigated to step 5 (Deployment)
#When User clicks on the "Confirm" button to approve the selections
#Then verify "Deploy" button should become activated
#And verify user should be able to proceed with the deployment
#
#@Test
#Scenario: TC045_Verify no hyperlink provided on step1 step2 and step3
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#Then verify Steps 1 (EDGE Groups), 2 (APP Groups), 3 (EDGE) should be disabled
#Then verify Step 4 (App Name) should be highlighted as the active step

#
#@Test
#Scenario: TC046_Verify to review the JSON file configuration and expand it by selecting the Expand icon under Step 5 (Deployment)
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device to deply app
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then Select the check box next to the name of each application you want to deploy to the EDGE.
#When User clicks on the "Next" button at step 4 (App Name)
#Then The user should be navigated to step 5 (Deployment)
#Then Select Click to expand the JSON file configuration Expand to maximize the JSON file configuration.

#
#
#@Test
#Scenario: TC047_Verify to review the JSON file configuration and minimize it by selecting the Collapse icon under Step 5 (Deployment)
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device to deply app
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then Select the check box next to the name of each application you want to deploy to the EDGE.
#When User clicks on the "Next" button at step 4 (App Name)
#Then The user should be navigated to step 5 (Deployment)
#Then Select Click to collapse icon to minimize the JSON file configuration.

#
#
#@Test
#Scenario: TC048_Verify all tooltips under Application Deployment Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#Then click on Previous button to verify tooltip for Edge, Status and also verify tooltip for Restart checkbox tooltip under Actions column under Step3(EDGE)

#
#
#@Test
#Scenario: TC049_Verify search functionality for invalid search query under Application Deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#When user click on the kebab menu next to the App Name
#And user type an invalid search query in the search bar of App Name
#Then verify user should see a message saying "No results found"

#
#@Test
#Scenario: TC050_Verify search functionality for valid search query under Application Deployment 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#When user click on the kebab menu next to the App Name
#And user type valid search query in the search bar of App Name
#Then verify search results of App Name should be relevant to the query entered

#
#
#@Test
#Scenario: TC051_Verify search functionality for Edge invalid search query under Application Deployment 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#Then click on previous button to visit EDGE Stepper
#When user click on the kebab menu next to the Edge
#And user type invalid search query in the search bar of EDGE
#Then verify user should see a message saying "No results found"
#
#
#@Test
#Scenario: TC052_Verify search functionality for App Groups valid search query under Application Deployment 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#Then click on previous button to visit EDGE Stepper
#Then click on previous button to visit App Groups
#When user click on the kebab menu next to the App Groups
#And user type valid search query in the search bar of App Groups
#Then verify search results of App Groups should be relevant to the query entered
#
#
#@Test
#Scenario: TC053_Verify search functionality for App Groups invalid search query under Application Deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#Then click on previous button to visit EDGE Stepper
#Then click on previous button to visit App Groups
#When user click on the kebab menu next to the App Groups
#And user type invalid search query in the search bar of App Groups
#Then verify user should see a message saying "No results found"
#
#
#
#@Test
#Scenario: TC054_Verify search functionality for Edge Group valid search query under Application Deployment 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#Then click on previous button to visit EDGE Stepper
#Then click on previous button to visit App Groups
#Then click on previous button to visit Edge Groups
#When user click on the kebab menu next to the Edge Groups
#And user type valid search query in the search bar of Edge Groups
#Then verify search results of Edge Groups should be relevant to the query entered
#
#
#@Test
#Scenario: TC055_Verify search functionality for Edge Group invalid search query under Application Deployment 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search Edge Name from existing Edge device and click on deploy button from the action column
#Then click on previous button to visit EDGE Stepper
#Then click on previous button to visit App Groups
#Then click on previous button to visit Edge Groups
#When user click on the kebab menu next to the Edge Groups
#And user type valid search query in the search bar of Edge Groups
#Then verify user should see a message saying "No results found"


