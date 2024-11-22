@SheetAPPGROUPS
Feature: APPGROUPS

@Test
Scenario: TC01_Verification of Browser Compatibility of APP Group Listing Screen of the application
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Successfull login should be happen


@Test
Scenario: TC02_Verification of resizing the User screen as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then verify page with resize option with App groups page


@Test
Scenario: TC03_Verify if user click on ADD button Functionality as a super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on Add button

@Test
Scenario: TC04_Verify if User without entered any values in all the text fields and click on save button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on Add button
Then Do not Fill all information on Add page and hit save button


@Test
Scenario: TC05_Verify if User click on Cancel button in APP Group add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on Add button
Then click on cancel button


@Test
Scenario: TC06_Verify user fill all the mandatory valid datails and click on save button in ADD screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
When Click on the Add icon at the right side of the page
Then Under Identity Section enter details for App Group Name and AppGroupDisplayName
And click on Save button.


@Test
Scenario: TC07_Verify if user will click the add button, page responding or not. 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
When Click on the Add icon at the right side of the page

@Test
Scenario: TC08_Verify if user Searching result should be display when u have enter the search 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then user should search for App Group Name and App Group Display name

@Test
Scenario: TC09_Verification of Expand button functionality in the APP Group >ADD screen by Super admin/Admin user 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on expand button from navigation menu



@Test
Scenario: TC10_Verification of Collapse button functionality in the User screen by Super admin/Admin user 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on collapse button from navigation menu
Then click on expand button from navigation menu

@Test
Scenario: TC11_Verification of the acceptance of alphabet values in APP Group Name Text field in the Add screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
When Click on the Add icon at the right side of the page
Then Under Identity Section enter details for App Group Name and AppGroupDisplayName
And click on Save button.

@Test
Scenario: TC12_Verification of the acceptance of alphabet values in APP Group Display Name Text field in the Add screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
When Click on the Add icon at the right side of the page
Then Under Identity Section enter details for App Group Name and AppGroupDisplayName
And click on Save button.

@Test
Scenario: TC13_Verification of breaching the Max word limit in APP Group Name Text field in the Add screen by Super admin/Admin user

Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC14_Verification of breaching the Max word limit in APP Group Display Name Text field in the Add screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC15_Verification of breaching the Max word limit in APP Group Name Text field in the Edit screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups



@Test
Scenario: TC16_Verification of the rejection of invalid number in App Group Name field in the Add screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups


@Test
Scenario: TC17_Verification of the rejection of invalid number in App Group Display Name field in the Add screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC18_Verification of copy pasting duplicate app name in the app name text field in the Add screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC19_Verification of error message verbaige for without entering details in ADD New Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups


@Test
Scenario: TC20_Verification of error message verbaige for entering invalid details for APP Group Name Text field in ADD New screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC21_Verification of error message verbaige for entering invalid details for APP Group Display Name Text field in ADD New screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC22_Verification of standarize text format for success message in toast
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC23_Verification of standarize text format below error message for APP Group Name text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups

@Test
Scenario: TC24_Verification of standarize text format below error message for APP Group Display Name text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Edit button to edit app groups
Then remove the existing value for AppGroupName and change with new value
Then remove the existing value for AppDisplayName and change with new value
Then click on save button to save App groups



@Test
Scenario: TC25_Verification of check filter icon availability for APP Group Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on three dots on App Group name and enter the value for AppName
Then Click on Delete button to delete app groups



@Test
Scenario: TC26_Verification of check filter icon availability for APP Group Display Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
When Click on the Add icon at the right side of the page
Then Under Identity Section enter details for App Group Name and AppGroupDisplayName
And click on Save button.

@Test
Scenario: TC27_Verification of check filter icon availability for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
When Click on the Status Icon at the right side of the page
Then Under Status column select Active checkbox from the List 


@Test
Scenario: TC28_Verification of switching between inputs fields using TAB
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on Add button
Then verify switching between input field using TAB


@Test
Scenario: TC29_Verification of visibilty duration to load the page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify visibilty duration to load the page


@Test
Scenario: TC30_Verification of visibilty the input field format
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify visibilty the input field format

@Test
Scenario: TC31_Verification of alignment of ("+" i.e. ADD New,Refresh,bulk upload & bulk download buttons)top right side
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify  alignment of ADD New,Refresh,bulk upload & bulk download buttons top right side

@Test
Scenario: TC32_Verification of visualization of icons in action column  
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify visualization of icons in action column


@Test
Scenario: TC33_Verification of loading properly in slow network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify application should load properly in slow network
Then verify page is loading in slow network

@Test
Scenario: TC34_Verification of the accessible the page by using mobile network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify page is accessible by using wi-fi network
Then verify page by using mobile network

@Test
Scenario: TC35_Verification of the accessible the screen by using wi-fi network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify page is accessible by using wi-fi network
Then verify page by using wi-fi network



@Test
Scenario: TC36_Verification of without login into browser, copy & paste the url
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify page without login into browser, copy & paste the url


@Test
Scenario: TC37_Verification of check filter icon visibility for APP Group Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then check filter icon visibility for APP Group Name

@Test
Scenario: TC38_Verification of check filter icon visibility for APP Group Display Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then check filter icon visibility for APP Group Display Name


@Test
Scenario: TC39_Verification of check filter icon visibility for Status column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then check filter icon visibility for Status column



@Test
Scenario: TC40_Verification of accessbility the filter icon for APP Group Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify page accessbility the filter icon for APP Group Display Name



@Test
Scenario: TC41_Verification of accessbility the filter icon for APP Group Display Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify to check the column width & size resolution

@Test
Scenario: TC42_Verification of accessbility the filter icon for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then check filter icon visibility for Status column

@Test
Scenario: TC43_Verification to check the column width & size resolution
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then check the column width & size resolution


@Test
Scenario: TC44_Verification of pagination i.e. items per page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then verify pagination

@Test
Scenario: TC45_Verification of pagination last page & first page using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then After pagination all default records will display in Next page. 



@Test
Scenario: TC46_Verification of pagination next page by using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then After pagination all default records will display in Previous page.

@Test
Scenario: TC47_Verification to check the labels of input text fields
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Click on App Groups tab
Then click on Add button
Then click on save button

