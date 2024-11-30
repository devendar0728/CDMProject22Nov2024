@SheetNOTIFICATIONS



Feature: NOTIFICATIONS


#@Test
#Scenario: TC001_Verify that the user is able to see the License Expiry in the Notifications tab
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#
#
#@Test
#Scenario: TC002_Verify tooltips on Notification tab
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verify tooltips for notification name, Status and Actions column
#
#
#
#@Test
#Scenario: TC003_Verify sorting on Notification tab
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verify sorting for notification name
#Then verify sorting on Status for notifications tab

#@Test
#Scenario: TC004_Verification of changing the items per page functionality in the notifications List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verification of pagination on notifications page it will display records will display
#
#@Test
#Scenario: TC005_Verification of displaying the items per page by default i.e. 25 per page in the notifications List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verification of Click on Notifications pagination it will display records will display
#
#@Test
#Scenario: TC006_Verification of displaying the total number of records with pagination icons in the notifications List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verification of pagination on notifications page it will display records will display
#
#@Test
#Scenario: TC007_Verification of displaying the First page (Full Backward arrow) button in the notifications List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verify to Click on Notifications to check functionality of Full Backward arrow
#
#@Test
#Scenario: TC008_Verification of displaying the Last page (Full Forward arrow button in the notifications List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verify to Click on Notifications pagination to check full forward arrow
#
#@Test
#Scenario: TC009_Verification of displaying the Next page (Forward arrow button in the notifications List screen by Super admin/Admin user
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on notifications tab from right panel of the screen
#Then verification of pagination on notifications page it will display records will display


@Test
Scenario: TC010_Verification of user group mapping
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen
Then apply filter on Notification name
Then click on icon add user group mapping
Then select the checkbox to map user group name
Then select the checkbox to map user group name for app deployment
Then click on save button to save mapping
Then verify confirmation message "Notification sent successfully" should appear on notifications page



