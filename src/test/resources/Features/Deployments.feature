@SheetDEPLOYMENTS
Feature: DEPLOYMENTS

@Test
Scenario: TC01_Verification of Browser Compatibility of Deployment module of the application
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Successfull login should be happen

@Test
Scenario: TC02_Verification of resizing the Deployment as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then verify page with resize option for the deployment page

@Test
Scenario: TC03_Verification of displaying the Deployment table details after clicking on Deployment module option from side menu bar by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar

@Test
Scenario: TC04_Verification of Bulk download button functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Bulk Download button

@Test
Scenario: TC05_Verification of Refreshing button functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Refresh button

@Test
Scenario: TC06_Verification of current view functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Current View button

@Test
Scenario: TC07_Verification of history view functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Current View button

@Test
Scenario: TC08_Verification of tooltip functionality for info icon under Actions column of the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Current View button

@Test
Scenario: TC09_Verification of reduction in the number of records in pagination section of Deployment details screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination part it will display default records will display

@Test
Scenario: TC10_Verification of changing the items per page functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination part it will display default records will display

@Test
Scenario: TC11_Verification of displaying the items per page by default i.e. 25 per page in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination part it will display default records will display

@Test
Scenario: TC12_Verification of displaying the total number of records with pagination icons in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination part it will display default records will display

@Test
Scenario: TC13_Verification of displaying the First page (Full Backward arrow) button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination to check functionality of Full Backward arrow

