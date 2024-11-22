@SheetLICENSES
Feature: LICENSES

#@Test
#
#Scenario: TC01_Verification of  Browser Compatibility of licenses  module of the application
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#Scenario: TC02_Resizing_login_page_screen
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#And Successfull login should be happen
#
#And verify page with resize the login page
#
#
#
#@Test
#Scenario: TC03_Verification user should be land on the License module
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#
#
#@Test
#
#Scenario: TC04_Verification of the refresh icon when Host Id filter is applied
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of  the refresh icon when Host Id filter is applied
#
#
#
#@Test
#
#Scenario: TC05_Verification of  the refresh icon when Issued Date filter is applied
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on Three dots on Issue Date Filter 
#
#Then enter the value for datepicker field
#
#Then Verification of  the refresh icon when Issued Date filter iss applied
#
#
#
#@Test
#
#Scenario: TC06_Verification of the refresh icon when Expiry Date filter is applied
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of the refresh icon when Expiry Date filter is applied
#
#
#
#@Test
#
#Scenario: TC07_Verification of the refresh icon when License Type filter is applied
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of the refresh icon when License Type filter is applied
#
#
#
#@Test
#
#Scenario: TC08_Verification of  the refresh icon when License Date filter is applied
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of  the refresh icon when License Date filter is applied
#
#
#
#@Test
#
#Scenario: TC09_Verification of the refresh icon when more than one filter is applied
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of the refresh icon when more than one filter is applied
#
#
#
#@Test
#
#Scenario: TC10_Verification of the Add License functionality
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on the Add License icon
#
#
#
#@Test
#
#Scenario: TC11_Verification of the error messgae in the Add License functionality
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on Add license button 
#
#Then upload invalid license file and click on upload button
#
#
#
#@Test
#
#Scenario: TC12 _Verification of the error message when the user hits the Upload CTA without uploading any file
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on Add license button 
#
#Then click on upload button to verify validation message
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC13_Verify the status of an expired License as 'Inactive' in the License Table
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on status three dot and choose status as inactive 
#
#
#
#
#
#@Test
#
#Scenario: TC14_Verification of the License list Bulk download functionality and verify the downloaded file content
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on the license tracker icon
#
#Then Click on bulk download icon and verify the downloaded file content
#
#
#
#@Test
#
#Scenario: TC15_Verification of the Bulk download functionality with FIlter applied on Host Id
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on the license tracker icon
#
#Then apply filter on host Id
#
#Then Click on bulk download icon and verify the downloaded file content
#
#
#
#@Test
#
#Scenario: TC16_Verification of the Bulk download functionality with FIlter applied on Issued Date
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then apply filter on issued date
#
#Then enter the value for datepicker field
#
#Then Click on bulk download icon on license table page 
#
#
#
#
#
#@Test
#
#Scenario: TC17_Verification of the Bulk download functionality with FIlter applied on Expiry Date
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then apply filter on expiry date
#Then enter the value for datepicker field for expiry date
#Then Click on bulk download icon and verify the downloaded file content
#
#
#
#@Test
#
#Scenario: TC18_Verification of the Bulk download functionality with FIlter applied on License type
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then apply filter on License Type
#
#Then Click on bulk download icon on license table page 
#
#
#
#@Test
#
#Scenario: TC19 _Verification of the Bulk download functionality with FIlter applied on Deployment Date
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#Then click on bulk download icon
#
#@Test
#
#Scenario: TC20_To Search all licenses  using Host Id
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on three dots of host Id and enter the text for host id  
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC21_To Search all licenses using Issued Date
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on three dots of issued date for license
#
#
#
#
#
#@Test
#
#Scenario: TC22_To Search all licenses  using Expiry Date filter
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of the refresh icon when Expiry Date filter is applied
#
#
#
#@Test
#
#Scenario: TC23_To Search all licenses using License Type filter
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on three dots for License Type
#
#Then enter the value for the License Type
#
#
#
#
#
#@Test
#
#Scenario: TC24_To Search all licenses using Version Filter
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on three dots for Version
#
#Then enter the value for the Version
#
#
#
#
#
#@Test
#
#Scenario: TC25_To verify the License tracker tool tip
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then verify tooltip for the License Tracker
#
#
#
#
#
#@Test
#
#Scenario: TC26_To track all licenses using Host Id and sort it alphabetically in ascending as well as descending order and then refresh the License Tracker
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then verify sorting alphabetically in ascending as well as descending order and then refresh the License Tracker
#
#
#@Test
#Scenario: TC27_To track  all licenses using Edge Name and then sort it alphabetically in ascending as well as descending order.
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on license tracker
#
#Then verify sorting alphabetically in ascending as well as descending order for Edge Name and then refresh the License Tracker
#
#
#
#@Test
#
#Scenario: TC28_To track  all licenses using Entity Name and then sort it in ascending as well as descending order and then refresh the License Tracker.
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then verify sorting alphabetically in ascending as well as descending order for Entity Name and then refresh the License Tracker
#
#
#@Test
#Scenario: TC29_To track  all licenses using Expiry Date and then sort it in ascending as well as descending order and then refresh the License Tracker
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on license tracker
#
#Then verify sorting alphabetically in ascending as well as descending order for Expiry Date and then refresh the License Tracker
#
#
#@Test
#Scenario: TC30_To track  all licenses using Deployment Date  and then sort it in ascending as well as descending order and then refresh the License Tracker.
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on license tracker
#
#Then verify sorting alphabetically in ascending as well as descending order for Deployment Date and then refresh the License Tracker
#
#@Test
#Scenario: TC31_To observe the Sorting of Status column of the License Tracker in ascending and descending order and then refreshing the License tracker.
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on license tracker
#
#Then scroll horizontal
#
#Then verify sorting alphabetically in ascending as well as descending order for status
#
#
#@Test
#Scenario: TC32_To track all licenses having Sent status and observe that they have a revoke icon enabled & then refresh the License Tracker
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#
#@Test
#Scenario: TC33_To track all licenses having Active status and observe that they have a revoke icon enabled & then refresh the License Tracker
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#
#Scenario: TC34_To track  all licenses having 'Expired' status and then refresh the License Tracker. Also observe the state of the 'Revoke' tooltip in the corresponding Actions column
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#
#@Test
#
#Scenario: TC35_To track  all licenses having 'Failed' status and then refresh the License Tracker. Also observe the state of the 'Revoke' tooltip in the corresponding Actions column
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#@Test
#
#Scenario: TC36_To track all licenses having Revoked status and then refresh the License Tracker
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC37_To track  all licenses having 'Inactive' status and then refresh the License Tracker.
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify status getting updated from Sent to Active
#
#
#@Test
#Scenario: TC38_To observe the license status getting updated from Sent to Active when the EDGE Device sends Acknowledgement to CDM via COMM App and that the Available Quota does not change
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC39_To observe the license status getting updated from Active to Expired
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then verify icense status getting updated from Active to Expired
#
#@Test
#
#Scenario: TC40_To observe the license status getting updated from Sent to failed
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#Then verify observe the license status getting updated from Sent to failed
#
#
#@Test
#
#Scenario: TC41_To observe the license status getting updated from Revoked to Failed
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then wait for window eight hours
#
#@Test
#Scenario: TC42_To observe the license status getting updated from Revoked to Inactive
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#
#Scenario: TC43_To be able to bulk download the list in the License Tracker and verify the downloaded file
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#
#Scenario: TC44_To observe the Resync button updating theTracker status from Sent to Active
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#
#Scenario: TC45_To observe the Resync button updating theTracker status from Revoked to Failed
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#
#Scenario: TC47_Verification of tooltip functionality for 'delete' present in the Actions column of the License module
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#
#Scenario: TC48_To observe that a license that is chosen for deleting and when Cancelled to do so, does not get deleted and exists within the License list
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#
#Scenario: TC49_Verification the count of available quota reducing by 1 on the successful License deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#
#Scenario: TC50_Verification the count of available quota reducing by 1 on the successful License deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#
#Scenario: TC51_Verification the count of available quota reducing by 1 on the successful License deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#
#Scenario: TC52_Verification the count of available quota reducing by 1 on the successful License deployment
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC53_Verification of the License deployment process when there is no quota available
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC54_Verification that License deployment cannot be proceeded when there is no Edge device selected on the Edge step
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#Scenario: TC55_Verification of the Revoke license functionality available in the Actions column of the License Table
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC56_License Expiry  _Verification
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#Scenario: TC57_To verify that Duplicate Licenses fails to be allocated and error message is thrown
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC58_To verify that Duplicate Licenses fails to be allocated and error message is thrown
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC59_To verify that the License deployment fails when the user tries to deploy duplicate License in Sent status on the multiple Edge Device
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#Scenario: TC60_To verify that the License deployment fails when the user tries to deploy duplicate License in 'Active' on the multiple Edge Device
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#Scenario: TC61_To verify that the License deployment fails when the user tries to deploy duplicate License in 'Sent' on a new Edge Device & multiple Entity Name
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#@Test
#Scenario: TC62_Verification the error message while deploying  same License on  more than Edge Devices
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#@Test
#Scenario: TC63_To observe the license allocation failure when more than 1 Entities have same License deployed on the same Edge Device
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#
#
#
@Test

