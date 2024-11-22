
@SheetWELLS

Feature: WELLS
#
#
#
#@Test
#
#Scenario: TC01_Verification of Browser Compatibility of Wells module of the application
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#
#
#@Test
#
#Scenario: TC02_Verification of resizing the Well list tab as per different zoom levels
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Try increasing & decreasing the Zoom% (from 50% to 150%) from browsers
#
#
#
#@Test
#
#Scenario: TC03_Browser fragmentation verification
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Minimise the screen and observe the UI carefully
#
#Then Maximise the screen
#
#
#
#
#
#@Test
#
#Scenario: TC04_Verification of  the refresh icon refreshing the Wells list when any one filter is applied
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#Then click on refresh button
#
#
#
#
#
#@Test
#
#Scenario: TC05_Verification of the refresh icon refreshes the Wells list when more than one filter is applied
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#Then apply filter on IP Address
#
#Then click on refresh button
#
#
#
#
#
#@Test
#
#Scenario: TC06_Verification that the refresh icon does not retaining the filter applied on the well name
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#Then click on refresh button
#
#
#
#@Test
#
#Scenario: TC07_Verification that the refresh icon does not retaining the filter applied on the IP Address
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on IP Address
#
#Then click on refresh button
#
#
#
#@Test
#
#Scenario: TC08_Verification that the refresh icon does not retaining the filter applied on the Device Type
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Wells tab from right panel of the screen
#Then Click on Three Dots for Device Type
#Then apply filter on Device Type
#Then click on refresh button
#
#
#
#@Test
#
#Scenario: TC09_Verification that the refresh icon does not retaining the filter applied on the RTU Address
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Three Dots for RTU Address
#
#Then apply filter on RTU Address
#
#Then click on refresh button
#
#
#
#@Test
#
#Scenario: TC10_Verification that the refresh icon retains the filter applied on the Status
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Three Dots for Status
#
#Then select Status inActive
#
#Then click on refresh button
#
#
#
#@Test
#
#Scenario: TC11_Verification of the Add new (+) well feature on the Wells tab
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Add new icon
#
#
#
#
#
#@Test
#
#Scenario: TC12_Verification of the "Cancel" button does not add a new well
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Add new icon
#
#Then Add mandatory or all fields like Well Name,Password, IP Address, Port Number, RTUAddress, Device Type etc
#
#Then Click on cancel button from wells add page
#
#
#
#@Test
#
#Scenario: TC13_Verification of  an error is thrown when the mandatory field "Well Name" is not entered while creating a new well
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Wells tab from right panel of the screen
#Then Click on the add icon to create new Well
#Then click on save button to save well
#
#@Test
#
#Scenario: TC14_Verification of  an error is thrown when the mandatory field "SSID"is not entered while creating a new well
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Add new icon
#
#
#
#@Test
#Scenario: TC15_Verification of  an error is thrown when the mandatory field "Password"is not entered while creating a new well
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Wells tab from right panel of the screen
#Then Click on Add new icon
#Then Add all fields except Password on the Add Well Details Page
#Then click on save button to save well
#
#
#@Test
#
#Scenario: TC16_Verification of  an error is thrown when the mandatory field "IP Address"is not entered while creating a new well
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Wells tab from right panel of the screen
#Then Click on Add new icon
#Then click on save button to save well
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC17_Verification of  an error is thrown when the mandatory field "Port Number"is not entered while creating a new well
#
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Add new icon
#Then without entering port number observe error message 
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC18_To observe that the error is not thrown and a well is added successfully when the mandatory field Device Type is left blank while adding a new Well
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Wells tab from right panel of the screen
#Then Click on Add new icon
#Then without entering device type observe error message
#Then click on save button to save well
#Then verify validation message if Device Type is left blank while adding a new Well

