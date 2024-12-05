@SheetLICENSES
Feature: LICENSES


@Test

Scenario: TC001_Verification of the License list Bulk download functionality and verify the downloaded file content
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on the license tracker icon
Then Click on bulk download icon and verify the downloaded file content

@Test

Scenario: TC002_To Search all licenses  using Host Id
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on three dots of host Id and enter the text for host id  

@Test

Scenario: TC003_To Search all licenses using Issued Date
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on three dots of issued date for license

@Test

Scenario: TC004_To Search all licenses using License Type filter

Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on three dots for License Type
Then enter the value for the License Type


@Test

Scenario: TC005_To Search all licenses using Version Filter
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on three dots for Version
Then enter the value for the Version

@Test

Scenario: TC006_To track all licenses using Host Id and sort it alphabetically in ascending as well as descending order and then refresh the License Tracker
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify sorting alphabetically in ascending as well as descending order and then refresh the License Tracker


@Test
Scenario: TC007_To track  all licenses using Edge Name and then sort it alphabetically in ascending as well as descending order.
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then verify sorting alphabetically in ascending as well as descending order for Edge Name and then refresh the License Tracker



@Test

Scenario: TC008_To track  all licenses using Entity Name and then sort it in ascending as well as descending order and then refresh the License Tracker.
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify sorting alphabetically in ascending as well as descending order for Entity Name and then refresh the License Tracker


@Test
Scenario: TC009_To track  all licenses using Expiry Date and then sort it in ascending as well as descending order and then refresh the License Tracker
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then verify sorting alphabetically in ascending as well as descending order for Expiry Date and then refresh the License Tracker


@Test
Scenario: TC010_To track  all licenses using Deployment Date  and then sort it in ascending as well as descending order and then refresh the License Tracker.
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then verify sorting alphabetically in ascending as well as descending order for Deployment Date and then refresh the License Tracker

@Test
Scenario: TC011_To observe the Sorting of Status column of the License Tracker in ascending and descending order and then refreshing the License tracker.
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then scroll horizontal
Then verify sorting alphabetically in ascending as well as descending order for status


@Test
Scenario: TC012_To track  all licenses having 'Inactive' status and then refresh the License Tracker.
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify status getting updated from Sent to Active

@Test
Scenario: TC013_To observe the license status getting updated from Active to Expired
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify license status getting updated from Active to Expired

@Test

Scenario: TC014_To observe the license status getting updated from Sent to failed
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify observe the license status getting updated from Sent to failed



Scenario: TC015_Pagination_Verification when items per page value is set to 5
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on pagination it will display default records will display



@Test

Scenario: TC016_Pagination_Verification when items per page value is set to 10
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on pagination it will display default records will display



@Test

Scenario: TC017_Pagination_Verification with the default items per page value i.e 25
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then Click on pagination it will display default records will display


@Test

Scenario: TC018_Pagination_Verification when items per page value is set to 100

Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then Click on pagination it will display default records will display
@Test

Scenario: TC019_Verification of check filter icon availability for Issued Date

Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on Three dots on Issue Date Filter 
Then enter the value for datepicker field


@Test

Scenario: TC020_Verification of check filter icon availability for Expiry Date
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Verification of the refresh icon when Expiry Date filter is applied


@Test

Scenario: TC021_Verification of check filter icon availability for License Type
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Verification of the refresh icon when License Type filter is applied




Scenario: TC022_Verification of check filter icon availability for Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on three dots for Version
Then enter the value for the Version

@Test
Scenario: TC023_Verification of check filter icon availability for License Type
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify check filter icon availability for License Type



@Test
Scenario: TC024_Verification of check filter icon availability for Version
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify check filter icon availability for Version

@Test
Scenario: TC025_Verification of check filter icon availability for Status
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify check filter icon availability for Status



@Test
Scenario: TC026_Verification of pagination i.e. items per page
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on pagination part it will display default records will display

@Test
Scenario: TC027_Verification of pagination last page & first page using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on pagination part it will display default records will display


@Test
Scenario: TC028_Verification of pagination last page & first page using backward & forward arrow button
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on pagination part it will display default records will display

@Test
Scenario: TC029_Verification of tool tip text visibilty for Host ID
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify tooltip  for Host ID
Then verify tooltip for Issued Date
Then verify tooltip for Expiry Date
#Then verify tool tip text visibilty for License Type
Then verify tool tip text visibilty for Version
Then verify tool tip text visibilty for  column
Then verify tool tip text visibilty for License Info from Actions column
Then verify tool tip text visibilty for License Deployment under Actions column
Then verify tool tip text visibilty for License revoke under Actions
Then verify tool tip text visibilty for Refresh button
Then verify tool tip text visibilty for License Upload button
Then verify tool tip text visibilty for License bulk download button
Then verify tool tip text visibilty for Request License button
Then verify tool tip text visibilty for License Tracker button at the top navigation



@Test
Scenario: TC030_Verification of tool tip text visibilty for EDGE Name in License Tracker Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then verify tool tip text visibilty for Edge Name

@Test
Scenario: TC031_Verification of tool tip text visibilty for EDGE Group Name in License Tracker Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then verify tool tip text visibilty for EDGE Group Name


@Test
Scenario: TC032_Verification of tool tip text visibilty for Entity Name in License Tracker Screen
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then scroll horizontal
Then verify tool tip text visibilty for Entity Name
Then verify tool tip text visibilty for Expiry Date
Then verify tool tip text visibilty for Deployment Date
Then verify tool tip text visibilty for Status license tracker
Then verify tool tip text visibilty for Refresh button in License Tracker
Then verify to check the tool tip text visibilty for Bulk Download button in License Tracker
Then verify to check the tool tip text visibilty for License Table in License Tracker



@Test
Scenario: TC033_Verification of ascending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on license tracker
Then verify to ascending order sorting functionality for the table list


@Test
Scenario: TC034_Verification of descending order sorting functionality for the table list
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then verify to descending order sorting functionality for the table list
Then click on license tracker
Then verify to ascending order sorting functionality for the table list


@Test
Scenario: TC035_Verification of the Upload License functionality
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then Click on Bulk upload icon at the top of the screen
Then Click on Bulk upload icon


@Test
Scenario: TC036_Verification of  License Step points while deploying Licenses
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Licenses module from side menu bar
Then click on three dots of Host ID and enter the value for the host id
Then Click on License deployment button
Then select edge device
Then click on Next button

