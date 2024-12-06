package com.cdm.pages;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeDevicesPage extends CommonActions {

	public EdgeDevicesPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@id= 'mat-form-field-label']")
	WebElement eddeIdLabel;

	@FindBy(xpath = "//div[@id='toast-container']")

	WebElement toasterSuccess;

	@FindBy(css = "//input[@value='1']")
	WebElement requiredFields;

	@FindBy(xpath = "//tbody/tr")
	List<WebElement> gridRows;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]")
	List<WebElement> gridStatusRows;

	@FindBy(xpath = "//h2[@class='titleHeading']")
	WebElement edgeDeviceTable;

	@FindBy(xpath = "//h4[contains(text(),'Identity')]")
	WebElement identityLabel;

	@FindBy(xpath = "//h4[contains(text(),'Health')]")
	WebElement healthLabel;

	@FindBy(xpath = "//h4[contains(text(),'Registration')]")
	WebElement registrationLabel;

	@FindBy(xpath = "//h4[contains(text(),'Deployment')]")
	WebElement deploymentLabel;

	@FindBy(xpath = "//h4[contains(text(),'Well Mapping')]")
	WebElement wellMappingLabel;

	@FindBy(xpath = "//div[contains(text(),'EDGE ID')]")
	WebElement headerColumnEDGEID;

	@FindBy(xpath = "//div[contains(text(),'EDGE Name')]")
	WebElement headerColumnEDGEName;

	@FindBy(xpath = "//thead/tr[1]/th[3]")
	WebElement headerColumnEDGEGroupName;

	@FindBy(xpath = "//h2[contains(text(),'EDGE Devices')]")
	WebElement listScreenTitle;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]")
	WebElement edgegroupnametip;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/span[1]/img[1]")
	WebElement deployAppsicon;

	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeGroupNameTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement consoleTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deployTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement configAppsTooltip;

	@FindBy(xpath = "//span[contains(text(),' Configurations')]")
	WebElement ConfigurationsTab;

	@FindBy(xpath = "//app-device-add-edit-detail-page/div/div/div/div/div[2]/button[1]")
	WebElement saveEdgeDeviceButton;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement communicationStatusThreeDot;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/label[1]/input[1]")
	WebElement communicationconnected;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement communication;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement communicationDisconnected;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[3]/label[1]/input[1]")
	WebElement EdgeDisconnected;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[4]/label[1]")
	WebElement BrokerDisconnected;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[5]")
	WebElement bulkConfigurationEdgeDevice;

	@FindBy(xpath = "//table[@id='matTable']/tbody")
	WebElement tableEdgeDevice;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/span[2]/img[1]")
	WebElement configurationIcon;

	@FindBy(xpath = "//div[@class='mat-paginator-range-label']")
	WebElement recordsperpage;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/span[1]/img[2]")
	WebElement configurationcolumnListPage;

	@FindBy(xpath = "//input[@formcontrolname='uploadfile']")
	WebElement uploadFileForEdgeDevice;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
	WebElement EditButtonToolTip;

	@FindBy(xpath = "//span[contains(text(),'Add')]")
	WebElement AddButtonEdgeDevice;

	@FindBy(xpath = "//h2[@class='titleHeading']")
	WebElement WebDevices_heading;

	// ScrollIntoView
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-device/div/div[2]/div/table/thead/tr/th[6]/div/span/div/div[1]")
	WebElement Status_Heading;

	@FindBy(xpath = "//td[@class='mat-cell cdk-cell table-data cdk-column-devicename mat-column-devicename ng-star-inserted']")
	WebElement Number_of_devices;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement Refresh_btn;

	@FindBy(xpath = "//div[@class='pagefooter']/../div[1]/div/img[2]")
	WebElement Add_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement BulkUpload_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[4]")
	WebElement Download_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[5]")
	WebElement Configuration_Icon_Button;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeIdsearchClickDot;

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement verifyalertfordownload;

	@FindBy(xpath = "//a[contains(text(),'Environment Variables')]")
	WebElement environmentalTabClick;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeGroupNameIconDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeNameSearchIconDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeappGroupsIconDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwareName;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement consolebutton;

	@FindBy(xpath = "//thead/tr[1]/th[7]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement status;

	@FindBy(xpath = "//input[@name='devicename']")
	WebElement edgeIdInput;

	@FindBy(xpath = "(//input[@name='options'])[1]")
	WebElement statusActive;

	@FindBy(xpath = "(//input[@name='options'])[2]")
	WebElement statusInactive;

	@FindBy(xpath = "//input[@name= 'displayname']")
	WebElement edgeNameInput;

	@FindBy(xpath = "//input[@name= 'appgroupname']")
	WebElement edgeAppgroupsInput;

	@FindBy(xpath = "//input[@name='controllername']")
	WebElement edgeGroupNameInput;

	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardWareNameInput;

	@FindBy(xpath = "//h2[contains(text(),'EDGE Devices')]")
	WebElement headingTitle;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/img[1]")
	WebElement EditButton;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/img[2]")
	WebElement DeleteButton;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[1]")
	WebElement ConfirmationYesButton;

	@FindBy(xpath = "//button[@class ='mat-focus-indicator btnCancel mat-button mat-button-base']")
	WebElement ConfirmationNoButton;

	@FindBy(css = ".mat-tooltip.mat-tooltip-show")
	WebElement DeleteButtonToolTip;



	//
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(css = ".cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing")
	WebElement backDropTransparent;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/span[1]/img[1]")
	WebElement deployclickfromActionsColumn;

	@FindBy(xpath = "//button/span[contains(text(),'Confirm')]/..")
	WebElement confirmDeployButton;

	@FindBy(xpath = "//button[@type='submit'][2]")
	WebElement deployButton;
	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;

	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	public void confirmClick() {
		clickElement(confirmDeployButton, "");

		// confirmDeployButton.click();
	}

	public void deployButtonClick() {
		clickElement(deployButton, "");
		// deployButton.click();
	}
	/*
	 * @FindBy(xpath =
	 * "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/h4[1]")
	 * WebElement deployListpageVerification;
	 */

	public void clickondeployimage() throws InterruptedException {

		
		clickElement(deployclickfromActionsColumn, "");
		
		// deployclickfromActionsColumn.click();
	}

//	public String get_Text_ToolTipviewAlert() {
//		scrollingElementRightBar("div.example-container", "900");
//		try {
//			Thread.sleep(30);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		mouseHover(viewAlertButton);
//
//
//		// mouseRollHoverDelete();
//		String toolTipAlert = AlertButtonToolTip.getText();
//		System.out.println("toolTipText-->" + toolTipAlert);
//		return toolTipAlert;
//	}

	public void mouseRollHoverDelete() {
		scrollingElementRightBar("div.example-container", "900");
		mouseHover(DeleteButton);
	}

	public String get_Text_ToolTipDelete() {
		// To get the tool tip text and assert
		scrollingElementRightBar("div.example-container", "900");

		mouseHover(DeleteButton);

		// mouseRollHoverDelete();

		String deletetoolTipText = DeleteButtonToolTip.getText();

		System.out.println("toolTipText-->" + deletetoolTipText);

		return deletetoolTipText;
	}

	public String get_Text_ToolTipEdit() {
		// To get the tool tip text and assert
		scrollingElementRightBar("div.example-container", "900");

		mouseHover(EditButton);

		String edittoolTipText = EditButtonToolTip.getText();

		System.out.println("toolTipText-->" + edittoolTipText);

		return edittoolTipText;
	}

	public WebElement edgeIdSearch_Button() throws InterruptedException {
       Thread.sleep(3000);
		clickElement(edgeIdsearchClickDot, "Clicking on 3 dots for Edge Id ");
		return edgeIdsearchClickDot;

		// edgeIdsearchClickDot.click();
	}

	public void edgeNameSearch_Button() {

		clickElement(edgeNameSearchIconDot, "Clicking on 3 dots for Edge Name ");
		// edgeNameSearchIconDot.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void backDropTransparent_Div_Click() {
		if (backDropTransparent != null) {
			backDropTransparent.click();
		}
	}

	public void edgeGroupNameSearch_Button() {

		// clickElement(edgeGroupNameIconDot, "Clicking on 3 dots of edgeGroupName");
		edgeGroupNameIconDot.click();
	}

	public void edgeAppGroupsSearch_Button() {
		clickElement(edgeappGroupsIconDot, "Clicking on 3 dots of edgeAppGroups");
		// edgeappGroupsIconDot.click();
	}

	public void hardwareNameSearchDot() {
		clickElement(hardwareName, "Clicking on 3 dots of HardwareName");

		// hardwareName.click();
	}

	public void headingClick() throws InterruptedException {
		clickElement(headingTitle, "");
		// headingTitle.click();

	}

	public void Confirmation_YesButton() {
		clickElement(ConfirmationYesButton, "");
		// ConfirmationYesButton.click();
	}

	public void Confirmation_NoButton() {
		clickElement(ConfirmationNoButton, "Clicking on confirmation on Cancel button");
		// ConfirmationNoButton.click();
	}

	public void clickRefreshButton() {
		clickElement(Refresh_btn, "Clicking on refresh button");
		// Refresh_btn.click();
	}
	public WebElement RefreshButtonText() {
		return Refresh_btn;
		
		
	}

	public void sendValueSearchIcon(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", edgeIdInput);
		SetInputENterKey(edgeIdInput, "");
		
		SetInput(edgeIdInput, value, value);
	}

	public void sendValueSearchIconByEdgeName(String value) {
		SetInputENterKey(edgeNameInput, "");
		SetInput(edgeNameInput, value, value);

//		edgeNameInput.sendKeys(Keys.ENTER);
//		edgeNameInput.sendKeys(value);

	}

	public void editValueSearchIconByEdgeName(String value) {

		SetInputENterKey(edgeNameInput, "");
		SetInput(edgeNameInput, value, value);
//		edgeNameInput.sendKeys(Keys.ENTER);
//
//		edgeNameInput.sendKeys(value);
//		edgeNameInput.sendKeys(Keys.ENTER);

	}

	public void sendValueSearchinputBoxForEdgeGroupName(String value) {
		SetInputENterKey(edgeGroupNameInput, "");
		SetInput(edgeGroupNameInput, value, value);

//		edgeGroupNameInput.sendKeys(Keys.ENTER);
//		edgeGroupNameInput.sendKeys(value);
	}

	public void sendValueSearchIconByAppGroups(String value) {

		SetInputENterKey(edgeAppgroupsInput, "");
		SetInput(edgeAppgroupsInput, value, value);

//		edgeAppgroupsInput.sendKeys(Keys.ENTER);
//		edgeAppgroupsInput.sendKeys(value);
	}

	public void hardwareNameInput(String value) {

		SetInputENterKey(hardWareNameInput, "");
		SetInput(hardWareNameInput, value, value);
//
//
//		hardWareNameInput.sendKeys(Keys.ENTER);
//		hardWareNameInput.sendKeys(value);
	}

	public String removalofEneredTextForEdgeId() {

		return removalofEneredText(edgeIdInput);

	}

	public String removalofEneredTextForEdgeName() {

		return removalofEneredText(edgeNameInput);

	}

	public String removalofEneredTextForEdgeGroupName() {

		return removalofEneredText(edgeGroupNameInput);

	}

	public String removalofEneredTextForAppGroups() {

		return removalofEneredText(edgeAppgroupsInput);

	}

	public String removalofEneredTextHardWareName() {

		return removalofEneredText(hardWareNameInput);

	}

	public void clickAddButton() {
		clickElement(Add_btn, "You are clicking on Add button on Edge Device");
		// Add_btn.click();
	}

	public void clickBulkUpload() {
		clickElement(BulkUpload_btn, "Clicking on bulkUpload button");
		// BulkUpload_btn.click();
	}

	public void clickDownload() {
		clickElement(Download_btn, "");
		// Download_btn.click();
	}

	public void verifyText(String strTitle) {
		// verifyText(EdgeDeviceheadingTitle,strTitle,"Edge Device Title not found");
	}

	public void clickConfiguration() {
		clickElement(Configuration_Icon_Button, "");
		// Configuration_Icon_Button.click();
	}

	public boolean isVisibleRefresh() {

		return Refresh_btn != null && Refresh_btn.isDisplayed();
	}

	public boolean isVisibleDeploy() {

		return deployButton != null && deployButton.isDisplayed();
	}

	public boolean isVisibleAdd() {

		return Add_btn != null && Add_btn.isDisplayed();
	}

	public boolean isVisibleEdgeIdSearchbox() {

		return edgeIdInput != null && edgeIdInput.isDisplayed();
	}

	public boolean isVisibleUpload() {

		return BulkUpload_btn != null && BulkUpload_btn.isDisplayed();
	}

	public boolean isVisibleDownload() {

		return Download_btn != null && Download_btn.isDisplayed();
	}

	public boolean isVisibleSettingButton() {

		return Configuration_Icon_Button != null && Configuration_Icon_Button.isDisplayed();
	}

	public void clickEditButton() {

		scrollingElementRightBar("div.example-container", "900");
		clickElement(EditButton, "");
		// EditButton.click();
	}



	public void clickDeleteButton() {

		scrollingElementRightBar("div.example-container", "900");
		clickElement(DeleteButton, "");
		// DeleteButton.click();
	}

	public String get_Text_AddEdgeDevice() {

		String BreadcrumbAdd = AddButtonEdgeDevice.getText();
		System.out.println("toolTipText-->" + BreadcrumbAdd);
		return BreadcrumbAdd;

	}

	public String get_Text_EdgeListHeading() {

		String EdgeDeviceList = WebDevices_heading.getText();
		System.out.println("Title on Edge Device List page-->" + EdgeDeviceList);
		return EdgeDeviceList;

	}

	public String get_Text_bulkDownload() {

//		String bulkdownloadText = verifyalertfordownload.getText();

		String bulkdownloadalert = verifyalertfordownload.getAttribute("innerHTML");

		System.out.println(
				"InnerHTML of the element (get_attribute): " + verifyalertfordownload.getAttribute("innerHTML"));
		System.out.println("Title on alert popup after download>" + bulkdownloadalert);
		return bulkdownloadalert;

	}

	public void setZoomLevel(int height, int width) {
		Dimension d = new Dimension(height, width);
		driver.manage().window().setSize(d);
	}

	public void WebDevices_heading() {
		clickElement(WebDevices_heading, "");
		// WebDevices_heading.click();
	}

	public void Configuration_Icon_Button() {
		clickElement(Configuration_Icon_Button, "");
		// Configuration_Icon_Button.click();
	}

	public void edgeDeviceScreenshot() {
		getScreenshot();
	}

	public void clearedgeIDSearchvalue() {
		edgeIdInput.clear();

	}

	public void clearedgeNameSearchvalue() {
		edgeNameInput.clear();

	}

	public void clearEdgeGroupNameSearchvalue() {
		edgeGroupNameInput.clear();

	}

	public void clearappNameSearchvalue() {
		edgeAppgroupsInput.clear();

	}

	public void clearHardwareSearchvalue() {
		hardWareNameInput.clear();

	}

	public void configurationcolumnListPage() {
		clickElement(configurationcolumnListPage, "");
		// configurationcolumnListPage.click();
	}

	public int[] getEdgeNameMinMaxCharLength() {
		int[] charLength = new int[2];
		charLength[0] = Integer.parseInt(edgeIdInput.getAttribute("minlength"));
		charLength[1] = Integer.parseInt(edgeIdInput.getAttribute("maxlength"));
		return charLength;
	}

	public void uploadFileForEdgeDevice(String value) {
		SetInputENterKey(uploadFileForEdgeDevice, "");
		SetInput(uploadFileForEdgeDevice, value, value);

//		uploadFileForEdgeDevice.sendKeys(Keys.ENTER);
//		uploadFileForEdgeDevice.sendKeys(value);
	}

	public void uploadFileForEdgeDeviceClick() {
	
		//clickElement(uploadFileForEdgeDevice, "");
		// uploadFileForEdgeDevice.click();
	}//

	public String recordsperpage() {

		String ExpectedNumberOfRecordsBasedOnPagination = "25";

		List<WebElement> ListOfRecordsBasedOnPagination = tableEdgeDevice.findElements(By.tagName("tr"));
		int ActualNumberOfRecordsBasedOnPagination = ListOfRecordsBasedOnPagination.size();
		System.out.println(ExpectedNumberOfRecordsBasedOnPagination
				+ " Then the table values should display the same number of records:"
				+ ActualNumberOfRecordsBasedOnPagination);

		return "";

	}

	public void fileupload() throws InterruptedException, AWTException {
		Actions action = new Actions(driver);

       action.moveToElement(BulkUpload_btn).click().build().perform();
		

//        // Use Robot class to handle the file upload dialog
//        Robot robot = new Robot();
//
//        // Simulate Ctrl+V to paste the file path
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//
//        // Simulate pressing Enter
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//
//        // Optional: Wait for the upload to complete
        Thread.sleep(2000);
	}

	public void configurationIcon() {
		clickElement(configurationIcon, "");
		// configurationIcon.click();
	}

	public void bulkConfigurationEdgeDevice() {
		clickElement(bulkConfigurationEdgeDevice, "");
		// bulkConfigurationEdgeDevice.click();
	}

	public void checkdisabledeploybutton() {
		// Check if button1 is enabled
		if (!deployButton.isEnabled()) {

			confirmClick();

		} else {

			Assert.assertTrue(isVisibleDeploy());
		}
	}

	public void ConfigurationsTab() {
		clickElement(ConfigurationsTab, "");
		// ConfigurationsTab.click();
	}

	public void statusInactive() throws InterruptedException {
		clickElement(statusInactive, "");
//		statusInactive.click();
	}
	
	public void statusActive() throws InterruptedException {
		clickElement(statusActive, "");
//		
	}

	public void status() {
		wait(status, logger);
		clickElement(status, "");

	}

	public void saveEdgeDeviceButton() {
		clickElement(saveEdgeDeviceButton, "");
		

	}

	public void deselectCheckboxforconnected() {

		if (communicationconnected.isSelected()) {
			communicationconnected.click();
		}
	}

	public void deselectCheckboxforDisconnected() {

		if (communicationDisconnected.isSelected()) {
			communicationDisconnected.click();
		}
	}

	public void deselectCheckboxforEdgeDisconnected() {

		if (EdgeDisconnected.isSelected()) {
			clickElement(EdgeDisconnected, "");
			// EdgeDisconnected.click();
		}
	}

	public void deselectCheckboxforBrokerdisconnected() {

		if (!BrokerDisconnected.isSelected()) {
			clickElement(BrokerDisconnected, "");
			// BrokerDisconnected.click();
		}
	}

	public boolean isCheckboxSelectedforconnected() {

		return communicationconnected.isSelected();
	}

	public void communicationconnected() {
		if (!communicationconnected.isSelected()) {

			communicationconnected.click();
		}

	}

	public void communicationDisconnected() {
		if (!communicationDisconnected.isSelected()) {

			communicationDisconnected.click();
		}
	}

	public void EdgeDisconnected() {
		if (!EdgeDisconnected.isSelected()) {

			EdgeDisconnected.click();
		}
		// EdgeDisconnected.click();
	}

	public void BrokerDisconnected() {
		if (!BrokerDisconnected.isSelected()) {

			BrokerDisconnected.click();
		}
	}

	public void communicationStatusThreeDot() {
		clickElement(communicationStatusThreeDot, "Clicking on communication status column");
		// communicationStatusThreeDot.click();
	}

	public String verifyalertfordownload() {
		return getText(verifyalertfordownload);
		// verifyalertfordownload.getText();
	}

	public String get_Text_deleteToolTip() throws InterruptedException {

		mouseHover(DeleteButton);

		if (deleteTooltip != null) {
			String deleteTooltipText = deleteTooltip.getText();

			System.out.println("toolTipText-->" + deleteTooltipText);

			return deleteTooltipText;
		}
		return "";
	}

	public String get_Text_deployToolTip() throws InterruptedException {

		mouseHover(deployAppsicon);

		if (deployTooltip != null) {
			String deployTooltipText = deployTooltip.getText();

			System.out.println("toolTipText-->" + deployTooltipText);

			return deployTooltipText;
		}
		return "";
	}

	public String get_Text_ConfigToolTip() throws InterruptedException {

		mouseHover(configurationIcon);

		if (configAppsTooltip != null) {
			String configAppsTooltipText = configAppsTooltip.getText();

			System.out.println("toolTipText-->" + configAppsTooltipText);

			return configAppsTooltipText;
		}
		return "";
	}

	public String get_Text_configToolTip() throws InterruptedException {

		mouseHover(Configuration_Icon_Button);

		if (configAppsTooltip != null) {
			String configAppsTooltipText = configAppsTooltip.getText();

			System.out.println("toolTipText-->" + configAppsTooltipText);

			return configAppsTooltipText;
		}
		return "";
	}

	public String get_Text_edgeGroupNameToolTip() throws InterruptedException {

		mouseHover(edgegroupnametip);

		if (edgeGroupNameTooltip != null) {
			String edgeGroupNameTooltipText = edgeGroupNameTooltip.getText();

			System.out.println("toolTipText-->" + edgeGroupNameTooltipText);

			return edgeGroupNameTooltipText;
		}
		return "";
	}

	public String get_Text_StatusToolTip() throws InterruptedException {

		mouseHover(status);

		if (statusTooltip != null) {
			String statusTooltipText = statusTooltip.getText();

			System.out.println("toolTipText-->" + statusTooltipText);

			return statusTooltipText;
		}
		return "";
	}

	public void environmentalVariableTab() {

		clickElement(environmentalTabClick, "Clicking on Environmental tab");

	}

	public String gettooltipfordeleteButtonEdgeDevice() {
		mouseHover(DeleteButton);

		if (deleteTooltip != null) {
			String deleteTooltipText = deleteTooltip.getText();

			System.out.println("toolTipText-->" + deleteTooltipText);

			return deleteTooltipText;
		}
		return "";
	}

	public String get_Text_ConsoleToolTip() {
		mouseHover(consolebutton);

		if (consoleTooltip != null) {
			String consoleTooltipText = consoleTooltip.getText();

			System.out.println("toolTipText-->" + consoleTooltipText);

			return consoleTooltipText;
		}
		return "";
	}

//	public void verifyListScreenTitle(String title) throws Exception {
//
//		verifyText(listScreenTitle, title, "  " + title + "Edge Device Title not found.");
//	}
	public String verifyListScreenTitle() {

		return getText(listScreenTitle);
	}

	public boolean edgeDeviceTableListView() {
		edgeDeviceTable.isDisplayed();
		return false;

	}

	public void verifyheaderColumnEdgeID(String title) throws Exception {

		verifyText(headerColumnEDGEID, title, "  " + title + " not found.");
	}

	public void verifyheaderColumnEdgeName(String title) throws Exception {
		verifyText(headerColumnEDGEName, title, "  " + title + " not found.");
	}

	public void verifyEdgeDeviceListHeaderTitle(String title) throws Exception {
		verifyText(listScreenTitle, title, "  " + title + " not found.");
	}

	public void verifyIdentityLabel(String label) throws Exception {
		verifyText(identityLabel, label, "  " + label + " not found.");

	}

	public void verifyHealthLabel(String label) throws Exception {

		verifyText(healthLabel, label, "  " + label + " not found.");

	}

	public void verifyRegistrationLabel(String label) throws Exception {
		verifyText(registrationLabel, label, "  " + label + "registration Label not found.");

	}

	public void verifydeploymentLabel(String label) throws Exception {
		verifyText(deploymentLabel, label, "  " + label + "deployment Label not found.");

	}

	public void verifyWellMappingLabel(String label) throws Exception {
		verifyText(wellMappingLabel, label, "  " + label + "Well Mapping Label not found.");
	}

	public int getRowCount() {

		return gridRows.size();
	}

	public List<String> getRowData() {
		
		List<String> rowData = new ArrayList<>();
		for (WebElement row : gridRows) {
			rowData.add(row.getText());
		}
		return rowData;
	}

	public List<String> getStatusRowData() {
		List<String> rowData = new ArrayList<>();

		for (WebElement row : gridRows) {
			rowData.add(row.getText());
		}
		return rowData;
	}

	public void checkCheckbox(WebElement checkbox) {
		if (!checkbox.isSelected()) {
			checkbox.click();
		}

	}

	public void uncheckCheckbox(WebElement checkbox) {
		if (checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public boolean isCheckboxChecked(WebElement checkbox) {
		return checkbox.isSelected();
	}

	@FindBy(xpath = "//input[@value='1']")
	WebElement connectedCheckbox;

	@FindBy(xpath = "//input[@value='2']")
	WebElement disconnectedCheckbox;

	@FindBy(xpath = "//input[@value='3']")
	WebElement edgeDisconnectedCheckbox;



	@FindBy(xpath = "//input[@value='4']")
	WebElement brokerDisconnectedCheckbox;
	
	@FindBy(xpath = "//tbody/tr[1]/td[8]/img")
	List<WebElement> actionIcons;
	
	public int getActionsMenuIconCount() {
        List<WebElement> icons = actionIcons;
        return icons.size();
    }

	 public void selectCheckbox(String status) {
	        if (status.equalsIgnoreCase("Connected")) {
	            connectedCheckbox.click();
	        } else if (status.equalsIgnoreCase("Disconnected")) {
	            disconnectedCheckbox.click();
	        }else if(status.equalsIgnoreCase("Edge Disconnected")){
	        	edgeDisconnectedCheckbox.click();
	        }else if(status.equalsIgnoreCase("broker Disconnected")) {

	        	brokerDisconnectedCheckbox.click();
	        } else {
	            throw new IllegalArgumentException("Invalid status: " + status);
	        }
	    }

	 @FindBy(xpath= "//tr/td[6]")
    List<WebElement> communicationStatusColumn;

	 public List<String> getDisplayedStatuses() {
		    List<String> displayedStatuses = new ArrayList<>();
		    for (WebElement element : communicationStatusColumn) {
		        displayedStatuses.add(element.getText());
		    }
		    return displayedStatuses;
		}





	public WebElement actioncolumn() {

		return communication;
	}

	public String successMessage() {

		System.out.println("InnerHTML of the element (get_attribute): " + toasterSuccess.getAttribute("innerHTML"));
		System.out.println("Title on alert popup after download>" + toasterSuccess);
		return toasterSuccess.getText();

	}
	
	public void ToasterMessageShouldBeDisplayed(String expectedMessage) {
        
        String actualMessage = toasterSuccess.getText();
        assert actualMessage.equals(expectedMessage) : "Expected: " + expectedMessage + ", but got: " + actualMessage;
    }

	public WebElement verifyToasterSuccess(WebElement toasterSuccess, String expectedMessage) {

		System.out.println("InnerHTML of the element (get_attribute): " + toasterSuccess.getAttribute("innerHTML"));
		System.out.println("Title on alert popup after download> " + toasterSuccess);

		String actualMessage = toasterSuccess.getAttribute("innerHTML");
		Assert.assertEquals("The toaster success message did not match the expected value.", expectedMessage,
				actualMessage);

		return toasterSuccess;
	}

	public String verifyheaderColumnEdgeID() {
		return getText(headerColumnEDGEID);
	}

	public String verifyheaderColumnEdgeName() {
		return getText(headerColumnEDGEName);
	}

	@FindBy(xpath = "//div[contains(text(),'EDGE ID')]")
	WebElement edgeIDTitle;

	@FindBy(xpath = "//div[contains(text(),'EDGE Name')]")
	WebElement edgeNameTitle;

	@FindBy(xpath = "//div[contains(text(),'EDGE Group Name')]")
	WebElement edgeGroupNameTitle;

	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeIdTooltip;
	public String get_Text_ToolTipEdgeID() {
		mouseHover(edgeIDTitle);

		if (edgeIdTooltip != null) {
			String edgeIdTooltipText = edgeIdTooltip.getText();

			System.out.println("toolTipText-->" + edgeIdTooltipText);

			return edgeIdTooltipText;
		}
		return "";

	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeNameTooltip;

	public String get_Text_ToolTipEdgeName() {

		mouseHover(edgeNameTitle);
		if (edgeNameTooltip != null) {
			String edgeNameTooltipText = edgeNameTooltip.getText();

			System.out.println("toolTipText-->" + edgeNameTooltipText);

			return edgeNameTooltipText;
		}
		return "";

	}


	public String get_Text_ToolTipEdgeGroupName() {
		mouseHover(edgeGroupNameTitle);

		if (edgeGroupNameTooltip != null) {
			String edgeGroupNameTooltipText = edgeGroupNameTooltip.getText();

			System.out.println("toolTipText-->" + edgeGroupNameTooltipText);

			return edgeGroupNameTooltipText;
		}
		return "";


	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement hardwareNameTitleTooltip;

	@FindBy(xpath = "//div[contains(text(),'Hardware Name')]")
	WebElement hardwareNameTitle;

	public String get_Text_ToolTipHardwareName() {
		mouseHover(hardwareNameTitle);

		if (hardwareNameTitleTooltip != null) {
			String hardwareNameTitleTooltipText = hardwareNameTitleTooltip.getText();

			System.out.println("toolTipText-->" + hardwareNameTitleTooltipText);

			return hardwareNameTitleTooltipText;
		}
		return "";

	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement communicationnameTooltip;

	@FindBy(xpath = "//div[contains(text(),'Communication Status')]")
	WebElement communicationNameTitle;

	public String get_Text_ToolTipCommunicationName() {
		mouseHover(communicationNameTitle);

		if (communicationnameTooltip != null) {
			String communicationnameTooltipText = hardwareNameTitleTooltip.getText();

			System.out.println("toolTipText-->" + communicationnameTooltipText);

			return communicationnameTooltipText;
		}
		return "";

	}

	public String get_Text_EdgeNameToolTip() {
		mouseHover(edgeNameTitle);

		if (edgeNameTooltip != null) {
			String edgeNameTooltipText = edgeNameTooltip.getText();

			System.out.println("toolTipText-->" + edgeNameTooltipText);

			return edgeNameTooltipText;
		}
		return "";

	}

	public void mousehoveronEdit() {

		mouseHover(EditButton);
	}

	@FindBy(xpath="//table[@id='matTable']/tbody/tr/td")
	List<WebElement>tableDataCells;
	
	@FindBy(xpath="//table[@id='matTable']/tbody/tr")
	List<WebElement>tableRows;
	public int areSearchResultsDisplayed() {
		 List<WebElement> rows = tableRows;
	        return rows.size();
	    }
	
	   public List<String> getRowDataAfterremoval() {
	        List<WebElement> cells = tableDataCells;
	        List<String> rowData = new ArrayList<>();
	        for (WebElement cell : cells) {
	            rowData.add(cell.getText()); // Collect text data from each cell
	        }
	        return rowData;
	    }

	public void sendValueSearchIconByHardwareName(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", hardWareNameInput);
		SetInputENterKey(hardWareNameInput, "");
		SetInput(hardWareNameInput, value, value);
		
	}

	
	@FindBy(xpath="(//input[@name='options'])[1]")
	WebElement statusactiveCheckbox;
	
	@FindBy(xpath="(//div[@id='toast-container'])")
	WebElement bulkdownloadsuccessmessage;

	@FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']")
	WebElement bulkUploadsuccessmessage;
	
	@FindBy(xpath="//div[@class='toast-top-right toast-container']")
	WebElement loader;
	
	public WebElement downloadSuccessMessage() {
		return bulkdownloadsuccessmessage;
	}
	
	public void selectActiveCheckbox() {
		
		clickElement(statusactiveCheckbox, "Checking checkbox inactive");
	}

	public void selectInactiveCheckbox() {
		clickElement(statusInactive, "Checking checkbox inactive");
		
	}
	
	public List<String> getIconTooltips() {
        List<WebElement> icons = actionIcons;
        List<String> tooltips = new ArrayList<>();
        for (WebElement icon : icons) {
           
            String tooltip = icon.getAttribute("title");
            if (tooltip != null && !tooltip.isEmpty()) {
                tooltips.add(tooltip);
            } else {
                
                tooltips.add("[No Tooltip]");
            }
        }
        return tooltips;
    }

	public int countActionIcons() {
		// TODO Auto-generated method stub
		return actionIcons.size();
	}

	public WebElement addButtonText() {
		// TODO Auto-generated method stub
		return Add_btn;
	}

	public WebElement bulkUploadButtonText() {
		return BulkUpload_btn;
	}

	public WebElement bulkApplicationConfigurationText() {
		// TODO Auto-generated method stub
		return Download_btn;
	}

	public WebElement bulkDownloadText() {
		return configurationIcon;
	}

	public WebElement bulkUploadPopupmessageText() {
		return bulkUploadsuccessmessage;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement infoTooltip;
	
	@FindBy(xpath =  "//tbody/tr[1]/td[8]/img[3]")
	WebElement infoButton;
	public String get_Text_InfoToolTip() {

		mouseHover(infoButton);

		if (infoTooltip != null) {
			String infoButtonTooltipText = infoTooltip.getText();

			System.out.println("toolTipText-->" + infoButtonTooltipText);

			return infoButtonTooltipText;
		}
		return "";
	}
    public boolean isSortedAscending(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
    public List<String> getColumnData(String columnName) {
        // Identify the table headers
        List<WebElement> headers = driver.findElements(By.xpath("//*[@id= 'matTable']/table/tbody/tr[a]/td"));

        // Find the index of the column based on the column name
        int columnIndex = -1;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().trim().equalsIgnoreCase(columnName)) {
                columnIndex = i + 1; // XPath indexes start at 1
                break;
            }
        }

        if (columnIndex == -1) {
            throw new RuntimeException("Column with name '" + columnName + "' not found");
        }

        // Fetch the data from the corresponding column in the table body
        List<WebElement> columnElements = driver.findElements(By.xpath("//table/tbody/tr/td[" + columnIndex + "]"));
        List<String> columnData = new ArrayList<>();

        for (WebElement element : columnElements) {
            columnData.add(element.getText().trim());
        }

        return columnData;
    }

    // Utility method to check descending order
    public boolean isSortedDescending(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) < 0) {
                return false;
            }
        }
        return true;
    }

    @FindBy(xpath="//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]")
    WebElement sortEdgeID;
    
    @FindBy(xpath="//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]")
    WebElement sortEdgeName;
    
    @FindBy(xpath="//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")
    WebElement sortEdgeGroupName;
    

    @FindBy(xpath="//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[2]/div[2]")
    WebElement sortAppGroups;
    
    
    @FindBy(xpath="//thead/tr[1]/th[5]/div[1]/span[1]/div[1]/div[2]/div[2]")
    WebElement sorthardwareName;
    
    @FindBy(xpath="//thead/tr[1]/th[6]/div[1]/span[1]/div[1]/div[2]/div[2]")
    WebElement sortCommunicationStatus;
    
    @FindBy(xpath="//thead/tr[1]/th[5]/div[1]/span[1]/div[1]/div[2]/div[2]")
    WebElement sortStatus;
    
	
	public void sortEdgeID() {
		clickElement(sortEdgeID, "Clicking on sort arrow of Edge ID");
		
	}
	
	public void sortEdgeName() {
		clickElement(sortEdgeName, "Clicking on sort arrow of Edge Name");
		
	}
	
	public void sortEdgeGroupName() {
		clickElement(sortEdgeGroupName, "Clicking on sort arrow of sortEdgeGroupName");
		
	}
	public void sortAppGroups() {
		clickElement(sortAppGroups, "Clicking on sort arrow of sortAppGroups");
		
	}
	
	public void sortCommunicationStatus() {
		clickElement(sortCommunicationStatus, "Clicking on sort arrow of sortCommunicationStatus");
		
	}
	
	
	public void sortStatus() {
		clickElement(sortStatus, "Clicking on sort arrow of sortStatus");
		
	}

	public void verifysortingonEdgeID() throws InterruptedException {
		 {
		    // Fetch column data before sorting
		    List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[1]")); // Adjusted XPath for specific column
		    String[] beforeSort = new String[columns.size()];
		    for (int i = 0; i < columns.size(); i++) {
		        beforeSort[i] = columns.get(i).getText().trim();
		       // System.out.println("Before Sort: " + beforeSort[i]);
		    }

		    // Sort the data in ascending order locally for comparison
		    String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
		    Arrays.sort(expectedAscending);
		   // System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

		    // Click the sorting icon for ascending order
		    driver.findElement(By.xpath("//table/thead/tr/th[1]/div/span/div/div[2]")).click();
		    Thread.sleep(2000);

		    // Fetch column data after sorting in ascending order
		    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[1]"));
		    String[] actualAscending = new String[columns.size()];
		    for (int i = 0; i < columns.size(); i++) {
		        actualAscending[i] = columns.get(i).getText().trim();
		        //System.out.println("After Ascending Sort: " + actualAscending[i]);
		    }

		    Assert.assertTrue(
		            "Column data is not sorted in ascending order",
		            Arrays.equals(expectedAscending, actualAscending)
		    );

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
		        //System.out.println("After Descending Sort: " + actualDescending[i]);
		    }

		    // Assert the data is sorted in descending order
		    Assert.assertTrue(
		            "Column data is not sorted in descending order",
		            Arrays.equals(expectedDescending, actualDescending)
		    );

		}

		
	}

	public void verifysortingonEdgeName() throws InterruptedException {
	    // Fetch column data before sorting
	    List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[2]")); // Adjusted XPath for specific column
	    String[] beforeSort = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        beforeSort[i] = columns.get(i).getText().trim();
	       // System.out.println("Before Sort: " + beforeSort[i]);
	    }

	    // Sort the data in ascending order locally for comparison
	    String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
	    Arrays.sort(expectedAscending);
	   // System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

	    // Click the sorting icon for ascending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);

	    // Fetch column data after sorting in ascending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[2]"));
	    String[] actualAscending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualAscending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Ascending Sort: " + actualAscending[i]);
	    }

	    Assert.assertTrue(
	            "Column data is not sorted in ascending order",
	            Arrays.equals(expectedAscending, actualAscending)
	    );

	    // Click the sorting icon for descending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]/div[2]")).click();
	    Thread.sleep(2000);

	    // Reverse sort the data locally for comparison
	    String[] expectedDescending = Arrays.copyOf(expectedAscending, expectedAscending.length);
	    Collections.reverse(Arrays.asList(expectedDescending));
	    System.out.println("Expected Descending Order: " + Arrays.toString(expectedDescending));

	    // Fetch column data after sorting in descending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[2]"));
	    String[] actualDescending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualDescending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Descending Sort: " + actualDescending[i]);
	    }

	    // Assert the data is sorted in descending order
	    Assert.assertTrue(
	            "Column data is not sorted in descending order",
	            Arrays.equals(expectedDescending, actualDescending)
	    );

	}

	public void verifysortingonEdgeGroupName() throws InterruptedException {
	    // Fetch column data before sorting
	    List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[3]")); // Adjusted XPath for specific column
	    String[] beforeSort = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        beforeSort[i] = columns.get(i).getText().trim();
	       // System.out.println("Before Sort: " + beforeSort[i]);
	    }

	    // Sort the data in ascending order locally for comparison
	    String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
	    Arrays.sort(expectedAscending);
	   // System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

	    // Click the sorting icon for ascending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);

	    // Fetch column data after sorting in ascending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[3]"));
	    String[] actualAscending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualAscending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Ascending Sort: " + actualAscending[i]);
	    }

	    Assert.assertTrue(
	            "Column data is not sorted in ascending order",
	            Arrays.equals(expectedAscending, actualAscending)
	    );

	    // Click the sorting icon for descending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]/div[2]")).click();
	    Thread.sleep(2000);

	    // Reverse sort the data locally for comparison
	    String[] expectedDescending = Arrays.copyOf(expectedAscending, expectedAscending.length);
	    Collections.reverse(Arrays.asList(expectedDescending));
	    System.out.println("Expected Descending Order: " + Arrays.toString(expectedDescending));

	    // Fetch column data after sorting in descending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[3]"));
	    String[] actualDescending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualDescending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Descending Sort: " + actualDescending[i]);
	    }

	    // Assert the data is sorted in descending order
	    Assert.assertTrue(
	            "Column data is not sorted in descending order",
	            Arrays.equals(expectedDescending, actualDescending)
	    );
		
	}

	public void verifysortingonAppGroups() throws InterruptedException {
	    // Fetch column data before sorting
	    List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[4]")); // Adjusted XPath for specific column
	    String[] beforeSort = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        beforeSort[i] = columns.get(i).getText().trim();
	       // System.out.println("Before Sort: " + beforeSort[i]);
	    }

	    // Sort the data in ascending order locally for comparison
	    String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
	    Arrays.sort(expectedAscending);
	   // System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

	    // Click the sorting icon for ascending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);

	    // Fetch column data after sorting in ascending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[4]"));
	    String[] actualAscending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualAscending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Ascending Sort: " + actualAscending[i]);
	    }

	    Assert.assertTrue(
	            "Column data is not sorted in ascending order",
	            Arrays.equals(expectedAscending, actualAscending)
	    );

	    // Click the sorting icon for descending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[2]/div[2]")).click();
	    Thread.sleep(2000);

	    // Reverse sort the data locally for comparison
	    String[] expectedDescending = Arrays.copyOf(expectedAscending, expectedAscending.length);
	    Collections.reverse(Arrays.asList(expectedDescending));
	    System.out.println("Expected Descending Order: " + Arrays.toString(expectedDescending));

	    // Fetch column data after sorting in descending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[4]"));
	    String[] actualDescending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualDescending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Descending Sort: " + actualDescending[i]);
	    }

	    // Assert the data is sorted in descending order
	    Assert.assertTrue(
	            "Column data is not sorted in descending order",
	            Arrays.equals(expectedDescending, actualDescending)
	    );
	}

	public void verifysortingonHardwareName() throws InterruptedException {
	    // Fetch column data before sorting
	    List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[4]")); // Adjusted XPath for specific column
	    String[] beforeSort = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        beforeSort[i] = columns.get(i).getText().trim();
	       // System.out.println("Before Sort: " + beforeSort[i]);
	    }

	    // Sort the data in ascending order locally for comparison
	    String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
	    Arrays.sort(expectedAscending);
	   // System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

	    // Click the sorting icon for ascending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);

	    // Fetch column data after sorting in ascending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[4]"));
	    String[] actualAscending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualAscending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Ascending Sort: " + actualAscending[i]);
	    }

	    Assert.assertTrue(
	            "Column data is not sorted in ascending order",
	            Arrays.equals(expectedAscending, actualAscending)
	    );

	    // Click the sorting icon for descending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[2]/div[2]")).click();
	    Thread.sleep(2000);

	    // Reverse sort the data locally for comparison
	    String[] expectedDescending = Arrays.copyOf(expectedAscending, expectedAscending.length);
	    Collections.reverse(Arrays.asList(expectedDescending));
	    System.out.println("Expected Descending Order: " + Arrays.toString(expectedDescending));

	    // Fetch column data after sorting in descending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[4]"));
	    String[] actualDescending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualDescending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Descending Sort: " + actualDescending[i]);
	    }

	    // Assert the data is sorted in descending order
	    Assert.assertTrue(
	            "Column data is not sorted in descending order",
	            Arrays.equals(expectedDescending, actualDescending)
	    );
		
	}

	public void verifysortingonCommunicationName() throws InterruptedException {
	    // Fetch column data before sorting
	    List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[6]")); // Adjusted XPath for specific column
	    String[] beforeSort = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        beforeSort[i] = columns.get(i).getText().trim();
	       // System.out.println("Before Sort: " + beforeSort[i]);
	    }

	    // Sort the data in ascending order locally for comparison
	    String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
	    Arrays.sort(expectedAscending);
	   // System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

	    // Click the sorting icon for ascending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[6]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);

	    // Fetch column data after sorting in ascending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[6]"));
	    String[] actualAscending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualAscending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Ascending Sort: " + actualAscending[i]);
	    }

	    Assert.assertTrue(
	            "Column data is not sorted in ascending order",
	            Arrays.equals(expectedAscending, actualAscending)
	    );

	    // Click the sorting icon for descending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[6]/div[1]/span[1]/div[1]/div[2]/div[2]")).click();
	    Thread.sleep(2000);

	    // Reverse sort the data locally for comparison
	    String[] expectedDescending = Arrays.copyOf(expectedAscending, expectedAscending.length);
	    Collections.reverse(Arrays.asList(expectedDescending));
	    System.out.println("Expected Descending Order: " + Arrays.toString(expectedDescending));

	    // Fetch column data after sorting in descending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[6]"));
	    String[] actualDescending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualDescending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Descending Sort: " + actualDescending[i]);
	    }

	    // Assert the data is sorted in descending order
	    Assert.assertTrue(
	            "Column data is not sorted in descending order",
	            Arrays.equals(expectedDescending, actualDescending)
	    );
		
	}

	public void verifysortingonStatus() throws InterruptedException {
	    // Fetch column data before sorting
	    List<WebElement> columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[7]")); // Adjusted XPath for specific column
	    String[] beforeSort = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        beforeSort[i] = columns.get(i).getText().trim();
	       // System.out.println("Before Sort: " + beforeSort[i]);
	    }

	    // Sort the data in ascending order locally for comparison
	    String[] expectedAscending = Arrays.copyOf(beforeSort, beforeSort.length);
	    Arrays.sort(expectedAscending);
	   // System.out.println("Expected Ascending Order: " + Arrays.toString(expectedAscending));

	    // Click the sorting icon for ascending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[7]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);

	    // Fetch column data after sorting in ascending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[7]"));
	    String[] actualAscending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualAscending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Ascending Sort: " + actualAscending[i]);
	    }

	    Assert.assertTrue(
	            "Column data is not sorted in ascending order",
	            Arrays.equals(expectedAscending, actualAscending)
	    );

	    // Click the sorting icon for descending order
	    driver.findElement(By.xpath("//thead/tr[1]/th[7]/div[1]/span[1]/div[1]/div[2]/div[2]")).click();
	    Thread.sleep(2000);

	    // Reverse sort the data locally for comparison
	    String[] expectedDescending = Arrays.copyOf(expectedAscending, expectedAscending.length);
	    Collections.reverse(Arrays.asList(expectedDescending));
	    System.out.println("Expected Descending Order: " + Arrays.toString(expectedDescending));

	    // Fetch column data after sorting in descending order
	    columns = driver.findElements(By.xpath("//*[@id='matTable']/table/tbody/tr/td[7]"));
	    String[] actualDescending = new String[columns.size()];
	    for (int i = 0; i < columns.size(); i++) {
	        actualDescending[i] = columns.get(i).getText().trim();
	        //System.out.println("After Descending Sort: " + actualDescending[i]);
	    }

	    // Assert the data is sorted in descending order
	    Assert.assertTrue(
	            "Column data is not sorted in descending order",
	            Arrays.equals(expectedDescending, actualDescending)
	    );
		
		
	}

	public void configAppButton() {
		
		clickElement(configurationIcon, "clicking on config app button");
		
	}

	@FindBy(xpath="//ul[@class='nav']/li[4]/a")
	WebElement edgeDeviceLogs;
	public void edgeDeviceLogsTab() {
		clickElement(edgeDeviceLogs, "clicking on config app button");
		
	}

	
	}

	