#@Test
#
#Scenario: TC19_To observe that the error is not thrown and a well is created successfully when the non-mandatory field "RTU Address" is left blank while adding a new Well
#Given User launch application in chrome browser
#Then click on login button on home page
#And user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Wells tab from right panel of the screen
#Then Click on Add new icon
#Then Add mandatory or all fields like Well Name,Password, IP Address, Port Number, RTUAddress, Device Type etc
#
#
#
#
#
#@Test
#
#Scenario: TC20_To create a new well with active status successfully
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Add new icon
#
#Then Enter all fields required to create a new Well on the Add Well Details Page.
#
#Then Observe that the status is Active by default
#
#Then click on save button to save well
#
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC21_To create a new well with Inactive status successfully
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Add new icon
#
#Then enter the data for well and choose slider in inactive mode
#
#Then click on save button to save well
#
#
#
#
#
#@Test
#
#Scenario: TC22_Verification of the Bulk upload functionality by uploading a valid Well json file
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#
#
#@Test
#
#Scenario: TC23_Verification of the Bulk upload functionality by uploading an invalid Well file
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#Then verify validation message for invalid file
#
#
#
#
#
#@Test
#
#Scenario: TC24_Verification of the Bulk upload functionality by uploading the file not saved in csv format
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#Then verify validation message for invalid file
#
#
#
#@Test
#
#Scenario: TC25_Verification of the error message when the user hits the Upload CTA without uploading any file
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then verify validation message if directly click on upload button
#
#
#
#@Test
#
#Scenario: TC26_Verification of the error message in the Well list Bulk upload functionality by downloading the template and uploading the same
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on template download icon
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#Then verify validation message for invalid file
#
#
#
#@Test
#
#Scenario: TC27_Verification of the error message in the Well list Bulk upload functionality by creating a file missing mandatory fields in it
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on template download icon
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#
#
#@Test
#
#Scenario: TC28_Verification of the Well list Bulk download functionality
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on download icon
#
#
#
#
#
#@Test
#
#Scenario: TC29_Verification of the Well list Bulk download functionality with FIlter applied on Well name
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#Then Click on download icon
#
#
#
#@Test
#
#Scenario: TC30_Verification of the Well list Bulk download functionality with FIlter applied on IP Address
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on IP Address
#
#Then Click on download icon
#
#
#
#
#
#@Test
#
#Scenario: TC31_Verification of the Well list Bulk download functionality with FIlter applied on Device Type
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Three Dots for Device Type
#
#Then apply filter on Device Type
#
#Then Click on download icon
#
#
#
#@Test
#
#Scenario: TC32_Verification of the Well list Bulk download functionality with FIlter applied on RTU Address
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Three Dots for RTU Address
#
#Then apply filter on RTU Address
#
#Then Click on download icon
#
#
#
#
#
#@Test
#
#Scenario: TC33_Verification of the Well list Bulk download functionality with FIlter applied on Status
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#Then Click on download icon
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC35_To Search a Well using an IP Address
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on the three dots against the IP Address column inorder to search a particular Well
#
#Then Enter an IP Address to be searched in the available Search box
#
#
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC36_To Search a Well using an RTU Address
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on the three dots against the RTU Address column inorder to search a particular Well
#
#Then Enter an RTU Address to be searched in the available Search box
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC38_To Search a Well having 'Active' and 'Inactive' Status
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Three Dots for Status
#
#Then select Status inActive 
#
#
#
#
#
#@Test
#
#Scenario: TC39_To Search a Well having 'Inactive' Status
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Three Dots for Status
#
#Then deselect Active status
#
#Then select Status inActive
#
#
#
#
#
#@Test
#
#Scenario: TC40_To verify that a well is editable
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#And Click on edit button for well given in the action column
#
#
#
#
#
#@Test
#
#Scenario: TC41_Verification of  Well Name is editable
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify Well Name
#
#Then click on save button to save well
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC42_Verification of  the Device Type of a particular well is editable
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify Well Device Type
#
#
#
#
#
#@Test
#
#Scenario: TC43_Verification of  the RTU Address of a particular well is editable
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify RTU Address
#
#
#
#@Test
#
#Scenario: TC44_Verification of  the Status of a particular well is editable
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify RTU Address
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC45_Verification of  the Password of a particular well is editable
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify password
#
#Then click on save button to save well
#
#
#
#
#
#@Test
#
#Scenario: TC46_To observe the error message when the Password does not satisfy it's criteria
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify password
#
#Then verify validation message for password
#
#
#
#
#
#@Test
#
#Scenario: TC47_Verification of  the Port number of a particular well is editable
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify port number
#
#
#
#
#
#
#
#@Test
#
#Scenario: TC48_To observe the error message when an incorrect value is entered while editing Port number and to observe that the Port number of this particular well is not updated
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click on edit button for well given in the action column
#
#Then modify port number
#
#Then verify validation message for password
#
#
#
#@Test
#
#Scenario: TC49_Verification of successfully deleting a well
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click Delete button to delete well
#
#
#
#@Test
#
#Scenario: TC50_To observe that a well that is chosen for deleting and when Cancelled to do so, it does not get deleted and exists in the Wells list
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then apply filter on well name
#
#And Click Delete button to delete well
#
#Then verify  well that is chosen for deleting and when Cancelled to do so, it does not get deleted and exists in the Wells list
#
#
#
#@Test
#
#Scenario: TC51_Pagination _Verification when items per page value is set to 5
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on pagination it will display default records will display 
#
#
#
#@Test
#
#Scenario: TC52_Pagination _Verification when items per page value is set to 10
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on pagination it will display default records will display 
#
#
#
#
#
#@Test
#
#Scenario: TC53_Pagination _Verification with the default items per page value i.e 25
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on pagination it will display default records will display 
#
#
#
#@Test
#
#Scenario: TC54_Pagination _Verification when items per page value is set to 100
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Pagination is in footer Below left side
#
#
#
#
#
#@Test
#
#Scenario: TC55_Creating new Well entries by using Bulk upload functionality by uploading a valid Well template file
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#
#
#@Test
#
#Scenario: TC56_Performing bulk delete of the selected Well entries by using Bulk upload functionality by uploading a valid Well template file
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#
#
#
#
#@Test
#
#Scenario: TC57_Updating Well entries by using Bulk upload functionality by uploading a valid Well template file
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#
#
#@Test
#
#Scenario: TC58_Verify the combination of Add+Update+Delete actions in the Bulk Upload functionality
#
#Given User launch application in chrome browser
#
#Then click on login button on home page
#
#And user enters credentials and click on login button
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully
#
#Then Click on Settings module from side menu bar
#
#Then Click on Wells tab from right panel of the screen
#
#Then Click on Well Bulk upload icon at the top of the screen
#
#Then Click on choose file option from popup
#
#Then Click on Well Bulk upload icon
#
#Then Click on Upload button to upload well successfully


@Test
Scenario: TC66_Verification of the acceptance of space values in Well Name Starting & Ending of the Text field in the Settings > Wells > Update screen by Super Admin
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Wells tab from right panel of the screen
Then apply filter on well name
And Click on edit button for well given in the action column
Then Type blank space characters starting & ending in Well Name Text field in the Wells > Add screen. 
Then Message appears that only alphabetic characters are allowed
