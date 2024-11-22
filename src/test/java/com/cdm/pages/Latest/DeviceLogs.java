package com.cdm.pages.Latest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DeviceLogs extends CommonActions {

	public DeviceLogs(WebDriver driver, ExtentTest logger) {

		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath = "//a[contains(text(),'Device Logs')]")
	WebElement deviceLogTab;
	
	
	
	
	@FindBy(xpath = "//app-filter[@name='devicename']")
	WebElement deviceName;

	@FindBy(xpath = "//app-filter[@name='categoryname']")
	WebElement logType;

	@FindBy(xpath = "//app-filter[@name='priorityname']")
	WebElement priorityName;

	@FindBy(xpath = "//app-filter[@name='summary']")
	WebElement summary;

	@FindBy(xpath = "//app-filter[@name='timestamp']")
	WebElement timeStamps;

	@FindBy(xpath = "//input[@name='devicename']")
	WebElement devicenameInput;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calender;

	@FindBy(xpath = "//input[@name='categoryname']")
	WebElement categorynameInput;

	@FindBy(xpath = "//input[@name='priorityname']")
	WebElement prioritynameInput;

	@FindBy(xpath = "//input[@name='summary']")
	WebElement summaryInput;

	public void deviceName() {
		clickElement(deviceName, "");
		//deviceName.click();
	}

	public void logType() {
		clickElement(logType, "");
		//logType.click();
	}

	public void priorityName() {
		clickElement(priorityName, "");
		//priorityName.click();
	}

	public void summary() {
		clickElement(summary, "");
		//summary.click();
	}
	
	
	public void deviceLogTab() {
		clickElement(deviceLogTab, "");
		//deviceLogTab.click();
	}

	public void timeStamps() {
		clickElement(timeStamps, "");
		//timeStamps.click();
	}

}
