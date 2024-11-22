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

public class UserGroupsPage extends CommonActions {

	public UserGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement networkStatus;
	
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	
	
	@FindBy(xpath = "//h4")
	WebElement headingtitle;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/img[3]")
	WebElement addusericon;
	
	@FindBy(xpath ="//tbody/tr[1]/td[2]/img[4]")
	WebElement managemappingicon;
	
	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/label[1]/input[1]")
	WebElement activeStatus;
	
	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement inactiveStatus;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-user-group[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement refreshIcon;
	
	@FindBy(xpath="//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusColumn;
	
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	@FindBy(xpath = "//a[contains(text(),'User Groups')]")
	WebElement UserGroupstab;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[2]")
	WebElement addbuttonicon;
	
	@FindBy(xpath = "//*[@id=\"matTable\"]/tbody/tr/td[2]/img[2]")
	WebElement deletebuttonicon;

	@FindBy(xpath = "//mat-icon[contains(text(),'more_vert')]")
	WebElement usergroupThreeDot;

	@FindBy(xpath = "//input[@formcontrolname='groupname']")

	WebElement inputUserGroup;
	
	@FindBy(xpath = "//input[@name='groupname']")

	WebElement searchUserGroup;

	public void inputUserGroup(String value) {
		SetInputENterKey(inputUserGroup,"");
		SetInput(inputUserGroup, value, value);
//		inputUserGroup.sendKeys(Keys.ENTER);
//		// ((JavascriptExecutor) driver).executeScript("arguments[0].value =
//		// arguments[1]", value, inputUserRole);
//		inputUserGroup.sendKeys(value);
	}
	
	
	public void searchUserGroup(String value) {
		SetInputENterKey(searchUserGroup,"");
		SetInput(searchUserGroup, value, value);
//		searchUserGroup.sendKeys(Keys.ENTER);
//		searchUserGroup.sendKeys(value);
//		searchUserGroup.sendKeys(Keys.ENTER);
	}

	

	public void addbuttonicon() {
		clickElement(addbuttonicon, "");
		//addbuttonicon.click();
	}

	public void UserGroupstab() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement element = wait.until(ExpectedConditions.visibilityOf(UserGroupstab));
	        element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void usergroupThreeDot() {
		clickElement(usergroupThreeDot, "");
		//usergroupThreeDot.click();
	}
	
	public void deletebuttonicon() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#matTable > tbody > tr > td.mat-cell.cdk-cell.table-data.cdk-column-Action.mat-column-Action.ng-star-inserted > img:nth-child(2)\").click()");
	}
	public void confirmationYesButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement confirmationYesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));

	        // Perform a click action on the confirmation Yes button
			clickElement(confirmationYesButton, "");
	        //confirmationYesButton.click();
		
	}
	
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			//backDropShowing.click();
		}
	}


	public void addusericon() {
	
		clickElement(addusericon, "");
		
	}


	public void inactiveStatus() {
		wait(inactiveStatus,logger);
		clickElement(inactiveStatus, "");
		//inactiveStatus.click();
	}
	
	public void statusColumn() {
		wait(statusColumn,logger);
		clickElement(statusColumn, "");
		//statusColumn.click();
	}


	public void activeStatus() {
		wait(activeStatus,logger);
		clickElement(activeStatus, "");
	//activeStatus.click();
		
	}
	public void headingtitle() {
		clickElement(headingtitle, "");
		//headingtitle.click();
		
	}
	public void managemappingicon() {
		
		clickElement(managemappingicon, "");
		//managemappingicon.click();
	}


	public void refreshicon() {
		
		clickElement(refreshIcon, "");
		
	}
	
	public void networkstatus() {
		clickElement(networkStatus, "");
	}


	public void outerlayerclick() {
		
		
		clickElement(outerlayerclick, "");
		
	}

}
