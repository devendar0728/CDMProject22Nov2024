@SheetEDGEGROUPS
Feature: EDGEGROUPS

#@Test
#Scenario: TC001_Verification of displaying the EDGE Group table details after clicking on EDGE Group module option from side menu bar by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then land on the dashbord
#And click on EDGE Group
#Then verify user is landing on Edge Group page

#@Test
#Scenario: TC112_Verification of tool tip text visibilty for Group name
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Verification of tool tip text visibilty for Group name
#Then Verification of tool tip text visibilty for Devices connected
#Then Verification of tool tip text visibilty for Devices Active
#Then Verification of tool tip text visibilty for Status
#Then Verification of tool tip text visibilty for EDIT button in Actions column
#Then Verification of tool tip text visibilty for Delete functionality button in Actions column
#Then Verification of tool tip text visibilty for deploy functionality button in Actions column
#Then Verification of tool tip text visibilty for console functionality button in Actions column
#Then After landing on EDGE Group List screen and Mousehover on STOP icon button Verify tooltip functionality



@Test
Scenario: TC005_Verification of displaying the total number of records with pagination icons in the EDGE Group List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then after pagination all default records will display in Next page


@Test
Scenario: TC006_Verification of displaying the First page (Full Backward arrow) button in the EDGE Group List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then Pagination is in footer Below right side

