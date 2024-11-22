@SheetREPOSITORIES
Feature: REPOSITORIES

@Test
Scenario: TC01_Verification of Browser Compatibility of Repositories module of the application
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab

@Test
Scenario: TC02_Verification of resizing the Repositories module as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Try increasing & decreasing the Zoom% (from 50% to 150%) from browsers.

@Test
Scenario: TC03_Verification of viewing the Repositories table details by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab

@Test

Scenario: TC04_Verification of the Add "+"button icon on top right side of Repositories List screen by Super admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories

@Test
Scenario: TC05_Verification of Refreshing button functionality in the Repositories List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then click on refresh button

@Test
Scenario: TC06_Verification of default Items per page functionality in the Repositories List screen by Super admin/Admin user 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Pagination is in footer Below left side

@Test
Scenario: TC07_Verification of Search button functionality in the Repositories List screen 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then observe search functionality

@Test
Scenario: TC08_Verification of Pagination using backward button functionality in the Repositories List screen by user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then After pagination all default records will display in Last page.

@Test
Scenario: TC09_Verification of Pagination using Forward button functionality in the Repositories  List screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then After pagination all default records will display in Next page.

@Test
Scenario: TC010_Verification of viewing the Edit button screen in the Repositories module
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then click on Edit button to edit repositories

@Test
Scenario: TC011_Verification of Delete functionality in the  Repositories List screen by Super admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then click on Delete button

@Test
Scenario: TC012_Verification of the Edit button functionlity in the Repositories module by Super admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then click on Edit button to edit repository

@Test
Scenario: TC013_Verification of tooltip functionality for Edit icon in Actions column of the Repositories List screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then verify tooltip for Edit button for repository

@Test
Scenario: TC014_Verification of tooltip functionality for Delete icon in Actions column of the repositories List screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then verify tooltip for Delete button for repository

@Test
Scenario: TC015_Verification of tooltip functionality for add new icon on the top right side of repositories List screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then Hover the mouse on Add New button on the top right side

@Test
Scenario: TC016_Verification of saving the record without entering any details in any fields in the Repositories Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then without entering any details click on save button

@Test
Scenario: TC017_Verification of redirection to Repositories List screen on clicking Cancel button in Repositories> Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on cancel button from repositories details page to list screen

@Test

Scenario: TC018_Verification of redirection to Repositories  List screen on clicking Save Button after entering the Mandatory fields of Repositories>ADD screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then fill all mandatory fields for respositories add section
Then hit on save button to save repositories


@Test
Scenario: TC019_Verification of the acceptance of alphabet values in repository NameText field in the Repository>Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type alphabeitc characters in Repository Name Text field in the Repository > Add screen. 
Then verify Message appears that only alphabetic characters are allowed


@Test
Scenario: TC020_Verification of the acceptance of name of the valid url values in URL Text field in the Repository>Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type valid name of the application url in URL Text field in the Repository > Add screen
Then verify Message appears that only valid URL are allowed

@Test
Scenario: TC021_Verification of breaching the Max word limit in Repository Name Text field in Repository > Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type alphabeitc characters in Repository Name Text field in the Repository > Add screen.
Then verify Message appears that only alphabetic characters are allowed

@Test
Scenario: TC022_Verification of breaching the Max word limit in URL Text field in the Repository > Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type alphanumeric with special characters in Repository URL Text field in the Repository > Add screen
Then Message appears that only valid URL are allowed i.e. minimum 8 & max No limit

@Test
Scenario: TC023_Verification of the acceptance of Data storage index text field using drop down in Repository > Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then using drop drown of data storage index in Data storage index Text field in the Repository > Add screen

@Test
Scenario: TC024_Verification of the acceptance length in optional repository path text field in repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then fill the details under Repository path optional Text field in the Repository > Add screen
Then hit on save button to save repositories

