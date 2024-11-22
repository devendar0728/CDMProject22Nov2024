@SheetEDGEDEVICESNEW
Feature: EDGE Devices
#
#@Test
#Scenario: TC01_Verification of Browser Compatibility of EDGE Device module of the application
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And Successfull login should be happen
#
#@Test
#Scenario: TC02_Verification of resizing the EDGE Device module as per different zoom levels
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then verify page with resize option the login page
#
#@Test    
#Scenario: TC03_Verification of displaying the EDGE Device table details after clicking on EDGE Device module option from side menu bar by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar

#
#
#@Test
#Scenario: TC04_Verification of displaying the Add button, Refresh, Application configuration,Bulk Upload & Download button icons on top right side of EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verify all buttons are working
#
@Test
Scenario: TC05_Verification of Refreshing button functionality in the EDGE Device List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on EDGE Device module from side menu bar
Then After landing on EDGE Device List screen, and Click on Refresh button on the top right side
#
#@Test
#Scenario: TC06_Verification of Add button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen, Click on ADD New button on the top right side
#
#
#@Test
#Scenario: TC07_Verification of Search button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen, Click on Search bar after entering data
#
#@Test
#Scenario: TC08_Verification of Bulk Application Configuration button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Bulk Application Configuration icon button on the top right side.
#
#
#@Test
#Scenario: TC09_Verification of Bulk download button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen Click on bulk Download icon button on the top right side
#
#
#@Test
#Scenario: TC010_Verification of displaying the Edit screen in the EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#
#@Test
#Scenario: TC011_Verification of Delete functionality in the EDGE Device List screen by Super admin/Admin user (If few devices are interlinked with other module)
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on DELETE icon button
#Then confirmation message appear on the Screen for deletion with option Yes or No
#
#@Test
#Scenario: TC012_Verification of Delete functionality in the EDGE Device List screen by Super admin/Admin user (If few devices are not linked with other module)
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Name search icon i.e. three dots & enter Valid inputs into search text field.
#Then After landing on EDGE Device List screen scroll horizontal and Click on DELETE icon button
#Then confirmation message appear on the Screen for deletion with option Yes or No
#
#@Test
#Scenario: TC013_Verification of tooltip functionality for Edit icon in Actions column of the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then After landing on EDGE Device List screen please Mousehover on EDIT icon button
#
#@Test
#Scenario:  TC014_Verification of tooltip functionality for Delete icon in Actions column of the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then After landing on EDGE Device List screen please Mousehover on DELETE icon button
#
#@Test
#Scenario: TC015_Verification of tooltip functionality for View Alert(s) icon in Actions column of the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Hover the mouse pointer View ALERTS icon Button in ACTIONS columns
#
#@Test  
#Scenario: TC016_Verification of reduction in the number of records in pagination section of EDGE details screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Pagination is in footer Below left side
#
#@Test
#Scenario: TC017_Verification of changing the items per page functionality in the EDGE Device List screen by Super admin/Admin user 
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Pagination is in footer Below left side
#
#@Test
#Scenario: TC018_Verification of displaying the items per page by default i.e. 25 per page in the EDGE Device List screen by Super admin/Admin user 
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Pagination is in footer Below left side
#
#@Test
#Scenario: TC019_Verification of displaying the total number of records with pagination icons in the EDGE Device List screen by Super admin/Admin user 
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After pagination all default records will display
#
#@Test
#Scenario: TC020_Verification of displaying the First page (Full Backward arrow) button in the EDGE Device List screen by Super admin/Admin user 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then check full backward functionality is working
#
#@Test
#Scenario: TC021_Verification of displaying the Last page (Full Forward arrow button in the EDGE Device List screen by Super admin/Admin user 
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After pagination all default records will display in Last page. 
#
#@Test
#Scenario: TC022_Verification of displaying the Next page (Forward arrow button in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After pagination all default records will display in Next page.
#
#@Test
#Scenario: TC023_Verification of displaying the Previous page (Backward arrow button in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After pagination all default records will display in Previous page. 
#
#@Test
#Scenario: TC024_Verification of the search functionality for EDGE ID column in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID name search icon i.e. three dots & enter Valid inputs into search text field
#
#@Test
#Scenario: TC025_Verification of the search functionality for EDGE Group Name column (Valid Group Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field
#
#@Test
#Scenario: TC026_Verification of the search functionality for EDGE Group Name column (Invalid Group Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Group name search icon i.e. three dots & enter invalid inputs into search text field
#
#@Test
#Scenario: TC027_Verification of the search functionality for EDGE Name column (Valid Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Name search icon i.e. three dots & enter Valid inputs into search text field.
#
#@Test
#Scenario: TC028_Verification of the search functionality for App Group column (Valid App Group) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar 
#Then Click on APP Group name search icon i.e. three dots & enter Valid inputs into search text field.
#
#@Test
#Scenario: TC029_Verification of the search functionality for Hardware Name (Valid HardWare Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And Click on HardWare Name Dots
#Then enter value for HardWare Name
#
#@Test
#Scenario: TC030_Verification of the search functionality for Health status column (Valid Health status entry) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#
#
#
#@Test
#Scenario: TC031_Verification of the search functionality for Communication status column (Valid Communication status entry) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar 
#And scroll horizontal to see status column
#Then Click on Communication Status search icon i.e. three dots & select desire communication status for edge
#
#
#@Test
#Scenario: TC032_Verification of the change in colour of three dots for all columns in the EDGE Device List screen by Super admin/Admin user when search filter is applied
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then verify the colour of three dots 
#
#@Test
#Scenario: TC033_Verification of the display of search bar and text for all columns in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Enter valid inputs as per required from table details into search text field and enter backspace & click on enter
#
#@Test
#Scenario: TC034_Verification of the removal of search results and text for all columns in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Enter valid inputs as per required from table details into search text field and enter backspace & click on enter
#
#
#@Test
#Scenario: TC035_Verification of the search functionality for overall table in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Enter valid inputs as per required from table details into search text field and enter backspace & click on enter
#
#@Test
#Scenario: TC036_Verification of blank value rejections in available fields of Identity section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#
#@Test
#Scenario: TC037_Verification of blank value rejections in available fields of Health section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#And scroll horizontal to see status column
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#
#@Test
#Scenario: TC038_Verification of blank value rejections in available fields of Registration & Licence sections in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#Then scroll up
#
#@Test
#Scenario: TC039_Verification of blank value rejections in available fields of Deployment section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#
#@Test
#Scenario: TC040_Verification of redirection functionality for Cancel icon in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then click on cancel button in EDGE>ADD screen
#
#@Test
#Scenario: TC041_Verification of the search functionality in the EDGE Device on Edge Device List Screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search for Edge ID enter the value for Edge ID and Clear Search
#
#
#
#
#
#@Test
#Scenario: TC042_Verification of entry of valid data for all the text fields (Mandatory & Optional) in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#And enter valid values for all text fields
#Then click on save button to add Edge

