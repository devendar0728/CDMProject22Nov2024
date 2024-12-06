@SheetUSERGROUPS
Feature: USERGROUPS

#
#@Test
#Scenario: TC001_Verification of  resizing the User Groups list tab as per different zoom levels
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then verify page with resize option the login page
#
#@Test
#Scenario: TC002_Verification of the Add new (+) User Group feature
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on add button to add user group
#Then user should see a "User Group added successfully" message on user Group page 
#
#@Test
#Scenario: TC003_To verify that a User Group is editable
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on three dots for user group and serach for user group
#Then click on Edit button to edit user group
#Then update the value for usergroup and click on save button
#Then user should see a "User Group updated successfully" message on user Group page 
#
#@Test
#Scenario: TC004_To verify that a User Group is editable and click on cancel button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on three dots for user group and serach for user group
#Then click on Edit button to edit user group
#Then click on cancel button to return back of user group list page
#Then verify user should be land on user group page
#
#
#@Test
#Scenario: TC005_Verification of successfully deleting a User Groups
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on three dots for user group and search for user group
#Then click on Delete icon from actions column to delete user group name
#Then user should see a "User Group deleted Successfully" message on user Group page 
#
#@Test
#Scenario: TC006_To observe that a User Groups that is chosen for deleting and when Cancelled to do so, it does not get deleted and exists in the User Groups list
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on three dots for user group and search for user group
#Then observe that a User Groups that is chosen for deleting and when Cancelled to do so, it does not get deleted and exists in the User Groups list
#
#
#@Test
#Scenario: TC007_To verify that mapping of active users to a user group is not successful when Cancel CTA is hit
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on add users icon
#Then click on cancel button to cancel map
#Then verify user should be land on user group page
#Then user should see a "User Group mapping done successfully" message on user Group page 
#
#@Test
#Scenario: TC008_To verify that mapping of active users to a user group is successful
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on add users icon
#Then Select the Active users by choosing users depending on wish to map
#Then user should see a "User Group mapping done successfully" message on user Group page
#
#
#@Test
#Scenario: TC009_To verify that  Inactive user cannot be mapped to a user group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on add users icon
#And select status inactive 
#
#
#@Test
#Scenario: TC010_To map new EDGE Devices to a User Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then Click on three dots of user group name and enter the value for user groups
#Then Click on the Manage Mapping icon present against a User Group
#Then Select EDGE Devices to map with the User Group
#Then Click on three dots of Edge name and enter the value for Edge Name 
#Then select the Active Edge device by checking checkbox 
#Then click on save button to save data
#Then user should see a "User Group mapping done successfully" message on user Group page
#
#@Test
#Scenario: TC011_To de-map EDGE Devices to a User Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then Click on three dots of user group name and enter the value for user groups
#Then Click on the Manage Mapping icon present against a User Group
#Then Select EDGE Devices to map with the User Group
#Then Click on three dots of Edge name and enter the value for Edge Name 
#Then deselect the Active Edge device by checking checkbox 
#Then click on save button to save data
#Then user should see a "User Group mapping done successfully" message on user Group page

#@Test
#Scenario: TC012_To map new EDGE Groups to a User Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then Click on three dots of user group name and enter the value for user groups
#Then Click on the Manage Mapping icon present against a User Group
#Then Select EDGE Groups to map with the User Group
#Then Click on three dots of Group Name and enter the value for Group Name 
#Then select the Active Group Name by checking checkbox 
#Then click on save button to save data on user group list page
#Then user should see a "User Group mapping done successfully" message on user Group page for mapping done


#@Test
#Scenario: TC013_To de-map EDGE Groups to a User Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then Click on three dots of user group name and enter the value for user groups
#Then Click on the Manage Mapping icon present against a User Group
#Then Select EDGE Groups to map with the User Group
#Then Click on three dots of Group Name and enter the value for Group Name 
#Then deselect the Active Group Name by checking checkbox 
#Then click on save button to save data
#Then user should see a "User Group mapping done successfully" message on user Group page 
#
#@Test
#Scenario: TC014_To de-map Wells to a User Group
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then Click on three dots of user group name and enter the value for user groups
#Then Click on the Manage Mapping icon present against a User Group
#Then Select EDGE Groups to map with the User Group
#Then Click on three dots of Group Name and enter the value for Group Name 
#Then deselect the Active Group Name by checking checkbox 
#Then click on save button to save data
#Then user should see a "User Group mapping done successfully" message on user Group page