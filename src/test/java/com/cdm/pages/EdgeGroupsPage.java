package com.cdm.pages;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupsPage extends CommonActions {

	public EdgeGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement healthstatusToolTip;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement groupNameEdit;

	@FindBy(xpath = "//div/mat-tooltip-component/div[contains(text(),'Close')]")
	WebElement closeTooltip;

	@FindBy(xpath = "//div[contains(text(),'Devices Connected')]")
	WebElement deviceConnectedlabel;

	@FindBy(xpath = "//div[contains(text(),'Devices Active')]")
	WebElement deviceActivelabel;

	@FindBy(xpath = "//app-console-terminal/div[1]/div[2]/i")
	WebElement closeIcon;

	@FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-3']")
	WebElement iconwindow;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupIDToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupNamefieldToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement locationToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement descriptionsToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverportToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverNodeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverHostAddressToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement editToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement consoleToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement stopToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deviceConnectedToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deviceActiveToolTip;

	@FindBy(xpath = "//div[contains(text(),'Group Name')]")
	WebElement groupNameLabel;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[2]")
	WebElement groupNameDelete;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[4]")
	WebElement consoleIcon;
	String popupHandle;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement licenseCancelButton;;

	@FindBy(xpath = "//div[@class='tableCard']/h4")
	WebElement deploymentHeadingTitle;

	@FindBy(xpath = "//input[@formcontrolname='controllername']/../../../../../span")
	WebElement edgeGroupIDinvalidValidationmessage;

	@FindBy(xpath = "(//input[@name='options'])[2]")
	WebElement edgegroupstatusInactive;

	@FindBy(xpath = "//div/div/div[1]/div/div/div[2]/label/div/span[2]")
	WebElement cloudhealthButtonOff;

	@FindBy(css = ".tableCard h4")
	WebElement AddListpageVerification;

	// *[@id="cdk-accordion-child-8"]/div/div[1]/div[1]/div/div/span
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-add-edit-edgegroup/div/div[1]/form/mat-nav-list/mat-expansion-panel[1]/div/div/div[1]/div[1]/div/div/mat-form-field/div")
	WebElement validationMessageEdgeId;

	@FindBy(xpath = "//span[@class='text-danger ng-star-inserted']")
	WebElement validationMessageEdgeName;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[3]")
	WebElement stopICon;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edgegrouplicenseupload[1]/form[1]/div[1]/input[1]")
	WebElement licenseUploadChooseFile;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edgegrouplicenseupload[1]/div[2]/button[2]")
	WebElement licenseUploadButtonAfter;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement location;

	@FindBy(xpath = "//input[@class='titleHeadingsub']")
	WebElement headingtitleonboarding;

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement description;

	@FindBy(xpath = "//input[@formcontrolname='serialkeys']")
	WebElement serialKey;

	@FindBy(xpath = "//span[contains(text(),'Alphanumerics of length Min = 2, Max = 64 are allo')]")
	WebElement validationMessageGroupName;

	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement uploadButton;

	@FindBy(xpath = "//button[@class='calButton']")
	WebElement cancelButton;

	@FindBy(xpath = "//span[contains(text(),'EDGE Groups')]")
	WebElement EdgeGroupTab;

	@FindBy(xpath = "//input[@type='file']")
	WebElement controllerConfigurationCertificateUpload;

	@FindBy(xpath = "//mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement onboardingCertificateIcon;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement saveButtononboardingCertificateIcon;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edgeconfigupload[1]/div[3]/button[2]")
	WebElement saveButtononEdgeConfiguration;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement registrationUploadButton;

	@FindBy(xpath = "//mat-expansion-panel[5]/div/div/div/div[1]/div/div[2]/img[3]")
	WebElement refreshButtonforLicence;

	@FindBy(xpath = "(//div[contains(text(),' License ')]/..//img)[2]")
	// @FindBy(xpath = "((//div[@class='labelClass'])[3])/../div[2]/img[2]")
	WebElement licenceDownloadButton;

	@FindBy(xpath = "(//div[contains(text(),' License ')]/..//img)[1]")
	WebElement licenceUploadButton;

	@FindBy(css = "mat-select[formcontrolname='appgroupid'] span")
	WebElement applicationGroupName;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]")
	WebElement groupNameArrow;

	@FindBy(css =".cdk-overlay-container mat-tooltip-component div")
	WebElement EditButtonToolTip;

	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/mat-tooltip-component[1]/div[1]")
	WebElement DeleteButtonToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement toolTip;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
	WebElement StopButtonToolTip;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
	WebElement ConsoleButtonToolTip;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[3]")
	WebElement stopButton;

	@FindBy(xpath = "//h2[contains(text(),'EDGE Groups')]")
	WebElement headingGroupListTitle;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[3]")
	WebElement stopIconEdgeGroup;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement devicesActiveThreeDot;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[1]")

	WebElement confirmationYesMessage;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[2]")

	WebElement confirmationNoMessage;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement groupNameThreeDot;

	@FindBy(xpath = "//input[@formcontrolname='maxservernode']")
	WebElement serverNodes;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement groupNameInputSearch;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement groupNameAdd;

	@FindBy(xpath = "//input[@data-placeholder ='Minimum']")
	WebElement alaramRaisedInputMin;

	@FindBy(xpath = "//input[@data-placeholder ='Maximum']")
	WebElement alaramRaisedInputMax;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/mat-card[1]/button[1]")
	WebElement submitButtonForAlaramRaised;

	// Device Connected

	@FindBy(xpath = "//input[@data-placeholder='Minimum']")
	WebElement deviceConnectedInputMin;

	@FindBy(xpath = "//input[@data-placeholder='Maximum']")
	WebElement deviceConnectedInputMax;

	@FindBy(xpath = "//div[contains(text(),'Status')]")
	WebElement statuslabel;

	// DeviceActive
	@FindBy(xpath = "//input[@data-placeholder='Minimum']")
	WebElement deviceActiveInputMin;

	@FindBy(xpath = "//input[@data-placeholder='Maximum']")
	WebElement deviceActiveInputMax;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[2]")
	WebElement deleteEdgeGroupColumn;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitButtonAll;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceConnectedThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceActiveThreeDot;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/label[1]/input[1]")
	WebElement statusColumnActive;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement statusColumnThreeDotUnchecked;
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[2]/div[1]/table[1]")
	WebElement table;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement alaramRaisedThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusColumnThreeDot;

	@FindBy(xpath = "//table[@role='table']")
	WebElement tableElement;

	@FindBy(xpath = "//span[@class='full-width ng-star-inserted full-active']")
	WebElement EdgeGroup_btn;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[1]")
	WebElement Refresh_btn;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[1]/div/div[1]/div/p/img")
	WebElement Collapse_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement Add_btn;

	@FindBy(xpath = "//button[@class='calButton']")
	WebElement Cancel_btn;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement Save_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement Bulk_App_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[4]")
	WebElement Bulk_Download_btn;

	@FindBy(xpath = "((//div[@class='labelClass'])[3])/../div[2]/img[2]")
	WebElement LicenseDownloadButton;

	@FindBy(xpath = "/body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[2]")
	WebElement edgeConfigurationDownloadBtn;

	@FindBy(xpath = "//span[@class='titleHeadingsub']")
	WebElement Buld_App_Validation;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement Edit_btn;

	// Identity Section
	@FindBy(xpath = "//input[@formcontrolname ='controllername']")
	WebElement edgeGroupIDInput;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeDeployment;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeGroupNameInput;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameInput;

	// Health Section

	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement healthtogglebtn;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement healthtoggleLabel;

	// Deployment section
	@FindBy(xpath = "//input[@formcontrolname='appgroupid']")
	WebElement edgeApplicationGroupID;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddressInput;

	// serverport

	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverPortInput;

	// addButton

	public void identitySectionGroupID(String value) {

		edgeGroupIDInput.sendKeys(Keys.ENTER);
		edgeGroupIDInput.sendKeys(value);

	}

	public void locationedgeGroup(String value) {

		location.sendKeys(Keys.ENTER);
		location.sendKeys(value);

	}

	public void descriptionedgeGroup(String value) {

		// edgeGroupIDInput.sendKeys(Keys.ENTER);
		description.sendKeys(Keys.ENTER);
		description.sendKeys(value);

	}

	public void edgenameInput(String value) {

		edgeGroupNameInput.sendKeys(Keys.ENTER);
		edgeGroupNameInput.sendKeys(value);
	}

	public void healthSection() {
		healthtogglebtn.click();
	}

	public void deploymentSection(String value) {

		// edgeApplicationGroupID.sendKeys(Keys.ENTER);
		edgeApplicationGroupID.sendKeys(value);

	}

	public void serverHostAddress(String value) {
		serverHostAddressInput.sendKeys(Keys.ENTER);
		serverHostAddressInput.sendKeys(value);
	}

	public void serverPort(String value) {
		serverPortInput.sendKeys(Keys.ENTER);
		serverPortInput.sendKeys(value);
	}

	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public void applicationGroupName(String value) throws InterruptedException {
		SelectMatOption(applicationGroupName, value);
	}

	public void checkEdgeGrouptab() {

		clickElement(EdgeGroup_btn, "");

	}

	public void groupNameThreeDot() throws Exception {
		clickElement(groupNameThreeDot, getScreenshot());
		ElementExist(groupNameThreeDot, getScreenshot());

	}

	public void alaramRaisedThreeDot() throws Exception {
		clickElement(alaramRaisedThreeDot, getScreenshot());
		try {
			ElementExist(alaramRaisedThreeDot, getScreenshot());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deviceConnectedThreeDot() {
		clickElement(deviceConnectedThreeDot, getScreenshot());

	}

	public void deviceActiveThreeDot() {
		clickElement(deviceActiveThreeDot, getScreenshot());

	}

	public void headingEdgeGroupListClick() {
		clickElement(headingGroupListTitle, "Clicking on Title of heading");

	}

	public void statusColumnThreeDot() {
		statusColumnThreeDot.click();

	}

	public void groupNameInputSearch(String value) {

		groupNameInputSearch.sendKeys(Keys.ENTER);
		groupNameInputSearch.sendKeys(value);

	}

	public void checkbulkAppBtn() {
		// Bulk_App_btn.click();
		clickElement(Bulk_App_btn, "");
//
	}

	public void checkrefreshbtn() {
		clickElement(Refresh_btn, getScreenshot());
		// ElementExist(Refresh_btn, getScreenshot());
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			try {
				backDropShowing.click();
			} catch (Exception ex) {
			}
		}
	}

	public void backDropShowing_Div_Clickonboarding() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", backDropShowing);
		if (backDropShowing != null) {
			try {
				backDropShowing.click();
			} catch (Exception ex) {
			}
		}
	}

	public void checkBulkDownloadButton() throws Exception {
		clickElement(Bulk_Download_btn, getScreenshot());
//
//			ElementExist(Bulk_Download_btn, getScreenshot());

	}

