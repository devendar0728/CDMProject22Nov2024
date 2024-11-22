package com.cdm.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

	@FindBy(xpath = "//input[@name='myfile']")
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

	@FindBy(xpath = "//input[@name='devicename']")
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

	@FindBy(xpath = "//h2[@class ='titleHeading']")
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

	@FindBy(xpath = "//tbody/tr[3]/td[8]/img[3]")
	WebElement viewAlertButton;

	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement AlertButtonToolTip;

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

	public void clickondeployimage() {

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

	public void edgeIdSearch_Button() {

		// clickElement(edgeIdsearchClickDot, "Clicking on 3 dots for Edge Id ");

		edgeIdsearchClickDot.click();
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

	public void sendValueSearchIcon(String value) {

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
		clickElement(Add_btn, "");
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

	public void verifyText(String strTitle){
		//verifyText(EdgeDeviceheadingTitle,strTitle,"Edge Device Title not found");
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

		String bulkdownloadText = verifyalertfordownload.getText();

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
		clickElement(uploadFileForEdgeDevice, "");
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

	public void fileupload() {
		Actions action = new Actions(driver);

		action.moveToElement(BulkUpload_btn).click().build().perform();
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

	public void status() {
		wait(status, logger);
		clickElement(status, "");
//		status.click();
	}

	public void saveEdgeDeviceButton() {
		clickElement(saveEdgeDeviceButton, "");
		// saveEdgeDeviceButton.click();

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
		//clickElement(communicationStatusThreeDot, "");
		communicationStatusThreeDot.click();
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



}