Scenario: TC64_Pagination_Verification when items per page value is set to 5

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Licenses module from side menu bar

Then Click on pagination it will display default records will display





@Test

Scenario: TC65_Pagination_Verification when items per page value is set to 10

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Licenses module from side menu bar

Then Click on pagination it will display default records will display



@Test

Scenario: TC66_Pagination_Verification with the default items per page value i.e 25

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Licenses module from side menu bar
Then click on license tracker

Then Click on pagination it will display default records will display


@Test

Scenario: TC67_Pagination_Verification when items per page value is set to 100

Given User launch application in chrome browser

Then click on login button on home page

When user enters credentials and click on login button

Then Click on Licenses module from side menu bar

Then click on license tracker

Then Click on pagination it will display default records will display
#
#
#@Test
#
#Scenario: TC68_Verification of check filter icon availability for Host ID
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then Verification of  the refresh icon when Host Id filter is applied
#
#@Test
#
#Scenario: TC69_Verification of check filter icon availability for Issued Date
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Click on Three dots on Issue Date Filter 
#
#Then enter the value for datepicker field
#
#
#@Test
#
#Scenario: TC70_Verification of check filter icon availability for Expiry Date
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of the refresh icon when Expiry Date filter is applied
#
#
#@Test
#
#Scenario: TC71_Verification of check filter icon availability for License Type
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then Verification of the refresh icon when License Type filter is applied
#
#
#
#
#Scenario: TC72_Verification of check filter icon availability for Version
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#When user enters credentials and click on login button
#
#Then Click on Licenses module from side menu bar
#
#Then click on three dots for Version
#
#Then enter the value for the Version
#
#@Test
#Scenario: TC73_Verification of check filter icon availability for Status
#
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then Click on status three dot
#
#@Test
#Scenario: TC74_Verification of visibilty duration to load the page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify the visibilty duration to load the page
#
#@Test
#Scenario: TC75_Verification of visualization of icons in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify visualization of icons in Actions column 
#
#@Test
#Scenario: TC76_Verification of loading properly in slow network
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify page is loading properly in slow network
#
#@Test
#Scenario: TC77_Verification of the accessible the page by using mobile network
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify page accessible the page by using mobile network
#
#@Test
#Scenario: TC78_Verification of the accessible the screen by using wi-fi network
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify page accessible the screen by using wi-fi network
#
#
#@Test
#Scenario: TC79_Verification of without login into browser, copy & paste the url
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify page accessible the screen by using wi-fi network
#
#
#@Test
#Scenario: TC80_Verification of accessbility the filter icon for Host ID
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify page accessbility the filter icon for Host ID
#
#@Test
#Scenario: TC81_Verification of accessbility the filter icon for Issued Date
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify page accessbility filter icon for Issued Date
#
#
#@Test
#Scenario: TC82_Verification of accessbility the filter icon for Expiry Date
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify page accessbility the filter icon for Expiry Date
#
#
#@Test
#Scenario: TC83_Verification of check filter icon availability for License Type
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify check filter icon availability for License Type
#
#
#
#@Test
#Scenario: TC84_Verification of check filter icon availability for Version
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify check filter icon availability for Version
#
#@Test
#Scenario: TC85_Verification of check filter icon availability for Status
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify check filter icon availability for Status
#
#@Test
#Scenario: TC86_Verification to check the coloumn width & size resolution
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify to check the coloumn width & size resolution
#
#
#@Test
#Scenario: TC87_Verification of pagination i.e. items per page
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then Click on pagination part it will display default records will display
#
#@Test
#Scenario: TC88_Verification of pagination last page & first page using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then Click on pagination part it will display default records will display
#
#
#@Test
#Scenario: TC89_Verification of pagination last page & first page using backward & forward arrow button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then Click on pagination part it will display default records will display
#
#@Test
#Scenario: TC90_Verification of tool tip text visibilty for Host ID
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tooltip  for Host ID
#
#@Test
#Scenario: TC91_Verification of tool tip text visibilty for Issued Date
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tooltip for Issued Date
#
#
#
#
#@Test
#Scenario: TC92_Verification of tool tip text visibilty for Expiry Date
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tooltip for Expiry Date
#
#@Test
#Scenario: TC93_Verification of tool tip text visibilty for License Type
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for License Type
#
#@Test
#Scenario: TC94_Verification of tool tip text visibilty for Version
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for Version
#
#@Test
#Scenario: TC95_Verification of tool tip text visibilty for Status
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for  column
#
#@Test
#Scenario: TC96_Verification of tool tip text visibilty for License Info button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for License Info from Actions column
#
#@Test
#Scenario: TC97_Verification of tool tip text visibilty for License Deployment  button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for License Deployment under Actions column
#
#@Test
#Scenario: TC98_Verification of tool tip text visibilty for License revoke  in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for License revoke under Actions
#
#
#@Test
#Scenario: TC99_Verification of tool tip text visibilty for Activate License button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for Activate License button in Actions column
#
#
#@Test
#Scenario: TC100_Verification of tool tip text visibilty for Deactivate License button in Actions column
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for deActivate License button in Actions column
#
#
#@Test
#Scenario: TC101_Verification to check the tool tip text visibilty for Refresh button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for Refresh button
#
#@Test
#Scenario: TC102_Verification to check the tool tip text visibilty for License Upload button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for License Upload button
#
#@Test
#Scenario: TC103_Verification to check the tool tip text visibilty for Bulk download button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for License bulk download button
#
#
#
#@Test
#Scenario: TC104_Verification to check the tool tip text visibilty for Request License button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for Request License button
#
#@Test
#Scenario: TC105_Verification to check the tool tip text visibilty for License Tracker button
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify tool tip text visibilty for License Tracker button at the top navigation
#
#
#@Test
#Scenario: TC106_Verification of alignment for maximize & minimize the screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify alignment for maximize & minimize the screen
#
#@Test
#Scenario: TC107_Verification of tool tip text visibilty for Host ID in License Tracker Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify tool tip text visibilty for Host ID
#
#
#@Test
#Scenario: TC108_Verification of tool tip text visibilty for EDGE Name in License Tracker Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify tool tip text visibilty for Edge Name
#
#@Test
#Scenario: TC109_Verification of tool tip text visibilty for EDGE Group Name in License Tracker Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify tool tip text visibilty for EDGE Group Name
#
#
#@Test
#Scenario: TC110_Verification of tool tip text visibilty for Entity Name in License Tracker Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify tool tip text visibilty for Entity Name
#
#@Test
#Scenario: TC111_Verification of tool tip text visibilty for Expiry Date in License Tracker Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify tool tip text visibilty for Expiry Date
#
#
#@Test
#Scenario: TC112_Verification of tool tip text visibilty for Deployment Date in License Tracker Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then scroll horizontal
#Then verify tool tip text visibilty for Deployment Date
#
#@Test
#Scenario: TC113_Verification of tool tip text visibilty for Status in License Tracker Screen
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then scroll horizontal
#Then verify tool tip text visibilty for Status license tracker
#
#@Test
#Scenario: TC114_Verification to check the tool tip text visibilty for Refresh button in License Tracker
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify tool tip text visibilty for Refresh button in License Tracker
#
#
#@Test
#Scenario: TC115_Verification to check the tool tip text visibilty for Bulk Download button in License Tracker
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify to check the tool tip text visibilty for Bulk Download button in License Tracker
#
#@Test
#Scenario: TC116_Verification to check the tool tip text visibilty for License Table  button in License Tracker
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify to check the tool tip text visibilty for License Table in License Tracker
#
#
#@Test
#Scenario: TC117_Verification of ascending order sorting functionality for the table list
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify to ascending order sorting functionality for the table list
#
#
#@Test
#Scenario: TC118_Verification of descending order sorting functionality for the table list
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then verify to descending order sorting functionality for the table list
#Then click on license tracker
#Then verify to ascending order sorting functionality for the table list
#
#@Test
#Scenario: TC119_Verification of  the refresh icon when Version filter is applied
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on license tracker
#Then verify refresh icon when Version filter is applied
#
#
#@Test
#Scenario: TC120_Verification of the Upload License functionality
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then Click on Bulk upload icon at the top of the screen
#Then Click on Bulk upload icon
#
#
#@Test
#Scenario: TC121_Verification of  License Step points while deploying Licenses
#Given User launch application in chrome browser
#Then click on login button on home page
#When user enters credentials and click on login button
#Then Click on Licenses module from side menu bar
#Then click on three dots of Host ID and enter the value for the host id
#Then Click on License deployment button
#Then select edge device
#Then click on Next button
#
