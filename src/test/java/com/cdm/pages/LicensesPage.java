package com.cdm.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class LicensesPage extends CommonActions {

	public LicensesPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='licensetype']")
	WebElement licenseTypeName;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[5]")
	WebElement licenseTrackerIcon;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]")
	WebElement sortissuedate;

	@FindBy(xpath = "//h2")
	WebElement headingTitle;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calenderIcon;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//span[contains(text(),'Apply')]")
	WebElement applyButtoncalender;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement opencalenderdot;

	@FindBy(xpath = "//input[@formcontrolname='start']")
	WebElement startDateforissuedDate;

	@FindBy(xpath = "//input[@formcontrolname='end']")
	WebElement endDateforIssuedDate;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hostIdThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement issueDateThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement expiryDateThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement licenseTypeThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement versionThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement inActiveCheckBox;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[3]")
	WebElement bulkDownloadButton;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement licenseType;

	@FindBy(xpath = "//input[@name='hostid']")
	WebElement hostidInput;

	@FindBy(xpath = "//input[@name='licensetype']")
	WebElement licenseTypeInput;

	@FindBy(xpath = "//ul/li/a/span[contains(text(),'Licenses')]")
	WebElement licensetabmodule;

	@FindBy(xpath = "//input[@name='version']")
	WebElement versionInput;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[2]")
	WebElement bulkDownloadIcon;

	@FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-0']/app-licenseuploadimport/div[2]/button[2]")

	WebElement uploadButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[2]")
	WebElement uploadLicenseButton;

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement invalidLicenseValidationmessage;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[1]")
	WebElement refreshButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[2]")
	WebElement requestLicenseButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement License_Tracker_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[4]")
	WebElement Bulk_dwnd_btn;

	@FindBy(xpath = "//input[@formcontrolname='uploadfile']/../div")
	WebElement validationmessageforupload;

	// can use FindAll

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement licenseinfo;

	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement uploadButtonSave;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[2]")
	WebElement licenseDeployment;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[3]")
	WebElement licenseRevoke;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[4]")
	WebElement licenseAcceptance;

	public void licenseinfo() {
		licenseinfo.click();
	}

	public void licenseDeployment() throws InterruptedException {
		Thread.sleep(2000);
		licenseDeployment.click();
	}

	public void licenseRevoke() {
		licenseRevoke.click();
	}

	public void licenseAcceptance() {
		licenseAcceptance.click();
	}

	public void movetoLicensetab() {
		clickElement(licensetabmodule, "Clicked on licence tab");
	}

	public void check_downloadBtn() {
		Bulk_dwnd_btn.click();
	}

	public void refreshButton() {
		refreshButton.click();
	}

	public void addButton() {
		uploadLicenseButton.click();
	}

	public void License_Tracker_btn() {
		clickElement(licenseTrackerIcon, "");
	}

	public void requestLicenseButton() {
		requestLicenseButton.click();
	}

	public void hostidInput(String value) {
		hostidInput.sendKeys(Keys.ENTER);
		hostidInput.sendKeys(value);
	}

	public void licenseTypeInput(String value) throws InterruptedException {
		licenseTypeInput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		licenseTypeInput.sendKeys(value);
	}

	public void versionInput(String value) {
		versionInput.sendKeys(Keys.ENTER);
		versionInput.sendKeys(value);
	}

	public void licensetabmodule() {
		licensetabmodule.click();
	}

	public void uploadButton() {
		uploadButton.click();
	}

	public void invalidLicenseValidationmessagetext() {
		invalidLicenseValidationmessage.getText();
	}

	public void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public void calenderIcon() {

		clickElement(calenderIcon, "");
		//calenderIcon.click();
	}

	public void validationmessageforupload() {
		validationmessageforupload.getText();
	}

	public void hostIdThreeDot() {
		hostIdThreeDot.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void issueDateThreeDot() {
		issueDateThreeDot.click();
	}

	public void opencalenderdot() {
		opencalenderdot.click();
	}

	public void sortissuedate() {
		sortissuedate.click();
	}

	public void startDateforissuedDate() {
		startDateforissuedDate.click();
	}

	public void endDateforIssuedDate() {
		endDateforIssuedDate.click();
	}

	public void sendStartDate(String value) {
		startDateforissuedDate.sendKeys(value);
	}

	public void sendEndDate(String value) {
		endDateforIssuedDate.sendKeys(value);
	}

	public void applyButtoncalender() {
		applyButtoncalender.click();
	}

	public void selectDateRange(String startDate, String endDate) {
		// Convert string dates to WebElements for better manipulation
		WebElement startElement = driver.findElement(
				By.xpath("//*[@id='mat-datepicker-1']/div/mat-month-view/table//button[starts-with(@aria-label,'"
						+ startDate + "')]"));
		WebElement endElement = driver.findElement(
				By.xpath("//*[@id='mat-datepicker-1']/div/mat-month-view/table//button[starts-with(@aria-label,'"
						+ endDate + "')]"));

		startElement.click();
		endElement.click();
	}

	public void sorting() throws InterruptedException {

		List<WebElement> columns = driver.findElements(By.xpath("//*[@id= 'matTable']/table/tbody/tr[2]/td"));
		String[] beforeSort = new String[columns.size()];
		for (int i = 0; i < beforeSort.length; i++) {
			beforeSort[i] = columns.get(i).getText();
			System.out.println(beforeSort[i]);

		}
		for (int i = 0; i < columns.size(); i++) {
			Arrays.sort(beforeSort);
			String sort = beforeSort[i];
			System.out.println(sort);
		}

		Thread.sleep(4000);
		driver.findElement(By.xpath("//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]")).click();
		Thread.sleep(4000);

		columns = driver.findElements(By.xpath("//*[@id= 'matTable']/table/tbody/tr[2]/td"));

		sortissuedate.click();

		String[] afterSort = new String[columns.size()];
		try {
			for (int i = 0; i < columns.size(); i++) {
				afterSort[i] = columns.get(i).getText().trim();
				System.out.println(afterSort[i]);
			}
			for (int i = 0; i < columns.size(); i++) {
				Collections.reverse(columns);
				String sort = afterSort[i];
				System.out.println(sort);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void licenseTypeThreeDot() {
		licenseTypeThreeDot.click();
	}

	public void headingTitle() {
		headingTitle.click();

	}

	public void expiryDateThreeDot() {
		expiryDateThreeDot.click();
	}

	public void versionThreeDot() {
		versionThreeDot.click();
	}

	public void uploadLicenseButton() {
		uploadLicenseButton.click();
	}

	public void licenseTrackerIcon() {
		clickElement(licenseTrackerIcon, "");

	}

	public void bulkDownloadIcon() {
		bulkDownloadIcon.click();
	}

	public void statusThreeDot() {

		statusThreeDot.click();

	}

	public void inActiveCheckBox() {
		clickElement(inActiveCheckBox, "");

	}

	public void bulkDownloadButton() {
		bulkDownloadButton.click();
	}

	public void licenseTypeThreeDots() {
		licenseType.click();
	}

	public void licenseType(String value) {
		licenseTypeName.sendKeys(value);
	}

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[1]")
	WebElement hostID;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[1]")
	WebElement issuedDate;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/span[1]/div[1]/div[1]")
	WebElement licenseStatus;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[1]")
	WebElement expiryDate;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[1]")
	WebElement licenseTypeElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement hostIDToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseStatusToolTip;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/span[1]/div[1]/div[1]")
	WebElement licenseVersion;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseVersionToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement issueDateToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseTickedToolTip;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement licenseInfoElement;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[2]")
	WebElement licenseDeploymentElement;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[3]")
	WebElement licenseRevokeElement;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[4]")
	WebElement licenseTickElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement expiryDateToolTip;

	@FindBy(xpath = "//div[contains(text(),'EDGE Name')]")
	WebElement licenseEdgeName;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseEdgeNameToolTip;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[5]")
	WebElement licenseTrackerElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseTrackerToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseTypeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseInfoToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseDeploymentToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseRevokeToolTip;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[1]")
	WebElement licenseRefreshElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseRefreshToolTip;

	@FindBy(xpath = "//div[@class='ng-star-inserted']/span/img[2]")
	WebElement licenseBulkUploadElement;

	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement licensebulkUploadToolTip;

	@FindBy(xpath = "//div[@class='ng-star-inserted']/span/img[4]")
	WebElement RequestLicenseElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement RequestLicenseToolTip;

	@FindBy(xpath = "//div[@class='ng-star-inserted']/span/img[3]")
	WebElement licenseBulkDownloadElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licensebulkDownloadToolTip;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]")
	WebElement hostIdAsc;

	@FindBy(xpath = "//div[contains(text(),'EDGE Group Name')]")
	WebElement licenseEdgeGroupName;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseEdgeGroupNameToolTip;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[1]")
	WebElement entityName;

	@FindBy(xpath = "//thead/tr[1]/th[7]")
	WebElement licenseStatusTracker;

	@FindBy(css = ".cdk-overlay-container")
	WebElement entityTooltip;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/span[1]/div[1]/div[1]")
	WebElement expiryDateElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement expiryDateTooltip;

	@FindBy(xpath = "//thead/tr[1]/th[6]")
	WebElement licenseDeploymentElementTracker;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/span[1]/div[1]/div[1]")
	WebElement licenseDeploymentDateTracker;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseDeploymentTooltip;

	public String get_Text_ToolTipHostID() throws InterruptedException {
		mouseHover(hostID);

		String hostIDToolTipText = hostIDToolTip.getText();

		Thread.sleep(2000);
		hostIDToolTipText.trim();

		return hostIDToolTipText;
	}

	public String get_Text_ToolTipIssuedDate() {
		mouseHover(issuedDate);

		String issueDatelabelText = issueDateToolTip.getText();

		issueDatelabelText.trim();

		return issueDatelabelText;
	}

	public String get_Text_ToolTipLicenseType() {
		mouseHover(licenseTypeElement);

		String licenseTypeToolTipText = licenseTypeToolTip.getText();

		licenseTypeToolTipText.trim();

		return licenseTypeToolTipText;
	}

	public String get_Text_ToolTipLicenseExpiryDate() {
		mouseHover(expiryDate);

		String expiryDateToolTipText = expiryDateToolTip.getText();

		expiryDateToolTipText.trim();

		return expiryDateToolTipText;
	}

	public String get_Text_ToolTipLicenseDeployment() {
		mouseHover(licenseDeploymentElement);

		String licenseDeploymentToolTipText = licenseDeploymentToolTip.getText();

		licenseDeploymentToolTipText.trim();

		return licenseDeploymentToolTipText;
	}

	public String get_Text_ToolTipLicenseVersion() {
		mouseHover(licenseVersion);

		String licenseVersionText = licenseVersionToolTip.getText();

		licenseVersionText.trim();

		return licenseVersionText;
	}

	public String get_Text_ToolTipLicenseStatus() {
		mouseHover(licenseStatus);

		String licenseStatusText = licenseStatusToolTip.getText();

		licenseStatusText.trim();

		return licenseStatusText;
	}

	public String get_Text_ToolTipLicenseInfo() {
		mouseHover(licenseInfoElement);

		String licenseInfoToolTipText = licenseInfoToolTip.getText();

		licenseInfoToolTipText.trim();

		return licenseInfoToolTipText;
	}

	public String get_Text_ToolTipLicenseRevoke() {
		mouseHover(licenseRevokeElement);

		String licenseRevokeToolTipText = licenseRevokeToolTip.getText();

		licenseRevokeToolTipText.trim();

		return licenseRevokeToolTipText;
	}

	public String get_Text_ToolTipLicenseActivate() {
		mouseHover(licenseTickElement);

		String licenseTickedToolTipText = licenseTickedToolTip.getText();

		licenseTickedToolTipText.trim();

		return licenseTickedToolTipText;
	}

	public String get_Text_ToolTipLicenseRefresh() {
		mouseHover(licenseRefreshElement);

		String licenseRefreshTooltipText = licenseRefreshToolTip.getText();

		licenseRefreshTooltipText.trim();

		return licenseRefreshTooltipText;
	}

	public String get_Text_ToolTipLicenseBulkUpload() {
		mouseHover(licenseBulkUploadElement);

		String licensebulkUploadToolTipText = licensebulkUploadToolTip.getText();

		licensebulkUploadToolTipText.trim();

		return licensebulkUploadToolTipText;
	}

	public String get_Text_ToolTipLicenseBulkDownload() {
		mouseHover(licenseBulkDownloadElement);

		String licensebulkDownloadToolTipText = licensebulkDownloadToolTip.getText();

		licensebulkDownloadToolTipText.trim();

		return licensebulkDownloadToolTipText;
	}

	public String get_Text_ToolTipRequestLicense() {
		mouseHover(RequestLicenseElement);

		String RequestLicenseToolTipText = RequestLicenseToolTip.getText();

		RequestLicenseToolTipText.trim();

		return RequestLicenseToolTipText;
	}

	public String get_Text_ToolTipLicenseTraker() {

		mouseHover(licenseTrackerElement);

		String licenseTrackerToolTipText = licenseTrackerToolTip.getText();

		licenseTrackerToolTipText.trim();

		return licenseTrackerToolTipText;
	}

	public String get_Text_ToolTipEdgeName() {
		mouseHover(licenseEdgeName);

		String licenseEdgeNameToolTipText = licenseEdgeNameToolTip.getText();

		licenseEdgeNameToolTipText.trim();

		return licenseEdgeNameToolTipText;
	}

	public String get_Text_ToolTipEdgeGroupName() {
		mouseHover(licenseEdgeGroupName);

		String licenseEdgeGroupNameText = licenseEdgeGroupNameToolTip.getText();

		licenseEdgeGroupNameText.trim();

		return licenseEdgeGroupNameText;
	}

	public String get_Text_ToolTipEntity() throws InterruptedException {
		mouseHover(entityName);
      Thread.sleep(4000);
     String entityTooltipText = entityTooltip.getText();

		entityTooltipText.trim();

		return entityTooltipText;
	}

	public String get_Text_ToolTipExpiryDate() {
		mouseHover(expiryDateElement);

		String expiryDateTooltipText = expiryDateTooltip.getText();

		expiryDateTooltipText.trim();

		return expiryDateTooltipText;
	}

	public String get_Text_ToolTipDeploymentDate() throws InterruptedException {

		mouseHover(licenseDeploymentDateTracker);

		String licenseDeploymentTooltipText = licenseDeploymentTooltip.getText();

		licenseDeploymentTooltipText.trim();

		return licenseDeploymentTooltipText;
	}

	public String get_Text_ToolTipLicenseStatusTracker() {
		mouseHover(licenseStatusTracker);

		String licenseStatusTrackerText = licenseStatusToolTip.getText();

		licenseStatusTrackerText.trim();

		return licenseStatusTrackerText;
	}

	@FindBy(xpath = "//div[contains(text(),'EDGE ID')]/../../..//mat-icon")

	WebElement edgeIDDot;

	@FindBy(xpath = "//div[contains(text(),'Entity Name')]/../../..//mat-icon")

	WebElement entityNameDot;

	@FindBy(xpath = "//input[@name='devicename']")

	WebElement edgeIDinput;

	public void hostIdAscElement() {
		hostIdAsc.click();
		// clickElement(hostIdAsc, "");
	}

	public void edgeIDDotElement() {
		clickElement(edgeIDDot, "");
	}

	public void edgeIDInput(String value) {
		SetInputENterKey(edgeIDinput, "");
		SetInput(edgeIDinput, value, value);
	}

	public void uploadButtonSaveElement() {
		clickElement(uploadButtonSave, "");
	}

	public void NextButtonStep() {
		clickElement(NextButton, "");
		// NextButton1.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement NextButton;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label//input")
	WebElement selectedCheckboxEdgeIDInput;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxEdgeIDDeploymentLicenseLabel;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement issuedateArrowFilter;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label//input")
	WebElement selectedCheckboxEntityNameInput;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxEntityNameLicenseLabel;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]")
	WebElement edgeNameArrowFilter;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement entityNameArrowFilter;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/span[1]/div[1]/div[2]")
	WebElement expiryDateArrowFilter;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement deploymentDateArrowFilter;

	@FindBy(xpath = "//thead/tr[1]/th[7]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement statusArrowFilter;

	public void entityDotElement() {
		clickElement(edgeIDDot, "");
	}

	public void checkboxEdgeIDStepOneName() {

		if (selectedCheckboxEdgeIDInput != null) {
			String checked = selectedCheckboxEdgeIDInput.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedCheckboxEdgeIDDeploymentLicenseLabel, "");

			}
		}
	}

	public void licenseEntityElement() {
		clickElement(entityNameDot, "");

	}

	public void licenseEntityInput(String value) {
		SetInputENterKey(edgeIDinput, "");
		SetInput(edgeIDinput, value, value);

	}

	public void issuedateArrowFilter() {
		clickElement(issuedateArrowFilter, "");
	}

	public void edgeNameArrowFilter() {
		clickElement(edgeNameArrowFilter, "");
	}

	public void entityNameArrowFilter() {
		clickElement(entityNameArrowFilter, "");
	}

	public void deploymentDateArrowFilter() {
		clickElement(deploymentDateArrowFilter, "");
	}

	public void expiryDateArrowFilter() {
		clickElement(expiryDateArrowFilter, "");
	}

	public void statusArrowFilter() {
		clickElement(statusArrowFilter, "");
	}

	public void checkboxEntityNameStepOneName() {
		if (selectedCheckboxEntityNameInput != null) {
			String checked = selectedCheckboxEntityNameInput.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedCheckboxEntityNameLicenseLabel, "");

			}
		}

	}
}