@Test
Scenario: TC14_Verification of displaying the Last page (Full Forward arrow button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination to check functionality of Full forward arrow

@Test
Scenario: TC15_Verification of displaying the Next page (Forward arrow button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination to check Next button(Forward arrow) functionality

@Test
Scenario: TC16_Verification of displaying the Previous page (Backward arrow button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination to check Previous Page button(Backward arrow) functionality

@Test
Scenario: TC17_Verification of the search functionality for Edge Name column (Valid Edge Name ) in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on EDGE Name search icon of deployment page i.e. three dots & enter Valid inputs into search text field

@Test
Scenario: TC18_Verification of the search functionality for Edge Name column (Invalid Edge Name) in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on EDGE Name search icon i.e. three dots & enter invalid inputs into search text field

@Test
Scenario: TC19_Verification of the search functionality for App Name column (Valid App Name) in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field of App Name

@Test
Scenario: TC20_Verification of the search functionality for App Name column (InValid App Name) in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on App Name search icon i.e. three dots & enter invalid inputs into search text field

@Test
Scenario: TC21_Verification of the search functionality for Status column (Valid Status entry) in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on Status Name search icon i.e. three dots & select status

@Test
Scenario: TC22_Verification of the search functionality for Error in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on Error search icon i.e. three dots & enter Valid inputs into search text field

@Test
Scenario: TC23_Verification of the search functionality for Running Version in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then scroll horizontal
Then Click on Running Version search icon i.e. three dots & enter Valid inputs into search text field

@Test
Scenario: TC24_Verification of the search functionality for Expected Version in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then scroll horizontal
Then Click on Expected Version invalid search icon i.e. three dots & enter Valid inputs into search text field

@Test

Scenario: TC25_Verification of the search functionality for Deployment Date in the Deployment List screen by Super admin/Admin user

Given User launch application in chrome browser
Then click on login button on home page

When user enters credentials and click on login button

Then Click on Deployments module from side menu bar

Then Click on the History View button

Then scroll horizontal

Then Click on deploymentDateThreeDot icon and enter the value in datepickercolumn



@Test

Scenario: TC26_Verification of the search functionality for Last Updated version in the Deployment List screen by Super admin/Admin user

Given User launch application in chrome browser
Then click on login button on home page

When user enters credentials and click on login button

Then Click on Deployments module from side menu bar

Then Click on the History View button

Then scroll horizontal

Then Click on lastupdated Three Dot icon and enter the value in datepickercolumn





@Test

Scenario: TC27_Verification of the removal of search results and text for all Edge Name Column in the Deployment screen by Super admin/Admin user

Given User launch application in chrome browser
Then click on login button on home page

When user enters credentials and click on login button

Then Click on Deployments module from side menu bar

Then Click on the History View button

Then Enter valid inputs into search text field of Edge name and enter backspace & click on enter



@Test

Scenario: TC28_Verification of the removal of search results and text for App Name columns in the Deployment screen by Super admin/Admin user

Given User launch application in chrome browser
Then click on login button on home page

When user enters credentials and click on login button

Then Click on Deployments module from side menu bar

Then Click on the History View button

Then Enter valid inputs into search text field of app name of deployment and enter backspace & click on enter


@Test

Scenario: TC29_Verification of the removal of search results and text for Status column in the Deployment screen by Super admin/Admin user

Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button

Then Click on Deployments module from side menu bar

Then Click on the History View button

Then Enter valid inputs into search text field of status name of deployment and enter backspace & click on enter


@Test
Scenario: TC30_Verification of the removal of search results and text for Error Trace columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then click on the view deployed Volume Details icon
Then Enter valid inputs into search text field of Volume name and enter backspace & click on enter

@Test
Scenario: TC31_Verification of the removal of search results and text for Running Version columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then scroll horizontal
Then Enter valid inputs into search text field of running version of deployment and enter backspace & click on enter

@Test
Scenario: TC32_Verification of the removal of search results and text for Expected Version columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then scroll horizontal
Then Enter valid inputs into search text field of Expected Version of deployment and enter backspace & click on enter

@Test
Scenario: TC33_Verification of the removal of search results and text for Deployment Date columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then scroll horizontal
Then Click on deploymentDateThreeDot icon and enter the value in datepickercolumn
Then click on reset button

@Test
Scenario: TC34_Verification of the removal of search results and text for Last Updated Date columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then scroll horizontal
Then Click on lastupdated Three Dot icon and enter the value in datepickercolumn
Then click on reset button

@Test
Scenario: TC35_Verification of the Error column and verify link Show More screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then click on the link show more from the Error column

@Test
Scenario: TC36_Verification of view deployed Volume Details icon
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then scroll horizontal
Then click on the view deployed Volume Details icon

@Test
Scenario: TC37_Verification of the search functionality for Volume Name by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on App Name search icon i.e. three dots & enter invalid inputs into search text field
Then scroll horizontal and click on the info icon
Then Enter valid inputs into search text field of volume name of volumename details page and enter backspace & click on enter

@Test
Scenario: TC38_Verification of the search functionality for Status in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on App Name search icon i.e. three dots & enter invalid inputs into search text field
Then scroll horizontal and click on the info icon
Then Enter valid inputs into search text field of volume name of status column deployment and enter backspace & click on enter

@Test
Scenario: TC39_Verification of the search functionality for Error Version in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on App Name search icon i.e. three dots & enter invalid inputs into search text field
Then scroll horizontal and click on the info icon
Then Enter valid inputs into search text field of volume name of error column deployment and enter backspace & click on enter

@Test
Scenario: TC40_Verification of the search functionality for Created Date in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on App Name search icon i.e. three dots & enter invalid inputs into search text field
Then scroll horizontal and click on the info icon
Then Click on createdDateThreeDot icon and enter the value in datepickercolumn

@Test
Scenario: TC41_Verify refresh button on the page of Deployed Volume Details Popup
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then click on the view deployed Volume Details icon
Then click on refresh button on the page of Deployed Volume Details Popup

@Test
Scenario: TC42_Verification of the removal of search results and text for Volume Name columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then click on the view deployed Volume Details icon
Then Enter valid inputs into search text field of Volume name and enter backspace & click on enter

@Test
Scenario: TC43_Verification of the removal of search results and text for Status columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on EDGE Name search icon of deployment page i.e. three dots & enter Valid inputs into search text field
Then scroll horizontal
Then click on the view deployed Volume Details icon
Then Enter valid inputs into search text field of status and enter backspace & click on enter

@Test
Scenario: TC44_Verification of the removal of search results and text for Error details page columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then click on the view deployed Volume Details icon
Then Enter valid inputs into search text field of error details list page and enter backspace & click on enter

@Test
Scenario: TC45_Verification of the removal of search results and select Date and clear date from  Created Date columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar

@Test
Scenario: TC46_Verification of the removal of search results and select Date and clear date from  Deployment Date columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar

@Test
Scenario: TC47_Verification of the removal of search results and select Date and clear date from  Last Updated Date columns in the Deployment screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar

@Test
Scenario: TC48_Verification of reduction in the number of records in pagination section of Deployment details screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on deployment pagination it will display records will display

@Test
Scenario: TC49_Verification of changing the items per page functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on deployment pagination it will display records will display

@Test
Scenario: TC50_Verification of displaying the items per page by default i.e. 25 per page in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on deployment pagination it will display records will display

@Test
Scenario: TC51_Verification of displaying the total number of records with pagination icons in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on deployment pagination it will display records will display

@Test
Scenario: TC52_Verification of displaying the First page (Full Backward arrow) button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on pagination to check functionality of Full Backward arrow

@Test
Scenario: TC53_Verification of displaying the Last page (Full Forward arrow button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on deployment pagination it will display records will display

@Test
Scenario: TC54_Verification of displaying the Next page (Forward arrow button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on deployment pagination it will display records will display

@Test
Scenario: TC55_Verification of displaying the Previous page (Backward arrow button in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on deployment pagination it will display records will display

@Test
Scenario: TC56_Verification of close button on the Deployed Volume Details Page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on EDGE Name search icon of deployment page i.e. three dots & enter Valid inputs into search text field
Then scroll horizontal
Then click on the view deployed Volume Details icon
Then Click on close button

@Test
Scenario: TC57_Verification of progress bar for Download Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then click on the view deployed Volume Details icon
Then verify progress bar

@Test
Scenario: TC58_Verification of check filter icon availability for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for Edge ID

@Test
Scenario: TC59_Verification of check filter icon availability for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for App Name

@Test
Scenario: TC60_Verification of check filter icon availability for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Status

@Test
Scenario: TC61_Verification of check filter icon availability for Error
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Error

@Test
Scenario: TC62_Verification of check filter icon availability for Running Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Running Version

@Test
Scenario: TC63_Verification of check filter icon availability for Deployment Date
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal 
Then verify filter icon for availability for Deployment Date

@Test
Scenario: TC64_Verification of check filter icon availability for Expected Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify filter icon for availability for Expected Version

@Test
Scenario: TC65_Verification of check filter icon availability for Last Updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify filter icon for availability for Last Updated

@Test
Scenario: TC66_Verfication of visibilty duration to load the page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify visibility duration to load page for deployment

@Test
Scenario: TC67_Verfication of visualization of icons in action column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify visualization of icons in action column

@Test
Scenario: TC68_Verfication of loading properly in slow network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Verfication of loading properly in slow network

@Test
Scenario: TC69_Verification of the accessible the page by using mobile network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Verification of the accessible the page by using mobile network

@Test
Scenario: TC70_Verification of the accessible the screen by using wi-fi network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Verification of the accessible the screen by using wi-fi network

@Test
Scenario: TC71_Verification of without login into browser, copy & paste the url
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Verification of without login into browser, copy & paste the url

@Test
Scenario: TC72_Verfication to check the alignment of Refresh,bulk download & History View buttons on the top right side
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Verfication to check the alignment of Refresh,bulk download & History View buttons on the top right side

@Test
Scenario: TC73_Verification of check filter icon visibility for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for Edge ID

@Test
Scenario: TC74_Verification of check filter icon visibility for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for App Name

@Test
Scenario: TC75_Verification of check filter icon visibility for Status 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Status

@Test
Scenario: TC76_Verification of check filter icon visibility for Error
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Error

@Test
Scenario: TC77_Verification of check filter icon visibility for Running Version
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Running Version

@Test
Scenario: TC78_Verification of check filter icon visibility for Deployment Date
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal 
Then verify filter icon for availability for Deployment Date

@Test
Scenario: TC79_Verification of check filter icon visibility for Expected Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify filter icon for availability for Expected Version


@Test
Scenario: TC80_Verification of check filter icon visibility for Last Updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify filter icon for availability for Last Updated

@Test
Scenario: TC81_Verification of check filter icon accessibility for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for Edge ID

@Test
Scenario: TC82_Verification of check filter icon accessibility for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for App Name

@Test
Scenario: TC83_Verification of check filter icon accessibility for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Status

@Test
Scenario: TC84_Verification of check filter icon accessibility for Error
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Error

@Test
Scenario: TC85_Verification of check filter icon accessibility for Running Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify filter icon for availability for Running Version

@Test
Scenario: TC86_Verification of check filter icon accessibility for Deployment Date
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal 
Then verify filter icon for availability for Deployment Date

@Test
Scenario: TC87_Verification of check filter icon accessibility for Expected Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify filter icon for availability for Expected Version


@Test
Scenario: TC88_Verification of check filter icon accessibility for Last Updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify filter icon for availability for Last Updated


@Test
Scenario: TC89_Verification to check the coloumn width & size resolution
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify to check the coloumn width & size resolution


@Test
Scenario: TC90_Verfication of pagination i.e. items per page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on pagination part it will display default records will display

@Test
Scenario: TC91_Verfication of pagination last page & first page using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on pagination to check functionality of Full Backward arrow

@Test
Scenario: TC92_Verfication of pagination next page by using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on pagination to check functionality of Full forward arrow

@Test
Scenario: TC93_Verification of tool tip text visibilty for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify tool tip text visibilty for EDGE ID


@Test
Scenario: TC94_Verification of tool tip text visibility for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify tool tip text visibility for APP Name

@Test
Scenario: TC95_Verification of tool tip text visibility for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify tool tip text visibility for Status


@Test
Scenario: TC96_Verification of tool tip text visibility for Error
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify tool tip text visibility for Error

@Test
Scenario: TC97_Verification of tool tip text visibility for Running Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify tool tip text visibility for Running Version

@Test
Scenario: TC98_Verification of tool tip text visibility for Deployment Date
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify tool tip text visibility for Deployment Date

@Test
Scenario: TC99_Verification of tool tip text visibility for Expected Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify tool tip text visibility for Expected Version

@Test
Scenario: TC100_Verification of tool tip text visibility for Last updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify tool tip text visibility for Last updated

@Test
Scenario: TC101_Verification of tool tip text visibilty for view deployed volume details button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify tool tip text visibility for view deployed volume details button in Actions column

@Test
Scenario: TC102_Verification of tool tip text visibilty for delete button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify tool tip text visibility for for delete button in Actions column

@Test
Scenario: TC103_Verification of tool tip text visibilty for Close button in Deployed volume details in History view screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then scroll horizontal
Then verify tool tip text visibilty for Close button in Deployed volume details in History view screen

@Test
Scenario: TC104_Verification of alignment for maximize & minimize the screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify alignment for maximize & minimize the screen

@Test
Scenario: TC105_Verification of tool tip text visibilty for Close button in Deployed volume details in History view screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify tool tip text visibilty for Close button in Deployed volume details in History view screen

@Test
Scenario: TC106_Verfication to check the text varbaige for all the tool tips
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify to check the text varbaige for all the tool tips

@Test
Scenario: TC107_Verification to check the visualisation look of the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then check the visualisation look of the table list

@Test
Scenario: TC108_Verification to check the coloumn width uniformity
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then check the coloumn width uniformity

@Test
Scenario: TC109_Verification to view the show more option in Error column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button

@Test
Scenario: TC110_Verification of ascending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify sorting functionality for the table list

@Test
Scenario: TC111_Verification of descending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then verify sorting functionality for the table list

