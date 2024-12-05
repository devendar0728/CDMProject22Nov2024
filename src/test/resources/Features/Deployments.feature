@SheetDEPLOYMENTS
Feature: DEPLOYMENTS

#@Test
#Scenario: TC001_Verification of displaying the Deployment table details after clicking on Deployment module option from side menu bar by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify user should land on deployments page
#
#@Test
#Scenario: TC002_Verification of Bulk download button functionality in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the Refresh button
#Then Click on the Bulk Download button
#Then verify user see download successful message and file should get downloaded for deployment
#
#
#@Test
#Scenario: TC003_Verification of tooltip functionality for info icon under Actions column of the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify tooltip for info icon
#
#
#@Test
#Scenario: TC004_Verification of the search functionality for Edge ID column (Valid Edge Name ) in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#
#
#
#@Test
#Scenario: TC005_Verification of the search functionality for App Name column (Valid App Name) in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field of App Name
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC006_Verification of the search functionality for App Name column (InValid App Name) in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on App Name search icon i.e. three dots & enter invalid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#
#@Test
#Scenario: TC007_Verification of the search functionality for Error in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on Error search icon i.e. three dots & enter Valid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC008_Verification of the search functionality for Running Version in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then Click on Running Version search icon i.e. three dots & enter Valid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC009_Verification of the search functionality for Expected Version in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then Click on Expected Version invalid search icon i.e. three dots & enter Valid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC010_Verification of the search functionality for Deployment Date in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then Click on deploymentDateThreeDot icon and enter the value in datepickercolumn
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC011_Verification of the search functionality for Last Updated version in the Deployment List screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then Click on lastupdated Three Dot icon and enter the value in datepickercolumn
#Then verify the search results are displayed on the Deployment List screen
#
#
#@Test
#Scenario: TC012_Verification of the removal of search results and text for all Edge ID Column in the Deployment screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Given User has applied a search filter on the Edge ID column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on Edge ID
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC013_Verification of the removal of search results and text for App Name columns in the Deployment screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Given User has applied a search filter on the App Name column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on App Name
#Then verify Deployment List screen should be reset to show all devices with all the APP Name
#
#@Test
#Scenario: TC014_Verfication to check all the tool tips on List page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify to check all the tool tips on Deployment List page
#
#
#@Test
#Scenario: TC015_Verification of the removal of search results and text for Running Version columns in the Deployment screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Given User has applied a search filter on the Running Version column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on Running Version
#Then verify Deployment List screen should be reset to show all devices with all the Running Version
#
#@Test
#Scenario: TC016_Verification of the removal of search results and text for Expected Version columns in the Deployment screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Given User has applied a search filter on the Expected Version column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on Expected Version
#Then verify Deployment List screen should be reset to show all devices with all the Expected Version
#
#
#Scenario: TC017_Verification of the removal of search results and text for Deployment Date columns in the Deployment screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then Click on deploymentDateThreeDot icon and enter the value in datepickercolumn
#Then click on reset button
#
#@Test
#Scenario: TC018_Verification of the removal of search results and text for Last Updated Date columns in the Deployment screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then Click on lastupdated Three Dot icon and enter the value in datepickercolumn
#Then click on reset button
#
#@Test
#Scenario: TC019_Verification of the Error column and verify link Show More screen by Super admin/Admin user on History View
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then click on the link show more from the Error column
#
#
#@Test
#Scenario: TC20_Verification of the Error column and verify link Show More screen on current view by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then click on the link show more from the Error column
#
#@Test
#Scenario: TC021_Verification of the removal of search results and text for Last Updated Date columns in the Deployment screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then Click on lastupdated Three Dot icon and enter the value in datepickercolumn
#Then verify to click on reset button
#
#@Test
#Scenario: TC022_Verification of the removal of search results and text for Deployment Date columns in the Deployment screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then Click on deploymentDateThreeDot icon and enter the value in datepickercolumn
#Then click on reset button
#
#@Test
#Scenario: TC023_Verification of the removal of search results and text for Expected Version columns in the Deployment screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Given User has applied a search filter on the Expected Version column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on Expected Version
#Then verify Deployment List screen should be reset to show all devices with all the Expected Version
#
#@Test
#Scenario: TC024_Verification of the removal of search results and text for Running Version columns in the Deployment screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Given User has applied a search filter on the Running Version column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on Running Version
#Then verify Deployment List screen should be reset to show all devices with all the Running Version
#
#@Test
#Scenario: TC025_Verification of the search functionality for Edge ID column (Valid Edge Name ) in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#
#
#
#@Test
#Scenario: TC026_Verification of the search functionality for App Name column (Valid App Name) in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on App Name search icon i.e. three dots & enter Valid inputs into search text field of App Name
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC027_Verification of the search functionality for App Name column (InValid App Name) in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on App Name search icon i.e. three dots & enter invalid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#
#@Test
#Scenario: TC028_Verification of the search functionality for Error in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on Error search icon i.e. three dots & enter Valid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC029_Verification of the search functionality for Running Version in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then Click on Running Version search icon i.e. three dots & enter Valid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC030_Verification of the search functionality for Expected Version in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then Click on Expected Version invalid search icon i.e. three dots & enter Valid inputs into search text field
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC031_Verification of the search functionality for Deployment Date in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then Click on deploymentDateThreeDot icon and enter the value in datepickercolumn
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC032_Verification of the search functionality for Last Updated version in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then Click on lastupdated Three Dot icon and enter the value in datepickercolumn
#Then verify the search results are displayed on the Deployment List screen
#
#
#@Test
#Scenario: TC033_Verification of the removal of search results and text for all Edge ID Column in the Deployment screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Given User has applied a search filter on the Edge ID column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on Edge ID
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC034_Verification of the removal of search results and text for App Name columns in the Deployment screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Given User has applied a search filter on the App Name column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on App Name
#Then verify Deployment List screen should be reset to show all devices with all the APP Name
#
#@Test
#Scenario: TC035_Verification of reduction in the number of records in pagination section of Deployment details screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verification of Click on deployment pagination it will display records will display