#@Test
#Scenario: TC043_Verification of the acceptance of Numeric values in EDGE ID Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Enter numeric values to check character strength into EDGE ID text fields

#@Test
#Scenario: TC044_Verification of the acceptance of Alphanumeric and special characters values in EDGE Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Enter alphanumeric with special char values to check character strength into EDGE NAME text fields on Add Screen
#
#
#@Test
#Scenario: TC045_Verification of breaching the Max character limit in EDGE ID Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#And Enter numeric values to check character strength into EDGE ID text fields
#
#@Test
#Scenario: TC046_Verification of breaching the Max character limit in EDGE  Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Enter alphanumeric with special char values to check character strength into EDGE NAME text fields on Add Screen
#
#@Test
#Scenario: TC047_Verification of selection of the from organization drop down in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Click & select options from Organization drop down
#
#@Test
#Scenario: TC048_Verification of selection of the from EDGE Group Name drop down in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#And Click & select options from EDGE Group Name drop down
#
#@Test
#Scenario: TC049_Verification of enter Serial number Registration section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Scroll down page go to the registration section of add screen and enter value for onboarding Key
#
#@Test	
#Scenario: TC050_Verification of editing the onboarding key in Registration section in Edit screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Scroll down page go to the registration section of Edit screen and enter value for onboarding Key
#
#@Test
#Scenario: TC051_Verification of upload of onboarding configuration file in Registration section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then verify upload functionality for onboarding configuration
#
#@Test
#Scenario: TC052_Verification of download of onboarding configuration file in Registration section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then check download feature for onboarding configuration
#
#@Test
#Scenario: TC053_Verification of modify the value in available mandatory fields of Identity section in EDIT screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then modify the value of mandatory field of Identity Section
#
#@Test
#Scenario: TC054_Verification of modify value in available optional text fields of Identity section in EDIT screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then modify the value of optional field of Identity section
#
#@Test
#Scenario: TC055_Verification of breaching the Max character limit in EDGE ID Text field in the Identity section of User EDIT Screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#
#
#@Test
#Scenario: TC056_Verification of breaching the Max character limit in EDGE NameText field in the Identity section of User EDIT Screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Enter alphanumeric with special char values to check character strength into EDGE NAME text fields in update field
#
#@Test
#Scenario: TC057_Verification of Viewing of all the steppers & select the application to deploy application in Individual EDGE Device module by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#
#@Test
#Scenario: TC058_Verification of multiple select of the Active Application for deploy of EDGE module by Super admin/Admin user and Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify application functionality for single select choice
#
#
#@Test
#Scenario: TC059_Verification of Single select of the Active Application for deploy of EDGE module by Super admin/Admin user  & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify application functionality for single select choice
#Then Verify deployment functionality
#
#
#@Test
#Scenario: TC060_Verification of Viewing of all the steppers & select the application configuration on EDGE Device Module by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#When Click on configuration icon button from Action column
#
#
#@Test
#Scenario: TC061_Verification of select the Active Application group for  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on configuration icon button from Action columnn
#Then verify application functionality for configuration
#
#
#@Test
#Scenario: TC062_Verification of select the Active Single EDGE in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on deployment icon button from Action columnn
#Then Check SelectAll checkbox from select column
#
#
#
#@Test
#Scenario: TC063_Verification of select the Active multiple EDGE  for  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on deployment icon button from Action columnn
#Then Check SelectAll checkbox from select column
#
#@Test
#Scenario: TC064_Verification of select the Active Single Application in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on deployment icon button from Action columnn
#Then verify Active Single Edge
#
#@Test
#Scenario: TC65_Verification of user not select the undeployed Application in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#
#@Test
#Scenario: TC66_Verification of select the application configuration in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on configuration icon button from Action columnn
#Then verify application functionality for configuration
#Then click on add icon to add configuration
#
#
#@Test
#Scenario: TC067_Verification of creation of new configuration in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on configuration icon button from Action columnn
#Then verify application functionality for configuration
#Then click on add icon to add configuration
#
#@Test
#Scenario: TC068_Verification of user cannot deploy the configuration without confirmation  in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on configuration icon button from Action columnn
#Then verify application functionality for configuration
#Then click on add icon to add configuration
#
#@Test
#Scenario: TC069_Verification of all deployed configuration are available in configuration list in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify application functionality for single select
#Then Verify deployment functionality
#Then Click on Configurations module from left navigation bar
#
#
#
#@Test
#Scenario: TC070_To verify that user is able to map well which is searched using Well Name
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of well and search for Well Name
#Then Check the checkbox to well map
#Then Click on Save button For Well
#
#
#@Test
#Scenario: TC071_To verify that user is able to map well which is searched using IP Address
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of IPAddress and search for IPAddress
#Then Enter the value for IPAddress
#
#
#@Test
#Scenario: TC072_To verify that user is able to map well which is searched using RTU Address
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress
#
#
#@Test
#Scenario: TC073_To verify that user is able to map well which is searched using Device type
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of DeviceType
#Then Enter the value for DeviceType  
#
#
#
#@Test
#Scenario: TC074_To verify that user is able to map well by applying filter on the RTU Address
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress
#
#
#
#
#@Test
#Scenario: TC075_To verify that user is able to map well in 'Active' status by applying filter on the Status column
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#
#
#
#
#@Test
#Scenario: TC076_To verify that user is able to map well having 'Active' and 'Inactive' Status
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on Status Three Dot and Select the inActive status Checkbox
#
#
#
#
#
#
#@Test
#Scenario: TC077_To verify that user is able to map well having 'Inactive' Status
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#
#
#
#
#@Test
#Scenario: TC078_To verify that user is able to map multiple wells at a time
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress
#Then Check the checkbox to well map
#Then Click on Save button For Well
#
#
#
#@Test
#Scenario: TC079_To verify that user is able to map single wells from each page at a time and observe that they appear at the top of the list once mapping is done
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress
#Then Check the checkbox to well map
#Then Click on Save button For Well
#
#
#
#@Test  
#Scenario: TC080_To verify that a newly created well appears in the Well Mapping list and the user is able to map it to the Edge Device
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Setting tab from left side bar and click on well tab from Navigation menu 
#Then Click on Add button to add new well
#Then Enter the details for Well Name , Port Number , IP Address and choose the Device Type
#Then Click on Save button To Save Well
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field to check well
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Enter the value for Well name to map setting from well module
#
#
#
#@Test
#Scenario: TC081_Verification of error message verbaige for without entering details in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#And verify error message verbaige for without entering details in ADD Screen of Edge Device
#
#
#@Test
#Scenario: TC082_Verification of error message verbaige for entering invalid details for EDGE ID Text field in ADD screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify error message verbaige for without entering details in ADD Screen of Edge Device
#
#
#@Test
#Scenario: TC083_Verification of error message verbaige for entering invalid details for EDGE Name Text field in ADD screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify error message verbaige for entering invalid details for EDGE Name Text field in ADD screen
#
#
#@Test
#Scenario: TC084_Verification of error message verbaige for entering invalid details for Organisation
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for Organisation
#
#
#
#@Test
#Scenario: TC085_Verification of error message verbaige for entering invalid details for EDGE GROUP NAME
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for EDGE GROUP NAME
#
#
#@Test
#Scenario: TC086_Verification of error message verbaige for entering invalid details for Hardware Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for Hardware Name
#
#
#
#
#
#@Test
#Scenario: TC087_Verification of error message verbaige for entering invalid details for App Group Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for App Group Name
#
#
#@Test
#Scenario: TC88_Verification of standarize text format for success message in toaster
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then enter valid values for all text fields
#Then click on save button on add page
#Then verify standarize text format for success message in toaster
#
#
#
#@Test
#Scenario: TC89_Verification of standarize text format for error message in toaster
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then enter valid values for all text fields
#Then click on save button on add page
#Then verify standarize text format for error message in toaster
#
#
#@Test
#Scenario: TC90_Verification of standarize text format for error message below EDGE ID text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify standarize text format for below EDGE ID text field
#
#@Test
#Scenario: TC91_Verification of standarize text format for error message below EDGE Name text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify standarize text format for error message below EDGE Name text field
#
#
#@Test
#Scenario: TC92_Verification of standarize text format for error message below Oraganisation text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify standarize text format for error message below Oraganisation text field
#
#@Test
#Scenario: TC93_Verification of standarize text format for error message below EDGE Group text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#
#
#@Test
#Scenario: TC94_Verification of check filter icon availability for Group Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify standarize text format for error message below EDGE Name text field
#
#
#@Test
#Scenario: TC95_Verification of switching between inputs fields using TAB
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#
#
#@Test
#Scenario: TC96_Verification of check filter icon availability for Alarm raised
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Verification of check filter icon availability for Alarm raised
#
#
#@Test
#Scenario: TC97_Verification of check filter icon availability for Device Connected
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Verification of check filter icon availability for Device Connected
#
#
#@Test
#Scenario: TC98_Verification of check filter icon availability for Devices Active column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Verification of check filter icon availability for Devices Active column
#
#
#@Test
#Scenario: TC99_Verification of check filter icon availability for Status column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Verification of check filter icon availability for Status column
#
#
#
#@Test
#Scenario: TC100_Verification of visibilty duration to load the page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Verification of visibilty duration to load the page
#
#@Test
#Scenario: TC101_Verification of visibilty the input field format
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of visibilty the input field format
#
#
#@Test
#Scenario: TC102_Verification of alignment of ("+" i.e. ADD,refresh,bulk upload,bulk download &bulk app deployment buttons)top right side
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Verification of alignment of  i.e. ADD,refresh,bulk upload,bulk download &bulk app deployment buttons top right side
#
#@Test
#Scenario: TC103_Verification of visualization of icons in action column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verification of visualization of icons in action column
#
#@Test
#Scenario: TC104_Verification of loading properly in slow network
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verification of loading properly in slow network
#
#
#
#@Test
#Scenario: TC105_Verification of the accessible the page by using mobile network
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verification of loading properly in slow network
#
#
#@Test
#Scenario: TC106_Verification of the accessible the screen by using wi-fi network
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verification of the accessible the screen by using wi-fi network
#
#@Test
#Scenario: TC107_Verification of without login into browser, copy & paste the url
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verification of without login into browser, copy & paste the url
#
#@Test
#Scenario: TC108_Verification of check filter icon availability for Communication status
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then check filter icon availability for communication status
#
#@Test
#Scenario: TC109_Verification of Config Name text field without enter all the details & click on save
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then verify check filter icon visibility for Alarms raised
#
#
#@Test
#Scenario: TC110_Verification of Config Value text field without enter all the details & click on save
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verification of check filter icon visibility for Group Name
#
#@Test
#Scenario: TC111_Verification of default Active Toggle button in Environment>ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Environment Variable
#And Click on Add new button
#And Enter details for Config Name and Config Value
#And inactivate environmental variable
#Then Click on save button for environmental variable
#
#
#@Test
#Scenario: TC112_Verification of check filter icon visibility for Config Name text field in Environment>ADD screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then verify tool tip text visibilty for Status
#
#
#@Test
#Scenario: TC114_Verification of Inactive Toggle button in Environment>ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Environment Variable
#And Click on Add new button
#And Enter details for Config Name and Config Value
#And inactivate environmental variable
#Then Click on save button for environmental variable
#
#
#
#@Test
#Scenario: TC115_Verification of check the Cancel button in Environmental>ADD screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Environment Variable
#And Click on Add new button
#Then click on cancel button
#
#
#@Test
#Scenario: TC116_Verfication of enter details in Config Name text field
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#And Click on Add new button
#And Enter details for Config Name
#And Enter details for Config Value
#Then Click on save button for environmental variable
#
#
#
#
#@Test
#Scenario: TC117_Verfication of enter details in Config Value text field
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#And Click on Add new button
#And Enter details for Config Name
#And Enter details for Config Value
#Then Click on save button for environmental variable
#@Test
#Scenario: TC118_Verification of the accessible the ADD NEW icon i.e."+"Functionality
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#And Click on Add new button
#And Enter details for Config Name
#And Enter details for Config Value
#Then Click on save button for environmental variable
#
#
#@Test
#Scenario: TC119_Verification of without login into browser copy & paste the url
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then verify user can able to login into browser copy & paste the url
#
#
#@Test
#Scenario: TC120_Verification of visiblility of red color status toggle button in Environment variables>add screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then choose inactive checkbox from status 
#And Click on edit button of environment variables
#Then the red color status toggle button should be visible
#
#@Test
#Scenario: TC121_Verification of accessbility the filter icons of all the tabs using the edit icons
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then click on filter of config name and Config value
#
#
#@Test
#Scenario: TC122_Verification of visiblility of green color status toggle button in Environment variables>add screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#And Click on edit button of environment variables
#Then verify visiblility of green color status toggle button in Environment variables
#
#
#@Test
#Scenario: TC123_Verification of check filter icon accessbility of Config Name in Environment Variables List screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then click on filter of config name and Config value
#Then check filter icon accessbility of Config Name in Environment Variables List screen
#
#
#@Test
#Scenario: TC124_Verification of check filter icon accessbility of Config Value in Environment Variables List screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then click on filter of config name and Config value
#Then check filter icon accessbility of Config value in Environment Variables List screen
#
#@Test
#Scenario: TC125_Verification of check filter icon accessbility of Status in Environment Variables List screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then check accessbility the filter icon for status
#
#@Test
#Scenario: TC126_Verification of pagination i.e. items per page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Pagination is in footer Below left side
#
#@Test
#Scenario: TC127_Verification of pagination last page & first page using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After pagination all default records will display in Last page.
#
#@Test
#Scenario: TC128_Verification of pagination next page by using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After pagination all default records will display in Last page.
#
#@Test
#Scenario: TC129_Verification of tool tip text visibilty for EDIT button in Actions column of ENVIRONMENT VARIABLES LIST SCREEN
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then verify tooltip text for edit
#
#
#
#@Test
#Scenario: TC130_Verification of tool tip text visibilty for Delete button in Actions column of ENVIRONMENT VARIABLES LIST SCREEN
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then verify tooltip text for delete
#
#@Test
#Scenario: TC131_Verification of tool tip text visibilty for Bulk Upload button in Environment Variable list screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then verify tooltip text for bulk upload button
#
#@Test
#Scenario: TC132_Verification of tool tip text visibilty for Bulk Download button in Environment Variable list screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then verify tooltip text for bulk download button
#
#
#@Test
#Scenario: TC133_Verification to click on bulk upload icon in Environment Variable List screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then click on bulk upload icon in Environment Variable List screen
#
#@Test
#Scenario: TC134_Verification to accessbilty of csv format icon in Environment Variable Bulk upload pop up screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then click on bulk upload icon in Environment Variable List screen
#Then verify accessbilty of csv format icon in Environment Variable Bulk upload pop up screen
#
#@Test
#Scenario: TC135_Verification of without upload any file and click on Upload button
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal and Click on EDIT icon button
#And Click on Environmental variable Tab
#Then click on bulk upload icon in Environment Variable List screen
#Then click on upload button without uploading any file
#
#@Test
#Scenario: TC136_Verification of tool tip text visibilty for Delete button in Actions column of EDGE Device List screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal scrollbar
#Then verify tooltip text for delete on Edge Device
#
#@Test
#Scenario: TC137_Verification of tool tip text visibilty for Console button in Actions column of EDGE Device List screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then scroll horizontal scrollbar
#Then verify tooltip text for console on Edge Device
#
#@Test
#Scenario: TC136_Verification of tool tip text visibilty for Deploy button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then verify tool tip text visibilty for Deploy button in Actions column
#
#
#@Test
#Scenario: TC137_Verification of tool tip text visibilty for config App button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then verify tool tip text visibilty for config App button in Actions column
#
#@Test
#Scenario: TC138_Verification to check the tool tip text visibilty for Input text field Identity card in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify tool tip text visibilty for Input text field Identity card in ADD Screen
#
#
#@Test
#Scenario: TC139_Verification to check the tool tip text visibilty for Input text field Health card in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify tool tip text visibilty for Input text field Health card in ADD Screen
#
#
#@Test
#Scenario: TC140_Verification to check the tool tip text visibilty for Input text field Deployment card in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then verify tool tip text visibilty for Input text field Deployment card in ADD Screen
#
#
#@Test
#Scenario: TC141_Verification to check the tool tip text visibilty for Input text field Identity card in EDIT Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then verify tool tip text visibilty for Input text field Deployment card in EDIT Screen
#
#
#@Test
#Scenario: TC142_Verification to check the tool tip text visibilty for Input text field Health card in EDIT Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then verify tool tip text visibilty for Input text field Health card in EDIT Screen
#
#
#@Test
#Scenario: TC144_Verification to check the tool tip text visibilty for Input text field Deployment card in EDIT Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Verification to check the tool tip text visibilty for Input text field Registration card in EDIT Screen
#
#@Test
#Scenario: TC147_Verification of alignment for maximize & minimize the screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then check the alignmnet for maximise and minimize the screen
#
#@Test
#Scenario: TC148_Verification of tool tip text validity for all the tool tips
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then After landing on EDGE Device List screen please Mousehover on EDIT icon button
#
#@Test  
#Scenario: TC149_Verification to check the multi select options while doing pagination
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Pagination is in footer Below left side
#
#@Test  
#Scenario: TC150_Verification of check the multi select options for screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Pagination is in footer Below left side
#
#@Test
#Scenario: TC151_Verification to check the text varbaige for all the input labels text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for Hardware Name
#
#
#@Test
#Scenario: TC152_Verification to check the content for all the error messages
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for Hardware Name
#
#@Test
#Scenario: TC153_Verification to check the input text field format
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then verify alignment for all the input text fields in ADD Screen
#
#
#@Test
#Scenario: TC154_Verification to check the visualisation look of the table list
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then verify to check the visualisation look of the table list
#
#@Test
#Scenario: TC155_Verification to check the coloumn width uniformity
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then verify to check the coloumn width uniformity
#
#@Test
#Scenario: TC156_Verification of alignment for all the input text fields in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then verify alignment for all the input text fields in ADD Screen
#
#@Test
#Scenario: TC157_Verification of alignment for all the input text fields in EDIT Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then verify alignment for all the input text fields in EDIT Screen
#
#@Test
#Scenario: TC158_Verification of standarize text format for error message below Hardware name text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for Hardware Name
#
#
#
#@Test
#Scenario: TC159_Verification of standarize text format for error message below App Group name text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Verification of error message verbaige for entering invalid details for App Group Name
#
#
#@Test
#Scenario: TC160_Verification to check the labels of input text fields
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then verify to check the labels of input text fields
#
#
#@Test
#Scenario: TC163_Verification of Environmental variable Add inactive Functionality
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Deployments tab
#And Click on Environment Variable
#And Click on Add new button
#And Enter details for Config Name and Config Value
#And inactivate environmental variable
#Then Click on save button for environmental variable
#
#
#@Test
#Scenario: TC164_Verification of Environmental variable Add Functionality
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Deployments tab
#And Click on Environment Variable
#And Click on Add new button
#And Enter details for Config Name and Config Value
#Then Click on save button for environmental variable
#
#@Test
#Scenario: TC165_Verification of Environmental variable delete Functionality
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Deployments tab
#And Click on Environment Variable
#Then Click on search icon of configName
#Then Click on Delete button
#
#@Test
#Scenario: TC166_Verification of Environmental variable search Functionality
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Deployments tab
#And Click on Environment Variable
#Then Click on search icon of configName 
#
#
#@Test
#Scenario: TC167_Verification of Update functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List please scroll horizontal and Click on Edit icon button
#Then update Edge Name, location, Description , Assigned To from Identity section 
#Then scroll down
#Then update the value of Serial Number, OnboardingKey, ImageVersion from the Registration accordion
#Then update the value of Server Port from the deployment
#Then select the value for App Group from the deployment
#Then Click on Save button to update edge
