package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AppGroupsAddPage extends CommonActions {

	public AppGroupsAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@formcontrolname='appgroupname']")
	WebElement appGroupNameInput;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement appGroupDisplayNameEnterData;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupNameTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupDisplayNameTooltip;

	@FindBy(xpath = "//input[@formcontrolname='appgroupname']")
	WebElement AppGroupName;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement AppGroupDisplayName;

	public void saveButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();");
	}

	public String get_Text_ToolTipforAppGroupName() {
		mouseHover(AppGroupName);

		String appGroupNameTipText = appGroupNameTooltip.getText();

		appGroupNameTipText.trim();

		return appGroupNameTipText;
	}

	public String get_Text_ToolTipforAppGroupDisplayName() {
		mouseHover(AppGroupDisplayName);

		String appGroupDisplayNameTipText = appGroupDisplayNameTooltip.getText();

		appGroupDisplayNameTipText.trim();

		return appGroupDisplayNameTipText;
	}

	public void addAppGroupName(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", appGroupNameInput);
		SetInputENterKey(appGroupNameInput, "");
		SetInput(appGroupNameInput, value, value);

	}

	public void addAppGroupDisplayName(String value) {
		SetInputENterKey(appGroupDisplayNameEnterData, "");
		SetInput(appGroupDisplayNameEnterData, value, value);

	}

	@FindBy(css = ".calButton")
	WebElement cancelAddDataButton;

	public boolean isCancelIconVisible() {
		return cancelAddDataButton.isDisplayed();
	}

	public void cancelData() {
		clickElement(cancelAddDataButton, "");

	}

	@FindBy(xpath = "//input[@formcontrolname='appgroupname']/../../../../../../div/div")
	WebElement validationMessageForAppGroupNameCharacterLimitation;
	
	
	
	@FindBy(xpath = "//input[@formcontrolname='appgroupname']/../../../../../../div/span[1]")
	WebElement validationMessageForAppGroupNameMandatory;
	
	@FindBy(xpath = "//input[@formcontrolname='appgroupname']/../../../../../../div/div[1]")
	WebElement validationMessageForAppGroupNameinvalidApps;
	
	@FindBy(xpath = "//app-addappgroup/div[1]/div[1]/mat-nav-list/mat-expansion-panel/div/div/form/div/div[2]/div/div")
	WebElement validationMessageForAppGroupDisplayName;
	
	
	
	@FindBy(xpath = "//input[@formcontrolname='displayname']/../../../../../../div/span[1]")
	WebElement validationMessageForAppGroupDisplayNameMandatory;
	
	@FindBy(xpath = "//input[@formcontrolname='displayname']/../../../../../../div/div[1]")
	WebElement validationMessageForAppGroupDisplayNameCharacterLimitations;
	
	@FindBy(xpath = "//app-addappgroup/div[1]/div[1]/mat-nav-list/mat-expansion-panel/div/div/form/div/div[2]/div/div[1]")
	WebElement validationMessageForAppGroupDisplayNameforInvalidAppGroupDisplayName;

	public String verifyValidationMessageForAppGroupNameforMandatory() throws InterruptedException {

		Thread.sleep(2000);
		if (validationMessageForAppGroupNameMandatory == null) {
			return "";
		}
		String message = validationMessageForAppGroupNameMandatory.getText().trim();

		return message.trim();
	}

	public String verifyValidationMessageForAppGroupNameforCharacters() throws InterruptedException {

		Thread.sleep(2000);
		if (validationMessageForAppGroupNameCharacterLimitation == null) {
			return "";
		}
		String message = validationMessageForAppGroupNameCharacterLimitation.getText().trim();

		return message.trim();
	}
	
	public String verifyValidationMessageForAppGroupNameforInvalidApps() throws InterruptedException {

		Thread.sleep(2000);
		if (validationMessageForAppGroupNameinvalidApps == null) {
			return "";
		}
		String message = validationMessageForAppGroupNameinvalidApps.getText().trim();

		return message.trim();
	}

	
	public String verifyValidationMessageForAppGroupDisplayNameMandatory() throws InterruptedException {
		Thread.sleep(2000);
		if (validationMessageForAppGroupDisplayNameMandatory == null) {
			return "";
		}
		String message =  validationMessageForAppGroupDisplayNameMandatory.getText().trim();

		return message.trim();
	}
	

	public String verifyValidationMessageForAppGroupDisplayNameCharacterLimitations() throws InterruptedException {
		Thread.sleep(2000);
		if (validationMessageForAppGroupDisplayNameCharacterLimitations == null) {
			return "";
		}
		String message =  validationMessageForAppGroupDisplayNameCharacterLimitations.getText().trim();

		return message.trim();
	}
	public String verifyValidationMessageForAppGroupDisplayNameforInvalidApps() throws InterruptedException {
		Thread.sleep(2000);
		if (validationMessageForAppGroupDisplayNameforInvalidAppGroupDisplayName == null) {
			return "";
		}
		String message =  validationMessageForAppGroupDisplayNameforInvalidAppGroupDisplayName.getText().trim();

		return message.trim();
	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;

	@FindBy(xpath = "//label[@id = 'mat-form-field-label-139']")
	WebElement appGroupNameAddLabel;

	@FindBy(xpath = "//label[@id = 'mat-form-field-label-141']")
	WebElement appGroupDisplayNameAddLabel;

	public String getTextAppGroupNameLabel() {

		clickElement(appGroupNameInput, "");
		return getText(appGroupNameAddLabel);
	}

	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	public String getTextAppGroupDisplayNameLabel() {
		clickElement(AppGroupDisplayName, "");
		return getText(appGroupNameAddLabel);
	}
}