#@Test
#Scenario: TC036_Verification of changing the items per page functionality in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verification of Click on deployment pagination it will display records will display
#
#@Test
#Scenario: TC037_Verification of displaying the items per page by default i.e. 25 per page in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verification of Click on deployment pagination it will display records will display
#
#@Test
#Scenario: TC038_Verification of displaying the total number of records with pagination icons in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verification of Click on deployment pagination it will display records will display

#@Test
#Scenario: TC039_Verification of displaying the First page (Full Backward arrow) button in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify to Click on pagination to check functionality of Full Backward arrow

#@Test
#Scenario: TC040_Verification of displaying the Last page (Full Forward arrow button in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify to Click on deployment pagination to check full forward arrow

#@Test
#Scenario: TC041_Verification of displaying the Next page (Forward arrow button in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify Click on deployment pagination it will display records will display
#
#@Test
#Scenario: TC042_Verification of displaying the Previous page (Backward arrow button in the Deployment List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on deployment pagination it will display records will display

#@Test
#Scenario: TC043_Verification of reduction in the number of records in pagination section of Deployment details screen on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify Click on deployment pagination it will display records will display

#@Test
#Scenario: TC044_Verification of changing the items per page functionality in the Deployment List screen by Super admin/Admin user on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify Click on deployment pagination it will display records will display
#
#@Test
#Scenario: TC045_Verification of displaying the items per page by default i.e. 25 per page in the Deployment List screen by Super admin/Admin user on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify Click on deployment pagination it will display records will display
#
#@Test
#Scenario: TC046_Verification of displaying the total number of records with pagination icons in the Deployment List screen by Super admin/Admin user on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify Click on deployment pagination it will display records will display

#@Test
#Scenario: TC047_Verification of displaying the First page (Full Backward arrow) button in the Deployment List screen by Super admin/Admin user on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on pagination to check functionality of Full Backward arrow

