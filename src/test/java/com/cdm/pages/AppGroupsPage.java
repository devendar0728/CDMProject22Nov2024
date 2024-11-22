package com.cdm.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AppGroupsPage extends CommonActions {

	public AppGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//input[@name= 'options'])[1]")

	WebElement statusActiveCheckbox;

	@FindBy(css = ".cdk-overlay-container")
	WebElement EditToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement DeleteToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement addApplicationToolTip;

	@FindBy(xpath = "//input[@id='csv']")
	WebElement uploadfile;

	@FindBy(xpath = "(//input[@name= 'options'])[2]")

	WebElement statusinActiveCheckbox;

	@FindBy(xpath = "//app-filter[@name ='isActive']")
	WebElement statusThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appDisplayNameThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appNameThreeDot;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[4]")
	WebElement bulkdownloadButton;

	@FindBy(xpath = "//input[@name='appgroupname']")
	WebElement appNameSearch;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement appGroupNameSearch;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[3]")
	WebElement bulkUploadButton;

	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement bulkUploadButtonSucess;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[2]")
	WebElement deleteIcon;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[1]")
	WebElement confirmationYesButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-appgroup[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement addApplicationButton;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@formcontrolname='appgroupname']")
	WebElement appGroupNameInput;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement appGroupDisplayNameEnterData;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButton;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/button/input")
	WebElement appGroupDisplayNameInput;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-appgroup[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement addButtonAppGroup;

	@FindBy(xpath = "//mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[7]/a/span")
	WebElement moveAppGroup;

	// tbody/tr[1]/td[4]/img[1]
	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[1]")
	WebElement editButton;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[2]")
	WebElement deleteButton;

	public void movetoAppGroup() {
		wait(moveAppGroup, logger);
		clickElement(moveAppGroup, "");
		// moveAppGroup.click();
	}

	public void checktitle(String exp) throws Exception {
		verifyTitle(exp,"checking title");
	}

	public void appGroupNameInput(String value) {
//		appGroupNameInput.sendKeys(Keys.ENTER);
//		appGroupNameInput.sendKeys(value);

		SetInputENterKey(appGroupNameInput,"");
		SetInput(appGroupNameInput, value, value);
	}

	public void appGroupDisplayNameInput(String value) {
//		appGroupDisplayNameInput.sendKeys(Keys.ENTER);
//		appGroupDisplayNameInput.sendKeys(value);

		SetInputENterKey(appGroupDisplayNameInput,"");
		SetInput(appGroupDisplayNameInput, value, value);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void addButtonAppGroup() {
		clickElement(addButtonAppGroup,"");
		//addButtonAppGroup.click();
	}

	public void appGroupDisplayNameEnterData(String value) {
//		appGroupDisplayNameEnterData.sendKeys(Keys.ENTER);
//		appGroupDisplayNameEnterData.sendKeys(value);

		SetInputENterKey(appGroupDisplayNameEnterData,"");
		SetInput(appGroupDisplayNameEnterData, value, value);
	}

	public void saveButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();");
	}

	public void deleteButton() {

		// deleteIcon.click();
	}

	public void editButton() {
		clickElement(editButton, "");
		// editButton.click();
	}

	public void statusThreeDot() {
		clickElement(statusThreeDot, "");
		// statusThreeDot.click();
	}

	public void statusActiveCheckbox() {
		clickElement(statusActiveCheckbox, "");
		// statusActiveCheckbox.click();
	}

	public void statusinActiveCheckbox() {
		clickElement(statusinActiveCheckbox, "");
		// statusinActiveCheckbox.click();
	}

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void cancelButton() {
		clickElement(cancelButton, "");
		// cancelButton.click();

	}

	public void appNameThreeDot() {
		clickElement(appNameThreeDot, "");
		// appNameThreeDot.click();
	}

	public void appDisplayNameThreeDot() {
		clickElement(appDisplayNameThreeDot, "");
		// appDisplayNameThreeDot.click();
	}

	public void bulkdownloadButton() {
		clickElement(bulkdownloadButton, "");
		// bulkdownloadButton.click();

	}

	public void bulkUploadButtonSucess() {
		clickElement(bulkUploadButtonSucess, "");
		// bulkUploadButtonSucess.click();

	}

	public void bulkUploadButton() {
		clickElement(bulkUploadButton, "");
		bulkUploadButton.click();
	}

	public String get_Text_ToolTipforEditButton() {
		mouseHover(editButton);

		String EditToolTipText = EditToolTip.getText();

		EditToolTipText.trim();

		return EditToolTipText;

	}

	public String get_Text_ToolTipforDeleteButton() {
		mouseHover(deleteButton);

		String DeleteToolTipText = DeleteToolTip.getText();

		DeleteToolTipText.trim();

		return DeleteToolTipText;

	}

	public String get_Text_ToolTipforAddApplications() {
		wait(addApplicationButton, logger);
		mouseHover(addApplicationButton);

		String addApplicationToolTipText = addApplicationToolTip.getText();

		addApplicationToolTipText.trim();

		return addApplicationToolTipText;

	}

	public void uploadFileTask(String filePath) throws InterruptedException {
		uploadfile.sendKeys(filePath);
		Thread.sleep(4000);
	}

	public void uploadfile() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.querySelector('#csv').click();");
	}

	public void uploadfile(String value) {
//		uploadfile.sendKeys(Keys.ENTER);
//		uploadfile.sendKeys(value);

		SetInputENterKey(uploadfile,"");
		SetInput(uploadfile, value, value);
	}

	public void confirmationYesDeleteButton() {

		clickElement(confirmationYesButton, "");
		//confirmationYesButton.click();
	}

	public void appNameSearch(String value) {
//		appNameSearch.sendKeys(Keys.ENTER);
//		appNameSearch.sendKeys(value);
		SetInputENterKey(appNameSearch,"");
		SetInput(appNameSearch, value, value);
	}

	public void appGroupNameSearch(String value) {
//		appGroupNameSearch.sendKeys(Keys.ENTER);
//		appGroupNameSearch.sendKeys(value);

		SetInputENterKey(appGroupNameSearch,"");
		SetInput(appGroupNameSearch, value, value);
	}

	public void switchingtab() {
		appGroupNameInput.sendKeys(Keys.TAB);

	}

}
