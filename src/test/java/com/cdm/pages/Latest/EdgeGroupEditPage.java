package com.cdm.pages.Latest;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupEditPage extends CommonActions {
	public EdgeGroupEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupToolTip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement maxServerNodeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverHostAddressToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverPortToolTip;

	@FindBy(xpath = "//button[@class='addButton')]")
	WebElement saveButtononEdgeEditPage;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddressInput;

	@FindBy(xpath = "//input[@formcontrolname='serialkeys']")
	WebElement serialNumberAdd;
	// serverport


	@FindBy(xpath = "//input[@formcontrolname='maxservernode']")
	WebElement maxserverNode;


	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverPortInput;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupName;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonfinalonboarding;


	@FindBy(xpath = "//input[@type='file']")
	WebElement onboardingCertificateUpload;


	@FindBy(xpath = "//input[@type='file']")
	WebElement EdgeConfigurationUpload;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement onboardingCertificateIcon;

	public void onboardingCertificateIcon() {
		clickElement(onboardingCertificateIcon, "");
		//onboardingCertificateIcon.click();
	}


	public void onboardingCertificateUpload(String value) {
		SetInputENterKey(onboardingCertificateUpload,"");
		SetInput(onboardingCertificateUpload, value, value);
		//onboardingCertificateUpload.sendKeys(Keys.ENTER);
		//onboardingCertificateUpload.sendKeys(value);
	}


public void EdgeConfigurationUpload(String value) {
	SetInputENterKey(EdgeConfigurationUpload,"");
	SetInput(EdgeConfigurationUpload, value, value);

//	EdgeConfigurationUpload.sendKeys(Keys.ENTER);
//	EdgeConfigurationUpload.sendKeys(value);
	}

	public void uploadfile() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;


		js.executeScript("arguments[0].click();",onboardingCertificateUpload);


	}

	public void scrollingverticalAdd() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public void applicationGroupName(String value) throws InterruptedException {
		wait(applicationGroupName,logger);
		SelectMatOption(applicationGroupName, value);
	}
	public void serverHostAddress(String value) {

		SetInputENterKey(serverHostAddressInput,"");
		SetInput(serverHostAddressInput, value, value);

		//serverHostAddressInput.sendKeys(value);
	}

	public void serverPort(String value) {
		SetInputENterKey(serverPortInput,"");
		SetInput(serverPortInput, value, value);

		//serverPortInput.sendKeys(value);
	}

	public void saveButtononEdgeEdit() {
		clickElement(saveButtononEdgeEditPage,"");
		//saveButtononEdgeEditPage.click();
	}


	public void saveButtonfinalonboarding() throws InterruptedException {

		//wait(saveButtonfinalonboarding,logger);

		clickElement(saveButtonfinalonboarding,"");

		//saveButtonfinalonboarding.click();


	}


	public void serialnumberAdd(String value) {
		SetInputENterKey(serialNumberAdd,"");
		SetInput(serialNumberAdd, value, value);

//
//		serialNumberAdd.sendKeys(Keys.ENTER);
//		serialNumberAdd.sendKeys(value);

	}


	public String get_Text_ToolTipappGroup() {
		mouseHover(applicationGroupName);

		String appGroupToolTipText = appGroupToolTip.getText();

		appGroupToolTipText.trim();

		return appGroupToolTipText;
	}


	public String get_Text_ToolTipmaxServerNode() {
		mouseHover(maxserverNode);

		String maxServerNodeToolTipText = maxServerNodeToolTip.getText();

		maxServerNodeToolTipText.trim();

		return maxServerNodeToolTipText;
	}

	public String get_Text_ToolTipmaxServerPort() {
		mouseHover(serverPortInput);

		String serverPortToolTipText = serverPortToolTip.getText();

		serverPortToolTipText.trim();

		return serverPortToolTipText;
	}


	public String get_Text_ToolTipmaxServerHostAddress() {
		mouseHover(serverHostAddressInput);

		String serverHostAddressToolTipText = serverHostAddressToolTip.getText();

		serverHostAddressToolTipText.trim();

		return serverHostAddressToolTipText;
	}


}
