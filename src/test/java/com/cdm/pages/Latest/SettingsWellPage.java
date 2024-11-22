package com.cdm.pages.Latest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class SettingsWellPage extends CommonActions {

	public SettingsWellPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@class='nav']/li[10]")
	WebElement wellnavigationTab;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-well-user[1]/div[1]/div[1]/div[1]/span[1]/img[1]")
	WebElement AddButtonforWell;

	@FindBy(xpath = "//input[@formcontrolname='wellname']")
	WebElement inputWellName;

	

	@FindBy(xpath = "//input[@formcontrolname='port']")
	WebElement inputPortNumber;

	@FindBy(xpath = "//input[@formcontrolname='ipaddress']")
	WebElement inputIPAddress;

	
	
	@FindBy(xpath = "//mat-select[@formcontrolname='devicetype']")
	WebElement deviceTypeSelectAdd;
	
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement savebuttonforSettingwell;

	public void deviceTypeSelectAdd(String value) throws InterruptedException {

		wait(deviceTypeSelectAdd,logger);
		SelectMatOption(deviceTypeSelectAdd, value);
	}
	
	
	
	public void clickWellNavigationTab() {
		clickElement(wellnavigationTab, "");
		//wellnavigationTab.click();
	}

	public void addWell() {
		clickElement(AddButtonforWell, "");
		//AddButtonforWell.click();
	}
	
	public void inputWellName(String value) {
		SetInputENterKey(inputWellName,"");
		SetInput(inputWellName, value, value);
		
//		inputWellName.sendKeys(Keys.ENTER);
//		inputWellName.sendKeys(value);
	}
	public void inputPortNumber(String value) {
		
		SetInputENterKey(inputPortNumber,"");
		SetInput(inputPortNumber, value, value);
		
		
//		inputPortNumber.sendKeys(Keys.ENTER);
//		inputPortNumber.sendKeys(value);
	}
	
	public void inputIPAddress(String value) {

		SetInputENterKey(inputIPAddress,"");
		SetInput(inputIPAddress, value, value);
		
//		inputIPAddress.sendKeys(Keys.ENTER);
//		inputIPAddress.sendKeys(value);
	}
	public void savebuttonforSettingwell() {
		clickElement(savebuttonforSettingwell, "");
		//savebuttonforSettingwell.click();
	}
}
