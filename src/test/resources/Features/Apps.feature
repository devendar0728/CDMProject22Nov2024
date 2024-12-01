@SheetAPPS
Feature: APPS
#
#@Test
#Scenario: TC001_Verification of resizing the Apps module as per different zoom levels
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then verify page with resize option for App page
#
#
#@Test
#Scenario: TC002_Verification to check the tool tip text on Edit Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then cilck on Pencil icon i.e. EDIT button
#Then check the tool tip text visibilty for Architecture Input text field in Edit Screen
#Then check the tool tip text visibilty for Version/Tag Input text field Edit Screen
#Then check the tool tip text visibilty for License type Input text field in edit Screen
#Then verify tooltip for Architecture from update Screen
#Then check the tool tip text visibilty for Root Volume Input text field in Edit Screen
#Then check the tool tip text visibilty for License type Input text field in edit Screen
#Then check the tool tip text visibilty for Type from drop down Input text field in edit Screen
#Then check the tool tip text visibilty for Repository Link  Input text field in Edit Screen
#Then check the tool tip text visibilty for Repository Name from drop down Input text field in Edit Screen
#Then verify tooltip for App Name from update Screen
#
#
#@Test
#Scenario: TC003_Verification of Search button functionality in the Apps List screen by Super admin 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then verify search for application name , architecture, Version
#
#
#
#@Test
#Scenario: TC004_Verification of the View Volume details icon in Actions column Apps List screen by Super admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then click on View VolumeDetails icon from actions column
#
#@Test
#Scenario: TC005_Verification of Refreshing button functionality in the Apps List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then click on refresh button for apps
#
#@Test
#Scenario: TC006_Verfication of pagination i.e. items per page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then Click on pagination it will display default records will display
#
#@Test
#Scenario: TC007_Verfication of pagination last page & first page using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then After pagination all default records will display in Last page.
#
#
#@Test
#Scenario: TC008_Verfication of pagination next page by using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then After pagination all default records will display in Last page.
#
#@Test
#Scenario: TC009_Verification of tool tip text visibilty for Architecture
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then verify tooltip text visibilty for Application Name
#Then verify tooltip text visibilty for Architecture
#Then verify tool tip text visibilty for Version/Tag
#Then verify tool tip text visibilty for status
#
#@Test
#Scenario: TC010_Verification of tool tip text visibilty for Inactive functionality button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then verify tool tip text visibilty for Inactive functionality button in Actions
#
#@Test
#Scenario: TC011_Verification of tool tip text visibilty for view volume details functionality button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then verify tool tip text visibilty for view volume details functionality button in Actions column
#
#
#@Test
#Scenario: TC012_Verification to check the tool tip text visibilty for Application Name Input text fields in Edit Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then cilck on Pencil icon i.e. EDIT button
#Then verify tool tip text visibilty for Application Name Input text fields in Edit Screen
#
#
#@Test
#Scenario: TC013_Verification to check the tool tip text visibilty for Application Display Name Input text fields in Edit Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then cilck on Pencil icon i.e. EDIT button
#Then verify tool tip text visibilty for Application Display Name Input text fields in Edit Screen
#
#@Test
#Scenario: TC014_Verification to check the tool tip text visibilty for Repository Link  Input text field in Edit Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then cilck on Pencil icon i.e. EDIT button
#Then verify tool tip text visibilty for Repository Link  Input text field in Edit Screen
#
#
#@Test
#Scenario: TC015_Verification to check the tool tip text visibilty for Root volume Input text field in Edit Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then verify tool tip text visibilty for Root volume Input text field in Edit Screen
#
#
#@Test
#Scenario: TC016_Verification to check the tool tip text visibilty for Config Master Input text field in Edit Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then cilck on Pencil icon i.e. EDIT button
#Then verify tooltip for Config Master from update Screen
#
@Test
Scenario: TC017_Verification to check Edit functionality of Apps
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then search for Application name
Then cilck on Pencil icon i.e. EDIT button
Then verify Edit functionality for Apps



#
#
#
#@Test
#Scenario: TC018_Verification of tool tip text visibilty for Edit functionality button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then cilck on Pencil icon i.e. EDIT button
#Then verify visibilty for Edit functionality button in Actions column
#Then verify tool tip text visibilty for Active functionality button in Actions column
#
#
#@Test
#Scenario: TC019_Verification of cancellation of saving data on Apps update screen by Super admin
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then cilck on Pencil icon i.e. EDIT button
#Then click on cancel button to Cancel updation
#
#
#
#@Test
#Scenario: TC020_Verification of inactive close icon from action column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then click on inactive button to deactivate application
#
#@Test
#Scenario: TC021_Verification of ascending order sorting functionality for the table list
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then click on ascending order sorting functionality for the table list
#
#@Test
#Scenario: TC022_Verification of descending order sorting functionality for the table list
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Apps tab from right panel of the screen
#Then click on descending order sorting functionality for the table list
#
#
#
#