@Test
Scenario: TC025_Verification of the acceptance of alphanumeric with special characters values in User NameText field in the Repository>Add screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the User Name optional Text field in the Repository > Add screen. 

@Test
Scenario: TC026_Verification of breaching the Max word limit in User Name Text field in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the value for username
Then verify message for User Name optional Text field in the Repository > Add screen

@Test
Scenario: TC027_Verification of breaching the Min word limit in User Name Text field in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the value for username
Then User Name optional Text field in the Repository > Add screen

@Test
Scenario: TC028_Verification of breaching the Min word limit in Password optional Text field in the Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen

@Test
Scenario: TC029_Verification of breaching the Max  word limit in Password optional Text field in the Repository >  Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen

@Test
Scenario: TC030_Verification of the acceptance of alphanumeric with special characters values in Password Text field in the Repository>Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen

@Test
Scenario: TC031_Verification of display default authenticate toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen


@Test
Scenario: TC032_Verification of View default Internal toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen

@Test
Scenario: TC033_Verification of view of default Status toggle button in Repository > Add screen 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Status Toggle button in the Repository > Add screen

@Test
Scenario: TC034_Verification of color of the default Status toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify colour of the toggle

@Test
Scenario: TC035_Verification of color of the default Internal toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories

@Test
Scenario: TC036_Verification of color of the default Authenticate toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories

@Test
Scenario: TC037_Verification of slide to change the Authenticate toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories

@Test
Scenario: TC038_Verification of slide to change the Internal toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories


@Test
Scenario: TC039_Verification of slide to change the Status toggle button in Repository > Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen
Then Status Toggle button in the Repository > Add screen

@Test
Scenario: TC040_Verification of Search button functionality in the Repository add  screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories

@Test
Scenario: TC041_Verification of Expand button functionality in the Repositories List screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on expand button from navigation menu

@Test
Scenario: TC042_Verification of Collapse button functionality in the Repositories List screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on collapse button from navigation menu

@Test
Scenario: TC043_Verification of Expand button functionality by click on Above Arrow mark on the top right in the Repositary > ADD  screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then On the top of the left side Click on accordion

@Test
Scenario: TC044_Verification of Collapse button functionality by click on Down Arrow mark on the top right in the Repositary > ADD  screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then check collapsible accordion functionality

@Test
Scenario: TC045_Verification of the swapping of the Status toggle option in the Identity section of User Add screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Status Toggle button in the Repository > Add screen

@Test
Scenario: TC46_Verification of error message verbaige for without entering details in Add New Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on save button to save repository

@Test
Scenario: TC47_Verification of error message verbaige for entering invalid details for Repository Name Text field in Add New screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on save button to save repository

@Test @tag="Duplicate"

Scenario: TC48_Verification of error message verbaige for entering invalid details for Repository Name Text field in Add New screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then fill invalid details and click on save respository button 


@Test
Scenario: TC49_Verification of error message verbaige for entering invalid details for URL Name Text field in Add New screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify validation message for URL without entering details


@Test
Scenario: TC50_Verification of error message verbaige for entering invalid details for Data Storage Index from drop down Text field in Add New screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify validation message for Data Storage Index without entering details

@Test
Scenario: TC51_Verification of standarize text format for success message in toaster
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the details for repository name and url
Then using drop drown of data storage index in Data storage index Text field in the Repository > Add screen
Then hit on save button to save repositories
Then check standarize text format for success message in toaster

@Test
Scenario: TC52_Verification of standarize text format for error message in toaster
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the details for repository name and url
Then using drop drown of data storage index in Data storage index Text field in the Repository > Add screen
Then hit on save button to save repositories
Then check standarize text format for error message in toaster

@Test
Scenario: TC53_Verification of standarize text format for error message below Repository Name text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify validation message for repository Name


@Test
Scenario: TC54_Verification of standarize text format for error message below URL text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify validation message for error message below URL text field

@Test
Scenario: TC55_Verification of standarize text format for error message below Data Storage index from drop down text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify validation message for Data Storage Index without entering details

