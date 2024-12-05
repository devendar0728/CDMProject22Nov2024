package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserGroupsAddPage extends CommonActions {

	public UserGroupsAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement networkStatus;
	
	@FindBy(xpath = "//a[contains(text(),'User Groups')]")
	WebElement UserGroupstab;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[2]")
	WebElement addbuttonicon;
	
	@FindBy(xpath = "//*[@id=\"matTable\"]/tbody/tr/td[2]/img[2]")
	WebElement deletebuttonicon;

	@FindBy(xpath = "//button[@class='addButton']")

	WebElement savebtnusergroups;

	@FindBy(xpath = "//mat-icon[contains(text(),'more_vert')]")

	WebElement usergroupThreeDot;

	@FindBy(xpath = "//input[@formcontrolname='groupname']")

	WebElement inputUserGroup;
	
	@FindBy(xpath = "//input[@name='groupname']")

	WebElement searchUserGroup;

	public void inputUserGroup(String value) {
		
		SetInputENterKey(inputUserGroup, "");
		SetInput(inputUserGroup, value, value);
		
	
	}
	
	
	public void searchUserGroup(String value) {
		SetInputENterKey(searchUserGroup, "");
		SetInput(searchUserGroup, value, value);
	
	}

	public void saveusergroups() {
		clickElement(savebtnusergroups, "");
//		savebtnusergroups.click();

	}

	public void addbuttonicon() {
		clickElement(addbuttonicon, "");
		
	}

	public void UserGroupstab() {
		
			clickElement(UserGroupstab, "");
		
	}

	public void usergroupThreeDot() {
		clickElement(usergroupThreeDot, "");
	
	}
	
	public void deletebuttonicon() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#matTable > tbody > tr > td.mat-cell.cdk-cell.table-data.cdk-column-Action.mat-column-Action.ng-star-inserted > img:nth-child(2)\").click()");
	}
	public void confirmationYesButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement confirmationYesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));
			clickElement(confirmationYesButton, "");
	        // Perform a click action on the confirmation Yes button
	        //confirmationYesButton.click();
		
	}
	
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
		
			backDropShowing.click();
		}
	}


	public void confirmationNoButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationNoButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'No')]")));
		clickElement(confirmationNoButton, "");
		//confirmationNoButton.click();
	}


	public void networkstatus() {
		clickElement(networkStatus, "");
	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	

	public void outerlayerclick() {
		clickElement(outerlayerclick, "");
		
	}
}
