package com.cdm.pages.Latest;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EnvironmentalVariablePage extends CommonActions {

	public EnvironmentalVariablePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement checkInActiveButton;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;

	@FindBy(xpath = "//input[@name='configname']")
	WebElement searchconfignameInput;

	@FindBy(xpath = "//input[@name='configvalue']")
	WebElement searchconfigValueInput;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//h4/span")
	WebElement headingTitle;


	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-config-csv-file[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement csvFormatIconEnvironmentalVariable;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[2]")
	WebElement deletebuttonEnvironmental;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement bulkUploadToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement bulkDownloadToolTip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement editToolTip;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement confirmationYesButton;

	@FindBy(xpath = "//input[@formcontrolname='configname']")
	WebElement confignameInput;

	@FindBy(xpath = "//input[@formcontrolname='configvalue']")
	WebElement configValueInput;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement configNameSearchThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement configValueSearchThreeDot;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/app-config[1]/div[1]/div[1]/div[2]/span[1]/img[3]")
	WebElement bulkUpload;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/app-config[1]/div[1]/div[1]/div[2]/span[1]/img[4]")
	WebElement bulkDownload;

	@FindBy(xpath = "//button[@class='mat-focus-indicator btnCancel mat-button mat-button-base']")
	WebElement confirmationCancelButton;

	@FindBy(xpath = "//ul[@class='nav']/li[3]")
	WebElement environmentalVariableTab;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[1]")
	WebElement EditButton;

	@FindBy(xpath = "//tbody/tr[3]/td[4]/img[2]")
	WebElement deleteButtonConfig;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/app-config[1]/div[1]/div[1]/div[2]/span[1]/img[2]")
	WebElement environmentalVariableAddButton;

	@FindBy(xpath = "//input[@formcontrolname = 'configvalue']")
	WebElement ConfigValue;

	@FindBy(xpath = "//input[@formcontrolname = 'configname']")
	WebElement ConfigName;

	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(xpath = "//input[@formcontrolname = 'Inactive')]")
	WebElement sliderOff;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButton;

	@FindBy(css = ".addButton")
	WebElement saveButtonEnvironmental;

	@FindBy(xpath = "//input[@formcontrolname='uploadfile']")
	WebElement chooseFile;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-config-csv-file[1]/div[2]/button[2]")
	WebElement uploadconfigbutton;

	@FindBy(xpath = "//input[@name='myfile']")
	WebElement uploadedFile;

	// Locate the red status toggle button by CSS, XPath, or any appropriate
	// selector
	@FindBy(xpath = "//span[contains(text(),'Inactive')]")
	WebElement redToggleButton;

	@FindBy(xpath = "//span[contains(text(),'Active')]")
	WebElement greenToggleButton;

	// Method to verify visibility of the red toggle button
	public boolean isRedToggleButtonVisible() {
		return redToggleButton.isDisplayed();
	}

	public boolean isGreenToggleButtonVisible() {
		return greenToggleButton.isDisplayed();
	}

	public void saveDataConfig() {
		clickElement(saveButton, "");
		// saveButton.click();
	}

	public void uploadConfig(String value) throws IOException {

		chooseFile.sendKeys(value);

	}

	public void clickOnUploadButton() {
		clickElement(uploadconfigbutton, "");
		// uploadconfigbutton.click();
	}

	public void moveSlideroffCondition() {
		Actions actions = new Actions(driver);
		actions.moveToElement(sliderOff).dragAndDropBy(sliderOff, 150, 0).build().perform();
	}

	public void environmentalVariableTab() {
		clickElement(environmentalVariableTab, "");
		// environmentalVariableTab.click();
	}

	// Either checked or unchecked
	public void moveSliderCondition(String m) {
		moveSliderCondition(sliderOnCheckBox, sliderOnCheckBoxLabel, m);
	}

	public void environmentalVariableAddButton() {
		clickElement(environmentalVariableAddButton, "");
		// environmentalVariableAddButton.click();
	}

	public void environmentalConfigName(String value) {
		SetInputENterKey(ConfigName, "");
		SetInput(ConfigName, value, value);

//		ConfigName.sendKeys(Keys.ENTER);
//		ConfigName.sendKeys(value);
	}

	public void environmentalConfigValue(String value) {

		SetInputENterKey(ConfigValue, "");
		SetInput(ConfigValue, value, value);

//		ConfigValue.sendKeys(Keys.ENTER);
//		ConfigValue.sendKeys(value);
	}

	public void clickEditButton() {

		scrollingElementRightBar("div.example-container", "900");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EditButton.click();
	}

	public void deleteButtonConfigClick() {
		clickElement(deleteButtonConfig, "");
//		deleteButtonConfig.click();
	}

	public void confirmationYesDeleteButton() {
		clickElement(confirmationYesButton, "");
		// confirmationYesButton.click();
	}

	public void confirmationCancelDeleteButton() {
		clickElement(confirmationCancelButton, "");
		// confirmationCancelButton.click();
	}

	public void clickEditevButton() {
		clickElement(EditButton, "");
		// EditButton.click();
	}

	public void clickInputField() {

		ConfigName.clear();
	}

	public void clickInputFieldconfigValue() {

		ConfigValue.clear();
	}

	public void bulkUploadButton() {
		clickElement(bulkUpload, "");
		// bulkUpload.click();
	}

	public void bulkDownloadButton() {
		clickElement(bulkDownload, "");
		// bulkDownload.click();
	}

	public void configNameSearchThreeDot() {
		clickElement(configNameSearchThreeDot, "");
		// configNameSearchThreeDot.click();
	}

	public void configValueSearchThreeDot() {
		clickElement(configValueSearchThreeDot, "");
		// configValueSearchThreeDot.click();
	}

	public void configNameInput(String value) {
		SetInputENterKey(confignameInput, "");
		SetInput(confignameInput, value, value);

//		confignameInput.sendKeys(Keys.ENTER);
//		confignameInput.sendKeys(value);

	}

	public void configValueInput(String value) {
		SetInputENterKey(configValueInput, "");
		SetInput(configValueInput, value, value);

//		configValueInput.sendKeys(Keys.ENTER);
//		configValueInput.sendKeys(value);
	}

	public void headingClick() {
		clickElement(headingTitle, "");
		// headingTitle.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			// clickElement(backDropShowing,"");
			backDropShowing.click();
		}
	}

	public void searchconfigNameValue(String value) {
		SetInputENterKey(searchconfignameInput, "");
		SetInput(searchconfignameInput, value, value);

//		searchconfignameInput.sendKeys(Keys.ENTER);
//		searchconfignameInput.sendKeys(value);
	}

	public void searchconfigValue(String value) {
		SetInputENterKey(searchconfigValueInput, "");
		SetInput(searchconfigValueInput, value, value);

//	searchconfigValueInput.sendKeys(Keys.ENTER);
//	searchconfigValueInput.sendKeys(value);
	}

	@FindBy(xpath = "//input[@name='configname']")
	WebElement confignameSearchinput;

	public void setFocusonInputonConfigName() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].focus();", confignameSearchinput);

	}

	public void statusThreeDot() {
		clickElement(statusThreeDot, "Clicking on three dot on status");

	}

	public void checkInactiveoption() {

		clickElement(checkInActiveButton, "checking on in Active button");

	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;

	public void outerlayerclick() {

		clickElement(outerlayerclick, "");

	}

	public boolean isConfigNameFilterIconAccessible() {
		// Verify the icon is displayed and has accessible attributes
		boolean isDisplayed = configNameSearchThreeDot.isDisplayed();

		// Check for accessibility attributes, e.g., aria-label or role
		String ariaLabel = configNameSearchThreeDot.getAttribute("aria-label");
		String role = configNameSearchThreeDot.getAttribute("role");

		return isDisplayed && ariaLabel != null && !ariaLabel.isEmpty() && role != null && role.equals("button");
	}

	public String gettooltipforEditEnvironmental() {
		mouseHover(EditButton);

		if (editToolTip != null) {
			String editTooltipText = editToolTip.getText();

			System.out.println("toolTipText-->" + editTooltipText);

			return editTooltipText;
		}
		return "";
	}

	public String gettooltipforDeleteEnvironmental() {
		mouseHover(deletebuttonEnvironmental);

		if (deleteToolTip != null) {
			String deleteToolTipText = deleteToolTip.getText();

			System.out.println("toolTipText-->" + deleteToolTipText);

			return deleteToolTipText;
		}
		return "";
	}

	public String gettooltipforBulkUploadEnvironmental() {
		mouseHover(bulkUpload);

		if (bulkUploadToolTip != null) {
			String bulkUploadToolTipText = bulkUploadToolTip.getText();

			System.out.println("toolTipText-->" + bulkUploadToolTipText);

			return bulkUploadToolTipText;
		}
		return "";
	}

	public String gettooltipforBulkDownloadEnvironmental() {
		mouseHover(bulkDownload);

		if (bulkDownloadToolTip != null) {
			String bulkDownloadToolTipText = bulkDownloadToolTip.getText();

			System.out.println("toolTipText-->" + bulkDownloadToolTipText);

			return bulkDownloadToolTipText;
		}
		return "";
	}

	public void csvFormatIconEnvironmentalVariable() {

		clickElement(csvFormatIconEnvironmentalVariable, "Accessing csvFormatIconEnvironmentalVariable");

	}
}