@Test
Scenario: TC56_Verification of check filter icon availability for Repository Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Repository Name


@Test
Scenario: TC57_Verification of check filter icon availability for Data Storage Index 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Data Storage Index


@Test
Scenario: TC58_Verification of check filter icon availability for User Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for UserName

@Test
Scenario: TC59_Verification of check filter icon availability for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Status

@Test
Scenario: TC60_Verfication of switching between inputs fields using TAB
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify switching between inputs fields using TAB in the repository

@Test
Scenario: TC61_Verfication of visibilty duration to load the page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify visibilty duration to load the page

@Test
Scenario: TC62_Verfication of visibilty the input field format
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify visibilty the input field format

@Test
Scenario: TC63_Verfication of alignment of Add New,Refresh buttons on the top right side
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify alignment of Add New,Refresh buttons on the top right side

@Test
Scenario: TC64_Verfication of visualization of icons in action columns 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify visualization of icons in action column

@Test
Scenario: TC65_Verfication of loading properly in slow network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify page is loading properly in slow network

@Test
Scenario: TC66_Verification of the accessible the page by using mobile network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify accessible the page by using mobile network

@Test
Scenario: TC67_Verification of the accessible the screen by using wi-fi network
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify page accessible the screen by using wi-fi network

@Test
Scenario: TC68_Verification of without login into browser, copy & paste the url 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify without login into browser, copy & paste the url


@Test
Scenario: TC69_Verification of check filter icon visibility for Repository Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Repository Name


@Test
Scenario: TC70_Verification of check filter icon visibility for Data Storage Index 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Data Storage Index


@Test
Scenario: TC71_Verification of check filter icon visibility for UserName
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for UserName

@Test
Scenario: TC72_Verification of check filter icon visibility for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Status

@Test
Scenario: TC73_Verfication of visibilty duration to load the page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify visibilty duration to load the page


@Test
Scenario: TC74_Verfication of visibilty the input field format
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify visibilty the input field format


@Test
Scenario: TC75_Verification of accessbility the filter icon for repository Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Repository Name

@Test
Scenario: TC76_Verification of accessbility the filter icon for Data Storage Index 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Data Storage Index

@Test
Scenario: TC77_Verification of accessbility the filter icon for User Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for UserName

@Test
Scenario: TC78_Verification of accessbility the filter icon for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify filter icon visibility for Status

@Test
Scenario: TC79_Verification to check the coloumn width & size resolution
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the coloumn width & size resolution

@Test
Scenario: TC80_Verfication of pagination i.e. items per page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on pagination it will display default records will display

@Test
Scenario: TC81_Verfication of pagination last page & first page using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then After pagination all default records will display in Last page.

@Test
Scenario: TC82_Verfication of pagination next page by using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then After pagination all default records will display in Last page.

@Test
Scenario: TC83_Verification of tool tip text visibilty for Repository Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify tooltip for repository name

@Test
Scenario: TC84_Verification of tool tip text visibilty for Data Storage Index
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify tool tip text visibilty for Data Storage Index


@Test
Scenario: TC85_Verification of tool tip text visibilty for User Name
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify tool tip text visibilty for User Name

@Test
Scenario: TC86_Verification of tool tip text visibilty for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then verify tool tip text visibilty for Status coloumn

@Test
Scenario: TC87_Verification of tool tip text visibilty for EDIT button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then verify tool tip text visibilty for EDIT button in Actions column for repositories

@Test
Scenario: TC88_Verification of tool tip text visibilty for Delete functionality button in Actions column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then verify tool tip text visibilty for Delete functionality button in Actions column for repositories

@Test
Scenario: TC89_Verification to check the tool tip text visibilty for Repository Name Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories 
Then verify tool tip text visibilty for Repository Name Input text field in ADD Screen