//	@Then("Click on the three dots of GroupName")
//	public void click_on_the_three_dots_of_group_name() throws Exception {
//		clickElement(groupNameThreeDot, getScreenshot());
////		try {
////			ElementExist(groupNameThreeDot, getScreenshot());
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}

	public void checkAddbtn() {
		Add_btn.click();

	}

	public void setZoomLevel(int height, int width) {
		Dimension d = new Dimension(height, width);
		driver.manage().window().setSize(d);
	}

	public String getCellText(int rowIndex, int colIndex) {
		WebElement row = tableElement.findElements(By.tagName("tr")).get(rowIndex);
		WebElement cell = row.findElements(By.tagName("td")).get(colIndex);
		String tablevalue = cell.getText();
		return tablevalue;
	}

	public void Edit_btn() {

		Edit_btn.click();

	}

	public void deleteEdgeGroupColumn() {
		clickElement(deleteEdgeGroupColumn, "");
		// deleteEdgeGroupColumn.click();

	}

	public void confirmationYesMessage() {
		clickElement(confirmationYesMessage, "");
		// confirmationYesMessage.click();
	}

	public void confirmationNoMessage() {
		clickElement(confirmationYesMessage, "");
		// confirmationYesMessage.click();

	}

	public void stopButton() {
		clickElement(stopButton, "");
		// stopButton.click();
	}

	public void consoleIcon() {
		clickElement(consoleIcon, "");
		// consoleIcon.click();

	}

	public void alaramRaisedThreeDotInputMin(String value) {

		alaramRaisedInputMin.sendKeys(Keys.ENTER);
		alaramRaisedInputMin.sendKeys(value);
	}

	public void alaramRaisedThreeDotInputMax(String value) {
		alaramRaisedInputMax.sendKeys(Keys.ENTER);
		alaramRaisedInputMax.sendKeys(value);
	}

	public void submitButtonForAll() {
		wait(submitButtonAll, logger);
		clickElement(submitButtonAll, "");
		// submitButtonAll.click();
	}

	public void deviceConnectedInputMin(String value) {
		SetInputENterKey(deviceConnectedInputMin, value);
		SetInput(deviceConnectedInputMin, value, value);
//		deviceConnectedInputMin.sendKeys(Keys.ENTER);
//		deviceConnectedInputMin.sendKeys(value);

	}

	public void deviceConnectedInputMax(String value) {
		SetInputENterKey(deviceConnectedInputMax, value);
		SetInput(deviceConnectedInputMax, value, value);

//		deviceConnectedInputMax.sendKeys(Keys.ENTER);
//		deviceConnectedInputMax.sendKeys(value);
	}

	public void deviceActiveInputMin(String value) {
		SetInputENterKey(deviceActiveInputMin, value);
		SetInput(deviceActiveInputMin, value, value);

//		deviceActiveInputMin.sendKeys(Keys.ENTER);
//		deviceActiveInputMin.sendKeys(value);
	}

	public void deviceActiveInputMax(String value) {
		SetInputENterKey(deviceActiveInputMax, value);
		SetInput(deviceActiveInputMax, value, value);
//
//		deviceActiveInputMax.sendKeys(Keys.ENTER);
//		deviceActiveInputMax.sendKeys(value);

	}

	public String get_Text_EditButtonToolTip() throws InterruptedException {

		mouseHover(Edit_btn);
		Thread.sleep(2000);
		if (toolTip != null) {
			String expectedToolTip = "Edit";
			String edittoolTipText = EditButtonToolTip.getText();

			System.out.println("toolTipText-->" + edittoolTipText);
			if (edittoolTipText.equals(expectedToolTip)) {
				System.out.println("Test Case Passed");
			}
			return edittoolTipText;
		}
		return "";
	}

	public String get_Text_DeleteButtonToolTip() throws InterruptedException {

		mouseHover(deleteEdgeGroupColumn);

		Thread.sleep(3000);

		if (toolTip != null) {
			String deletetoolTipText = toolTip.getText();

			System.out.println("toolTipText-->" + deletetoolTipText);

			return deletetoolTipText;
		}
		return "";
	}

	public String get_Text_StopButtonToolTip() throws InterruptedException {

		mouseHover(stopButton);

		Thread.sleep(3000);

		String stoptoolTipText = StopButtonToolTip.getText();

		System.out.println("toolTipText-->" + stoptoolTipText);

		return stoptoolTipText;
	}

	public String get_Text_ConsoleButtonToolTip() throws InterruptedException {

		mouseHover(consoleIcon);

		Thread.sleep(3000);

		if (toolTip != null) {
			String consoletoolTipText = ConsoleButtonToolTip.getText();

			System.out.println("toolTipText-->" + consoletoolTipText);

			return consoletoolTipText;
		}
		return "";
	}

	public void moveSliderCondition(String m) {
		moveSliderCondition(healthtogglebtn, healthtoggleLabel, m);
	}

	public String removalofEneredTextForEdgeGroupName() {

		return removalofEneredText(edgeGroupNameInput);

	}

	public String removalofEneredTextForLocation() {

		return removalofEneredText(location);

	}

	public String removalofEneredTextForDescription() {

		return removalofEneredText(description);

	}

	public void moveslideronoff() {
		Actions act = new Actions(driver);
		act.moveToElement(cloudhealthButtonOff).build().perform();
	}

	public String removalofEneredTextForServerNodes() {

		return removalofEneredText(serverNodes);

	}

	public String removalofEneredTextForServerHostAddress() {

		return removalofEneredText(serverHostAddressInput);

	}

	public String removalofEneredTextForServerPort() {

		return removalofEneredText(serverPortInput);

	}

	public void edgeConfigurationDownloadBtn() {
		edgeConfigurationDownloadBtn.click();
	}

	public void refreshButtonforLicence() {
		refreshButtonforLicence.click();
	}

	public void registrationUploadButton() {
		registrationUploadButton.click();
	}

	public void controllerConfigurationCertificateUpload(String value) throws AWTException {
		backDropShowing_Div_Click();
		controllerConfigurationCertificateUpload.sendKeys(value);
//		Robot r = new Robot();
//	      //pressing enter
//	      r.keyPress(KeyEvent.VK_ENTER);
//	      //releasing enter
//	      r.keyRelease(KeyEvent.VK_ENTER);
//	      //pressing ctrl+v
//	      r.keyPress(KeyEvent.VK_CONTROL);
//	      r.keyPress(KeyEvent.VK_V);
//	      //releasing ctrl+v
//	      r.keyRelease(KeyEvent.VK_CONTROL);
//	      r.keyRelease(KeyEvent.VK_V);
//	      //pressing enter
//	      r.keyPress(KeyEvent.VK_ENTER);
//	      //releasing enter
//	      r.keyRelease(KeyEvent.VK_ENTER);
	}

	public String verifyValidationMessageEdgeId() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		if (validationMessageEdgeId == null) {
			return "";
		}
		String message = validationMessageEdgeId.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeName() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		if (validationMessageEdgeName == null) {
			return "";
		}
		String message = validationMessageEdgeName.getText();

		return message.trim();

	}

	public void serialKey(String value) {
		serialKey.sendKeys(value);
	}

	public void uploadButton() {
		uploadButton.click();
	}

	public void licenceUploadButton() {
		licenceUploadButton.click();
	}

	public void licenseUploadButtonAfter() {

		licenseUploadButtonAfter.click();
	}

	public void licenseUploadChooseFile(String value) {

		SetInput(licenseUploadChooseFile, value, value);
		// licenseUploadChooseFile.sendKeys(value);
	}

	public void cancelButton() {
		clickElement(cancelButton, "");
		//
//cancelButton.click();
	}

	public void serverNodes(String value) {
		SetInputENterKey(serverNodes, "");
		SetInput(serverNodes, value, value);
		// serverNodes.sendKeys(value);

	}

	public String deploymentHeadingTitle() {
		String titleDeployment = deploymentHeadingTitle.getText();
		return titleDeployment;

	}

	public void groupNameAdd(String value) {
		SetInputENterKey(groupNameAdd, "");
		SetInput(groupNameAdd, value, value);

//		groupNameAdd.sendKeys(Keys.ENTER);
//		groupNameAdd.sendKeys(value);
	}

	public void LicenseDownloadButton() {
		clickElement(LicenseDownloadButton, "");

		// LicenseDownloadButton.click();
	}

	public String validationMessageGroupName() {
		validationMessageGroupName.getText();
		return validationMessageGroupName();
	}

	public void saveButtononboardingCertificateIcon() {

		clickElement(saveButtononboardingCertificateIcon, "");

		// saveButtononboardingCertificateIcon.click();
	}

	public void fileupload() {
		Actions action = new Actions(driver);

		action.moveToElement(Bulk_App_btn).click().build().perform();
	}

	public void statusColumnActive() {
		clickElement(statusColumnActive, "");
		// statusColumnActive.click();
	}

	public String removalofEnteredTextForGroupName() {

		return removalofEneredText(groupNameInputSearch);

	}

	public String removalofEnteredTextForAlaramRaisedMin() {

		return removalofEneredText(alaramRaisedInputMin);

	}

	public String removalofEnteredTextForAlaramRaisedMax() {

		return removalofEneredText(alaramRaisedInputMax);

	}

	public String removalofEnteredTextForDeviceConnectedMin() {

		return removalofEneredText(deviceConnectedInputMin);

	}

	public String removalofEnteredTextFordeviceConnectedInputMax() {

		return removalofEneredText(deviceConnectedInputMax);

	}

	public void cloudbuttonhealth() {
		clickElement(cloudhealthButtonOff, "");
		// cloudhealthButtonOff.click();
	}

	public void clickEdgeGroups() {
		clickElement(EdgeGroupTab, "");
		// EdgeGroupTab.click();
	}

	public void edgegroupstatusInactive() {
		clickElement(edgegroupstatusInactive, "");
		// edgegroupstatusInactive.click();
	}

	public void saveButtononEdgeGroupEdit() {
		clickElement(saveButtononEdgeConfiguration, "");

		// saveButtononEdgeConfiguration.click();
	}

	public void licenseCancelButton() {
		clickElement(licenseCancelButton, "");
		// licenseCancelButton.click();
	}

	public void headingtitleonboarding() {
		clickElement(headingtitleonboarding, "");
		// headingtitleonboarding.click();
	}

	public void sortingGroupName() throws InterruptedException {
		// Fetch column data before sorting
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[1]")); // Adjusted
																												// XPath
																												// for
																												// specific
																												// column
		String[] beforeSort = new String[columns.size()];
		for (int i = 0; i < columns.size(); i++) {
			beforeSort[i] = columns.get(i).getText().trim();
			System.out.println("Before Sort: " + beforeSort[i]);
		}

		// Sort the data in ascending order locally for comparison
		String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
		Arrays.sort(expectedAscending);
		System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

		// Click the sorting icon for ascending order
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);

		// Fetch column data after sorting in ascending order
		columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[1]"));
		String[] actualAscending = new String[columns.size()];
		for (int i = 0; i < columns.size(); i++) {
			actualAscending[i] = columns.get(i).getText().trim();
			System.out.println("After Ascending Sort: " + actualAscending[i]);
		}

		Assert.assertTrue("Column data is not sorted in ascending order",
				Arrays.equals(expectedAscending, actualAscending));

		// Click the sorting icon for descending order
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);

		// Reverse sort the data locally for comparison
		String[] expectedDescending = Arrays.copyOf(expectedAscending, expectedAscending.length);
		Collections.reverse(Arrays.asList(expectedDescending));
		System.out.println("Expected Descending Order: " + Arrays.toString(expectedDescending));

		// Fetch column data after sorting in descending order
		columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[1]"));
		String[] actualDescending = new String[columns.size()];
		for (int i = 0; i < columns.size(); i++) {
			actualDescending[i] = columns.get(i).getText().trim();
			System.out.println("After Descending Sort: " + actualDescending[i]);
		}

		// Assert the data is sorted in descending order
		Assert.assertTrue("Column data is not sorted in descending order",
				Arrays.equals(expectedDescending, actualDescending));

	}

	public void checkcolumuniformity() {

		// Get the column headers
		List<WebElement> headers = table.findElements(By.xpath("//tr"));

		// Store column widths
		java.util.ArrayList<Integer> columnWidths = new java.util.ArrayList<Integer>();

		// Extract widths of each column
		for (WebElement header : headers) {
			columnWidths.add(header.getSize().getWidth());
		}

		// Check uniformity
		int threshold = 5; // Define a threshold for uniformity
		boolean uniform = true;
		int firstWidth = columnWidths.get(0);
		for (int width : columnWidths) {
			if (Math.abs(width - firstWidth) >= threshold) {
				uniform = false;
				break;
			}
		}

		if (uniform) {
			System.out.println("Column widths are uniform.");
		} else {
			System.out.println("Column widths are not uniform.");
		}
	}

	public String get_Text_ToolTipDeviceConnected() {
		mouseHover(deviceConnectedlabel);

		String deviceConnectedlabelText = deviceConnectedToolTip.getText();

		deviceConnectedlabelText.trim();

		return deviceConnectedlabelText;
	}

	public String get_Text_ToolTipDeviceActive() {
		mouseHover(deviceActivelabel);

		String deviceActiveText = deviceActiveToolTip.getText();

		deviceActiveText.trim();

		return deviceActiveText;
	}

	public String get_Text_ToolTipStatus() {
		mouseHover(statuslabel);

		String statuslabelText = statusToolTip.getText();

		statuslabelText.trim();

		return statuslabelText;
	}

	public String get_Text_ToolTipEdit() throws InterruptedException {
		mouseHover(groupNameEdit);
		Thread.sleep(2000);

		String editToolTipText = editToolTip.getText();

		editToolTipText.trim();

		return editToolTipText;
	}

	public String get_Text_ToolTipDelete() {
		mouseHover(groupNameDelete);

		String deleteToolTipText = deleteToolTip.getText();

		deleteToolTipText.trim();

		return deleteToolTipText;
	}

	public String get_Text_ToolTipConsole() {
		mouseHover(consoleIcon);

		String consoleIconText = consoleToolTip.getText();

		consoleIconText.trim();

		return consoleIconText;
	}

	public String get_Text_ToolTipClose() {

		mouseHover(closeIcon);
		wait(closeTooltip, logger);

		String closeToolTipIconText = closeTooltip.getText();

		closeToolTipIconText.trim();

		return closeToolTipIconText;
	}

	public String get_Text_ToolTipStop() {
		mouseHover(stopICon);

		String stopIconText = stopToolTip.getText();

		stopIconText.trim();

		return stopIconText;
	}

	public String lastRowBeforeRefresh() {

		WebElement tableGrid = driver.findElement(By.xpath("//table[@role='table']")); // Replace with your table
																						// locator

		// Locate the last row before the refresh
		WebElement lastRowBeforeRefresh = tableGrid.findElement(By.xpath("//tbody/tr[last()]")); // Adjust XPath if
																									// necessary
		return lastRowBeforeRefresh.getText();

	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[1]")
	WebElement refreshButtonfun;

	@FindBy(xpath = "//table[@role='table']")
	WebElement refreshedTableGrid;

	public String lastRowDataAfterRefresh() throws InterruptedException {
		refreshButtonfun.click();
		Thread.sleep(2000);

		WebElement lastRowAfterRefresh = refreshedTableGrid.findElement(By.xpath("//tbody/tr[last()]")); 
		return lastRowAfterRefresh.getText();

	}
	@FindBy(xpath = "//table[@id='matTable']/tbody/tr")
	List<WebElement> tableRows;
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	WebElement ListDeploy;

	public String resultTable() {
		return ListDeploy.getText();

	}

	@FindBy(xpath = "(//div[@id='toast-container'])")
	WebElement bulkdownloadsuccessmessage;
		public WebElement downloadSuccessMessage() {
			return bulkdownloadsuccessmessage;
		}

		public String get_Text_ToolTipedgeGroupName() throws InterruptedException {
			mouseHover(groupNameAdd);
			
			Thread.sleep(500);

			String groupNameToolTipText = getText(groupNameToolTip);

			groupNameToolTipText.trim();

			return groupNameToolTipText;
		
	}

		public void sortingOnGroupName() throws InterruptedException {
			driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[1]/div/span/div/div[contains(text(),'Group Name')][1]")).click();
			Thread.sleep(2000);
			try {
		

				// Fetch column data before sorting
				List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
				List<String> beforeSort = new ArrayList<String>();
				List<String> afterSort = new ArrayList<String>();
				for (int i = 0; i < columns.size(); i++) {
					beforeSort.add(columns.get(i).getText().trim());
					afterSort.add(columns.get(i).getText().trim());
				}

				afterSort.sort((a, b) -> a.compareTo(b));

				for (int i = 0; i < afterSort.size(); i++) {
					Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
							beforeSort.get(i));
				}

			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Test failed due to exception: " + e.getMessage());
			}
			
			
		}

		public void sortingOnDeviceActive() throws InterruptedException {
			driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[3]/div/span/div/div[1]")).click();
			Thread.sleep(2000);
			try {
		

				// Fetch column data before sorting
				List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
				List<String> beforeSort = new ArrayList<String>();
				List<String> afterSort = new ArrayList<String>();
				for (int i = 0; i < columns.size(); i++) {
					beforeSort.add(columns.get(i).getText().trim());
					afterSort.add(columns.get(i).getText().trim());
				}

				afterSort.sort((a, b) -> a.compareTo(b));

				for (int i = 0; i < afterSort.size(); i++) {
					Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
							beforeSort.get(i));
				}

			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Test failed due to exception: " + e.getMessage());
			}
			
		}

		public void sortingOnStatus() throws InterruptedException {
			driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[4]/div/span/div/div[1]")).click();
			Thread.sleep(2000);
			try {
		

				// Fetch column data before sorting
				List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
				List<String> beforeSort = new ArrayList<String>();
				List<String> afterSort = new ArrayList<String>();
				for (int i = 0; i < columns.size(); i++) {
					beforeSort.add(columns.get(i).getText().trim());
					afterSort.add(columns.get(i).getText().trim());
				}

				afterSort.sort((a, b) -> a.compareTo(b));

				for (int i = 0; i < afterSort.size(); i++) {
					Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
							beforeSort.get(i));
				}

			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Test failed due to exception: " + e.getMessage());
			}
			
		}

		
		@FindBy(xpath = "//div[@id='toast-container']")

		WebElement confirmationMessage;

		
	    // Method to get the confirmation message text
	    public String getConfirmationMessage() {
	        return confirmationMessage.getText();
	    
}
	
}