package com.cdm.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DashboardPage extends CommonActions {

	public DashboardPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@title='Total EDGE Devices']")
	WebElement edgeDevicesElement;

	public String edgeDeviceCount() {

		String edgeDevicesCount = edgeDevicesElement.getText();
		return edgeDevicesCount;

	}

	@FindBy(xpath = "//div[@title='Active App Groups ']")
	WebElement activeAppGroupsElement;

	public String activeAppGroupsCount() {

		String activeAppGroupsCount = activeAppGroupsElement.getText().trim();
		return activeAppGroupsCount;
	}

	@FindBy(xpath = "//div[@title='Active Repositories ']")
	WebElement activeRepositoriesCountElement;

	public String activeRepositoriesCount() {
		String activeRepositoriesCount = activeRepositoriesCountElement.getText().trim();
		return activeRepositoriesCount;
	}

	@FindBy(xpath = "//div[@title='Active EDGE Groups ']")
	WebElement activeEdgeGroupsCountElement;

	public String activeEdgeGroupsCount() {
		String activeEdgeGroupsCount = activeEdgeGroupsCountElement.getText().trim();
		return activeEdgeGroupsCount;
	}

	@FindBy(xpath = "//div[@title=' Active Volumes']")
	WebElement activeVolumesCountElement;

	public String activeVolumesCount() {
		String activeVolumesCount = activeVolumesCountElement.getText().trim();
		return activeVolumesCount;
	}

	@FindBy(xpath = "//div[@title='Active Applications ']")
	WebElement activeApplicationsCountElement;

	public String activeApplicationsCount() {
		String activeApplicationsCount = activeApplicationsCountElement.getText().trim();
		return activeApplicationsCount;
	}

	@FindBy(xpath = "//div[@title='Active EDGE Devices ']")
	WebElement activeEdgeDevicesCountElement;

	public String activeEdgeDevicesCount() {
		String activeEdgeDevicesCount = activeEdgeDevicesCountElement.getText().trim();
		return activeEdgeDevicesCount;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[2]/td[2])")
	WebElement deploymentsLast24HoursElement;

	public String deploymentsLast24HoursElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String deploymentsCountText = deploymentsLast24HoursElement.getText().trim();

		return deploymentsCountText;

	}

	public boolean deploymentsLast24HoursCountElement() {

		boolean deploymentsCount = deploymentsLast24HoursElement.getText().trim().isEmpty();

		return deploymentsCount;

	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[2]/td[2])")
	WebElement deploymentsLastSevenDaysElement;

	public String deploymentsLastSevenDaysElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String deploymentsCountText = deploymentsLastSevenDaysElement.getText().trim();

		return deploymentsCountText;

	}

	public boolean deploymentsLastSevenDaysCountElement() {

		boolean deploymentLastSevenDaysCount = deploymentsLastSevenDaysElement.getText().trim().isEmpty();

		return deploymentLastSevenDaysCount;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[2]/td[3])")
	WebElement ongoingLastSevenDaysElement;

	public String OngoingLastSevenDaysElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String deploymentsCountText = ongoingLastSevenDaysElement.getText().trim();

		return deploymentsCountText;

	}

	public boolean OngoingLastSevenDaysCountElement() {
		boolean ongoingLastSevenDaysCount = ongoingLastSevenDaysElement.getText().trim().isEmpty();

		return ongoingLastSevenDaysCount;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[1]/td[3])")
	WebElement OngoingLastTwentyFourHoursElement;

	public String OngoingLastTwentyFourHoursElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String OngoingLastTwentyFourHoursElementText = OngoingLastTwentyFourHoursElement.getText().trim();

		return OngoingLastTwentyFourHoursElementText;
	}

	public boolean OngoingLastTwentyFourHoursElementCount() {
		boolean ongoingLastSevenDaysCount = OngoingLastTwentyFourHoursElement.getText().trim().isEmpty();

		return ongoingLastSevenDaysCount;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[1]/td[4])")
	WebElement successfulLastTwentyFourHoursElement;

	public String successfulLastTwentyFourHoursElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String OngoingLastTwentyFourHoursElementText = successfulLastTwentyFourHoursElement.getText().trim();

		return OngoingLastTwentyFourHoursElementText;
	}

	public boolean successfulLastTwentyFourHoursElementCount() {
		boolean successfulCountforTwentyFourHours = successfulLastTwentyFourHoursElement.getText().trim().isEmpty();

		return successfulCountforTwentyFourHours;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[2]/td[4])")
	WebElement successfulLastSevenDaysElement;

	public String successfulLastSevenDaysElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String successfulLastSevenDaysElementText = successfulLastSevenDaysElement.getText().trim();

		return successfulLastSevenDaysElementText;
	}

	public boolean successfulLastSevenDaysCount() {
		boolean successfulCountforLastSevenDays = successfulLastSevenDaysElement.getText().trim().isEmpty();

		return successfulCountforLastSevenDays;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[1]/td[5])")
	WebElement FailedLastTwentyFourHoursElement;

	public String FailedLastTwentyFourHoursElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String FailedLastTwentyFourHoursElementText = FailedLastTwentyFourHoursElement.getText().trim();

		return FailedLastTwentyFourHoursElementText;
	}

	public boolean FailedLastTwentyFourHoursElementCount() {
		boolean FailedLastTwentyFourHours = FailedLastTwentyFourHoursElement.getText().trim().isEmpty();

		return FailedLastTwentyFourHours;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[1]/td[6])")
	WebElement deletedLastTwentyFourHoursElement;

	public String DeletedLastTwentyFourHoursElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String deletedLastTwentyFourHoursElementText = deletedLastTwentyFourHoursElement.getText().trim();

		return deletedLastTwentyFourHoursElementText;
	}

	public boolean DeletedLastTwentyFourHoursElementCount() {
		boolean deletedLastTwentyFourHours = deletedLastTwentyFourHoursElement.getText().trim().isEmpty();

		return deletedLastTwentyFourHours;
	}

	public boolean failedLastSevenDaysCountElement() {
		boolean deletedlastsevenDaysElementCount = deletedlastsevenDaysElement.getText().trim().isEmpty();

		return deletedlastsevenDaysElementCount;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[2]/td[6])")
	WebElement deletedlastsevenDaysElement;

	public String deletedLastSevenDaysElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String deletedlastsevenDaysElementText = deletedlastsevenDaysElement.getText().trim();

		return deletedlastsevenDaysElementText;
	}

	public boolean deletedLastsevenDaysElementCount() {
		boolean deletedlastsevenDaysElementCount = deletedlastsevenDaysElement.getText().trim().isEmpty();

		return deletedlastsevenDaysElementCount;
	}

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[2]/td[5])")
	WebElement failedlastsevenDaysElement;

	public String failedLastSevenDaysElement() throws InterruptedException {
		Thread.sleep(2000);
		// Get the text value from the widget
		String failedlastsevenDaysElementText = failedlastsevenDaysElement.getText().trim();

		return failedlastsevenDaysElementText;
	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-dashboard/div/div[2]/div/gridstack/gridstack-item[1]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement edgeGroupImage;

	public void EdgeGroupImageClick() {
		clickElement(edgeGroupImage, "Clicking on Edge Group Image");

	}

	@FindBy(xpath = "//span[contains(text(),' Active')]")
	WebElement activeStatusElement;

	public boolean activeStatus() {
		activeStatusElement.isDisplayed();
		return activeStatusElement != null;

	}

	@FindBy(xpath = "//span[contains(text(),' InActive')]")
	WebElement InactiveStatusElement;

	public boolean InactiveStatus() {
		return InactiveStatusElement.isDisplayed();

	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-dashboard/div/div[2]/div/gridstack/gridstack-item[2]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement edgeDevicesImage;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-dashboard/div/div[2]/div/gridstack/gridstack-item[3]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement appGroupsImage;

	public void EdgeDevicesImageClick() {

		clickElement(edgeDevicesImage, "Clicking on Total Edge Devices Image");

	}

	@FindBy(xpath = "//gridstack/gridstack-item[5]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement edgeGroupsImage;

	public void totalEdgeGroups() {

		clickElement(edgeGroupsImage, "Clicking on Total Edge Groups Image");

	}

	public void activeAppGroupImage() {
		clickElement(appGroupsImage, "Clicking on Total App Groups Image");

	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-dashboard/div/div[2]/div/gridstack/gridstack-item[4]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement activeRepositoriesImage;

	public void activeRepositoriesImage() {
		clickElement(activeRepositoriesImage, "Clicking on Total App Groups Image");

	}

	@FindBy(xpath = "//gridstack/gridstack-item[7]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement activeApplicationImage;

	@FindBy(xpath = "//gridstack/gridstack-item[8]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement volumeApplicationImage;

	@FindBy(xpath = "//gridstack/gridstack-item[5]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement activeEdgeGroupsImage;

	@FindBy(xpath = "//gridstack/gridstack-item[6]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement activeEdgeDevicesImage;

	@FindBy(xpath = "//gridstack/gridstack-item[8]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement activevolumesImageElement;

	public void activeApplicationImage() {
		clickElement(activeApplicationImage, "Clicking on Active Application Image");

	}

	public void activeVolumeImage() {
		clickElement(volumeApplicationImage, "Clicking on volume Application Image");
	}

	public void activeEdgeGroupsImage() {
		clickElement(activeEdgeGroupsImage, "Clicking on Active Application Image");
	}

	public void activeEdgeDevicesImage() {
		clickElement(activeEdgeDevicesImage, "Clicking on Active Application Image");

	}

	@FindBy(xpath = "//gridstack/gridstack-item[5]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement countOnTotalEdgeGroupsElement;

	@FindBy(xpath = "//gridstack/gridstack-item[3]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement countOnTotalActiveappGroupsElement;

	@FindBy(xpath = "//gridstack/gridstack-item[4]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement countOnTotalActiveRepositoriesElement;

	@FindBy(xpath = "//gridstack/gridstack-item[4]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement countOnTotalActiveActiveEdgeGroupsElement;

	@FindBy(xpath = "//gridstack/gridstack-item[6]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement countOnTotalActiveActiveEdgeDevicesElement;

	@FindBy(xpath = "//gridstack/gridstack-item[8]/div/app-cardwidget/div/div[2]/div[2]/img")
	WebElement countOnTotalActiveActiveApplicationsElement;

	public boolean getCountTextOnTotalEdgeGroups() {

		return countOnTotalEdgeGroupsElement.getText() != null;

	}

	public boolean getCountTextOnTotalEdgeDevices() {
		return countOnTotalEdgeGroupsElement.getText() != null;
	}

	public boolean getCountTextOnActiveAppGroups() {

		return countOnTotalActiveappGroupsElement.getText() != null;
	}

	public boolean getCountTextOnActiveRepositories() {
		return countOnTotalActiveRepositoriesElement.getText() != null;
	}

	public boolean getCountTextOnActiveEdgeGroups() {
		return countOnTotalActiveActiveEdgeGroupsElement.getText() != null;
	}

	public boolean getCountTextOnActiveEdgeDevices() {
		return countOnTotalActiveActiveEdgeDevicesElement.getText() != null;
	}

	public boolean getCountTextOnActiveApplications() {
		return countOnTotalActiveActiveApplicationsElement.getText() != null;
	}

	public boolean getCountTextOnActiveVolumes() {
		return activevolumesImageElement.getText() != null;
	}

	public WebElement getColumnByName(String columnName) {
		try {
			WebElement columnNames = driver.findElement(By.xpath("//th[contains(text(), '" + columnName + "')]"));

			columnName.toString().trim();
			return columnNames;
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public String getColorCode(String colorName) {
		switch (colorName.toLowerCase()) {
		case "black":
			return "rgba(0, 0, 0, 1)";
		case "orange":
			return "rgba(255, 165, 0, 1)";
		case "green":
			return "rgba(0, 128, 0, 1)";
		case "red":
			return "rgba(255, 0, 0, 1)";
		case "brown":
			return "rgba(165, 42, 42, 1)";
		default:
			throw new IllegalArgumentException("Unknown color: " + colorName);
		}
	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-dashboard/div/div[2]/div/gridstack/gridstack-item[9]/div/app-tablewidget/div/table")
	WebElement deploymenttableElement;

	public boolean getDeploymentTableData() {

		// Ensure the table element exists
		Assert.assertNotNull("Deployment Report table is not found!", deploymenttableElement);

		// Fetch all rows of the table
		List<WebElement> rows = deploymenttableElement.findElements(By.tagName("tr"));
		Assert.assertTrue("Deployment Report table has no rows!", rows.size() > 0);

		// Collect all table data into a single string
		StringBuilder tableData = new StringBuilder();

		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			// Collect data from each cell
			StringBuilder rowData = new StringBuilder();
			for (WebElement cell : cells) {
				rowData.append(cell.getText()).append(" | ");
			}

			// Add row data to table data
			tableData.append(rowData.toString().trim()).append("\n");
			System.out.println(rowData);
		}
		return false;

		// Return the collected table data as a string

	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-dashboard/div/div[2]/div/gridstack/gridstack-item[10]/div/app-tablewidget/div/table")
	WebElement licensetableElement;

	public boolean getLicenseTableData() {

		// Ensure the table element exists
		Assert.assertNotNull("License Report table is not found!", licensetableElement);

		// Fetch all rows of the table
		List<WebElement> rows = licensetableElement.findElements(By.tagName("tr"));
		Assert.assertTrue("License Report table has no rows!", rows.size() > 0);

		// Collect all table data into a single string
		StringBuilder tableData = new StringBuilder();

		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			// Collect data from each cell
			StringBuilder rowData = new StringBuilder();
			for (WebElement cell : cells) {
				rowData.append(cell.getText()).append(" | ");
			}

			// Add row data to table data
			tableData.append(rowData.toString().trim()).append("\n");
			System.out.println(rowData);
		}
		return false;
	}

}