#@Test
#Scenario: TC048_Verification of displaying the Last page (Full Forward arrow button in the Deployment List screen by Super admin/Admin user on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify to Click on deployment pagination to check full forward arrow

#@Test
#Scenario: TC049_Verification of displaying the Next page (Forward arrow button in the Deployment List screen by Super admin/Admin user on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verification of Click on deployment pagination it will display records will display
#
#@Test
#Scenario: TC050_Verification of displaying the Previous page (Backward arrow button in the Deployment List screen by Super admin/Admin user on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verification of Click on deployment pagination it will display records will display

#
#@Test
#Scenario: TC051_Verification of search functionality on volume name on view deployed Volume Details icon
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Given User has applied a search filter on the volume Name column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on volume Name
#Then verify the search results are displayed on the Deployment List screen

#
#@Test
#Scenario: TC052_Verification of search functionality on status on view deployed Volume Details icon
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Given User has applied a search filter on the status column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on status
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC053_Verification of search functionality on error on view deployed Volume Details icon
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Given User has applied a search filter on the error column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on error
#Then verify the search results are displayed on the Deployment List screen


#@Test
#Scenario: TC054_Verification of search functionality on volume name on view deployed Volume Details icon on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Given User has applied a search filter on the volume Name column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on volume Name
#Then verify the search results are displayed on the Deployment List screen

#
#@Test
#Scenario: TC055_Verification of search functionality on status on view deployed Volume Details icon on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Given User has applied a search filter on the status column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on status
#Then verify the search results are displayed on the Deployment List screen
#
#@Test
#Scenario: TC056_Verification of search functionality on error on view deployed Volume Details icon on current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
#Then Verify that the search results match the entered Edge ID
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Given User has applied a search filter on the error column
#And The search results are displayed on the Deployment List screen
#When User clears the search filter on error
#Then verify the search results are displayed on the Deployment List screen

#@Test
#Scenario: TC057_Verification of tool tip text visibilty for Close button in Deployed volume details in History view screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify tool tip text visibilty for Close button in Deployed volume details in History view screen

#
#@Test
#Scenario: TC058_Verification of sorting feature on Edge ID current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify sorting for Edge ID

#@Test
#Scenario: TC059_Verification of sorting feature of App name on current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify sorting for AppName


#@Test
#Scenario: TC060_Verification of sorting feature of Status on current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify sorting for Status
#
#@Test
#Scenario: TC061_Verification of sorting feature of error on current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then verify sorting for Error
#
#@Test
#Scenario: TC062_Verification of sorting feature of RunningVersion on current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then verify sorting for RunningVersion
#
#@Test
#Scenario: TC063_Verification of sorting feature of  ExpectedVersion on current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then verify sorting for ExpectedVersion


#@Test
#Scenario: TC064_Verification of sorting feature of  DeploymentDate on current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then verify sorting for DeploymentDate

#@Test
#Scenario: TC065_Verification of sorting feature of  LastUpdated on current view of deployment page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then verify sorting for LastUpdated
#
#@Test
#Scenario: TC066_Verification of sorting feature on Edge ID current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify sorting for Edge ID
#
#@Test
#Scenario: TC067_Verification of sorting feature of App name on current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify sorting for AppName
#
#
#@Test
#Scenario: TC068_Verification of sorting feature of Status on current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify sorting for Status
#
#@Test
#Scenario: TC069_Verification of sorting feature of error on current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then verify sorting for Error
#
#@Test
#Scenario: TC070_Verification of sorting feature of RunningVersion on current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then verify sorting for RunningVersion
#
#@Test
#Scenario: TC071_Verification of sorting feature of  ExpectedVersion on current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then verify sorting for ExpectedVersion
#
#
#@Test
#Scenario: TC072_Verification of sorting feature of  DeploymentDate on current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then verify sorting for DeploymentDate
#
#@Test
#Scenario: TC073_Verification of sorting feature of  LastUpdated on current view of deployment page on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then verify sorting for LastUpdated

