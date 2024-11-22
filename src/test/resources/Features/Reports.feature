@SheetREPORTS
Feature: REPORTS

@Test
Scenario: TC01_Verification of  Browser Compatibility of Reports module of the application
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then user should be login successfully

@Test
Scenario: TC02_Verification of  resizing the Reports list tab as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then verify page with resize option for the Reports page


@Test
Scenario: TC03_Browser fragmentation verification
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Minimise the screen and observe the UI carefully.
Then Maximize the screen


@Test
Scenario: TC04_To verify that the user is able to successfully download any date's  Report.
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date
And Click on download button


@Test
Scenario: TC05_To verify that the user is able to successfully download report from a date range
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date
And Click on download button


@Test
Scenario: TC06_To verify error message when user does not select the Report type dropwdown
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message

@Test
Scenario: TC07_To verify that the Report module is not available to an Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date

@Test
Scenario: TC08_To verify that the Report module is not available to an Operator user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date


@Test
Scenario: TC09_Verification of error message verbaige for without entering details in Reports
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message

@Test
Scenario: TC10_Verification of error message verbaige for entering invalid details
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message


@Test
Scenario: TC12_Verification of standarize text format below error message for text fields
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message




@Test
Scenario: TC13_Verification of check drop down option in Report type
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.

@Test
Scenario: TC14_Verification of switching between inputs fields using TAB
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then verify switching between inputs fields using TAB for reports

@Test
Scenario: TC15_Verification of visibilty duration to load the page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then verify loading time to load page


@Test
Scenario: TC16_Verification of visibilty the calender pop up in Start Date field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date



@Test
Scenario: TC17_Verification of visibilty the calender pop up in End Date field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date


@Test
Scenario: TC18_Verification to select date range from the calender pop up in Start Date field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date

@Test
Scenario: TC19_Verification to select date range from the calender pop up in End Date field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date



@Test
Scenario: TC20_Verification of alignment for all the input text fields
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then verify all the input text field


@Test
Scenario: TC21_Verification of alignment for the download button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Verification to check alignment for the download button
@Test
Scenario: TC22_Verification to check the labels of input text fields
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then verify to check the labels of input text field 



@Test
Scenario: TC23_Verification to check the visualisation look of the Calender pop up
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then check visualisation look of calender pop up

@Test
Scenario: TC24_Verification of alignment for maximize & minimize the screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then check maximize and minimise the screen

@Test
Scenario: TC25_Verification of pagination i.e. items per page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then check pagination item per page

@Test
Scenario: TC26_Verification of tool tip text visibilty for Start Date text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then check tool tip text visibilty for Start Date text field
@Test
Scenario: TC27_Verification of tool tip text visibilty for End Date
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then check tool tip text visibilty for End Date text field


@Test
Scenario: TC28_Verification of read & understanding the Audit logs
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
