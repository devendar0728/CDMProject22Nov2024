@SheetVOLUMES
Feature: VOLUMES


@Test

Scenario: TC01_Verification of resizing the Volume module as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then Try increasing & decreasing the Zoom% (from 50% to 150%) from browsers.



@Test
Scenario: TC02_Verification of Search button functionality in the Volume List screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on three dots of volume name and enter the value for volume name search

@Test

Scenario: TC03_Verification of Refreshing button functionality in the Volume List screen by Super admin/Admin user 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on the refresh button at the top right corner of the page



@Test

Scenario: TC04_Verification of Volume name Tool tip functionality in the Volume > ADD screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then verify add button on volumes list page
Then verify tooltip for Repository Name for repository volume name for repository
Then verify tooltip for Repository Link text field
Then verify tooltip for License Type text field 
Then verify tooltip for License Type text field
Then verify tooltip for type dropdown
Then verify tooltip for mount directory
Then verify tooltip for version
Then verify tooltip for architecture text field
Then verify tooltip for max size
Then verify tooltip for profile icon



@Test

Scenario: TC05_Verification of default Items per page functionality in the Volume List screen by Super admin/Admin user

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then Click on Pagination is in footer Below left side





@Test

Scenario: TC06_Verification of Pagination using backward button functionality in the Volume List screen by user

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then check full backward functionality is working

@Test

Scenario: TC07_Verification of Pagination using Forward button functionality in the Volume List screen by  user

Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then After pagination all default records will display in Next page.

@Test    

Scenario: TC08_Verification of viewing the Edit button screen  in the Volume module by Super admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on three dots of volume name and click on Edit button 
Then update the value for volume page 






@Test    

Scenario: TC09_Verification of Convert Volume to application functionality in the Volume List screen by Super admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on three dots of volume name and enter the value for volume name search
Then Click on button convert volume to application 


@Test

Scenario: TC10_Verification of saving the record without entering any details in any fields in the Volume> Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then verify add button on volumes list page
Then without entering any details in any fields in the Volume click on save button



@Test

Scenario: TC11_Verification of redirection to Volume List screen on clicking Cancel Button in Volume > Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then verify add button on volumes list page
Then click on cancel button on volumeAdd page



@Test

Scenario: TC12_Verification of redirection to Volume List screen on clicking Save Button after entering the Mandatory fields of Volume >ADD screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on three dots of volume name and click on Edit button 
Then update the value for volume page





@Test
Scenario: TC13_Verification of the acceptance of alphanumeric & Special character values in Volume NameText field in the Volume >Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on three dots of volume name and click on Edit button 
Then enter the alphanumeric and special character value in Volume Name Text



@Test

Scenario: TC14_Verification of the acceptance of Repositery name using dropdown Text field in the Volume >Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on three dots of volume name and click on Edit button 
Then choose repository name using dropdown 


@Test

Scenario: TC15_Verification of the acceptance of Type using dropdown Text field in the Volume >Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on three dots of volume name and click on Edit button 
Then choose type using dropdown 


@Test

Scenario: TC16_Verification of the acceptance of Alphanumeric & special characters in Repository link Text field in the Volume >Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then verify add button on volumes list page
Then enter the alphanumeric and special character value in repository link Text field





@Test

Scenario: TC17_Verification of the acceptance of Alphanumeric & special characters in License Type Text field in the Volume >Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then enter the alphanumeric and special character value in License Type text field





@Test

Scenario: TC18_Verification of the acceptance of Alphanumeric & special characters in Mount Directory Text field in the Volume >Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then enter the alphanumeric and special character value in Mount Directory Text field





@Test

Scenario: TC19_Verification of the acceptance of Alphanumeric & special characters in Version/Tag Text field in the Volume >Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then enter the alphanumeric and special character value in Version/Tag Text field



@Test

Scenario: TC20_Verification of the acceptance of Alphanumeric & special characters in Architecture Text field in the Volume >Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then enter the alphanumeric and special character value in Architecture Text field in the Volume



@Test

Scenario: TC21_Verification of the acceptance of Numericals in Max Size Text field in the Volume >Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then enter acceptance of Numbers in Max Size Text field in the Volume



@Test

Scenario: TC22_Verification of the acceptance of Alphanumerical & special characters in SHA KeyText field in the Volume >Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then enter the alphanumeric and special character value in SHA KeyText field



@Test

Scenario: TC23_Verification of display default status toggle button in Volume > Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then verify toggle button for status



@Test

Scenario: TC24_Verification of color of the default Status toggle button in Volume > Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then verify toggle button for status


@Test

Scenario: TC25_Verification of slide to change the Status toggle button in Volume > Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then verify the toggle color should change to green

Then verify toggle button for status





@Test

Scenario: TC26_Verification of breaching the Max word limit in Volume nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in Volume name Text field



@Test

Scenario: TC27_Verification of breaching the Min word limit in Volume nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in Volume name Text field



@Test

Scenario: TC28_Verification of breaching the Max word limit in Repository Link nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in repository link name Text field





@Test

Scenario: TC29_Verification of breaching the Min word limit in Repository Link nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in repository link name Text field





@Test

Scenario: TC30_Verification of breaching the Max word limit in License Type nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in License Type





@Test

Scenario: TC31_Verification of breaching the Max word limit in Mount Directory nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in mount directory name text field





@Test

