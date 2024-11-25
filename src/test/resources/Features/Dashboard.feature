@SheetDASHBOARD
Feature: DASHBOARD

#@Test
#Scenario: TC001_Verify the main dashboard overview with test data from Excel
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of EDGE groups in CDM on card widget
#Then verify total number of EDGE Devices in CDM on card widget
#Then verify total number of Active App Groups in CDM on card widget
#Then verify total number of Active Repositories in CDM on card widget
#Then verify total number of Active Edge Groups in CDM on card widget
#Then verify total number of Active Edge Devices in CDM on card widget
#Then verify total number of Active Applications in CDM on card widget
#Then verify total number of Active Volumes in CDM on card widget

#
@Test
Scenario: TC002_Verify the total number of deployments that occurred in the last 24 hours
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Given the user am on the dashboard page
Then verify total number of deployments that occurred in the last 24 hours
#
#
#@Test
#Scenario: TC003_Verify the total number of deployments that occurred in the last 7 days
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of "deployments" that occurred in the last 7 days
#
#
#
#@Test
#Scenario: TC004_Verify the ongoing deployments that occurred in the last 24 hours
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of "ongoing" deployments that occurred in the last 24 hours
#
#@Test
#Scenario: TC005_Verify the ongoing deployments that occurred in the last 7 days
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of "ongoing" deployments that occurred in the last 7 days
#
#@Test
#Scenario: TC006_Verify the successful deployments that occurred in the last 24 hours
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of "successful" deployments that occurred in the last 24 hours
#
#
#@Test
#Scenario: TC007_Verify the successful deployments that occurred in the last 7 days
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of "successful" deployments that occurred in the last 7 days
#
#
#@Test
#Scenario: TC008_Verify the failed deployments that occurred in the last 24 hours
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of "failed" deployments that occurred in the last 24 hours
#
#
#@Test    
#Scenario: TC009_Redirect to Total Edge Group page when clicking on the image of Total Edge Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Edge Group List page with both Active and Inactive staus
#
#
#@Test
#Scenario: TC010_Redirect to Total Edge Devices page when clicking on the image of Total Edge Devices
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Edge Devices list page with both Active and Inactive staus
#
#@Test    
#Scenario: TC011_Redirect to Total Edge Group page when clicking on the number of Total Edge Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Edge Group List page with both Active and Inactive staus
#
#
#@Test    
#Scenario: TC012_Redirect to Total Edge Group page when clicking on the number of Edge Devices
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Edge Devices List page with both Active and Inactive staus
#
#@Test    
#Scenario: TC013_Redirect to Active Edge Groups page when clicking on the image of Active Edge Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active Edge Groups List page with both Active and Inactive staus
#
#
#@Test    
#Scenario: TC014_Redirect to Active Edge Devices page when clicking on the image of Active Edge Devices
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active Edge Devices List page with both Active and Inactive staus
#
#@Test    
#Scenario: TC015_Redirect to Active Edge Device clicking on the number of Edge Devices
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Edge Devices List page with both Active and Inactive staus
#
#
#@Test    
#Scenario: TC016_Redirect to Active App Groups page when clicking on the image of Active App Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active App Groups List page
#
#@Test    
#Scenario: TC017_Redirect to Active App Groups clicking on the number of Edge Devices
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active App Groups List page
#
#
#@Test    
#Scenario: TC018_Redirect to Active Application page when clicking on the image of Active Application
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active Application List page
#
#@Test    
#Scenario: TC019_Redirect to Active App Groups clicking on the number of the Active Application
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active App Groups List page
#
#@Test    
#Scenario: TC020_Redirect to Active Application page when clicking on the image of Active Repositories
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active Repositories List page
#
#@Test    
#Scenario: TC021_Redirect to Active App Groups clicking on the number of the Active Repositories
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active Repositories page
#
#@Test    
#Scenario: TC022_Redirect to Active Application page when clicking on the image of Active Volumes
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active Volumes List page
#
#@Test    
#Scenario: TC023_Redirect to Active App Groups clicking on the number of the Active Volumes
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify user should be redirected to the Active Volumes page
#
#@Test    
#Scenario: TC024_Validate styling of statuses
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify the "Ongoing" column should have an orange color
#Then verify the "Successful" column should have a green color
#Then verify the "Failed" column should have a red color
#Then verify the "Deleted" column should have the appropriate color
#
#@Test
#Scenario: TC025_Accessibility testing
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then the "Deployment Report" section should be readable by screen readers
#Then verify all statuses should include text to assist colorblind users
#
#@Test 
#Scenario: TC026_Deployment Report table should be printed on the console
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify Deployment Report table should be printed on the console
#
#@Test 
#Scenario: TC027_License Report table should be printed on the console
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify License Report table table should be printed on the console
 #
#@Test    
#Scenario: TC028_Validate styling of statuses under License Report table
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify  "will expire" column has title in red color
#
#@Test
#Scenario: TC029_Verify the failed deployments that occurred in the last 7 days
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Given the user am on the dashboard page
#Then verify total number of "failed" deployments that occurred in the last 7 days
    