package com.cdm.pages;

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

	@FindBy(xpath = "((//app-tablewidget/div/table/tbody/tr)[1]/td[2])")
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

}
