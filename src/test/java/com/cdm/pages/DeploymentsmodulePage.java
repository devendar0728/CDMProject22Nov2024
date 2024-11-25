package com.cdm.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DeploymentsmodulePage extends CommonActions {

	public DeploymentsmodulePage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement infoIconToolTip;

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

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[2]")
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

		return removalofEneredText(inputVolumeErrorNameDeploy);

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

		// Assuming you want to display 4 records per page
		int recordsPerPage = 4;

		// Calculate the number of pages required
		int totalPages = (records.size() + recordsPerPage - 1) / recordsPerPage;

		for (int page = 1; page <= totalPages; page++) {
			// Simulate navigating to the desired page
			// For example:
			// driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();

			// Extract expected records for the current page
			int startIndex = (page - 1) * recordsPerPage;
			int endIndex = Math.min(page * recordsPerPage, records.size());
			List<String> expectedPageRecords = records.subList(startIndex, endIndex);

			// Simulate fetching displayed records on the current page
			// Replace the below line with actual records fetched from the web page
			List<String> displayedRecords = expectedPageRecords; // Simulate correct display

			// Assert that the displayed records match the expected records
			assert expectedPageRecords.equals(displayedRecords)
					: "Displayed records do not match the expected records for page " + page;

			// Print the records on the current page for verification
			System.out.println("Page " + page + ": " + displayedRecords);
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
		if (runningstatus.getAttribute("checked") != null) { // if Checked
			clickElement(runningstatus, "");
			// runningstatus.click();
		}

	}

	public void runningStatuschecked() {
		if (!runningstatus.isSelected()) {
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

	public String get_Text_ToolTipforDeploymentDate() throws InterruptedException {
		Thread.sleep(3000);
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

	@FindBy(xpath = "//h3[@class='titleHeading']")
	WebElement deploymentLabel;

	public boolean isAssertionAddedSuccessfully() {
		return deploymentLabel.isDisplayed();
	}

	@FindBy(xpath = "(//div[@id='toast-container'])")
	WebElement bulkdownloadsuccessmessage;

	public WebElement downloadSuccessMessage() {
		return bulkdownloadsuccessmessage;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;

	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	@FindBy(xpath = "//tbody/tr")
	List<WebElement> gridRows;

	public List<String> getRowData() {

		List<String> rowData = new ArrayList<>();
		for (WebElement row : gridRows) {
			rowData.add(row.getText());
		}
		return rowData;
	}

	WebElement infoiconTooltipText;

	public String get_Text_ToolTipforinfo() {
		mouseHover(infoicon);

		String infoiconTooltipText = infoIconToolTip.getText();

		infoiconTooltipText.trim();

		return infoiconTooltipText;

	}

	@FindBy(xpath = "//table[@id='matTable']/tbody/tr/td")
	List<WebElement> tableDataCells;

	@FindBy(xpath = "//input[@name='devicename']")
	WebElement inputEdgeIDListDeploy;

	public void inputEdgeIDDeploy(String value) {

		SetInputENterKey(inputEdgeIDListDeploy, value);
		SetInput(inputEdgeIDListDeploy, value, value);

	}

	@FindBy(xpath = "//table[@id='matTable']/tbody/tr")
	List<WebElement> tableRows;
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	WebElement ListDeploy;

	public String resultTable() {
		return ListDeploy.getText();

	}

	public int getRowCount() {

		return gridRows.size();
	}

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

	public String removalofEnteredTextForEdgeID() {
		return removalofEneredText(inputEdgeIDListDeploy);

	}

	public String get_Text_ToolTipforRefresh() {
		mouseHover(refresh_Button);

		String refreshToolTipText = refreshToolTip.getText();

		refreshToolTipText.trim();

		return refreshToolTipText;
	}

	public String get_Text_ToolTipforBulkDownload() {
		mouseHover(bulkDownloadButton);

		String bulkDownloadToolTipText = bulkDownloadToolTip.getText();

		bulkDownloadToolTipText.trim();

		return bulkDownloadToolTipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement refreshToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement currentViewButtonToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement bulkDownloadToolTip;

	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement DeployedVolumeDetailStatusThreeDot;

	public void DeployedVolumeDetailStatusThreeDot() {

		clickElement(DeployedVolumeDetailStatusThreeDot, "Clicking on Status on volume Deployed ");

	}

	public String get_Text_ToolTipforHistoryView() {
		mouseHover(currentViewButton);

		String currentViewButtonToolTipText = currentViewButtonToolTip.getText();

		currentViewButtonToolTipText.trim();

		return currentViewButtonToolTipText;
	}

	@FindBy(xpath = "//input[@name='errortrace']")
	WebElement inputVolumeErrorNameDeploy;

	public void inputVolumeErrorNameDeploy(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", inputVolumeErrorNameDeploy);
		SetInputENterKey(inputVolumeErrorNameDeploy, "");
		SetInput(inputVolumeErrorNameDeploy, value, value);

	}

	@FindBy(xpath = "mat-date-range-input-container")
	WebElement selectedDate;

	public boolean isDateSelected() {
		return selectedDate.isDisplayed();
	}

	public void verifysortingonDeploymentEdgeID() throws InterruptedException {
		{

			// Click the sorting icon for ascending order
			driver.findElement(By.xpath("//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
			Thread.sleep(2000);
			try {
				// Wait for table to load
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[1]")));

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
	}

	@FindBy(xpath = "//div[@id='matTable']/table/thead/tr/th[2]/div/span/div/div[contains(text(),'App Name')][1]")
	WebElement sortinonAppName;

	public void verifysortingonAppName() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(sortinonAppName, "Clicking on sort Arrow of AppName");
		Thread.sleep(2000);
		try {
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
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

	public void verifysortingonError() throws InterruptedException {
		// Click the sorting icon for ascending order
		driver.findElement(
				By.xpath("//div[@id='matTable']/table/thead/tr/th[4]/div/span/div/div[contains(text(),'Error')][1]"))
				.click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[4]")));

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

	public void verifysortingonStatus() throws InterruptedException {
		driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[3]")));

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

	public void verifysortingonRunningVersion() throws InterruptedException {
		driver.findElement(By.xpath(
				"//div[@id='matTable']/table/thead/tr/th[5]/div/span/div/div[contains(text(),'Running Version')][1]"))
				.click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[5]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
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

	public void verifysortingonExpectedVersion() throws InterruptedException {
		driver.findElement(By.xpath(
				"//div[@id='matTable']/table/thead/tr/th[6]/div/span/div/div[contains(text(),'Expected Version')][1]"))
				.click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[6]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
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

	public void verifysortingonDeploymentDate() throws InterruptedException {
		driver.findElement(By.xpath(
				"//div[@id='matTable']/table/thead/tr/th[7]/div/span/div/div[contains(text(),'Deployment Date')][1]"))
				.click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[7]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[7]"));
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

	public void verifysortingonLastUpdated() throws InterruptedException {
		driver.findElement(By.xpath(
				"//div[@id='matTable']/table/thead/tr/th[8]/div/span/div/div[contains(text(),'Last Updated')][1]"))
				.click();
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[8]"));
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

	public void verifySortOnPopupVolumename() throws InterruptedException {
		driver.findElement(By.xpath(
				"//div[@id='matTable']/table/thead/tr/th[1]/div/span/div/div[contains(text(),'Volume Name')][1]"))
				.click();
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//div[@id='matTable']/table/thead/tr/th[1]"));
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

	public void verifySortOnPopupStatusVolume() throws InterruptedException {
		driver.findElement(
				By.xpath("//div[@id='matTable']/table/thead/tr/th[2]/div/span/div/div[contains(text(),'Status')][1]"))
				.click();
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//div[@id='matTable']/table/thead/tr/th[2]"));
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

	public void verifySortiOnPopupCreatedDateVolume() {
		driver.findElement(By.xpath(
				"//div[@id='matTable']/table/thead/tr/th[4]/div/span/div/div[contains(text(),'Create Date')][1]"))
				.click();

		try {
			Thread.sleep(2000);

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//div[@id='matTable']/table/thead/tr/td[4]"));
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

	public void verifySortOnErrorVolumename() {
		driver.findElement(
				By.xpath("//div[@id='matTable']/table/thead/tr/th[3]/div/span/div/div[contains(text(),'Error')][1]"))
				.click();

		try {
			Thread.sleep(2000);

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//div[@id='matTable']/table/thead/tr/td[3]"));
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

	public void verifycloseButton() {
		clickElement(closevolume, "Clicking on close button");

	}

	@FindBy(xpath = "//div[@id='matTable']/table/tbody/tr/td[5]/progress-bar/div")
	WebElement progressBar;

	public boolean progressbarText() {

		String progressText = progressBar.getText();
		return progressText != null;

	}

	public boolean isStatusVisible(String statusName) {

		try {
			// Dynamically fetch the list of status elements every time
			List<WebElement> statuses = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));

			// Check if the status name is visible in the statuses
			return statuses.stream().anyMatch(status -> status.getText().equalsIgnoreCase(statusName));
		} catch (StaleElementReferenceException e) {
			// Handle the exception gracefully by re-checking the DOM
			List<WebElement> statuses = driver.findElements(By.xpath("//div[@class='status-column']"));
			return statuses.stream().anyMatch(status -> status.getText().equalsIgnoreCase(statusName));
		}

	}

	@FindBy(xpath = "//input[@value='INITIAL']")
	WebElement initialCheckbox;

	public void uncheckCheckboxInitial() {
		WebElement checkbox = initialCheckbox;
		if (checkbox.isSelected()) {
			checkbox.click();
		} else {
			checkbox.click();
		}

	}

	@FindBy(xpath = "//input[@value='RESOLVING_TAG']")
	WebElement resolvingTagCheckbox;

	@FindBy(xpath = "//input[@value='RESOLVED_TAG']")
	WebElement resolvedTagCheckbox;

	@FindBy(xpath = "//input[@value='DOWNLOADING']")
	WebElement downloadingCheckbox;

	@FindBy(xpath = "//input[@value='DOWNLOADED']")
	WebElement downloadedCheckbox;

	@FindBy(xpath = "//input[@value='VERIFYING']")
	WebElement verifyingCheckbox;

	@FindBy(xpath = "//input[@value='VERIFIED']")
	WebElement verifiedCheckbox;

	@FindBy(xpath = "//input[@value='LOADING']")
	WebElement loadingCheckbox;

	@FindBy(xpath = "//input[@value='FAILED']")
	WebElement failedcheckbox;

	@FindBy(xpath = "//input[@value='ERROR']")
	WebElement errorcheckbox;
	
	@FindBy(xpath = "//input[@value='INSTALLED']")
	WebElement installedcheckbox;
	
	@FindBy(xpath = "//input[@value='CREATED_VOLUME']")
	WebElement createdVolumeCheckbox;
	
	@FindBy(xpath = "//input[@value='AWAITNETWORKINSTANCE']")
	WebElement awaitingWorkInstanceCheckbox;
	
	@FindBy(xpath = "//input[@value='START_DELAYED']")
	WebElement START_DELAYEDCheckbox;
	
	@FindBy(xpath = "//input[@value='BOOTING']")
	WebElement BOOTINGCheckbox;
	
	@FindBy(xpath = "//input[@value='RUNNING']")
	WebElement RUNNINGCheckbox;
	
	@FindBy(xpath = "//input[@value='PAUSING']")
	WebElement PAUSINGCheckbox;
	
	@FindBy(xpath = "//input[@value='PAUSED']")
	WebElement PAUSEDCheckbox;
	
	@FindBy(xpath = "//input[@value='HALTING']")
	WebElement HALTINGCheckbox;
	
	@FindBy(xpath = "//input[@value='HALTED']")
	WebElement HALTEDCheckbox;
	
	@FindBy(xpath = "//input[@value='RESTARTING']")
	WebElement RESTARTINGCheckbox;
	
	@FindBy(xpath = "//input[@value='BROKEN']")
	WebElement BROKENCheckbox;
	
	@FindBy(xpath = "//input[@value='UNKNOWN']")
	WebElement UNKNOWNCheckbox;
	
	@FindBy(xpath = "//input[@value='MAXSTATE']")
	WebElement MAXSTATECheckbox;
	
	@FindBy(xpath = "//input[@value='DEPLOYMENT_STARTED']")
	WebElement DEPLOYMENT_STARTEDCheckbox;
	
	
	@FindBy(xpath = "//input[@value='DEPLOYMENT_CREATED']")
	WebElement DEPLOYMENT_CREATEDCheckbox;
	
	@FindBy(xpath = "//input[@value='CREATING_VOLUME']")
	WebElement CREATING_VOLUMECheckbox;
	
	@FindBy(xpath = "//input[@value='BROKEN']")
	WebElement brokenCheckbox;
	
	@FindBy(xpath = "//input[@value='UNKNOWN']")
	WebElement unKnownCheckbox;
	
	
	@FindBy(xpath = "//input[@value='RESTARTING']")
	WebElement restartingCheckbox;
	
	
	@FindBy(xpath = "//input[@value='INSTALLED']")
	WebElement installCheckbox;
	
	@FindBy(xpath = "//input[@value='AWAITNETWORKINSTANCE']")
	WebElement AWAITNETWORKINSTANCECheckbox;
	
	@FindBy(xpath = "//input[@value='START_DELAYED']")
	WebElement startDelayedCheckbox;
	
	@FindBy(xpath = "//input[@value='PURGING']")
	WebElement purgingCheckbox;

	@FindBy(xpath = "//input[@value='UNKNOWN']")
	WebElement unknownCheckbox;
	
	@FindBy(xpath = "//input[@value='BOOTING']")
	WebElement BootingCheckbox;
	

	
	
	@FindBy(xpath = "//input[@value='LOADED']")
	WebElement loadedCheckbox;
	
	public void uncheckCheckboxResolvingTag() {
		WebElement checkboxResolving = resolvingTagCheckbox;
		if (checkboxResolving.isSelected()) {
			checkboxResolving.click();
		} else {
			checkboxResolving.click();
		}

	}

	public void uncheckCheckboxResolvedTag() {
		WebElement checkboxResolvedTag = resolvedTagCheckbox;
		if (checkboxResolvedTag.isSelected()) {
			checkboxResolvedTag.click();
		} else {
			checkboxResolvedTag.click();
		}

	}

	public void uncheckCheckboxdownloading() {
		WebElement checkboxDownloading = downloadingCheckbox;
		if (checkboxDownloading.isSelected()) {
			checkboxDownloading.click();
		} else {
			checkboxDownloading.click();
		}

	}

	public void uncheckCheckboxdownloaded() {
		WebElement checkboxDownloaded = downloadedCheckbox;
		if (checkboxDownloaded.isSelected()) {
			checkboxDownloaded.click();
		} else {
			checkboxDownloaded.click();
		}
	}

	public void uncheckCheckboxverified() {
		WebElement checkboxverified = verifiedCheckbox;
		if (checkboxverified.isSelected()) {
			checkboxverified.click();
		} else {
			checkboxverified.click();
		}

	}

	public void uncheckCheckboxverifying() {
		WebElement checkboxverifying = verifyingCheckbox;
		if (checkboxverifying.isSelected()) {
			checkboxverifying.click();
		} else {
			checkboxverifying.click();
		}

	}

	public void uncheckCheckboxLoading() {

		WebElement checkboxloading = loadingCheckbox;
		if (checkboxloading.isSelected()) {
			checkboxloading.click();
		} else {
			checkboxloading.click();
		}

	}

	public void uncheckCheckboxFailed() {
		WebElement checkboxFailed = failedcheckbox;
		if (checkboxFailed.isSelected()) {
			checkboxFailed.click();
		} else {
			checkboxFailed.click();
		}

	}

	public void uncheckCheckboxError() {
		WebElement checkboxError = errorcheckbox;
		if (checkboxError.isSelected()) {
			checkboxError.click();
		} else {
			checkboxError.click();
		}

	}

	public void uncheckCheckboxInstalled() {
		WebElement checkboxInstall = installedcheckbox;
		if (checkboxInstall.isSelected()) {
			checkboxInstall.click();
		} else {
			checkboxInstall.click();
		}
		
	}

	public void uncheckCheckboxCreatedVolume() {
		WebElement checkboxCreatedVolume = createdVolumeCheckbox;
		if (checkboxCreatedVolume.isSelected()) {
			checkboxCreatedVolume.click();
		} else {
			checkboxCreatedVolume.click();
		}
	}

	public void uncheckCheckboxHalting() {
		WebElement HALTEDCheckboxCheck = HALTINGCheckbox;
		if (HALTEDCheckboxCheck.isSelected()) {
			HALTEDCheckbox.click();
		} else {
			HALTEDCheckbox.click();
		}
		
	}

	public void uncheckCheckboxPaused() {
		WebElement PAUSEDCheckboxcheck = PAUSEDCheckbox;
		if (PAUSEDCheckboxcheck.isSelected()) {
			PAUSEDCheckboxcheck.click();
		} else {
			PAUSEDCheckboxcheck.click();
		}
	}

	public void uncheckCheckboxPausing() {
		WebElement pausingCheckboxcheck = PAUSINGCheckbox;
		if (pausingCheckboxcheck.isSelected()) {
			pausingCheckboxcheck.click();
		} else {
			pausingCheckboxcheck.click();
		}
		
	}

	public void uncheckCheckboxRunning() {
		WebElement runningCheckboxcheck = RUNNINGCheckbox;
		if (runningCheckboxcheck.isSelected()) {
			runningCheckboxcheck.click();
		} else {
			runningCheckboxcheck.click();
		}
		
	}

	public void uncheckCheckboxCreatingVolume() {
		WebElement CREATING_VOLUMECheckboxcheck = CREATING_VOLUMECheckbox;
		if (CREATING_VOLUMECheckboxcheck.isSelected()) {
			CREATING_VOLUMECheckboxcheck.click();
		} else {
			CREATING_VOLUMECheckboxcheck.click();
		}
		
	}

	public void uncheckCheckboxLoaded() {
		WebElement loadedCheckboxcheck = loadedCheckbox;
		if (loadedCheckboxcheck.isSelected()) {
			loadedCheckboxcheck.click();
		} else {
			loadedCheckboxcheck.click();
		}
		
	}

	public void uncheckCheckboxBooting() {
		WebElement bootingCheckboxcheck = BOOTINGCheckbox;
		if (bootingCheckboxcheck.isSelected()) {
			bootingCheckboxcheck.click();
		} else {
			bootingCheckboxcheck.click();
		}
		
	}

	public void uncheckCheckboxAwaitNetworkInstance() {
		WebElement awaitingWorkInstancecheck = awaitingWorkInstanceCheckbox;
		if (awaitingWorkInstancecheck.isSelected()) {
			awaitingWorkInstancecheck.click();
		} else {
			awaitingWorkInstancecheck.click();
		}
		
	}

	public void uncheckStarDelayedCheckbox() {
		WebElement starDelayedcheck = START_DELAYEDCheckbox;
		if (starDelayedcheck.isSelected()) {
			starDelayedcheck.click();
		} else {
			starDelayedcheck.click();
		}
		
	}


	public void uncheckCheckboxRestarting() {
		WebElement restartingcheck = restartingCheckbox;
		if (restartingcheck.isSelected()) {
			restartingcheck.click();
		} else {
			restartingcheck.click();
		}
		
	}

	public void uncheckCheckboxPurging() {
		WebElement purgingcheck = purgingCheckbox;
		if (purgingcheck.isSelected()) {
			purgingcheck.click();
		} else {
			purgingcheck.click();
		}
	}

	public void uncheckCheckboxbroken() {
		WebElement brokencheck = brokenCheckbox;
		if (brokencheck.isSelected()) {
			brokencheck.click();
		} else {
			brokencheck.click();
		}
		
	}

	public void uncheckCheckboxunKnown() {
		WebElement unknownCheckbox = unKnownCheckbox;
		if (unknownCheckbox.isSelected()) {
			unknownCheckbox.click();
		} else {
			unknownCheckbox.click();
		}
		
	}
	@FindBy(xpath = "//input[@value='HALTED']")
	WebElement haltedcheckbox;
	

	@FindBy(xpath = "//input[@value='DELETED']")
	WebElement DELETEDcheckbox;
	
	public void uncheckCheckboxHalted() {
		WebElement haltedCheckbox = haltedcheckbox;
		if (haltedCheckbox.isSelected()) {
			haltedCheckbox.click();
		} else {
			haltedCheckbox.click();
		}
		
	}
	
	public boolean checkboxDeleted() {
		WebElement deletedCheckbox = DELETEDcheckbox;
		return deletedCheckbox.isSelected();
		
	}

	public void uncheckCheckboxDeploymentStarted() {
		WebElement deploymentStartedCheckbox = DEPLOYMENT_STARTEDCheckbox;
		if (deploymentStartedCheckbox.isSelected()) {
			deploymentStartedCheckbox.click();
		} else {
			deploymentStartedCheckbox.click();
		}
		
	}

	public void uncheckCheckboxdeplymentCreated() {
		WebElement deploymentCreatedCheckbox = DEPLOYMENT_CREATEDCheckbox;
		if (deploymentCreatedCheckbox.isSelected()) {
			deploymentCreatedCheckbox.click();
		} else {
			deploymentCreatedCheckbox.click();
		}
		
	}

	public void uncheckCheckboxmaxstate() {
		WebElement maxStateCheckbox = MAXSTATECheckbox;
		if (maxStateCheckbox.isSelected()) {
			maxStateCheckbox.click();
		} else {
			maxStateCheckbox.click();
		}
		
	}

	public void deletedCheckboxClick() {
		WebElement deletedCheckbox = DELETEDcheckbox; // Replace with actual checkbox ID
        if (!deletedCheckbox.isSelected()) {
            deletedCheckbox.click();
        }
	}

	public String statusColumn_GetText() {
		WebElement statusColumn = driver.findElement(By.xpath("//table/tbody/tr/td[3]")); 
	        String columnText =  statusColumn.getText();
	        return columnText;
		
	}
}
