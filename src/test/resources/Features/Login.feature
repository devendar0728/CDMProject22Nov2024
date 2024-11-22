@SheetLogin
Feature: LOGIN

@Test
Scenario: TC01_Verification of Browser Compatibility of Login page of the application
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
And Successfull login should be happen


@Test
Scenario: TC02_Verification of resizing the Login screen as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then verify page with resize option the login page

@Test
Scenario: TC03_Verification of User registration screen as a Super admin
Given User launch application in chrome browser
Then verify registration screen as a super admin

@Test
Scenario: TC04_Verification of Super admin User Login with a valid super admin Username, i.e. email id & valid password
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
And Successfull login should be happen

@Test
Scenario: TC05_Verification of the login page for both Super admin/Admin without entering details
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then verify validation message for username 
Then verify validation message for password 



@Test
Scenario: TC06_Verification of the ‘Forgot Password’ functionality for both Super admin/Admin
Given User launch application in chrome browser
When user click on forgot password button
Then enter email id to reset password



@Test
Scenario: TC07_Verification of the messages for invalid login for both Super admin/Admin
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Verify Error message for password


@Test
Scenario: TC08_Verification of the ‘Remember Me’ functionality for both Super admin/Admin
Given User launch application in chrome browser
Then verify remember me functionality


@Test
Scenario: TC09_Verification of the availability of data in password field when viewed by both Super admin/Admin
Given User launch application in chrome browser
Then click on login button on home page
Then Click on the hidden eye icon in Password field


@Test
Scenario: TC10_Verification of both Super admin/Admin user logging with a new password after he/she has changed the password
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
And Successfull login should be happen

@Test
Scenario: TC11_Verification of logging in with valid credentials in multiple browsers simultaneously 
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
And Successfull login should be happen

@Test
Scenario: TC12_Verification of working of the 'Enter' Key in the login page
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
And Successfull login should be happen


@Test
Scenario: TC13_Verification of the time taken to log in with a valid username and password
Given User launch application in chrome browser  
Then click on login button on home page 
And user enters credentials and click on login button
Then the user should be redirected to the dashboard and login time should be measured

@Test
Scenario: TC14_Verification of the availability of a ‘Cancel’ button to erase the entered text
Given User launch application in chrome browser
Then click on login button on home page
And check for cancel button


@Test
Scenario: TC15_Verification of compliance to the Login page standards in terms of font, text color and color coding
Given User launch application in chrome browser
Then click on login button on home page
Then click on Login button without adding credentials
Then the user should verify compliance with login page standards

@Test
Scenario: TC16_Verification of the failed re-entry by pressing ‘Back button’ on the browser
Given User launch application in chrome browser
And click on back button and verify page

@Test
Scenario: TC17_Verification of the timeout functionality of the login session
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then the user should be redirected to the dashboard and login time should be measured
And the user waits for an extended period to simulate session timeout
And the user attempts to interact with the application
Then the user should be redirected to the login page due to session timeout


@Test
Scenario: TC18_Verification of logging in functionality with different valid credentials in the same browser simultaneously
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Profile icon on the top of the Right side.& click on Log out from drop down

@Test
Scenario: TC19_Verification of the limit on the number of characters entered in each field (Username and Password) of the login page
Given User launch application in chrome browser
Then click on login button on home page
When I enter max characters in the username field
Then I should see the username field accepts a maximum of max characters


@Test
Scenario: TC20_Verification of the wrong attempts of username & passwords by the Super admin/Admin User several times
Given User launch application in chrome browser
Then click on login button on home page
Then I should see an error message indicating invalid credentials
 
@Test
Scenario: TC21_Verification of acceptance of special characters, alphabets, numeric digits, case sensitivity, maximum length, minimum length in password field for Superadmin/Admin Users
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button


@Test
Scenario: TC22_Verification of acceptance of special characters, alphabets, numeric digits, .com Incase sensitivity, maximum length, minimum length in Username field for Superadmin/Admin Users
Given User launch application in chrome browser
Then click on login button on home page
When I enter an invalid username and password
Then click on Login button
Then verify validation message 

