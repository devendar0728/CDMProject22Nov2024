package com.cdm.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DeploymentsmodulePage extends CommonActions {

	public DeploymentsmodulePage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeIDToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement errorToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement runningVersionToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deploymentDateToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement expectedVersionToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement lastUpdatedToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement infoToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteTip;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/mat-tooltip-component/div")
	WebElement closeTip;

	@FindBy(xpath = "//tbody/tr[1]/td[9]/span[1]/img[1]")
	public WebElement deletebutton;

	@FindBy(xpath = "//div[contains(text(),'EDGE ID')]")
	public WebElement edgeIdLabel;

	@FindBy(xpath = "//div[contains(text(),'App Name')]")
	public WebElement appNameLabel;

	@FindBy(xpath = "//div[contains(text(),'Status')]")
	public WebElement statusLabel;

	@FindBy(xpath = "//div[contains(text(),'Error')]")
	public WebElement errorLabel;

	@FindBy(xpath = "//div[contains(text(),'Running Version')]")
	public WebElement runningVersionLabel;

	@FindBy(xpath = "//div[contains(text(),'Expected Version')]")
	public WebElement expectedVersionLabel;

	@FindBy(xpath = "//div[contains(text(),'Deployment Date')]")
	public WebElement deploymentDateLabel;

	@FindBy(xpath = "//div[contains(text(),'Last Updated')]")
	public WebElement LastUpdatedLabel;

	@FindBy(xpath = "//app-filter[@name='devicename']/div/a/mat-icon[contains(text(),'more_vert')]")
	public WebElement edgeIdThreeDot;

	@FindBy(xpath = "//app-filter[@name='appname']/div/a/mat-icon[contains(text(),'more_vert')]")
	public WebElement appNameThreeDot;

	@FindBy(xpath = "//app-filter[@name='status']/div/a/mat-icon[contains(text(),'more_vert')]")
	public WebElement statusThreeDots;

	@FindBy(xpath = "//app-filter[@name='errortrace']/div/a/mat-icon[contains(text(),'more_vert')]")
	public WebElement errorThreeDots;

	@FindBy(xpath = "//span[contains(text(),' Apply ')]")
	public WebElement applybuttoncalender;

	@FindBy(xpath = "//button[@aria-label ='Choose month and year']")
	public WebElement arrowforyearandmonth;

	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement volumeDetailsStatusThreeDot;

	@FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-2']")
	WebElement dialogue2;

	@FindBy(xpath = "//tbody/tr[1]/td[9]/img[1]")
	WebElement infoicon;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//table[@role='grid']")
	WebElement tableData;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/span[1]/span[1]/span[1]/small[1]")
	WebElement showMoreLink;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeNameThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appNameDeployThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement errorThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement RunningVersionThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement expectedVersionThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[7]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deploymentDateThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[8]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement lastUpdatedThreeDotDeploy;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement refresh_Button;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement bulkDownloadButton;

	@FindBy(xpath = "//span[contains(text(),'Deployments')]")
	WebElement deployment_tab;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement currentViewButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement historyviewButton;

	@FindBy(xpath = "//input[@name='devicename']")
	WebElement inputEdgeNameDeploy;

	@FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-0']/app-deploy-volume/div/div[1]/div/i")
	WebElement closevolume;

	@FindBy(xpath = "//input[@name='volumename']")
	WebElement inputVolumeNameDeploy;

	@FindBy(xpath = "//input[@name='volumename']")
	WebElement inputVolumeNameDetailsPageDeploy;

	@FindBy(xpath = "//app-filter[@name='volumename']/div/a/mat-icon")
	WebElement volumeNameThreeDot;


	@FindBy(xpath = "//span[contains(text(),'Reset')]")
	WebElement resetButton;


	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/a[1]/mat-icon[1]")
	WebElement errorThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/a[1]/mat-icon[1]")
	WebElement DeployedVolumeDetailserrorThreeDot;

	@FindBy(xpath = "//h3[contains(text(),'Deployed Volume Details')]")
	WebElement titleheadingvolumeDetailsPage;

	@FindBy(xpath = "//h3[@class='titleHeading']")
	WebElement titleheadingDeployment;

	@FindBy(xpath = "//input[@name='status']")
	WebElement statusDeploy;

	@FindBy(xpath = "(//div[@id='matTable']/table/thead/tr/th/div/app-filter/div/a/mat-icon)[9]")
	WebElement volumeNamePopUpThreeDot;

	@FindBy(xpath = "//input[@name='//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]']")
	WebElement CreatedDate;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement inputAppNameDeploy;

	@FindBy(xpath = "//input[@placeholder='Status']")
	WebElement inputStatusDeploy;

	@FindBy(xpath = "//input[@name='errortrace']")
	WebElement inputErrorDeploy;

	@FindBy(xpath = "//input[@name='current_version']")
	WebElement inputRunningVersion;

	@FindBy(xpath = "//input[@placeholder='Expected Version']")
	WebElement inputExpectedVersion;

	@FindBy(xpath = "//input[@placeholder='status']")
	WebElement inputVolumeNameStatusDeploy;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/progress-bar[1]/div[1]/div[1]")
	WebElement downloadstatus;

	@FindBy(xpath = "//input[@name='status']")
	WebElement inputStatusVolumeDetailsDeploy;

	@FindBy(xpath = "//input[@placeholder='Expected Version']")
	WebElement inputExpectedVersionDeploy;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calenderIcon;

	@FindBy(xpath = "//input[@placeholder=' Error trace']")
	WebElement volumeDetailsError;

	@FindBy(xpath = "//input[@name='errortrace']")
	WebElement inputErrorDetailsPageDeploy;

	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement createdDateVolumeDeployDetails;

	@FindBy(xpath = "//input[@value='RUNNING']")
	WebElement runningstatus;

	public void calenderIcon() {
		clickElement(calenderIcon, "");
		// calenderIcon.click();
	}

	public void arrowforyearandmonth() {
		clickElement(arrowforyearandmonth, "");
		// arrowforyearandmonth.click();

	}

	public void refresh_Button() {
		clickElement(refresh_Button, "");
		// refresh_Button.click();
	}

	public void bulkDownloadButton() {
		clickElement(bulkDownloadButton, "");

		// bulkDownloadButton.click();
	}

	public void currentView() {
		clickElement(currentViewButton, "");
//
//		currentViewButton.click();
	}

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void deploymenttabclick() {
		clickElement(deployment_tab, "");

	}

	public void edgeNameThreeDotDeploy() {
		clickElement(edgeNameThreeDotDeploy, "");
		// edgeNameThreeDotDeploy.click();
	}

	public void appNameDeployThreeDot() {
		clickElement(appNameDeployThreeDot, "");
		// appNameDeployThreeDot.click();
	}

	public void statusThreeDotDeploy() {
		clickElement(statusThreeDotDeploy, "");
		// statusThreeDotDeploy.click();
	}

	public void errorThreeDotDeploy() {
		clickElement(errorThreeDotDeploy, "");
		// errorThreeDotDeploy.click();
	}

	public String downloadStatus() {
		if (downloadstatus == null) {
			return "";
		}

		return getText(downloadstatus);

	}

	public void RunningVersionThreeDotDeploy() {
		clickElement(RunningVersionThreeDotDeploy, "");
		// RunningVersionThreeDotDeploy.click();
	}

	public void expectedVersionThreeDotDeploy() {
		clickElement(expectedVersionThreeDotDeploy, "");
		// expectedVersionThreeDotDeploy.click();
	}

	public void deploymentDateThreeDotDeploy() {
		clickElement(deploymentDateThreeDotDeploy, "");
		// deploymentDateThreeDotDeploy.click();
	}

	public void lastUpdatedThreeDotDeploy() {
		wait(lastUpdatedThreeDotDeploy, logger);
		clickElement(lastUpdatedThreeDotDeploy, "");
		// lastUpdatedThreeDotDeploy.click();
	}

	public void inputEdgeNameDeploy(String value) {
		inputEdgeNameDeploy.sendKeys(Keys.ENTER);
		inputEdgeNameDeploy.sendKeys(value);
	}

	public void inputAppNameDeploy(String value) {

		SetInputENterKey(inputAppNameDeploy, "");
		SetInput(inputAppNameDeploy, value, value);

//		inputAppNameDeploy.sendKeys(Keys.ENTER);
//		inputAppNameDeploy.sendKeys(value);
	}

	public void inputStatusDeploy(String value) {

		SetInputENterKey(inputStatusDeploy, "");
		SetInput(inputStatusDeploy, value, value);

//		inputStatusDeploy.sendKeys(Keys.ENTER);
//		inputStatusDeploy.sendKeys(value);
	}

	public void inputErrorDeploy(String value) {

		SetInputENterKey(inputErrorDeploy, "");
		SetInput(inputErrorDeploy, value, value);

//		inputErrorDeploy.sendKeys(Keys.ENTER);
//		inputErrorDeploy.sendKeys(value);
	}

	public void inputRunningVersion(String value) {
		SetInputENterKey(inputRunningVersion, "");
		SetInput(inputRunningVersion, value, value);

//		inputRunningVersion.sendKeys(Keys.ENTER);
//		inputRunningVersion.sendKeys(value);
	}

	public void inputExpectedVersion(String value) {
		SetInputENterKey(inputExpectedVersion, "");
		SetInput(inputExpectedVersion, value, value);

//		inputExpectedVersion.sendKeys(Keys.ENTER);
//		inputExpectedVersion.sendKeys(value);
	}

	public void inputVolumeNameDeploy(String value) {
		SetInputENterKey(inputVolumeNameDeploy, "");
		SetInput(inputVolumeNameDeploy, value, value);

		// inputVolumeNameDeploy.sendKeys(value);
	}

	public void inputVolumeStatusDetailsDeploy(String value) {

		SetInputENterKey(inputStatusVolumeDetailsDeploy, "");
		SetInput(inputStatusVolumeDetailsDeploy, value, value);

//		inputStatusVolumeDetailsDeploy.sendKeys(Keys.ENTER);
//		inputStatusVolumeDetailsDeploy.sendKeys(value);
	}

	public String removalofEnteredTextForEdgeName() {

		return removalofEneredText(inputEdgeNameDeploy);

	}

	public String removalofEnteredTextForRunningVersion() {

		return removalofEneredText(inputRunningVersion);

	}

	public String removalofEnteredTextForExpectedVersion() {

		return removalofEneredText(inputExpectedVersion);

	}

	public String removalofEnteredTextForappName() {

		return removalofEneredText(inputAppNameDeploy);

	}

	public String removalofEnteredTextForStatus() {

		return removalofEneredText(inputStatusDeploy);

	}

	public String removalofEnteredTextForError() {

		return removalofEneredText(inputErrorDeploy);

	}

	public String removalofEnteredTextForVolumeNameDeploy() {

		return removalofEneredText(inputVolumeNameDeploy);

	}

	public String removalofEnteredTextForErrorDetails() {

		return removalofEneredText(inputErrorDetailsPageDeploy);

	}

	public String removalofEnteredTextForStatusDetails() {

		return removalofEneredText(inputStatusVolumeDetailsDeploy);

	}

	public String removalofEnteredTextForVolumeName() {

		return removalofEneredText(inputVolumeNameDetailsPageDeploy);

	}

	public String removalofEnteredTextForStatusVolume() {

		return removalofEneredText(inputStatusDeploy);

	}

	public String removalofEnteredTextForvolumeDetailsError() {

		return removalofEneredText(inputExpectedVersionDeploy);

	}

	public String removalofEnteredTextForcreatedDate() {

		return removalofEneredText(inputExpectedVersionDeploy);

	}

	public void showMoreLink() {
		clickElement(showMoreLink, "");
		// showMoreLink.click();
	}

	public void infoicon() {
		try {
			wait(infoicon, logger);
			clickElement(infoicon, "");
			// infoicon.click();
		} catch (Exception e) {

		}

	}

	public void volumeNamePopUpThreeDot() {

		wait(volumeNamePopUpThreeDot, logger);
		clickElement(volumeNamePopUpThreeDot, "");

	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			// clickElement(backDropShowing, "");
			backDropShowing.click();
		}
	}

	public void volumeDetailsStatusThreeDot() {

		clickElement(volumeDetailsStatusThreeDot, "");

	}

	public void titleheadingvolumeDetailsPage() {
		clickElement(titleheadingvolumeDetailsPage, "");
		// titleheadingvolumeDetailsPage.click();
	}

	public void inputVolumeNameDetailsPageDeploy(String value) {
		inputVolumeNameDetailsPageDeploy.sendKeys(Keys.ENTER);
		inputVolumeNameDetailsPageDeploy.sendKeys(value);
	}

	public void inputErrorDetailsPageDeploy(String value) {

		SetInputENterKey(inputErrorDetailsPageDeploy, "");
		SetInput(inputErrorDetailsPageDeploy, value, value);

//		inputErrorDetailsPageDeploy.sendKeys(Keys.ENTER);
//		inputErrorDetailsPageDeploy.sendKeys(value);
	}

	public void inputCreatedDate(String value) {
		SetInputENterKey(inputErrorDetailsPageDeploy, "");
		SetInput(inputErrorDetailsPageDeploy, value, value);

//		inputErrorDetailsPageDeploy.sendKeys(Keys.ENTER);
//		inputErrorDetailsPageDeploy.sendKeys(value);
	}

	public void DeployedVolumeDetailserrorThreeDot() {
		clickElement(DeployedVolumeDetailserrorThreeDot, "");
		// DeployedVolumeDetailserrorThreeDot.click();
	}

	public void createdDateVolumeDeployDetailsThreeDot() {
		clickElement(createdDateVolumeDeployDetails, "");
//		createdDateVolumeDeployDetails.click();
	}

	public void volumepageRecord() {
		List<String> records = Arrays.asList("Record 1", "Record 2", "Record 3", "Record 4");

// Assuming you want to display 5 records per page
		int recordsPerPage = 4;

// Calculate the number of pages required
		int totalPages = (records.size() + recordsPerPage - 1) / recordsPerPage;

		for (int page = 1; page <= totalPages; page++) {
// Navigate to the desired page
// You need to implement this part according to your specific webpage
// For example:
// driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();

// Extract records for the current page
			int startIndex = (page - 1) * recordsPerPage;
			int endIndex = Math.min(page * recordsPerPage, records.size());
			List<String> currentPageRecords = records.subList(startIndex, endIndex);

// Process the records on the current page
			for (String record : currentPageRecords) {
				System.out.println(record);
			}
		}

	}

	public void applybuttoncalender() {
		clickElement(applybuttoncalender, "");
		// applybuttoncalender.click();
	}

	public List<WebElement> tableData() {
		tableData.findElements(By.tagName("td"));
		return null;
	}

	public void closevolume() {
		clickElement(closevolume, "");
		// closevolume.click();

	}

	public void runningStatusunchecked() {
		if (runningstatus.getAttribute("checked") != null)
		 { // if Checked
			clickElement(runningstatus, "");
					// runningstatus.click();
		}

	}

	public void runningStatuschecked() {
		if (!runningstatus.isSelected())
		 {
			clickElement(runningstatus, "");
		// runningstatus.click();
		}

	}

	public void historyviewButton() {
		clickElement(historyviewButton, "");
		// historyviewButton.click();

	}

	public void edgeIdThreeDot() {
		clickElement(edgeIdThreeDot, "");
		// edgeIdThreeDot.click();
	}

	public void appNameThreeDot() {
		clickElement(appNameThreeDot, "");
		// appNameThreeDot.click();
	}

	public void statusThreeDots() {
		clickElement(statusThreeDots, "");
		// statusThreeDots.click();
	}

	public void errorThreeDots() {
		clickElement(errorThreeDots, "");
		// errorThreeDots.click();
	}

	public String get_Text_ToolTipforEdgeID() {
		mouseHover(edgeIdLabel);

		String edgeIDToolTipText = edgeIDToolTip.getText();

		edgeIDToolTipText.trim();

		return edgeIDToolTipText;

	}

	public String get_Text_ToolTipforAppName() {
		mouseHover(appNameLabel);

		String appNameToolTipText = appNameToolTip.getText();

		appNameToolTipText.trim();

		return appNameToolTipText;

	}

	public String get_Text_ToolTipforStatus() {
		mouseHover(statusLabel);

		String statusToolTipText = statusToolTip.getText();

		statusToolTipText.trim();

		return statusToolTipText;

	}

	public String get_Text_ToolTipforError() {
		mouseHover(errorLabel);

		String errorToolTipText = errorToolTip.getText();

		errorToolTipText.trim();

		return errorToolTipText;

	}

	public String get_Text_ToolTipforRunningVersion() {
		mouseHover(runningVersionLabel);

		String runningVersionToolTipText = runningVersionToolTip.getText();

		runningVersionToolTipText.trim();

		return runningVersionToolTipText;

	}

	public String get_Text_ToolTipforDeploymentDate() {
		mouseHover(deploymentDateLabel);

		String deploymentDateToolTipText = deploymentDateToolTip.getText();

		deploymentDateToolTipText.trim();

		return deploymentDateToolTipText;

	}

	public String get_Text_ToolTipforExpectedVersion() {
		mouseHover(expectedVersionLabel);

		String expectedVersionToolTipText = expectedVersionToolTip.getText();

		expectedVersionToolTipText.trim();

		return expectedVersionToolTipText;

	}

	public String get_Text_ToolTipforLastUpdatedVersion() {
		mouseHover(LastUpdatedLabel);

		String lastUpdatedToolTipText = lastUpdatedToolTip.getText();

		lastUpdatedToolTipText.trim();

		return lastUpdatedToolTipText;

	}

	public String get_Text_ToolTipforViewDeployedVolume() {
		mouseHover(infoicon);

		String infoToolTipText = infoToolTip.getText();

		infoToolTipText.trim();

		return infoToolTipText;

	}

	public String get_Text_ToolTipforDelete() {
		mouseHover(deletebutton);

		String deleteToolTipText = deleteTip.getText();

		deleteToolTipText.trim();

		return deleteToolTipText;

	}

	public String get_Text_ToolTipClose() {

		mouseHover(closevolume);
		wait(closeTip, logger);

		String closeToolTipIconText = closeTip.getText();

		closeToolTipIconText.trim();

		return closeToolTipIconText;
	}

	public void clickingonheading() {
		clickElement(titleheadingDeployment, "");
	}

	public void minimizeBrowser() {
		driver.manage().window().minimize();
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();

	}

	public void resetButton() {

		clickElement(resetButton, "");

	}
}