#@Test
#Scenario: TC074_Verification of sorting feature of volumename on Deployed Volume Details
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify sorting for volumeName
#
#@Test
#Scenario: TC075_Verification of sorting feature on status of Deployed Volume Details
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify sorting for statusdeployvolume


#@Test
#Scenario: TC076_Verification of sorting feature on error of Deployed Volume Details
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify sorting for errordeployvolume
#
#
#@Test
#Scenario: TC077_Verification of sorting feature on created date on Deployed Volume Details
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify sorting for createdDatedeployvolume
#
#@Test
#Scenario: TC078_Verification of sorting feature of volumename on Deployed Volume Details
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify sorting for volumeName
#
#@Test
#Scenario: TC079_Verification of sorting feature on status of Deployed Volume Details
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify sorting for statusdeployvolume
#
#
#@Test
#Scenario: TC080_Verification of sorting feature on error of Deployed Volume Details
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify sorting for errordeployvolume

#
#@Test
#Scenario: TC081_Verification of close icon on the popup of deployed volume details page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then verify close icon on the popup of deployed volume details page


#@Test
#Scenario: TC082_Verification of the download status of the volume shown as a percentage on deployed volume details page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then User has applied a search filter on the Edge ID column
#Then scroll horizontal
#Then click on the view deployed Volume Details icon
#Then search for volumeName on deployed volume details page
#Then verify progress bar should display percentange of the download status of the volume shown as a percentage on deployed volume details page

#
#@Test
#Scenario: TC083_Verification of checking checkbox of RUNNING under deployment status column on the current view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then User has applied a search filter on the status
#When user uncheck the INITIAL checkbox
#Then the "INITIAL" status should not appear in the status column
#Then apart from initial other statuses should remain visible
#When user uncheck the RESOLVING_TAG checkbox
#Then the "RESOLVING_TAG" status should not appear in the status column
#Then apart from RESOLVING_TAG other statuses should remain visible
#When user uncheck the RSOLVEDTAG checkbox
#Then the "RESOLVED_TAG" status should not appear in the status column
#Then apart from RESOLVED_TAG other statuses should remain visible
#When user uncheck the DOWNLOADING checkbox
#Then the "DOWNLOADING" status should not appear in the status column
#Then apart from DOWNLOADING other statuses should remain visible
#When user uncheck the DOWNLOADED checkbox
#Then the "DOWNLOADED" status should not appear in the status column
#Then apart from DOWNLOADED other statuses should remain visible
#When user uncheck the VERIFIYING checkbox
#Then the "VERIFIYING" status should not appear in the status column
#Then apart from VERIFIYING other statuses should remain visible
#When user uncheck the VERIFIED checkbox
#Then the "VERIFIED" status should not appear in the status column
#Then apart from VERIFIED other statuses should remain visible
#When user uncheck the LOADING checkbox
#Then the "LOADING" status should not appear in the status column
#When user uncheck the FAILED checkbox
#Then the "FAILED" status should not appear in the status column
#Then apart from FAILED other statuses should remain visible
#When user uncheck the ERROR checkbox
#Then the "ERROR" status should not appear in the status column
#Then apart from ERROR other statuses should remain visible
#When user uncheck the LOADED checkbox
#Then the "LOADED" status should not appear in the status column
#Then apart from LOADED other statuses should remain visible
#When user uncheck the CREATING_VOLUME checkbox
#Then the "CREATING_VOLUME" status should not appear in the status column
#Then apart from CREATING_VOLUME other statuses should remain visible
#When user uncheck the CREATED_VOLUME checkbox
#Then the "CREATED_VOLUME" status should not appear in the status column
#Then apart from CREATED_VOLUME other statuses should remain visible
#When user uncheck the INSTALLED checkbox
#Then the "INSTALLED" status should not appear in the status column
#Then apart from INSTALLED other statuses should remain visible
#When user uncheck the AWAITNETWORKINSTANCE checkbox
#Then the "AWAITNETWORKINSTANCE" status should not appear in the status column
#Then apart from AWAITNETWORKINSTANCE other statuses should remain visible
#When user uncheck the STARTDELAYED checkbox
#Then the "STARTDELAYED" status should not appear in the status column
#Then apart from STARTDELAYED other statuses should remain visible
#When user uncheck the BOOTING checkbox
#Then the "BOOTING" status should not appear in the status column
#Then apart from BOOTING other statuses should remain visible
#When user uncheck the PAUSING checkbox
#Then the "PAUSING" status should not appear in the status column
#Then apart from PAUSING other statuses should remain visible
#When user uncheck the PAUSED checkbox
#Then the "PAUSED" status should not appear in the status column
#Then apart from PAUSED other statuses should remain visible
#When user uncheck the HALTING checkbox
#Then the "HALTING" status should not appear in the status column
#Then apart from HALTING other statuses should remain visible
#When user uncheck the HALTED checkbox
#Then the "HALTED" status should not appear in the status column
#Then apart from HALTED other statuses should remain visible
#When user uncheck the RESTARTING checkbox
#Then the "RESTARTING" status should not appear in the status column
#Then apart from RESTARTING other statuses should remain visible
#When user uncheck the PURGING checkbox
#Then the "PURGING" status should not appear in the status column
#Then apart from BROKEN other statuses should remain visible
#When user uncheck the BROKEN checkbox
#Then the "BROKEN" status should not appear in the status column
#Then apart from BROKEN other statuses should remain visible
#When user uncheck the UNKNOWN checkbox
#Then the "UNKNOWN" status should not appear in the status column
#Then apart from UNKNOWN other statuses should remain visible
#When user uncheck the MAXSTATE checkbox
#Then the "MAXSTATE" status should not appear in the status column
#Then apart from MAXSTATE other statuses should remain visible
#When user uncheck the DEPLOYMENT_STARTED checkbox
#Then the "DEPLOYMENT_STARTED" status should not appear in the status column
#Then apart from DEPLOYMENT_STARTED other statuses should remain visible
#When user uncheck the DEPLOYMENT_CREATED checkbox
#Then the "DEPLOYMENT_CREATED" status should not appear in the status column
#Then apart from DEPLOYMENT_CREATED other statuses should remain visible

