package com.cdm.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class WellNameEditPage extends CommonActions {

	public WellNameEditPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	@FindBy(xpath = "//*[@id= 'isActive']")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id='isActive']/..")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(xpath = "//input[@formcontrolname ='wellname']")
	WebElement wellnameinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='port']")
	WebElement portNumberinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='rtunumber']")
	WebElement RTUAddressinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='password']")
	WebElement passwordinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='ipaddress']")
	WebElement IPAddressinputEdit;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonwell;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonWell;

	@FindBy(xpath = "(//input[@formcontrolname='wellname']/../../../../../span/../div)")
	WebElement validationMessgaeWellName;

	@FindBy(xpath = "(//input[@formcontrolname='port']/../../../../div)")
	WebElement validationMessgaePort;

	@FindBy(xpath = "//div[@class='row']/div[3]/div/mat-form-field[1]/../span")
	WebElement validationMessgaePortEdit;

	@FindBy(xpath = "(//input[@formcontrolname='rtunumber']/../../../../div)")
	WebElement validationMessgaeRTUAddress;

	@FindBy(xpath = "(//input[@formcontrolname='password']/../../../../div)")
	WebElement validationMessgaePassword;

	@FindBy(xpath = "(//input[@formcontrolname='ipaddress']/../../../../div)")
	WebElement validationMessgaeIPAddress;

	@FindBy(xpath = "//mat-select[@formcontrolname='devicetype']")
	WebElement deviceTypeEdit;

	@FindBy(xpath = "(//mat-select[@formcontrolname='devicetype']/../../../../div)")
	WebElement validationMessgaedeviceType;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public String removalofEnteredTextForwellname() {

		return removalofEneredText(wellnameinputEdit);

	}

	public String removalofEnteredTextForRTUAddress() {

		return removalofEneredText(RTUAddressinputEdit);

	}

	public String removalofEnteredTextForPortNumber() {

		return removalofEneredText(portNumberinputEdit);

	}

	public String removalofEnteredTextForPassword() {

		return removalofEneredText(passwordinputEdit);

	}

	public void cancelButtonwell() {
		clickElement(cancelButtonwell, "");
		// cancelButtonwell.click();

	}

	public void saveButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.querySelector(\".addButton\").click()");

	}

	public String verifyValidationMessageWellName() throws InterruptedException {


		for(int i=0;i<5;i++) {
			try {
				String message = validationMessgaeWellName.getText();

				return message.trim();

			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		return "";

	}

	public String verifyValidationMessagePort() throws InterruptedException {
		for(int i=0;i<5;i++) {
		try {

			if (validationMessgaePort == null) {
				return "";
			}
			String message = validationMessgaePort.getText();

			return message.trim();

		} catch (Exception e) {
			try {
			Thread.sleep(1000);
			}
			catch(Exception e2) {}
		}
		}
return "";
	}

	public String verifyValidationMessagePortEdit() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaePortEdit == null) {
			return "";
		}
		String message = validationMessgaePortEdit.getText();

		return message.trim();

	}

	public String verifyValidationMessageRTUAddress() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaeRTUAddress == null) {
			return "";
		}
		String message = validationMessgaeRTUAddress.getText();

		return message.trim();

	}

	public String verifyValidationMessageIPAddress() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaeIPAddress == null) {
			return "";
		}
		String message = validationMessgaeIPAddress.getText();

		return message.trim();

	}

	public String verifyValidationMessagePassword() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaePassword == null) {
			return "";
		}
		String message = validationMessgaePassword.getText();

		return message.trim();

	}

	public String verifyValidationMessagedeviceType() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaedeviceType == null) {
			return "";
		}
		String message = validationMessgaedeviceType.getText();

		return message.trim();

	}

	public void wellnameinputEdit(String value) {
		SetInputENterKey(wellnameinputEdit, "");
		SetInput(wellnameinputEdit, value, value);
		RTUAddressinputEdit.click();
//		wellnameinputEdit.sendKeys(Keys.ENTER);
//		wellnameinputEdit.sendKeys(value);
	}

	public void portnumberinputEdit(String value) {

		SetInputENterKey(portNumberinputEdit, "");
		SetInput(portNumberinputEdit, value, value);

//		portNumberinputEdit.sendKeys(Keys.ENTER);
//		portNumberinputEdit.sendKeys(value);
	}

	public void RTUAddressinputEdit(String value) {
		SetInputENterKey(RTUAddressinputEdit, "");
		SetInput(RTUAddressinputEdit, value, value);

//		RTUAddressinputEdit.sendKeys(Keys.ENTER);
//		RTUAddressinputEdit.sendKeys(value);
	}

	public void passwordinputEdit(String value) {
		SetInputENterKey(passwordinputEdit, "");
		SetInput(passwordinputEdit, value, value);

//		passwordinputEdit.sendKeys(Keys.ENTER);
//		passwordinputEdit.sendKeys(value);
	}

	public void IPAddressinputEdit(String value) {
		SetInputENterKey(IPAddressinputEdit, "");
		SetInput(IPAddressinputEdit, value, value);

//		IPAddressinputEdit.sendKeys(Keys.ENTER);
//		IPAddressinputEdit.sendKeys(value);
	}

	public void deviceTypeDropdownEdit(String value) throws InterruptedException {
		Thread.sleep(4000);
		SelectMatOption(deviceTypeEdit, value);
	}

	public void moveSliderCondition(String m) {

		moveSliderCondition(sliderOnCheckBox, sliderOnCheckBoxLabel, m);
	}

}