@Test
Scenario: TC90_Verification to check the tool tip text visibilty for URL Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories 
Then verify tool tip text visibilty for URL Input text field in ADD Screen

@Test
Scenario: TC91_Verification to check the tool tip text visibilty for Repository Path Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories 
Then verify tool tip text visibilty for Repository Path Input text field in ADD Screen

@Test
Scenario: TC92_Verification to check the tool tip text visibilty for User Name Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories 
Then verify tool tip text visibilty for User Name Input text field in ADD Screen

@Test
Scenario: TC93_Verification to check the tool tip text visibilty for Password Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories 
Then verify tool tip text visibilty for Password Input text field in ADD Screen


@Test
Scenario: TC94_Verification to check the tool tip text visibilty for Data Storage Index drop down Input text field in ADD Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories 
Then verify tool tip text visibilty for Data Storage Index drop down Input text field in ADD Screen of repositories

@Test
Scenario: TC95_Verification to check the tool tip text visibilty for Repository Name Input text field Edit Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal
Then click on Edit button to edit repositories
Then verify tool tip text visibilty for Repository Name Input text field Edit Screen of repositories


@Test
Scenario: TC96_Verification to check the tool tip text visibilty for URL Input text field in Edit Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then verify to check the tool tip text visibilty for URL Input text field in Edit Screen


@Test
Scenario: TC97_Verification to check the tool tip text visibilty for Repository Path Input text field in Edit Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then verify to check the tool tip text visibilty for Repository Path Input text field in Edit Screen

@Test
Scenario: TC98_Verification to check the tool tip text visibilty for User Name Input text field in edit  Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then verify to check the tool tip text visibilty for Repository Path Input text field in Edit Screen

@Test
Scenario: TC99_Verification to check the tool tip text visibilty for Password Input text field in Edit Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal 
Then verify tool tip text visibilty for User Name Input text field in Edit Screen

@Test
Scenario: TC100_Verification to check the tool tip text visibilty for Data Storage Index drop down Input text field in Edit Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Scroll horizontal
Then click on Edit button to edit repositories

@Test
Scenario: TC101_Verification of alignment for maximize & minimize the screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify alignment for maximise and minimize the screen

@Test
Scenario: TC102_Verfication to check the text varbaige for all the input labels text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the text varbaige for all the input labels text field

@Test
Scenario: TC103_Verfication to check the content for all the error messages
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the text varbaige for all the input labels text field

@Test
Scenario: TC104_Verification to check the input text field format
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the text varbaige for all the input labels text field


@Test
Scenario: TC105_Verification to check the visualisation look of the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the visualisation look of the table list

@Test
Scenario: TC106_Verification to check the coloumn width uniformity
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the coloumn width uniformity

@Test
Scenario: TC107_Verfication to check the text varbaige for all the input labels text field
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the text varbaige for all the input labels text field


@Test
Scenario: TC108_Verfication to check the content for all the error messages
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the text varbaige for all the input labels text field

@Test
Scenario: TC109_Verification to check the input text field format
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the text varbaige for all the input labels text field

@Test
Scenario: TC110_Verification to check the visualisation look of the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the visualisation look of the table list

@Test
Scenario: TC111_Verification to check the coloumn width uniformity
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify to check the coloumn width uniformity

@Test
Scenario: TC112_Verfication of alignment for all the input text fields in ADD New Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify alignment for all the input text fields in ADD New Screen

@Test
Scenario: TC113_Verfication of alignment for all the input text fields in EDIT Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify alignment for all the input text fields in EDIT Screen

@Test
Scenario: TC114_Verification of standarize text format for error message below for all the text fields
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify standarize text format for error message below for all the text fields

@Test
Scenario: TC115_Verification to check the labels of input text fields
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify standarize text format for error message below for all the text fields

@Test
Scenario: TC116_Verification of ascending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify sorting functionality for the table list

@Test
Scenario: TC117_Verification of descending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on switching to Repositories tab
Then verify sorting functionality for the table list