Scenario: TC32_Verification of breaching the Max word limit in Version/Tag Text field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in Version/Tag Text field text field

@Test

Scenario: TC33_Verification of breaching the Max word limit in Architacture nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in architecture name Text field


@Test

Scenario: TC34_Verification of breaching the Max word limit in MAX size nameText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Max word limit in MAX size name text field



@Test

Scenario: TC35_Verification of breaching the Min word limit in License TypeText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Min word limit in License Type Text





@Test

Scenario: TC36_Verification of breaching the Min word limit in Mount DirectoryText field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the min word in Mount Directory Text field



@Test

Scenario: TC37_Verification of breaching the Min word limit in Version/Tag Text field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Min word limit in Version/Tag Text field





@Test

Scenario: TC38_Verification of breaching the Min word limit in Architecture Text field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Min word limit in Architecture Text field in Volume





@Test

Scenario: TC39_Verification of breaching the Min word limit in SHA Key Text field in Volume> Add screen by Super Admin

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verification of breaching the Min word limit in SHA Key Text field in Volume> Add screen by Super Admin



@Test

Scenario: TC40_Verify if User without entered any values in all the text fields and click on save button

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then without entered any values in all the text fields and click on save button


@Test

Scenario: TC41_Verify if user fill all the mandatory valid details and click on save button in Volume>ADD screen

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then fill all the mandatory valid details and click on save button



@Test

Scenario: TC42_Verify if user fill the invalid details and click on save button in Volume>ADD screen

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then Verify if user fill the invalid details and click on save button





@Test

Scenario: TC43_Verify if user fill the invalid details i.e. more than max characters with invalid inputs and click on save button in Volume>ADD screen

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then user fill the invalid details i.e. more than max characters with invalid inputs and click on save button in Volume



@Test

Scenario: TC44_Verify if user fill the invalid details i.e. more than max characters with invalid inputs and click on save button in Volume>Update screen

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify add button on volumes list page

Then  user fill the invalid details i.e. more than max characters with invalid inputs and click on save button in Volumefill all the mandatory valid details and click on save button



@Test

Scenario: TC45_Verify if user modify data and click on save button in Volume>Update screen

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then apply filter on volume name and click on edit button

Then if user modify data and click on save button in Volume


@Test

Scenario: TC46_Verification of check filter icon availability for Architecture

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Settings module from side menu bar

Then Click on volumes tab from right panel of the screen

Then verify check filter icon availability for  Architecture

@Test
Scenario: TC47_Verification of check filter icon availability for Version/Tag
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check filter icon visibility for Version/Tag



@Test
Scenario: TC48_Verification of check filter icon visibility for Volume Name 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check filter icon visibility for volume name


@Test
Scenario: TC49_Verification of check filter icon visibility for Architecture
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check filter icon visibility for Architecture


@Test
Scenario: TC50_Verification of check filter icon visibility for Version/Tag
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check filter icon visibility for Version/Tag


@Test
Scenario: TC51_Verification of check filter icon visibility for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check filter icon visibility for Status


@Test
Scenario: TC52_Verfication of pagination last page & first page using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then After pagination all default records will display in Last page.


@Test
Scenario: TC53_Verfication of pagination next page by using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then After pagination all default records will display in Last page.

@Test
Scenario: TC54_Verification of tool tip text visibilty for Volume Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check the tool tip text visibilty for Architecture
Then check the tool tip text visibilty for Architecture
Then check the tool tip text visibilty for Version/Tag
Then check the tool tip text visibilty for Status
Then check tool tip text visibilty for EDIT button in Actions column

@Test
Scenario: TC55_Verification of tool tip text visibilty for Convert to application functionality button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check tool tip text visibilty for Convert to application functionality button in Actions column for volumes


@Test
Scenario: TC56_Verification to check the tool tip text visibilty for Volume Name Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on Add button
Then check the tool tip text visibilty for Volume Name Input text field in ADD Screen
Then check the tool tip text visibilty for Repository Name from drop down Input text field in ADD Screen




@Test
Scenario: TC57_Verfication of alignment for all the input text fields in EDIT Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then check the tool tip text visibilty for Volume Name Input text field in ADD Screen


Scenario: TC58_Verification of ascending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then to check ascending order sorting functionality for the table list


@Test
Scenario: TC59_Verification of descending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then to check ascending order sorting functionality for the table list

@Test
Scenario: TC60_Verification to check the tool tip text visibilty for Volume Name Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on volumes tab from right panel of the screen
Then click on edit button
Then to check the tool tip text visibilty for Volume Name Input text field in ADD Screen
Then to check the tool tip text visibilty for Repository Name from drop down Input text field in Edit Screen

Then to check the tool tip text visibilty for Repository Link  Input text field in Edit Screen

Then to check the tool tip text visibilty for Type from drop down Input text field in edit Screen

Then to check the tool tip text visibilty for License type Input text field in ADD Screen

Then to check the tool tip text visibilty for Mount Directory Input text field in Edit Screen

Then to check the tool tip text visibilty for Version/Tag Input text field Edit Screen

Then to check the tool tip text visibilty for Architecture Input text field in Edit Screen

Then to check the tool tip text visibilty for Repository Path Input text field in Edit Screen

Then to check the tool tip text visibilty for Max Size Input text field in Edit Screen

Then to check the tool tip text visibilty for SHA key Input text field in edit Screen



