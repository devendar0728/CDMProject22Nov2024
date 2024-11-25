#@SheetREPORTS
#Feature: REPORTS
#
#@Test
#Scenario: TC01_To verify that the user is able to successfully download any date's  Report
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And Click on Report module from side menu bar
#When User selects "Report Type" from the dropdown
#And User selects a "Start Date" from the date picker
#And User selects an "End Date" from the date picker
#And User clicks on the "Download" button
#Then verify report should be downloaded successfully
#
#@Test
#Scenario: TC02_To verify error message when user does not select the Report type drop-down
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And Click on Report module from side menu bar
#Then verify Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message
#
#@Test
#Scenario: TC03_Verification of check drop down option in Report type
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And Click on Report module from side menu bar
#When User selects "Report Type" from the dropdown
#And Verify "Audit Report" is selected in the dropdown
#
#
#
#
#@Test
#Scenario: TC004_Verification to check the labels of input text fields
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And Click on Report module from side menu bar
#Then verify to check the labels of input text field 
#
#
#@Test
#Scenario: TC005_Verification of tool tip text visibilty for Start Date text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And Click on Report module from side menu bar
#Then verify to check tool tip text visibilty for Start Date text field
#
#@Test
#Scenario: TC006_Verification of tool tip text visibilty for End Date
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And Click on Report module from side menu bar
#Then verify to check tool tip text visibilty for End Date text field
#
#
