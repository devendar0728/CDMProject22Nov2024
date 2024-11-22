package com.cdm.pages.Latest;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AppGroupsEditPage extends CommonActions {

	public AppGroupsEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@formcontrolname='appgroupname']")
	WebElement appGroupNameEdit;
	
	
	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement appGroupDisplayNameEdit;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButton;
	
	public void appGroupNameEdit(String value) {
		///appGroupNameEdit.sendKeys(Keys.ENTER);
		//appGroupNameEdit.sendKeys(value);
		
		SetInputENterKey(appGroupNameEdit, value);
		SetInput(appGroupNameEdit, value, value);
	}
	
	public void appGroupDisplayNameEdit(String value) {

		SetInputENterKey(appGroupDisplayNameEdit, value);
		SetInput(appGroupDisplayNameEdit, value, value);
//		
//		appGroupDisplayNameEdit.sendKeys(Keys.ENTER);
//		appGroupDisplayNameEdit.sendKeys(value);
	}

	public String removalofEnteredTextForappGroupName() {

		return removalofEneredText(appGroupNameEdit);

	}
	

	public String removalofEnteredTextForappGroupDisplayNameEdit() {

		return removalofEneredText(appGroupDisplayNameEdit);

	}
	


	public void saveButton() {
		clickElement(saveButton, "");
//		saveButton.click();
	}

	
	}
	
	