@Test
Scenario: TC007_Verification of displaying the Last page (Full Forward arrow button in the EDGE Group List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then pagination all default records will display in Next page

@Test
Scenario: TC008_Verification of displaying the Next page(Forward arrow button) in the EDGE Group List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then After pagination all default records will display in Next page.

@Test
Scenario: TC009_Verification of displaying the Previous page(Backward arrow button)in the EDGE Group List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then After pagination all default records will display in Previous page.
#
#@Test
#Scenario: TC05_Verification of Refreshing button functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then land on the dashbord
#And click on EDGE Group
#Then Click on Refresh button
#Then verify page should get refresh
#
#

#
#@Test
#Scenario: TC07_Verification of Search button functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then land on the dashbord
#And click on EDGE Group
#Then Click on three dots on Device Connected functionality 
#Then enter the value of Minimum searchbox for device connected
#Then enter the value of Maximum searchbox for device connected
#Then Click on submit button
#
#
#
#

#
#@Test
#Scenario: TC09_Verification of Bulk download button functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Download icon button on the top right side
#Then verify success message appear on the screen for download
#
#
#
#@Test
#Scenario: TC10_Verification of displaying the Edit screen in the EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#Then enter text in the field of GroupName
#Then Click on Edit Edge Group button
#

#
#@Test
#Scenario: TC12_Verification of Bulk Application Deploy  functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#Then verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#Then select the single check box valid Application name with latest version tag column and click on NEXT button from Application page
#
#


@Test
Scenario: TC16_Verification of reduction in the number of records in pagination section of EDGE Group details screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then Click on Pagination is in footer Below left side

@Test
Scenario: TC17_Verification of changing the items per page functionality in the EDGE Group List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then Click on Pagination is in footer Below left side

@Test
Scenario: TC18_Verification of displaying the items per page by default i.e. 25 per page in the EDGE Group List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
Then Click on Pagination is in footer Below left side


#
#
#@Test
#Scenario: TC24_Verification of the search functionality for Group Name column (Valid Group Name) in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field.
#
#@Test
#Scenario: TC25_Verification of the search functionality for Group Name column (Invalid Group Name) in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on EDGE Group Name search icon i.e. three dots & enter Invalid inputs into search text field.
#
#
#@Test
#Scenario: TC26_Verification of the search functionality for Status column (Valid Status entry) in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the checkbox of Active under status column
#
#@Test
#Scenario: TC27_Verification of the change in colour of three dots for all columns in the EDGE Group List screen by Super admin/Admin user when search filter is applied
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then land on the dashbord
#And click on EDGE Group
#Then verify change in the colour of three dots
#
#@Test
#Scenario: TC28_Verification of the display of search bar and text for all columns in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on three dots on Device Connected functionality 
#And enter the value of Minimum searchbox for device connected
#And enter the value of Maximum searchbox for device connected
#And Click on submit button

#
#@Test
#Scenario: TC29_Verification of the removal of search results and text for all columns in the EDGE Group screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field.
#Then Click on EDGE Group name search icon i.e. three dots
#Then remove the text for GroupName
#Then Click on three dots on Device Connected functionality 
#Then enter the value of Minimum searchbox for device connected
#Then enter the value of Maximum searchbox for device connected
#And Click on submit button
#Then Click on three dots on Device Connected functionality 
#Then remove the value for minimum value for device connected
#Then remove the value for maximum device connected
#And Click on submit button
#
#
#
#@Test
#Scenario: TC30_Verification of blank value rejections in available fields of Identity section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on Add button
#Then without enter any values click on save
#Then Click on Save button to save Edge group
#
#
#@Test
#Scenario: TC31_Verification of blank value rejections in available fields of Health section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then without enter any values scroll down
#Then Click on Save button to save Edge group
#
#@Test
#Scenario: TC32_Verification of redirection functionality for Cancel icon in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then click on cancel button in EDGE Group
#
#
#@Test
#Scenario: TC33_Verification of blank value rejections in mandatory fields of deployment section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then without enter any values scroll down
#Then Click on Save button to save Edge group
#
#@obsolete
#Scenario: TC34_Verification of blank value rejections in available fields of Registration sections in Add New screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then Verification of blank value rejections in available fields of Registration sections in Add New screen of EDGE Group module by Super admin/Admin user
#
#
#@Test
#Scenario: TC35_Verification of blank value rejections in available fields of Deployment section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then without enter any values scroll down
#Then Click on Save button to save Edge group
#
#@Skip
#Scenario: TC36_Verification of blank value rejections in available fields of Configuration section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then Verification of blank value rejections in available fields of Configuration section in Add screen of EDGE Group module by Super admin/Admin user
#
#
#@Test
#Scenario: TC37_Verification of the acceptance of Numeric,Special characters & alphabets values in GROUP ID Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then Enter numeric values to check character strength into Group ID text fields
#
#@Test
#Scenario: TC38_Verification of the acceptance of Alphanumeric and special characters values in GROUP Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then Enter numeric values to check character strength into Group NAME text fields
#
#
#@Test
#Scenario: TC39_Verification of breaching the Max character limit in Group Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then Enter numeric values to check character strength into Group ID text fields
#
#
#@Test
#Scenario: TC40_Verification of breaching the Max character limit in Group Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then Enter numeric values to check character strength into Group NAME text fields
#
#@Test
#Scenario: TC41_Verification of selection of the from Application Group drop down in the Deployment section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then scroll down the page 
#And select the value from application group dropdown
#
#@Test
#Scenario: TC42_Verification of Maximum Server Nodes drop down in the deployment section of User Edit screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then scroll down the page 
#Then enter value for the maximum server nodes
#Then Click on save data for Edge Group
#
#@Test
#Scenario: TC43_Verification of Server host Address under deployment section of User Edit screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then scroll down the page 
#Then enter value for the server host address
#Then Click on save data for Edge Group
#
#@obsolete
#Scenario: TC44_Verification of selection of the from Delink EDGE Device drop down in the Configuration section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then scroll down the page 
#
#@obsolete
#Scenario: TC45_Verification of cloud button is on premise i.e.(Enable mode) in Configuration section in Add screen of EDGE Group add module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then Verification of cloud button is on premise i.e.Enable mode in Configuration section in Add screen of EDGE Group add module by Super admin/Admin user
#
#
#
#@Test
#Scenario: TC46_Verification of selection of the from Maximum Application drop down in the Configuration section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#
#@Test
#Scenario: TC47_Verification of upload of onboarding EDGE Configuration in Registration section in Edit screen of EDGE Group Edit module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then Click on Onboarding Certificate icon of Edge Configurations
#Then browse the upload document and upload for Registration section for OnBoarding Certificate
#Then Save the certificates
#
#
#
#@Test
#Scenario: TC49_Verification of Viewing of all the steppers & select the EDGE GROUP to deploy the application of EDGE Group module by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#Then select the single check box valid Application name with latest version tag column and click on NEXT button
#Then Click on Confirm button and Click on Deploy button
#
#@Test
#Scenario: TC50_Verification of select the Active APP GROUP for deploy the application of EDGE Group module by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#Then verify for Edge Group functionality
#Then verify for App Group functionality
#
#@Test
#Scenario: TC51_Verification of Single select of the Active Edge Group for deploy the application of EDGE Group module by Super admin/Admin user  & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#Then verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#
#@Test
#Scenario: TC52_Verification of mulitiple select of the  Active  Edge Group for deploy the application of EDGE Group module by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#Then verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#
#
#
#@Test
#Scenario: TC53_Verification of Single select of the Active Application for deploy of EDGE Group module by Super admin/Admin user  & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#Then verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#Then select the single check box valid Application name with latest version tag column and click on NEXT button
#
#
#@Test
#Scenario: TC54_Verification of multi select of the Active Application for deploy module of EDGE Group by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#Then verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the multiselect check box valid Application name with latest version tag column and click on NEXT button
#
#@Test
#Scenario: TC55_Verification of view of version tag when select of the Application for deploy module of EDGE Group by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the single check box valid Application name with latest version tag column and click on NEXT button
#
#@Test
#Scenario: TC56_Verification of user unable to deploy without confirming the Config file for deploy module of EDGE Group by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the single check box valid Application name with latest version tag column and click on NEXT button
#
@Test
Scenario: TC57_Verification of deployment failure on empty On boarding key in EDGE Group
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And click on EDGE Group
Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
And verify for Edge Group functionality
Then verify for App Group functionality
Then verify for Edge Name functionality
And select the single check box valid Application name with latest version tag column and click on NEXT button
#
#@Test
#Scenario: TC58_Verification of deployment failure on empty On boarding key in EDGE Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the single check box valid Application name with latest version tag column and click on NEXT button
#
#@Test
#Scenario: TC59_Verification of deployment failure on wrong /empty server port on EDGE Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the single check box valid Application name with latest version tag column and click on NEXT button
#
#@Test
#Scenario: TC60_Verification of deployment failure on wrong /empty Server Host Adress on EDGE Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the single check box valid Application name with latest version tag column and click on NEXT button
#
#
#@Test
#Scenario: TC61_Verification of deployment creation only for single newly selected application during deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the single check box valid Application name with latest App Name column and click on NEXT button
#
#
#
#@Test
#Scenario: TC62_Verification of deployment creation only for multiple newly selected application during deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#And verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#And select the single check box valid Application name with latest App Name column and click on NEXT button
#
#
#@Test
#Scenario: TC63_Verification of Check bulk Upload button functionality in the EDGE Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then land on the dashbord
#And click on EDGE Group
#And click on bulk Upload button EDGE Group
#
#@Test
#Scenario: TC64_Verification of error message verbaige for without entering details in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for without entering details in ADD Screen
#
#@Test
#Scenario: TC65_Verification of error message verbaige for entering invalid details for EDGE Group ID Text field in ADD screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for EDGE Group ID Text field
#
#
#@Test
#Scenario: TC66_Verification of error message verbaige for entering invalid details for EDGE Group Name Text field in ADD screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for EDGE Group Name Text field
#
#@Test
#Scenario: TC67_Verification of error message verbaige for entering invalid details for Sever Host Address
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for Sever Host Address
#
#@Test
#Scenario: TC68_Verification of error message verbaige for entering invalid details for Sever port
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for Sever port
#
#
#
#@Test
#Scenario: TC69_Verification of alignment for all the input text fields in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify alignment for all the input text fields in ADD Screen
#
#
#@Test
#Scenario: TC70_Verification of alignment for all the input text fields in EDIT Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#Then enter text in the field of GroupName
#Then Click on Edit Edge Group button
#And verify alignment for all the input text fields in EDIT Screen
#
#@Test
#Scenario: TC71_Verification of standarize text format for success message in toaster
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then enter all mandatory field under identity section
#Then scroll down page
#Then enter all fields under deployment
#Then Click on Save button to save Edge group
#Then verify standarize text format for success message in toaster
#
#
#@Test
#Scenario: TC72_Verification of standarize text format for error message in toaster
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then enter all mandatory field under identity section
#Then scroll down page
#Then enter all fields under deployment
#Then Click on Save button to save Edge group
#Then verify standarize text format for success message in toaster
#
#
#@Test
#Scenario: TC73_Verification of standarize text format for error message below Group ID  text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for EDGE Group ID Text field
#
#
#@Test
#Scenario: TC74_Verification of standarize text format for error message below Group Name text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message below Group Name text field
#
#
#@Test
#Scenario: TC75_Verification of standarize text format for error message below Server Host Address text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message below Server Host Address text field
#
#
#@Test
#Scenario: TC76_Verification of standarize text format for error message below Server port text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message below Server port text field
#
#
#@Test
#Scenario: TC77_Verification of check filter icon availability for Group Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify check filter icon availability for Group Name
#
#@Test
#Scenario: TC78_Verification of switching between inputs fields using TAB
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify switching between inputs fields using TAB
#
#
#@Test
#Scenario: TC79_Verification of check filter icon availability for Alarm raised
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify check filter icon availability for Alarm raised
#
#
#@Test
#Scenario: TC80_Verification of check filter icon availability for Device Connected
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify check filter icon availability for Device Connected
#
#@Test
#Scenario: TC81_Verification of check filter icon availability for Devices Active column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify check filter icon availability for Device Active
#
#
#@Test
#Scenario: TC82_Verification of check filter icon availability for Status column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify check filter icon availability for status
#
#
#@Test
#Scenario: TC83_Verification of visibilty duration to load the page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify visibilty duration to load the page
#
#@Test
#Scenario: TC84_Verification of visibilty the input field format
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify visibilty the input field format
#
#
#@Test
#Scenario: TC85_Verification of alignment of ("+" i.e. ADD,refresh,bulk upload,bulk download &bulk app deployment buttons)top right side
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And verify alignment of ADD,refresh,bulk upload,bulk download &bulk app deployment buttons top right side
#


#
#@Test
#Scenario: TC91_Verification of switching between inputs fields using TAB 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify switching between inputs fields using TAB
#


#
#
#@Test
#Scenario: TC109_Verification of pagination i.e. items per page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Pagination is in footer Below left side
#
#@Test
#Scenario: TC110_Verification of pagination last page & first page using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After pagination all default records will display in Next page.
#
#@Test
#Scenario: TC111_Verification of pagination next page by using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After pagination all default records will display in Next page.
#
#
#

#
#
#@Test
#Scenario: TC122_Verification to check the tool tip text visibilty for Input text field Health card in ADD Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then Verification to check the tool tip text visibilty for Input text field Health card in ADD Screen
#Then Verification to check the tool tip text visibilty for Input text field Deployment card in ADD Screen

#
#@Test
#Scenario: TC124_Verification to check the tool tip text visibilty for Input text field Identity card in EDIT Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And click on edit button
#Then Verification to check the tool tip text visibilty for Input text field Identity card in EDIT Screen
#Then Verification to check the tool tip text visibilty for Input text field Health card in EDIT Screen
#Then Verification to check the tool tip text visibilty for Input text field Registration card in EDIT Screen
#Then Verification to check the tool tip text visibilty for Input text field Deployment card in EDIT Screen


#@Test
#Scenario: TC128_Verification to check the tool tip text visibilty for Input text field bulk Deployment steppers
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And click on App Deployment button EDGE Group
#Then Verification to check the tool tip text visibilty for Input text field bulk Deployment steppers
#
#@Test
#Scenario: TC129_Verification of tool tip text visibilty for Close button in Console screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#When I click on a Console button link that opens a popup window
#Then I should switch to the popup window
#And I should see a tooltip on the popup window


#
#@Test
#Scenario: TC135_Verification to check the content for all the error messages
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And Verification to check the content for all the error messages
#
#


#@Test
#Scenario: TC141_Verification of Stop Functionality of Edge Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Stop button

#
#@Test
#Scenario: TC06_Verification of Add button functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button to add Edge group value
#Then enter all mandatory field under identity section
#Then scroll down page
#Then enter all fields under deployment
#Then Click on Save button to save Edge group
#Then verify success message appear on the screen
#
#
#@Test
#Scenario: TC143_Verify Edit functionality of Edge Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then Click on the three dots of GroupName
#Then enter text in the field of GroupName for Edit
#Then Click on Edit Edge Group button
#Then remove the text for Edge group Name which already entered and fill with new entry
#Then remove the text for location which already entered and fill with new entry
#Then remove the text for description which already entered and fill with new entry
#Then scroll down page
#Then choose App group for updation
#Then remove the text for Maximum Server node and fill with new entry
#Then remove the text for Server Host Address and fill with new entry
#Then remove the text for Server Port and fill with new entry
#Then Click on save data for Edge Group



#@Test
#Scenario: TC11_Verification of Delete functionality in the EDGE Group List screen by Super admin/Admin user (If few Groups are interlinked with other module)
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Delete Edge Group button
#Then confirmation message appeared for confirm delete Click on Yes to delete and No to Cancel
