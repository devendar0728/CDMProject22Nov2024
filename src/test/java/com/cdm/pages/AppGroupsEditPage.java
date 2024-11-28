package com.cdm.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AppGroupsEditPage extends CommonActions {

	public AppGroupsEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//div[@id='cdk-accordion-child-1']/div/form/div/div[2]
	@FindBy(xpath = "//app-addappgroup/div[1]/div[1]/mat-nav-list/mat-expansion-panel/div/div/form/div/div[2]/div/div[1]")
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

	public String get_Text_ToolTipforAppGroupDisplayNameEdit() {
		mouseHover(AppGroupDisplayName);

		String appGroupDisplayNameTipText = appGroupDisplayNameTooltip.getText();

		appGroupDisplayNameTipText.trim();

		return appGroupDisplayNameTipText;
	}

	public void editAppGroupName(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", appGroupNameInput);
		SetInputENterKey(appGroupNameInput, "");
		SetInput(appGroupNameInput, value, value);

	}

	public void editAppGroupDisplayName(String value) {
		SetInputENterKey(appGroupDisplayNameEnterData, "");
		SetInput(appGroupDisplayNameEnterData, value, value);

	}
	
	public void tabKey() {
		appGroupNameInput.sendKeys(Keys.TAB);
		appGroupDisplayNameEnterData.sendKeys(Keys.TAB);
	}

	@FindBy(css = ".calButton")
	WebElement cancelAddDataButton;

	public boolean isCancelIconVisible() {
		return cancelAddDataButton.isDisplayed();
	}

	public void cancelData() {
		clickElement(cancelAddDataButton, "");

	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;

	@FindBy(xpath = "//label[@aria-owns ='mat-input-0']")
	WebElement appGroupNameEditLabel;

	@FindBy(xpath = "//label[@aria-owns ='mat-input-1']")
	WebElement appGroupDisplayNameEditLabel;
	public String getTextAppGroupNameEditLabel() {

		clickElement(appGroupNameInput, "");
		return getText(appGroupNameEditLabel);
	}

	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	public String getTextAppGroupDisplayNameLabel() {
		clickElement(AppGroupDisplayName, "");
		return getText(appGroupNameEditLabel);
	}

	public String removalofEneredTextForAppGroupName() {

		return removalofEneredText(appGroupNameInput);

	}

	public String removalofEneredTextForAppGroupDisplayName() {
		return removalofEneredText(appGroupDisplayNameEnterData);
		
	}

}
