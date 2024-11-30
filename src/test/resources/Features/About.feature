@SheetABOUT

Feature: ABOUT

#@Test
#Scenario: TC001_Verification of displaying the About page after clicking on About module option from Settings Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on About tab from right panel of the screen


#@Test
#Scenario: TC002_User verifies the color of the page title
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on About tab from right panel of the screen
#Then verify colour of the heading Title

#
#@Test
#Scenario: TC003_User verifies the version on About Page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on About tab from right panel of the screen
#Then verify version on about page




@Test
Scenario: TC004_Verification of Terms and Conditions link by Using Enter tab in ABOUT Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on About tab from right panel of the screen
When the user focuses on the "Terms and Conditions" link and presses the Enter key
And the page title should be "Centralized Device Management"




