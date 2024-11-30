package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class CertificatesPage extends CommonActions {

	public CertificatesPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement toasterSuccess;

	@FindBy(xpath = "//mat-select[@role='combobox']")
	WebElement dropdownmain;

	@FindBy(xpath = "//input[@formcontrolname='ip']/../../../../../span[1]")
	WebElement validationmessageIP;

	@FindBy(xpath = "//input[@formcontrolname='group']/../../../../../span[1]")
	WebElement validationmessageGroup;

	@FindBy(xpath = "//input[@formcontrolname='duration']/../../../../../span[1]")
	WebElement validationmessageValidity;

	@FindBy(xpath = "//input[@formcontrolname='cn']/../../../../../span[1]")
	WebElement validationmessageOnboardingCertificateName;

	@FindBy(xpath = "//input[@formcontrolname='org']/../../../../../span[1]")
	WebElement validationmessageOnboardingOrganization;

	@FindBy(xpath = "//input[@formcontrolname='duration']/../../../../../span[1]")
	WebElement validationmessageOnboardingValidity;

	@FindBy(xpath = "//button[contains(text(),'Download')]")
	WebElement downloadButton;

	@FindBy(xpath = "//input[@formcontrolname='ip']")
	WebElement IPInput;

	@FindBy(xpath = "//input[@formcontrolname='cn']")
	WebElement certificateName;

	@FindBy(xpath = "//input[@formcontrolname='org']")
	WebElement OrganizationField;

	@FindBy(xpath = "//input[@formcontrolname='duration']")
	WebElement duration;

	@FindBy(xpath = "//input[@formcontrolname='group']")
	WebElement GroupInput;

	@FindBy(xpath = "//input[@formcontrolname='duration']")
	WebElement validityDay;

	@FindBy(xpath = "//a[contains(text(),'Certificates')]")
	WebElement certificateTab;

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void certificateTabClick() {
		clickElement(certificateTab, "");
		// certificateTab.click();
	}

	public void certificateType(String value) throws InterruptedException {

		SelectMatOption(dropdownmain, value);
	}

	public void IPinput(String value) {

		SetInputENterKey(IPInput, "");
		SetInput(IPInput, value, value);

	}

	public void groupInput(String value) {

		SetInputENterKey(GroupInput, "");
		SetInput(GroupInput, value, value);

//		GroupInput.sendKeys(Keys.ENTER);
//		GroupInput.sendKeys(value);
	}

	public void validitydaysinput(String value) {
		SetInputENterKey(validityDay, "");
		SetInput(validityDay, value, value);

//		validityDay.sendKeys(Keys.ENTER);
//		validityDay.sendKeys(value);
	}

	public void downloadButton() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.querySelector(\".addButton\").click();");
		clickElement(downloadButton, "");

	}

	public void certificateName(String value) {
		SetInputENterKey(certificateName, "");
		SetInput(certificateName, value, value);
//		
//		certificateName.sendKeys(Keys.ENTER);
//		certificateName.sendKeys(value);
	}

	public void OrganizationField(String value) {

		SetInputENterKey(OrganizationField, "");
		SetInput(OrganizationField, value, value);

//		OrganizationField.sendKeys(Keys.ENTER);
//		OrganizationField.sendKeys(value);
	}

	public void validitydaysinputOnboarding(String value) {

		SetInputENterKey(validityDay, "");
		SetInput(validityDay, value, value);

//		validityDay.sendKeys(Keys.ENTER);
//		validityDay.sendKeys(value);
	}

	public String validationmessageIP() {

		if (validationmessageIP == null) {
			return "";
		}
		String message = validationmessageIP.getText();

		return message.trim();
	}

	public String validationmessageGroup() throws InterruptedException {
Thread.sleep(2000);
		if (validationmessageGroup == null) {
			return "";
		}
		String message = validationmessageGroup.getText();

		return message.trim();
	}

	public String validationmessageValidity() {

		if (validationmessageValidity == null) {
			return "";
		}
		String message = validationmessageValidity.getText();

		return message.trim();
	}

	public String validationmessageOnboardingCertificateName() {

		if (validationmessageOnboardingCertificateName == null) {
			return "";
		}
		String message = validationmessageOnboardingCertificateName.getText();

		return message.trim();
	}
	public String ToasterMessageShouldBeDisplayed(String expectedMessage) {

		String actualMessage = toasterSuccess.getText();
		assert actualMessage.equals(expectedMessage) : "Expected: " + expectedMessage + ", but got: " + actualMessage;
		return actualMessage;
	}

	public String validationmessageOnboardingOrganization() throws InterruptedException {
      Thread.sleep(2000);
		if (validationmessageOnboardingOrganization == null) {
			return "";
		}
		String message = validationmessageOnboardingOrganization.getText();

		return message.trim();
	}

	public String validationmessageOnboardingValidity() {

		if (validationmessageOnboardingValidity == null) {
			return "";
		}
		String message = validationmessageOnboardingValidity.getText();

		return message.trim();
	}

	public WebElement successMessage() {

		System.out.println("InnerHTML of the element (get_attribute): " + toasterSuccess.getAttribute("innerHTML"));
		System.out.println("Title on alert popup after download>" + toasterSuccess);
		return toasterSuccess;

	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverTLSGroupTooltip;

	@FindBy(xpath = "input[@formcontrolname='group']")
	WebElement serverTLSGroup;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverTLSIPTooltip;

	@FindBy(xpath = "//input[@formcontrolname='ip']")
	WebElement serverTLSIP;

	public String get_Text_ToolTipserverTLSIP() {

		mouseHover(serverTLSIP);

		String serverTLSIPTooltipText = serverTLSIPTooltip.getText();

		serverTLSIPTooltipText.trim();

		return serverTLSIPTooltipText;
	}

	public String get_Text_ToolTipserverTLSGroup() {

		mouseHover(serverTLSGroup);

		String serverTLSGroupTooltipText = serverTLSGroupTooltip.getText();

		serverTLSGroupTooltipText.trim();

		return serverTLSGroupTooltipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverTLSValidityTooltip;

	@FindBy(xpath = "input[@formcontrolname='duration']")
	WebElement serverTLSValidity;

	@FindBy(css = ".cdk-overlay-container")
	WebElement onboardingCertificateNameTooltip;

	@FindBy(xpath = "input[@formcontrolname='cn']")
	WebElement onboardingCertificateName;

	public String get_Text_ToolTipserverTLSValidity() {

		mouseHover(serverTLSValidity);

		String serverTLSValidityTooltipText = serverTLSValidityTooltip.getText();

		serverTLSValidityTooltipText.trim();

		return serverTLSValidityTooltipText;
	}

	public String get_Text_ToolTipOnboardingCertificateName() {
		mouseHover(onboardingCertificateName);

		String onboardingCertificateNameTooltipText = onboardingCertificateNameTooltip.getText();

		onboardingCertificateNameTooltipText.trim();

		return onboardingCertificateNameTooltipText;
	}
	

	@FindBy(css = ".cdk-overlay-container")
	WebElement onboardingCertificateOrganizationTooltip;

	@FindBy(xpath = "input[@formcontrolname='org']")
	WebElement onboardingOrganization;
	public String get_Text_ToolTipOnboardingOrganizationName() {
		
		
		mouseHover(onboardingOrganization);

		String onboardingCertificateOrganizationTooltipText = onboardingCertificateOrganizationTooltip.getText();

		onboardingCertificateOrganizationTooltipText.trim();

		return onboardingCertificateOrganizationTooltipText;
	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;


	public void outerlayerclick() {
	
		clickElement(outerlayerclick, "");
	}
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-setting/div/div/div/div/app-certgenerator/div/mat-expansion-panel/div/div/div/form/div/div[1]/div/mat-form-field/div")
	WebElement IPLabel;
	
	@FindBy(xpath = "//span[contains(text(),'Please Enter Validity')]")
	WebElement ValidityLabel;

	@FindBy(xpath = "//span[contains(text(),'Please Enter Group')]")
	WebElement GroupLabel;
	
	public String getTextIPLabel() {
		clickElement(IPInput, "");
		return getText(IPLabel);
	}

	public String getTextGroupLabel() {
		clickElement(GroupInput, "");
		return getText(GroupLabel);
	}

	public String getTextValidityLabel() {
		clickElement(validityDay, "");
		return getText(ValidityLabel);
	}

}
