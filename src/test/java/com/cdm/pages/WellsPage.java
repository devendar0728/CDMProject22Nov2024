package com.cdm.pages;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class WellsPage extends CommonActions {

	public WellsPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}
	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement popupMessage;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//div[contains(text(),'Please Enter the File')]")
	WebElement validationmessagenotuploadingfile;

	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement uploadButtonwell;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/span[1]")
	WebElement statusVerify;

	@FindBy(xpath = "//input[@formcontrolname='uploadfile']")
	WebElement browsefile;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[1]")
	WebElement wellEditButton;

	@FindBy(xpath = "//input[@name='options']")
	WebElement activeStatusCheck;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonwell;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[2]")
	WebElement deleteButton;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonWell;

	@FindBy(xpath = "//input[@name='wellname']")
	WebElement inputWellName;

	@FindBy(xpath = "//div[@aria-label='An error occurred. Please check downloaded error file']")
	WebElement popupMessageinvalidFile;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-well-upload-file-list[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement templateDownloadFile;

	@FindBy(xpath = "//div[contains(text(),'Please Enter the File')]")
	WebElement validationmessageFileUpload;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[1]")
	WebElement refreshButton;

	@FindBy(xpath = "//input[@name='ipaddress']")
	WebElement inputIPAddress;

	@FindBy(xpath = "//input[@name='ipaddress']")
	WebElement inputIPAddressSearch;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[2]")
	WebElement ConfirmationNoButton;

	@FindBy(xpath = "//input[@name='devicetype']")
	WebElement inputdeviceType;

	@FindBy(xpath = "(//input[@name='options'])[2]")
	WebElement inputStatusInActive;

	@FindBy(xpath = "//input[@name='rtunumber']")
	WebElement inputRTUAddress;

	@FindBy(xpath = "//app-well-user[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement downloadButtonWell;

	@FindBy(xpath = "//app-well-user[1]/div[1]/div[1]/div[1]/span/img[2]")
	WebElement uploadwellbutton;

	@FindBy(xpath = "//a[contains(text(),'Wells')]")
	WebElement WellTab;

	@FindBy(xpath = "(//input[@formcontrolname='wellname']/../../../../div)")
	WebElement validationMessgaeWellName;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/span/img[1]")
	WebElement addButtonWell;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement wellNameThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement IPAddressThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceTypeThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement RTUAddressThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;

	@FindBy(xpath = "//input[@id='csv']")
	WebElement wellBulkUpload;

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void wellNameThreeDot() {
		clickElement(wellNameThreeDot, "");
		//wellNameThreeDot.click();
	}

	public void deviceTypeThreeDot() {
		clickElement(deviceTypeThreeDot, "");
		//deviceTypeThreeDot.click();
	}

	public void RTUAddressThreeDot() {
		clickElement(RTUAddressThreeDot, "");
		//RTUAddressThreeDot.click();
	}

	public void statusThreeDot() {
		clickElement(statusThreeDot, "");
		//statusThreeDot.click();
	}

	public void ipAddressThreeDot() {
		clickElement(IPAddressThreeDot, "");
		//IPAddressThreeDot.click();
	}

	public void wellTab() {
		clickElement(WellTab, "");
		//WellTab.click();
	}

	public void searchWellName(String value) {

		SetInputENterKey(inputWellName,"");
		SetInput(inputWellName, value, value);

//		inputWellName.sendKeys(Keys.ENTER);
//		inputWellName.sendKeys(value);

	}

	public void mimimizewindow() {
		driver.manage().window().minimize();
	}

	public void maximisewindow() {
		driver.manage().window().maximize();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {

			backDropShowing.click();
		}
	}

	public void searchipAddress(String value) {
		SetInputENterKey(inputIPAddress,"");
		SetInput(inputIPAddress, value, value);

//		inputIPAddress.sendKeys(Keys.ENTER);
//		inputIPAddress.sendKeys(value);

	}

	public void searchDeviceType(String value) {
		SetInputENterKey(inputdeviceType,"");
		SetInput(inputdeviceType, value, value);
//
//		inputdeviceType.sendKeys(Keys.ENTER);
//		inputdeviceType.sendKeys(value);

	}

	public void searchRTUAddress(String value) {
		SetInputENterKey(inputRTUAddress,"");
		SetInput(inputRTUAddress, value, value);
//
//		inputRTUAddress.sendKeys(Keys.ENTER);
//		inputRTUAddress.sendKeys(value);

	}

	public void clickrefreshbutton() {
		Actions act = new Actions(driver);
		act.moveToElement(refreshButton).build().perform();
		clickElement(refreshButton, "");
		//refreshButton.click();
	}

	public void inputStatusInActive() {
		clickElement(inputStatusInActive, "");
		//inputStatusInActive.click();
	}

	public void addbutton() throws InterruptedException {
		clickElement(addButtonWell, "");
		//addButtonWell.click();
	}

	public void cancelButtonwell() {
		clickElement(cancelButtonwell, "");
		//cancelButtonwell.click();

	}

	public void saveButton() {
		clickElement(saveButtonWell, "");
		//saveButtonWell.click();

	}

	public String verifyValidationMessageWellName() throws InterruptedException {
		Thread.sleep(3000);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaeWellName == null) {
			return "";
		}
		String message = validationMessgaeWellName.getText();

		return message.trim();

	}

	public void downloadButtonWell() {
		clickElement(downloadButtonWell, "");

		//downloadButtonWell.click();
	}

	public void browsefile(String value) {
		browsefile.sendKeys(Keys.ENTER);
		browsefile.sendKeys(value);
	}

	public void wellEditButton() {
		clickElement(wellEditButton, "");
		//wellEditButton.click();
	}

	public void uploadwellbutton() {
		clickElement(uploadwellbutton, "");
		//uploadwellbutton.click();
	}

	public void activeStatusCheck() throws InterruptedException {

		clickElement(activeStatusCheck, "");
		//activeStatusCheck.click();

	}

	public void deleteButton() {
		clickElement(activeStatusCheck, "");
		//deleteButton.click();
	}

	public void ConfirmationNoButton() {
		clickElement(ConfirmationNoButton, "");
		//ConfirmationNoButton.click();
	}

	public String get_Textget_Text_PopupMessage() {

		mouseHover(popupMessage);

		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String popupMessageTipText = popupMessage.getText();

		System.out.println("popupMessageText-->" + popupMessageTipText);

		return popupMessageTipText;
	}

	public String get_Textget_Text_PopupMessageinvalid() throws InterruptedException {

		mouseHover(popupMessageinvalidFile);

		String popupMessageInvalidTipText = popupMessageinvalidFile.getText();

		System.out.println("popupMessageText-->" + popupMessageInvalidTipText);

		return popupMessageInvalidTipText;

	}

	public String get_Text_For_Status() {

		mouseHover(statusVerify);

		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String statusVerifyText = statusVerify.getText();

		System.out.println("statusVerifyText-->" + statusVerifyText);

		return statusVerifyText;
	}

	public boolean isVisiblepopupMessageWellAdd() {

		return popupMessage != null && popupMessage.isDisplayed();
	}

	public void choosefilebutton() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", wellBulkUpload);

	}

	public void wellBulkUpload(String value) {
		SetInputENterKey(wellBulkUpload,"");
//		SetInput(wellBulkUpload, value, value);
//
//
//		wellBulkUpload.sendKeys(Keys.ENTER);
//		wellBulkUpload.sendKeys(value);
	}

	public void uploadButtonwell() {
		wait(uploadButtonwell,logger);

		uploadButtonwell.click();

	}

	public void inputIPAddressSearch(String value) {
		SetInputENterKey(inputIPAddressSearch,"");
		SetInput(inputIPAddressSearch, value, value);

//		inputIPAddressSearch.sendKeys(Keys.ENTER);
//		inputIPAddressSearch.sendKeys(value);
	}

	public String validationmessageFileUpload() {
		if(validationmessageFileUpload==null) {
			return "";
		}

		return getText(validationmessageFileUpload);

	}

	public void templateDownloadFile() {
	SetInputENterKey(templateDownloadFile,"");
		//SetInput(templateDownloadFile, value, value);
		//templateDownloadFile.click();
	}

	public String validationmessagenotuploadingfile() {

		if (validationmessagenotuploadingfile == null) {
			return "";
		}
		String message = validationmessagenotuploadingfile.getText();

		return message.trim();

	}
}
