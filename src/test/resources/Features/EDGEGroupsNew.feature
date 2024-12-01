@SheetEDGEGROUPS
Feature: EDGEGROUPS
#
#@Test
#Scenario: TC001_Verification of displaying the EDGE Group table details after clicking on EDGE Group module option from side menu bar by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then land on the dashbord
#And click on EDGE Group
#Then verify user is landing on Edge Group page
#
#@Test
#Scenario: TC002_Verification of tool tip text visibilty for Group name
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
#Then Verification of tool tip text visibilty for console functionality button in Actions column
#Then After landing on EDGE Group List screen and Mousehover on STOP icon button Verify tooltip functionality
#
#
#
#@Test
#Scenario: TC003_Verification of displaying the total number of records with pagination icons in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then after pagination all default records will display in Next page
#
#
#@Test
#Scenario: TC004_Verification of displaying the First page (Full Backward arrow) button in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Pagination is in footer Below right side
#
#@Test
#Scenario: TC005_Verification of displaying the Last page (Full Forward arrow button in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then pagination all default records will display in Next page
#
#@Test
#Scenario: TC006_Verification of displaying the Next page(Forward arrow button) in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After pagination all default records will display in Next page.
#
#@Test
#Scenario: TC007_Verification of displaying the Previous page(Backward arrow button)in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After pagination all default records will display in Previous page.
#
#@Test
#Scenario: TC008_Verification of Refreshing button functionality in the EDGE Group List screen by Super admin/Admin user
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
#
#@Test
#Scenario: TC009_Verification of Search button functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then land on the dashbord
#And click on EDGE Group
#Then Click on three dots on Device Connected functionality
#Then enter the value of Minimum searchbox for device connected
#Then enter the value of Maximum searchbox for device connected
#Then Click on submit button
#Then verify successful operation
#
#
#@Test
#Scenario: TC010_Verification of Bulk download button functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Download icon button on the top right side
#Then verify success message appear on the screen for download
#
#@Test
#Scenario: TC011_Verification of Search button functionality for Device Active in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on three dots on Device Active functionality
#Then enter the value for Minimum searchbox for device Active
#Then enter the value for maximum searchbox for device Active
#Then Click on submit button
#Then verify successful operation
#
#@Test
#Scenario: TC012_Verification of displaying the Edit screen in the EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#Then enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then verify user is landing on Edit page
#
#
#
#@Test
#Scenario: TC013_Verification of Bulk Application Deploy  functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side 
#Then verify for Edge Group functionality
#Then verify for App Group functionality
#Then verify for Edge Name functionality
#Then verify for App Name functionality
#Then select the single check box valid Application name with App name column and click on NEXT button from Application page
#
#
#
#@Test
#Scenario: TC014_Verification of the search functionality for Group Name column (Valid Group Name) in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field.
#Then verify successful operation
#
#@Test
#Scenario: TC015_Verification of the search functionality for Group Name column (Invalid Group Name) in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on EDGE Group Name search icon i.e. three dots & enter Invalid inputs into search text field.
#Then verify successful operation
#
#
#@Test
#Scenario: TC016_Verification of the search functionality for Status column (Valid Status entry) in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the checkbox of Active under status column
#Then verify successful operation
#
#
#
#
#
#@Test
#Scenario: TC017_Verification of the removal of search results and text for all columns in the EDGE Group screen by Super admin/Admin user
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
#
#@Test
#Scenario: TC018_Verification of blank value rejections in available fields of Identity section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on Add button
#Then without enter any values click on save
#Then Click on Save button to save Edge group
#
#
#
#@Test
#Scenario: TC019_Verification of blank value rejections in available fields of Health section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then without enter any values scroll down
#Then Click on Save button to save Edge group
#
#@Test
#Scenario: TC020_Verification of redirection functionality for Cancel icon in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then click on cancel button in EDGE Group
#Then verify user is returned back to Edge Group list page
#
#
#@Test
#Scenario: TC021_Verification of blank value rejections in mandatory fields of deployment section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then without enter any values scroll down
#Then Click on Save button to save Edge group
#
#
#@Test
#Scenario: TC022_Verification of blank value rejections in available fields of Deployment section in Add screen of EDGE Group module by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then without enter any values scroll down
#Then Click on Save button to save Edge group
#
#
#@Test
#Scenario: TC023_Verification of the acceptance of Numeric,Special characters & alphabets values in GROUP ID Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then verify Enter numeric values to check character strength into Group ID text fields
#
#@Test
#Scenario: TC024_Verification of the acceptance of Alphanumeric and special characters values in GROUP Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then verify Enter numeric values to check character strength into Group NAME text fields
#
#
#@Test
#Scenario: TC025_Verification of breaching the Max character limit in Group Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then verify Enter numeric values to check character strength into Group ID text fields
#
#
#@Test
#Scenario: TC026_Verification of breaching the Max character limit in Group Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#Then verify Enter numeric values to check character strength into Group NAME text fields
#
#
#
#@Test
#Scenario: TC027_Verification of upload of onboarding EDGE Configuration in Registration section in Edit screen of EDGE Group Edit module by Super admin/Admin user
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
#Scenario: TC028_Verification of Viewing of all the steppers & select the EDGE GROUP to deploy the application of EDGE Group module by Super admin/Admin user & Operator users
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
#
@Test
Scenario: TC029_Verification of Check bulk Upload button functionality in the EDGE Group
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on EDGE Group module from side menu bar
And click on bulk Upload button EDGE Group
Then the user clicks on the "Choose File" option from the popup for Edge Group
Then the user clicks on the "Upload" button for Edge Group
Then verify confirmation message "Edge Group added successfully" should appear on the Edge Group List page
#
#
#@Test
#Scenario: TC030_Verification of error message verbaige for entering invalid details for EDGE Group Name Text field in ADD screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for EDGE Group Name Text field
#
#@Test
#Scenario: TC031_Verification of error message verbaige for entering invalid details for Sever Host Address
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for Sever Host Address
#
#@Test
#Scenario: TC032_Verification of error message verbaige for entering invalid details for Sever port
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message verbaige for entering invalid details for Sever port
#
#@Test
#Scenario: TC033_Verification of standarize text format for error message below Group Name text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message below Group Name text field
#
#
#@Test
#Scenario: TC034_Verification of standarize text format for error message below Server Host Address text field
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify error message below Server Host Address text field
#
#@Test
#Scenario: TC035_Verification of switching between inputs fields using TAB
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on Add button
#And verify switching between inputs fields using TAB
#
#
#@Test
#Scenario: TC036_Verification to check the tool tip text visibilty for Input text field Identity card in EDIT Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#And click on edit button
#Then Verification to check the tool tip text visibilty for Input text field Identity card in EDIT Screen
#Then Verification to check the tool tip text visibilty for Input text field Registration card in EDIT Screen
#Then Verification to check the tool tip text visibilty for Input text field Deployment card in EDIT Screen
#
#
#
#@Test
#Scenario: TC037_Verification of tool tip text visibilty for Close button in Console screen
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#When user click on a Console button link that opens a popup window
#Then user should switch to the popup window
#And user should see a tooltip on the popup window
#
#@Test
#Scenario: TC038_Verification of Stop Functionality of Edge Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#And click on EDGE Group
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Stop button
#
#
#@Test
#Scenario: TC039_Verification of Add button functionality in the EDGE Group List screen by Super admin/Admin user
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
#Scenario: TC040_Verify Edit functionality of Edge Group
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
#Scenario: TC041_Verification of Delete functionality in the EDGE Group List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#And enter text in the field of GroupName
#Then Click on Delete Edge Group button
#Then confirmation message appeared for confirm delete Click on Yes to delete and No to Cancel

#
#@Test
#Scenario: TC042_Verification of all Tooltips on Edge Group List page 
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then verify all tooltips on Edge Group List page
#
#
#@Test
#Scenario: TC043_Verification sorting on Group Name  
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then verify sorting on Group Name


#
#@Test
#Scenario: TC044_Verification sorting on Device Active
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then verify sorting on Device Active
#
#
#@Test
#Scenario: TC045_Verification sorting on Device Connected
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then verify sorting on Device Connected
#
#@Test
#Scenario: TC046_Verification sorting on Status
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then verify sorting on Status

#@Test
#Scenario: TC047_Verification of all Tooltips on Edge Group Add page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then After landing on EDGE Group List screen and Click on Add button
#Then verify all tooltips on Edge Group Add page


#@Test
#Scenario: TC048_Verification of all Tooltips on Edge Group Edit page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on EDGE Group module from side menu bar
#Then Click on the three dots of GroupName
#Then enter text in the field of GroupName
#Then Click on Edit Edge Group button
#Then verify all tooltips on Edge Group Edit page


