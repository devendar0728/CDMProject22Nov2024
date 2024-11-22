@SheetCONFIGURATIONS
Feature: CONFIGURATIONS

@Test
Scenario: TC01_Verification of Browser Compatibility of Configurations module of the application
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Successfull login should be happen

@Test
Scenario: TC02_Verification of resizing the Configurations as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
And verify page with resize the login page


@Test
Scenario: TC03_Verification of displaying the Configurations table details after clicking on Configurations module option from side menu bar by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar


@Test
Scenario: TC04_Verification of Refreshing button functionality in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on refresh button for configuration


@Test
Scenario: TC05_Verification of current view functionality in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on current view button for configuration

@Test
Scenario: TC06_Verification of history view functionality in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on history view button for configuration


@Test
Scenario: TC07_Verification of tooltip functionality for Refresh button of the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify tooltip for the refresh button


@Test
Scenario: TC08_Verification of tooltip functionality for View Response body button of the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for the View Response body button

@Test
Scenario: TC09_Verification of changing the items per page functionality in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then Click on pagination it will display default records will display 

@Test
Scenario: TC10_Verification of displaying the items per page by default i.e. 25 per page in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
And Click on pagination it will display default records will display 

@Test
Scenario: TC11_Verification of displaying the total number of records with pagination icons in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then Click on pagination it will display default records will display 



@Test
Scenario: TC12_Verification of displaying the First page (Full Backward arrow) button in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then check full backward functionality is working


