package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserSettingsEditPage extends CommonActions {

	public UserSettingsEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='slider round']")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//label[@class='switch']")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(xpath = "//input[@formcontrolname='firstname']")
	WebElement firstNameInputEdit;

	@FindBy(xpath = "//input[@data-placeholder='Last Name']")
	WebElement lastNameInputEdit;

	@FindBy(xpath = "//input[@data-placeholder='Phone Number']")

	WebElement phoneNumberInputEdit;

	@FindBy(xpath = "//input[@data-placeholder='Email ID']")
	WebElement emailidInputEdit;

	@FindBy(xpath = "//input[@data-placeholder='Password']")
	WebElement passwordInputEdit;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationEdit;

	@FindBy(xpath = "//mat-select[@formcontrolname='defaultdashboard']")
	WebElement dashboardEdit;

	@FindBy(xpath = "//mat-select[@formcontrolname='rolemasterid']")
	WebElement roleNameEdit;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButtonEdit;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonEdit;

	@FindBy(xpath = "//h3[@class='subTitle']")
	WebElement headingTitleEdit;

	public void headingTitleEdit() {
		clickElement(headingTitleEdit, "");
		// headingTitleEdit.click();
	}

	public void firstNameinputEdit(String value) {
		SetInputENterKey(firstNameInputEdit, "");
		SetInput(firstNameInputEdit, value, value);

//		firstNameInputEdit.sendKeys(Keys.ENTER);
//		firstNameInputEdit.sendKeys(value);
	}

	public void lastNameinputEdit(String value) {
		SetInputENterKey(lastNameInputEdit, "");
		SetInput(lastNameInputEdit, value, value);
//		lastNameInputEdit.sendKeys(Keys.ENTER);
//		lastNameInputEdit.sendKeys(value);
	}

	public void phoneNumberInputEdit(String value) {
		SetInputENterKey(phoneNumberInputEdit, "");
		SetInput(phoneNumberInputEdit, value, value);
//		phoneNumberInputEdit.sendKeys(Keys.ENTER);
//		phoneNumberInputEdit.sendKeys(value);
	}

	public void emailidinputEdit(String value) {
		SetInputENterKey(phoneNumberInputEdit, "");
		SetInput(phoneNumberInputEdit, value, value);
//		emailidInputEdit.sendKeys(Keys.ENTER);
//		emailidInputEdit.sendKeys(value);
	}

	public void passwordInputEdit(String value) {
		SetInputENterKey(passwordInputEdit, "");
		SetInput(passwordInputEdit, value, value);
//		passwordInputEdit.sendKeys(Keys.ENTER);
//		passwordInputEdit.sendKeys(value);
	}

	public void roleNameinputEdit(String value) {
		SetInputENterKey(roleNameEdit, "");
		SetInput(roleNameEdit, value, value);
//		roleNameEdit.sendKeys(Keys.ENTER);
//		roleNameEdit.sendKeys(value);
	}

	public void organizationEdit(String value) throws InterruptedException {

		SelectMatOption(organizationEdit, value);
	}

	public void dashboardEdit(String value) throws InterruptedException {

		SelectMatOption(dashboardEdit, value);
	}

	public void roleNameEdit(String value) throws InterruptedException {
		wait(roleNameEdit, logger);
		SelectMatOption(roleNameEdit, value);
	}

	public void saveButtonEdit() {
		clickElement(saveButtonEdit, "");
		// saveButtonEdit.click();
	}

	public void cancelButtonEdit() {
		clickElement(cancelButtonEdit, "");
		cancelButtonEdit.click();
	}

	public String firstNameEditgetText() {
		return firstNameInputEdit.getText();
	}

	public String verified_str(String inputStr) {
		String regexString = "[A-Za-z]";// "^[A-Z+$]";

		if (inputStr.matches("[" + regexString + "]+")) {
			System.out.println("valid Alphabet");
		} else {

			System.out.println("Invalid character in Name field");
		}
		return null;

	}

