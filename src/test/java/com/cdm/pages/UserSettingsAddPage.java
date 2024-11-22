package com.cdm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserSettingsAddPage extends CommonActions {

	public UserSettingsAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='slider round']")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//label[@class='switch']")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[1]")

	WebElement refreshButton;

	@FindBy(xpath = "//input[@formcontrolname='password']/../../../../div/../../span[1]")
	WebElement verifyValidationMessagepassnotnotentered;

	@FindBy(xpath = "//span[@class='far fa-eye-slash showpwd']")
	WebElement passwordeyeicon;

	@FindBy(xpath = "//div[@class='form-group']/div[1]")
	WebElement verifyValidationMessagepassword;

	@FindBy(xpath = "//input[@formcontrolname='firstname']")
	WebElement firstNameInputAdd;

	@FindBy(xpath = "//input[@data-placeholder='Last Name']")
	WebElement lastNameInputAdd;

	@FindBy(xpath = "//input[@data-placeholder='Phone Number']")

	WebElement phoneNumberInputAdd;

	@FindBy(xpath = "//input[@data-placeholder='Email ID']")
	WebElement emailidInputAdd;

	@FindBy(xpath = "//input[@data-placeholder='Password']")
	WebElement passwordInputAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='defaultdashboard']")
	WebElement dashboardAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='rolemasterid']")
	WebElement roleNameAdd;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButtonAdd;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonAdd;

	@FindBy(xpath = "//h3[@class='subTitle']")
	WebElement headingTitleAdd;

	public void headingTitleAdd() {
		clickElement(headingTitleAdd, "");
		// headingTitleAdd.click();
	}

	public void refreshButton() {
		clickElement(refreshButton, "");
		refreshButton.click();
	}

	public void firstNameinputAdd(String value) {
		SetInputENterKey(firstNameInputAdd, "");

		SetInput(firstNameInputAdd, value, value);
//		firstNameInputAdd.sendKeys(Keys.ENTER);
//		firstNameInputAdd.sendKeys(value);
	}

	public void lastNameinputAdd(String value) {
		SetInputENterKey(lastNameInputAdd, "");

		SetInput(lastNameInputAdd, value, value);
//		lastNameInputAdd.sendKeys(Keys.ENTER);
//		lastNameInputAdd.sendKeys(value);
	}

	public void phoneNumberInputAdd(String value) {
		SetInputENterKey(phoneNumberInputAdd, "");

		SetInput(phoneNumberInputAdd, value, value);
//
//		phoneNumberInputAdd.sendKeys(Keys.ENTER);
//		phoneNumberInputAdd.sendKeys(value);
	}

	public void emailidinputAdd(String value) {
		SetInputENterKey(emailidInputAdd, "");

		SetInput(emailidInputAdd, value, value);
//		emailidInputAdd.sendKeys(Keys.ENTER);
//		emailidInputAdd.sendKeys(value);
	}

	public void passwordInputAddControl(String value) {

		passwordInputAdd.sendKeys(Keys.CONTROL + "a");

		SetInput(passwordInputAdd, value, value);
		// passwordInputAdd.sendKeys(value);
	}

	public String passwordInputattribute() {
		return passwordInputAdd.getAttribute("value");

	}

	public void passwordInputAddPaste(String value) {
		passwordInputAdd.sendKeys(Keys.CONTROL + "v");
		passwordInputAdd.sendKeys(value);

		SetInput(passwordInputAdd, value, value);
	}

	public void passwordInputAddBackspace(String value) {
		passwordInputAdd.sendKeys(Keys.BACK_SPACE);
		// passwordInputAdd.sendKeys(value);
		SetInput(passwordInputAdd, value, value);
	}

	public void passwordInputAdd(String value) {
		passwordInputAdd.sendKeys(Keys.ENTER);
		// passwordInputAdd.sendKeys(value);
		SetInput(passwordInputAdd, value, value);
	}

	public void roleNameinputAdd(String value) throws InterruptedException {

		SelectMatOption(roleNameAdd, value);
	}

	public void organizationAdd(String value) throws InterruptedException {

		SelectMatOption(organizationAdd, value);
	}

	public void dashboardAdd(String value) throws InterruptedException {

		SelectMatOption(dashboardAdd, value);
	}

	public void roleNameAdd(String value) throws InterruptedException {

		SelectMatOption(roleNameAdd, value);
	}

	public void saveButtonAdd() throws InterruptedException {
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		// js.executeScript("arguments[0].click();",saveAddDataBtn);
//		js.executeScript("document.querySelector(\".addButton\").click();", saveButtonAdd);
		clickElement(saveButtonAdd, "");
	}

	public void cancelButtonAdd() {
		clickElement(cancelButtonAdd, "");
		cancelButtonAdd.click();
	}

	public String firstNameAddgetText() {
		return firstNameInputAdd.getText();
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

	@FindBy(xpath = "(//input[@formcontrolname='lastname']/../../../../div/../../span)[1]")
	WebElement verifyValidationMessageLastNameUser;

	@FindBy(xpath = "//input[@formcontrolname='contact']/../../../../../div")
	WebElement verifyValidationMessageContact;

	@FindBy(xpath = "//input[@formcontrolname='contact']/../../../../../span")
	WebElement verifyValidationMessageContactmandatoryfield;

	@FindBy(xpath = "//div[contains(text(),'Please enter a valid Phone Number !')]")
	WebElement verifyValidationMessagedigitwithSpace;

	@FindBy(xpath = "//div[contains(text(),'Please enter a valid Phone Number !')]")
	WebElement verifyValidationMessagedigitwithZeros;

	public String verifyValidationMessageFirstNameUser() {
		if (validationMessageverifyValidationMessageFirstNameUser == null) {
			return "";
		}
		String message = validationMessageverifyValidationMessageFirstNameUser.getText();

		return message.trim();
	}

	public void pressTabKeyOnEmailInput() {

		emailidInputAdd.sendKeys(Keys.TAB);
	}

	public boolean isNextFieldFocused() {

		return passwordInputAdd.equals(driver.switchTo().activeElement());
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

	public String verifyValidationMessageContactInvalid() {
		if (verifyValidationMessageContact == null) {
			return "";
		}
		String message = verifyValidationMessageContact.getText();

		return message.trim();
	}

	public String getAttributeContact() {
		return phoneNumberInputAdd.getAttribute("value");

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

	public String removalofEnteredTextForLastName() {

		return removalofEneredText(lastNameInputAdd);

	}

	public String verifyValidationMessagepasswordnotentered() {
		if (verifyValidationMessagepassnotnotentered == null) {
			return "";
		}
		String message = verifyValidationMessagepassnotnotentered.getText();

		return message.trim();

	}

	public String verifyValidationMessagepassword() {
		if (verifyValidationMessagepassword == null) {
			return "";
		}
		String message = verifyValidationMessagepassword.getText();

		return message.trim();

	}

	public String verifyValidationMessageContactmandatoryfield() {
		if (verifyValidationMessageContactmandatoryfield == null) {
			return "";
		}
		String message = verifyValidationMessageContactmandatoryfield.getText();

		return message.trim();

	}

	public void passwordeyeicon() throws InterruptedException {
		clickElement(passwordeyeicon, "");
		// passwordeyeicon.click();

	}

	public void verifyvalidationmessageforroleName() {

	}

	public void moveSliderCondition(String m) {
		moveSliderCondition(sliderOnCheckBox, sliderOnCheckBoxLabel, m);
	}

	@FindBy(xpath = "//input[@formcontrolname='firstname']")
	WebElement firstNameAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement firstNameAddToolTip;

	@FindBy(xpath = "//input[@formcontrolname='lastname']")
	WebElement lastNameAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement lastNameAddToolTip;

	@FindBy(xpath = "//input[@formcontrolname='contact']")
	WebElement phoneNumberAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement phoneNumberAddToolTip;

	@FindBy(xpath = "//input[@formcontrolname='emailid']")
	WebElement emailIDAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement emailIDAddToolTip;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement passwordAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement passwordAddToolTip;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement dashboardAddToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement organizationAddToolTip;

	public String get_Text_ToolTipFirstNameAdd() {

		mouseHover(firstNameAddLabel);

		String firstNameAddToolTipText = firstNameAddToolTip.getText();

		firstNameAddToolTipText.trim();

		return firstNameAddToolTipText;
	}

	public String get_Text_ToolTipLastNameAdd() {

		mouseHover(lastNameAddLabel);

		String lastNameAddToolTipText = lastNameAddToolTip.getText();

		lastNameAddToolTipText.trim();

		return lastNameAddToolTipText;
	}

	public String get_Text_ToolTipPhoneNumberAdd() {
		mouseHover(phoneNumberAddLabel);

		String phoneNumberAddToolTipText = phoneNumberAddToolTip.getText();

		phoneNumberAddToolTipText.trim();

		return phoneNumberAddToolTipText;
	}

	public String get_Text_ToolTipEmailIdAdd() {
		mouseHover(emailIDAddLabel);

		String phoneNumberAddToolTipText = emailIDAddToolTip.getText();

		phoneNumberAddToolTipText.trim();

		return phoneNumberAddToolTipText;
	}

	public String get_Text_ToolTipPasswordAdd() {
		mouseHover(passwordAddLabel);

		String passwordAddToolTipText = passwordAddToolTip.getText();

		passwordAddToolTipText.trim();

		return passwordAddToolTipText;
	}

	public String get_Text_ToolTipOrganizationAdd() {
		mouseHover(organizationAddLabel);

		String organizationAddToolTipText = organizationAddToolTip.getText();

		organizationAddToolTipText.trim();

		return organizationAddToolTipText;
	}

	public Object get_Text_ToolTipdashboardDropdown() {
		mouseHover(dashboardAdd);

		String dashboardAddToolTipText = dashboardAddToolTip.getText();

		dashboardAddToolTipText.trim();

		return dashboardAddToolTipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement roleNameToolTip;

	public Object get_Text_ToolTipRoleNameAdd() {
		mouseHover(roleNameAdd);

		String roleNameToolTipText = roleNameToolTip.getText();

		roleNameToolTipText.trim();

		return roleNameToolTipText;
	}
}
