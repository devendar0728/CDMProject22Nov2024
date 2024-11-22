@SheetCERTIFICATES

Feature: CERTIFICATES

@Test
Scenario: TC01_Verification of Browser Compatibility of certificates module of the application
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen

@Test
Scenario: TC02_Verification of resizing the Certificates as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify page with resize option for the certificate page

@Test
Scenario: TC03_Verification of selection of certificate type "Server TLS"
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown


@Test
Scenario: TC04_Verification of selection of certificate type "Onboarding"
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown


@Test
Scenario: TC05_Verification of filling the value of IP Group Validity from Server TLS  and click on download button
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then fill the value for IP Group and validity 
Then click on download button

@Test
Scenario: TC06_Verification of filling the value of Certificate Name Organization Validity and click on download button
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then fill the value for Certificate name Organization and validity
Then click on download button

@Test
Scenario: TC07_Verification of visibilty duration to load the page
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen


@Test
Scenario: TC08_Verification of loading properly in slow network
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify page is loading properly in slow network


@Test
Scenario: TC10_Verification of the accessible the screen by using wi-fi network
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify page accessible the screen by using wi-fi network

@Test
Scenario: TC11_Verification of without login into browser, copy & paste the url
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify page without login into browser, copy & paste the url

@Test
Scenario: TC12_Verification of error message verbaige for without entering details in Servere Tls Certificate Screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then click on download button
Then verify page error message verbaige for without entering details in Servere Tls Certificate Screen


@Test
Scenario: TC13_Verification of error message verbaige for entering invalid details for  IP Text field in Server TLS screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then click on download button
Then verify page error message verbaige for entering invalid details for  IP Text field in Server TLS screen


@Test
Scenario: TC14_Verification of error message verbaige for entering invalid details for  Group Text field in Server TLS screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then click on download button
Then verify page error message verbaige for entering invalid details for  Group Text field in Server TLS screen


@Test
Scenario: TC15_Verification of error message verbaige for entering invalid details for  ValidityText field in Server TLS screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then click on download button
Then verify page error message verbaige for entering invalid details for  IP Text field in Server TLS screen



@Test
Scenario: TC16_Verification of error message verbaige for without entering details in Onboarding Certificate Screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify page  error message verbaige for without entering details in Onboarding Certificate Screen


@Test
Scenario: TC17_Verification of error message verbaige for entering invalid details for  Certificate Name Text field in Onboarding Certificate Screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify error message verbaige for entering invalid details for  Certificate Name Text field in Onboarding Certificate Screen

@Test
Scenario: TC18_Verification of error message verbaige for entering invalid details for  OrganisationText field in Onboarding Certificate Screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify error message verbaige for entering invalid details for  OrganisationText field in Onboarding Certificate Screen


@Test
Scenario: TC19_Verification of error message verbaige for entering invalid details for  ValidityText field in Onboarding Certificate Screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify error message verbaige for entering invalid details for  ValidityText field in Onboarding Certificate Screen

@Test
Scenario: TC20_Verification of standarize text format for success message in toaster
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then fill the value for Certificate name Organization and validity
Then click on download button
Then verify standarize text format for success message in toaster for certificates




@Test
Scenario: TC21_Verification of standarize text format for error message below for all the text fields
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify error message below for all the text fields


@Test
Scenario: TC22_Verification of standarize text format for error message belowCerficate Name text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify page error message verbaige for without entering details in Servere Tls Certificate Screen

@Test
Scenario: TC23_Verification of standarize text format for error message below Organisation Name text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify error message verbaige for entering invalid details for  OrganisationText field in Onboarding Certificate Screen

@Test
Scenario: TC24_Verification of standarize text format for error message below Validity text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certificate dropdown
Then click on download button
Then verify error message verbaige for entering invalid details for  ValidityText field in Onboarding Certificate Screen



@Test
Scenario: TC25_Verification of standarize text format for error message below IP text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then click on download button
Then verify page error message verbaige for entering invalid details for  IP Text field in Server TLS screen

@Test
Scenario: TC26_Verification of standarize text format for error message below Group text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then click on download button
Then verify page error message verbaige for entering invalid details for  Group Text field in Server TLS screen


@Test
Scenario: TC27_Verification of standarize text format for error message below Validity text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server TLS from certificate dropdown
Then click on download button
Then verify error message verbaige for entering invalid details for  ValidityText field in Onboarding Certificate Screen

@Test
Scenario: TC28_Verification of check filter icon availability for IP Text field Server Tls
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then check filter icon availability for IP Text field Server Tls



@Test
Scenario: TC29_Verification of check filter icon availability for Group Text field Server Tls
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then check filter icon availability for Group Text field Server Tls

@Test
Scenario: TC30_Verification of check filter icon availability for Validity Text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then check filter icon availabilityValidity Text field
@Test
Scenario: TC31_Verification of check filter icon availability for Certificate NameText field Onboarding Certificate
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then check filter icon availability for Certificate NameText field Onboarding Certificate


@Test
Scenario: TC32_Verification of check filter icon availability for Organisation  Text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then check filter icon availability for Organisation  Text field


@Test
Scenario: TC33_Verification of check filter icon availability for Validity Text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then check filter icon availability for Validity Text field



@Test
Scenario: TC34_Verfication of switching between inputs fields using TAB
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen

@Test
Scenario: TC35_Verification of check filter icon visibility for IP Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen

@Test
Scenario: TC36_Verification of check filter icon visibility for Group Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen

@Test
Scenario: TC37_Verification of check filter icon visibility for Validity
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen


@Test
Scenario: TC38_Verification of check filter icon visibility for Certificate Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen



@Test
Scenario: TC39_Verification of check filter icon visibility for Organisation Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen

@Test
Scenario: TC40_Verification of check filter icon visibility for Validity
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen


@Test
Scenario: TC41_Verification of tool tip text visibilty for IP Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen

@Test
Scenario: TC42_Verification of tool tip text visibilty for Group Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify tooltip visibility for Group Name



@Test
Scenario: TC43_Verification of tool tip text visibilty for Validity
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify tool tip text visibilty for Validity


@Test
Scenario: TC44_Verification of tool tip text visibilty for Certificate Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify tool tip text visibilty for Certificate Name

@Test
Scenario: TC45_Verification of tool tip text visibilty for Organisation Name
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify tool tip text visibilty for Organisation Name

@Test
Scenario: TC46_Verification of tool tip text visibilty for Validity
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify tool tip text visibilty for Organisation for validity

@Test
Scenario: TC47_Verfication to check the text varbaige for all the input labels text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify to check the text varbaige for all the input labels text field


@Test
Scenario: TC48_Verfication to check the content for all the error messages
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify page error message verbaige for entering invalid details for  IP Text field in Server TLS screen


@Test
Scenario: TC49_Verification to check the input text field format
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify to check the input text field format

@Test
Scenario: TC50_Verfication to check the text varbaige for all the input labels text field
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify to check the text varbaige for all the input labels text field

@Test
Scenario: TC51_Verfication to check the content for all the error messages
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify to check the content for all the error messages

@Test
Scenario: TC52_Verfication of alignment for all the input text fields in Server Tls Screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify alignment for all the input text fields in Server Tls Screen

@Test
Scenario: TC53_Verfication of alignment for all the input text fields in Onboarding Certificates Screen
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify alignment for all the input text fields in Onboarding Certificates Screen


@Test
Scenario: TC54_Verification to check the labels of input text fields
Given User launch application in chrome browser
Then click on login button on home page
And user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then verify page error message verbaige for entering invalid details for ValidityText field in Server TLS screen