@Test
Scenario: TC13_Verification of displaying the Last page (Full Forward arrow button in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then After pagination all default records will display in Last page.


@Test
Scenario: TC14_Verification of displaying the Next page (Forward arrow button in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then After pagination all default records will display in Next page.


@Test
Scenario: TC15_Verification of displaying the Previous page (Backward arrow button in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then After pagination all default records will display in Previous page.


@Test
Scenario: TC16_Verification of tooltip functionality for Current View Button of the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify tooltip for the refresh button

@Test
Scenario: TC17_Verification of the search functionality for Edge ID column (Valid Edge ID ) in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then search for Edge ID column with valid data



@Test
Scenario: TC18_Verification of the search functionality for Edge ID column (Invalid Edge ID) in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then search for Edge ID column with invalid data



@Test
Scenario: TC19_Verification of the search functionality for App Name column (Valid App Name) in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC20_Verification of the search functionality for App Name column (InValid App Name) in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC21_Verification of the search functionality for Config Name (Valid Config Name) in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Config Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC22_Verification of the search functionality for Config Name (InValid Config Name) in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Config Name invalid search icon i.e. three dots & enter Valid inputs into search text field



@Test
Scenario: TC23_Verification of the search functionality for Response Status  in the Configurations List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Response Name valid search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC24_Verification of the removal of search results and text for all Edge ID Column in the Configurations screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Enter valid inputs into search text field and enter backspace & click on enter

@Test
Scenario: TC25_Verification of the removal of search results and text for App Name columns in the Configurations screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Enter valid inputs into search text field of app name and enter backspace & click on enter


@Test
Scenario: TC26_Verification of the removal of search results and text for Config Name in the Configurations screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Enter valid inputs into search text field of config name and enter backspace & click on enter

@Test
Scenario: TC27_Verification of the removal of search results and text for Response Status columns in the Configurations screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar


@Test
Scenario: TC28_Verification of the removal of search results and text for timestamp columns in the Configurations screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on TimeStampThreeDotSearch icon and enter the value in datepickercolumn and clear the field


@Test
Scenario: TC29_Verification of send Configuration functionality
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar



@Test
Scenario: TC30_Verification of Selecting a valid range of dates for Last Updated columns in the Configurations screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on LastUpdatedThreeDotSearch icon and enter the value in datepickercolumn

@Test
Scenario: TC31_Verification of Selecting a valid range of dates timeStamp columns in the Configurations screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on TimeStampThreeDotSearch icon and enter the value in datepickercolumn and clear the field

@Test
Scenario: TC32_Verification of View Response body icon from action column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on view response body icon from Action Column


@Test
Scenario: TC33_Verification of download button from the action column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal and Click on download button from Action column


@Test
Scenario: TC35_Verification of check filter icon availability for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then search for Edge ID column with valid data


@Test
Scenario: TC36_Verification of check filter icon availability for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC37_Verification of check filter icon availability for Config Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Config Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC38_Verification of check filter icon availability for Response Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Response Name valid search icon i.e. three dots & enter Valid inputs into search text field

@Test
Scenario: TC39_Verification of check filter icon availability for Time stamp
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on TimeStampThreeDotSearch icon and enter the value in datepickercolumn and clear the field


@Test
Scenario: TC40_Verification of check filter icon availability for Last Updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on LastUpdatedThreeDotSearch icon and enter the value in datepickercolumn


@Test
Scenario: TC41_Verification of visibilty duration to load the page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify visibility duration to load page for configuration

@Test
Scenario: TC42_Verification of visualization of icons in action column 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar



@Test
Scenario: TC43_Verification of loading properly in slow network 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify page loading properly in slow network

@Test
Scenario: TC44_Verification of the accessible the page by using mobile network 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify page accessible by using mobile network


@Test
Scenario: TC45_Verification of the accessible the screen by using wi-fi network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify accessible the screen by using wi-fi network


@Test
Scenario: TC46_Verification of without login into browser, copy & paste the url
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify without login into browser, copy & paste the url

@Test
Scenario: TC47_Verification to check the alignment of Refresh & History View buttons on the top right side
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify to check the alignment of Refresh & History View buttons on the top right side


@Test
Scenario: TC48_Verification of check filter icon visibility for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then search for Edge ID column with valid data


@Test
Scenario: TC49_Verification of check filter icon visibility for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC50_Verification of check filter icon visibility for Config Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Config Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC51_Verification of check filter icon visibility for Response Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Response Name valid search icon i.e. three dots & enter Valid inputs into search text field

@Test
Scenario: TC52_Verification of check filter icon visibility for Time stamp
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on TimeStampThreeDotSearch icon and enter the value in datepickercolumn and clear the field


@Test
Scenario: TC53_Verification of check filter icon visibility for Last Updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on LastUpdatedThreeDotSearch icon and enter the value in datepickercolumn


@Test
Scenario: TC54_Verification of check filter icon accessibility for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then search for Edge ID column with valid data


@Test
Scenario: TC55_Verification of check filter icon accessbility for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC56_Verification of check filter icon accessibility for Config Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Config Name search icon i.e. three dots & enter Valid inputs into search text field


@Test
Scenario: TC57_Verification of check filter icon accessibilty for Response Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on Response Name valid search icon i.e. three dots & enter Valid inputs into search text field

@Test
Scenario: TC58_Verification of check filter icon accessibility for Time stamp
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on TimeStampThreeDotSearch icon and enter the value in datepickercolumn and clear the field


@Test
Scenario: TC59_Verification of check filter icon accessibility f for Last Updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on LastUpdatedThreeDotSearch icon and enter the value in datepickercolumn


@Test
Scenario: TC60_Verification to check the column width & size resolution
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify column width and size resolution

@Test
Scenario: TC61_Verification of pagination i.e. items per page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then Click on pagination it will display default records will display 

@Test
Scenario: TC62_Verification of pagination last page & first page using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
And Click on pagination it will display default records will display 

@Test
Scenario: TC63_Verification of pagination next page by using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Click on History View Button
Then Click on pagination it will display default records will display 


@Test
Scenario: TC64_Verification of tool tip text visibilty for EDGE ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then verify tooltip for the Edge ID


@Test
Scenario: TC65_Verification of tool tip text visibility for APP Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for the App Name

@Test
Scenario: TC66_Verification of tool tip text visibility for Config Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for the Config Name


@Test
Scenario: TC67_Verification of tool tip text visibility for Response Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for Response Status


@Test
Scenario: TC68_Verification of tool tip text visibility for Time Stamp
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for Time Stamp

@Test
Scenario: TC69_Verification of tool tip text visibility for Last Updated
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for Time Stamp


@Test
Scenario: TC70_Verification of tool tip text visibilty for view response body details button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for view response body


@Test
Scenario: TC71_Verification of tool tip text visibilty for download button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for download button


@Test
Scenario: TC72_Verification of tool tip text visibilty for send configuration button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for send configuration button


@Test
Scenario: TC73_Verification of tool tip text visibilty for Actions
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then verify tooltip for Actions

@Test
Scenario: TC74_Verification of tool tip text visibilty for Close button in Deployed volume details in Current view screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then Scroll horizontal
Then click on view response body icon from actions column
Then verify tooltip for close button

@Test
Scenario: TC75_Verification of alignment for maximize & minimize the screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then maximise and minimize screen

@Test
Scenario: TC76_Verification to check the text varbaige for all the tool tips
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then to check the text varbaige for all the tool tips

@Test
Scenario: TC77_Verification to check the visualisation look of the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar


@Test
Scenario: TC78_Verification to check the column width uniformity
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar



@Test
Scenario: TC79_Verification of ascending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then to check ascending order sorting functionality for the table list


@Test
Scenario: TC80_Verification of descending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then to check descending order sorting functionality for the table list