#@Test
#Scenario: TC084_Verification of 'Deleted' Checkbox Inactive by Default
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then User has applied a search filter on the status
#Then the "DELETED" checkbox should not be checked


#@Test
#Scenario: TC085_Verification of checking'Deleted' Checkbox
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then User has applied a search filter on the status
#When User checks the "DELETED" checkbox
#Then The "DELETED" status should appear in the status column

#@Test
#Scenario: TC086_Verification of checking checkbox of RUNNING under deployment status column on the History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then User has applied a search filter on the status
#When user uncheck the INITIAL checkbox
#Then the "INITIAL" status should not appear in the status column
#Then apart from initial other statuses should remain visible
#When user uncheck the RESOLVING_TAG checkbox
#Then the "RESOLVING_TAG" status should not appear in the status column
#Then apart from RESOLVING_TAG other statuses should remain visible
#When user uncheck the RSOLVEDTAG checkbox
#Then the "RESOLVED_TAG" status should not appear in the status column
#Then apart from RESOLVED_TAG other statuses should remain visible
#When user uncheck the DOWNLOADING checkbox
#Then the "DOWNLOADING" status should not appear in the status column
#Then apart from DOWNLOADING other statuses should remain visible
#When user uncheck the DOWNLOADED checkbox
#Then the "DOWNLOADED" status should not appear in the status column
#Then apart from DOWNLOADED other statuses should remain visible
#When user uncheck the VERIFIYING checkbox
#Then the "VERIFIYING" status should not appear in the status column
#Then apart from VERIFIYING other statuses should remain visible
#When user uncheck the VERIFIED checkbox
#Then the "VERIFIED" status should not appear in the status column
#Then apart from VERIFIED other statuses should remain visible
#When user uncheck the LOADING checkbox
#Then the "LOADING" status should not appear in the status column
#When user uncheck the FAILED checkbox
#Then the "FAILED" status should not appear in the status column
#Then apart from FAILED other statuses should remain visible
#When user uncheck the ERROR checkbox
#Then the "ERROR" status should not appear in the status column
#Then apart from ERROR other statuses should remain visible
#When user uncheck the LOADED checkbox
#Then the "LOADED" status should not appear in the status column
#Then apart from LOADED other statuses should remain visible
#When user uncheck the CREATING_VOLUME checkbox
#Then the "CREATING_VOLUME" status should not appear in the status column
#Then apart from CREATING_VOLUME other statuses should remain visible
#When user uncheck the CREATED_VOLUME checkbox
#Then the "CREATED_VOLUME" status should not appear in the status column
#Then apart from CREATED_VOLUME other statuses should remain visible
#When user uncheck the INSTALLED checkbox
#Then the "INSTALLED" status should not appear in the status column
#Then apart from INSTALLED other statuses should remain visible
#When user uncheck the AWAITNETWORKINSTANCE checkbox
#Then the "AWAITNETWORKINSTANCE" status should not appear in the status column
#Then apart from AWAITNETWORKINSTANCE other statuses should remain visible
#When user uncheck the STARTDELAYED checkbox
#Then the "STARTDELAYED" status should not appear in the status column
#Then apart from STARTDELAYED other statuses should remain visible
#When user uncheck the BOOTING checkbox
#Then the "BOOTING" status should not appear in the status column
#Then apart from BOOTING other statuses should remain visible
#When user uncheck the PAUSING checkbox
#Then the "PAUSING" status should not appear in the status column
#Then apart from PAUSING other statuses should remain visible
#When user uncheck the PAUSED checkbox
#Then the "PAUSED" status should not appear in the status column
#Then apart from PAUSED other statuses should remain visible
#When user uncheck the HALTING checkbox
#Then the "HALTING" status should not appear in the status column
#Then apart from HALTING other statuses should remain visible
#When user uncheck the HALTED checkbox
#Then the "HALTED" status should not appear in the status column
#Then apart from HALTED other statuses should remain visible
#When user uncheck the RESTARTING checkbox
#Then the "RESTARTING" status should not appear in the status column
#Then apart from RESTARTING other statuses should remain visible
#When user uncheck the PURGING checkbox
#Then the "PURGING" status should not appear in the status column
#Then apart from BROKEN other statuses should remain visible
#When user uncheck the BROKEN checkbox
#Then the "BROKEN" status should not appear in the status column
#Then apart from BROKEN other statuses should remain visible
#When user uncheck the UNKNOWN checkbox
#Then the "UNKNOWN" status should not appear in the status column
#Then apart from UNKNOWN other statuses should remain visible
#When user uncheck the MAXSTATE checkbox
#Then the "MAXSTATE" status should not appear in the status column
#Then apart from MAXSTATE other statuses should remain visible
#When user uncheck the DEPLOYMENT_STARTED checkbox
#Then the "DEPLOYMENT_STARTED" status should not appear in the status column
#Then apart from DEPLOYMENT_STARTED other statuses should remain visible
#When user uncheck the DEPLOYMENT_CREATED checkbox
#Then the "DEPLOYMENT_CREATED" status should not appear in the status column
#Then apart from DEPLOYMENT_CREATED other statuses should remain visible


#@Test
#Scenario: TC087_Verification of 'Deleted' Checkbox Inactive by Default on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then User has applied a search filter on the status
#Then the "DELETED" checkbox should not be checked


#@Test
#Scenario: TC088_Verification of checking'Deleted' Checkbox on History view
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar
#Then Click on the History View button
#Then User has applied a search filter on the status
#When User checks the "DELETED" checkbox
#Then The "DELETED" status should appear in the status column

@Test
Scenario: TC089_Verification of deleting Old/Orphaned Deployments
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the History View button
Then Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field
Then scroll horizontal
Then click on delete button for removing old deploymnet
Then provide confirmation to delete old deployment by clicking on Yes button 
Then verify EDGE ID "12345" should no longer be visible in the deployment list