@Test
Scenario: TC23_Verification of error message verbaige for without entering details
Given User launch application in chrome browser
Then click on login button on home page
Then click on Login button without adding credentials
Then verify validation message for username 
Then verification message for password should come


@Test
Scenario: TC24_Verification of error message verbaige for entering details in user name text field
Given User launch application in chrome browser
Then click on login button on home page
Then click on Login button without adding credentials
Then verify validation message for username 



@Test
Scenario: TC25_Verification of error message verbaige for entering details in password text field
Given User launch application in chrome browser
Then click on login button on home page
Then keep the username field blank
Then enter details under password
Then verify validation message for username 


@Test
Scenario: TC26_Verification of error message verbaige for entering invalid details i.e. email id & password
Given User launch application in chrome browser
Then click on login button on home page
Then click on Login button without adding credentials
Then verify validation message for username 
Then verification message for password should come

@Test
Scenario: TC27_Verification of alignment for Login button
Given User launch application in chrome browser
Then Login button should be horizontally aligned
And Login button should be vertically aligned


@Test
Scenario: TC28_Verification of alignment for Reset password button
Given User launch application in chrome browser
Then verify reset password functioanlity


@Test
Scenario: TC29_Verification of alignment for Login with auth app button
Given User launch application in chrome browser
Then verify auth app button


@Test
Scenario: TC30_Verification of standarize text format for success message in toaster
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
And Successfull login should be happen 



@Test
Scenario: TC31_Verification of standarize text format for error message in toaster
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
And Successfull login should be happen 

@Test
Scenario: TC32_Verification of standarize text format for error message below  text field
Given User launch application in chrome browser
Then click on login button on home page
Then click on Login button without adding credentials
Then verify validation message for username 
Then verification message for password should come


@Test
Scenario: TC33_Verification of acceptance of emaild for forgot password button
Given User launch application in chrome browser
Then click on forgot password button to reset password 
Then verify acceptance of emaild for forgot password button


@Test
Scenario: TC34_Verification of autofill username & password
Given User launch application in chrome browser
Then click on login button on home page
Then Username and password fields are autofilled


@Test
Scenario: TC35_Verification of check the log out functionality
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then click on Log Out button


@Test
Scenario: TC36_Verification of log into the app by using new credentials
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button


@Test
Scenario: TC37_Verification of switching between inputs fields using TAB
Given User launch application in chrome browser
Then click on login button on home page
Then verify switching between input fields using TAB


@Test
Scenario: TC38_Verification of restore the password with invalid user name
Given User launch application in chrome browser
Then verify restore the password with invalid user name


@Test
Scenario: TC39_Verification of restore the password with empty required fields
Given User launch application in chrome browser
Then click on login button on home page
Then click on Login button without adding credentials
Then verify restore password functionality

@Test
Scenario: TC40_Verification of login to the application using old password
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button



@Test
Scenario: TC41_Verification of visibilty duration to load the application
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then verify visibility duration to load page for Login


@Test
Scenario: TC42_Verification of visibilty the input field format
Given User launch application in chrome browser
Then click on login button on home page
Then the input field should be visible

@Test
Scenario: TC43_Verification of alignment  show icon into the text field
Given User launch application in chrome browser
Then click on login button on home page
Then click on eye icon for the password


@Test
Scenario: TC44_Verification of visualization of background picture
Given User launch application in chrome browser
Then verification of background picture



@Test
Scenario: TC45_Verification of loading proper in slow network
Given User launch application in chrome browser
Then verification of loading proper in slow network


@Test
Scenario: TC46_Verification of the accessible by using mobile network
Given User launch application in chrome browser
Then verification of screen accessible by using mobile network


@Test
Scenario: TC47_Verification of the accessible by using wi-fi network
Given User launch application in chrome browser
Then verification of screen accessible by using wi-fi network


@Test
Scenario: TC48_Verification of without login into browser copy & paste the url
Given User launch application in chrome browser
Then Verification of without login into browser copy & paste the url