//			public String verifyValidationMessageEdgeId1verifyValidationMessageFirstNameUser() {
//
//
//
//			}
	@FindBy(xpath = "(//input[@formcontrolname='firstname']/../../../../../span)[2]")
	WebElement validationMessageverifyValidationMessageFirstNameUser;

	@FindBy(xpath = "(//input[@formcontrolname='lastname']/../../../../div/../../span)")
	WebElement verifyValidationMessageLastNameUser;

	@FindBy(xpath = "//div[contains(text(),'Numericals of length Min = 10 & Max = 16 character')]")
	WebElement verifyValidationMessageContact;

	@FindBy(xpath = "(//input[@formcontrolname='contact']/../../../../div/../../span)[1]")
	WebElement verifyValidationMessageEditContact;

	@FindBy(xpath = "	//div[contains(text(),'Please enter a valid Phone Number !')]")
	WebElement verifyValidationMessagedigitwithSpace;

	@FindBy(xpath = "	//div[contains(text(),'Please enter a valid Phone Number !')]")
	WebElement verifyValidationMessagedigitwithZeros;

	public String verifyValidationMessageFirstNameUser() {
		if (validationMessageverifyValidationMessageFirstNameUser == null) {
			return "";
		}
		String message = validationMessageverifyValidationMessageFirstNameUser.getText();

		return message.trim();
	}

	public String verifyValidationMessageLastNameUser() {
		if (verifyValidationMessageLastNameUser == null) {
			return "";
		}
		String message = verifyValidationMessageLastNameUser.getText();

		return message.trim();
	}

	public String verifyValidationMessageContact() {
		if (verifyValidationMessageContact == null) {
			return "";
		}
		String message = verifyValidationMessageContact.getText();

		return message.trim();
	}

	public String verifyValidationMessageEditContact() {
		if (verifyValidationMessageEditContact == null) {
			return "";
		}
		String message = verifyValidationMessageEditContact.getText();

		return message.trim();
	}

	public String verifyValidationMessageContactInvalid() {
		if (verifyValidationMessageContact == null) {
			return "";
		}
		String message = verifyValidationMessageContact.getText();

		return message.trim();
	}

	public String getAttributeContact() {
		return phoneNumberInputEdit.getAttribute("value");

	}

	public String verifyValidationMessagedigitwithSpace() {
		if (verifyValidationMessageContact == null) {
			return "";
		}
		String message = verifyValidationMessagedigitwithSpace.getText();

		return message.trim();
	}

	public String verifyValidationMessagedigitwithZeros() {
		if (verifyValidationMessageContact == null) {
			return "";
		}
		String message = verifyValidationMessagedigitwithZeros.getText();

		return message.trim();
	}

	public String removalofEnteredTextForFirstNameEdit() {

		return removalofEneredText(firstNameInputEdit);

	}

	public String removalofEnteredTextForLastNameEdit() {

		return removalofEneredText(lastNameInputEdit);

	}

	public String removalofEnteredTextForPhoneNoEdit() {

		return removalofEneredText(phoneNumberInputEdit);

	}

	public String removalofEnteredTextForEmailId() {

		return removalofEneredText(emailidInputEdit);

	}

	public String removalofEnteredTextForPassword() {

		return removalofEneredText(passwordInputEdit);

	}

	public void moveSliderCondition(String m) {
		moveSliderCondition(sliderOnCheckBox, sliderOnCheckBoxLabel, m);
	}

	@FindBy(xpath = "//input[@formcontrolname='firstname']")
	WebElement firstNameEditLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement firstNameEditToolTip;

	@FindBy(xpath = "//input[@formcontrolname='lastname']")
	WebElement lastNameEditLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement lastNameEditToolTip;


	@FindBy(xpath = "//input[@formcontrolname='contact']")
	WebElement phoneNumberEditLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement phoneNumberEditToolTip;


	@FindBy(xpath = "//input[@formcontrolname='emailid']")
	WebElement emailIDEditLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement emailIDEditToolTip;


	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement passwordEditLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement passwordEditToolTip;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationEditLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement dashboardEditToolTip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement organizationEditToolTip;

	public String get_Text_ToolTipFirstNameEdit() {

		mouseHover(firstNameEditLabel);

		String firstNameEditToolTipText = firstNameEditToolTip.getText();

		firstNameEditToolTipText.trim();

		return firstNameEditToolTipText;
	}

	public String get_Text_ToolTipLastNameEdit() {

		mouseHover(lastNameEditLabel);

		String lastNameEditToolTipText = lastNameEditToolTip.getText();

		lastNameEditToolTipText.trim();

		return lastNameEditToolTipText;
	}

	public String get_Text_ToolTipPhoneNumberEdit() {
		mouseHover(phoneNumberEditLabel);

		String phoneNumberEditToolTipText = phoneNumberEditToolTip.getText();

		phoneNumberEditToolTipText.trim();

		return phoneNumberEditToolTipText;
	}

	public String get_Text_ToolTipEmailIdEdit() {
		mouseHover(emailIDEditLabel);

		String phoneNumberEditToolTipText = emailIDEditToolTip.getText();

		phoneNumberEditToolTipText.trim();

		return phoneNumberEditToolTipText;
	}

	public String get_Text_ToolTipPasswordEdit() {
		mouseHover(passwordEditLabel);

		String passwordEditToolTipText = passwordEditToolTip.getText();

		passwordEditToolTipText.trim();

		return passwordEditToolTipText;
	}

	public String get_Text_ToolTipOrganizationEdit() {
		mouseHover(organizationEditLabel);

		String organizationEditToolTipText = organizationEditToolTip.getText();

		organizationEditToolTipText.trim();

		return organizationEditToolTipText;
	}

	public Object get_Text_ToolTipdashboardDropdown() {
		mouseHover(dashboardEdit);

		String dashboardEditToolTipText = dashboardEditToolTip.getText();

		dashboardEditToolTipText.trim();

		return dashboardEditToolTipText;
	}
	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement emailThreeDot;

	public void emailThreeDot() {
		clickElement(emailThreeDot, "");

	}

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement roleNameThreeDot;

	public void roleNameThreeDot() {
		clickElement(roleNameThreeDot, "");

	}

	public void roleNameSearchInput(String string) {
		// TODO Auto-generated method stub

	}

}
