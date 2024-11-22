package com.cdm.pages.Latest;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserRolePage extends CommonActions {

	public UserRolePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}
	
	

	@FindBy(xpath = "//input[@name='rolename']")
	WebElement searchRoleName;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement networkstatusclick;
	
	@FindBy(xpath = "//input[@formcontrolname='rolename']")
	WebElement updateSearchRoleName;
	
	
	
	@FindBy(xpath = "//mat-icon[contains(text(),'more_vert')]")
	WebElement searchRoleNameThreeDot;
	

	@FindBy(xpath = "//tbody/tr[2]/td[2]/span[1]/img[2]")
	WebElement editRoleButton;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			//clickElement(backDropShowing, "");
			backDropShowing.click();
		}
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@name='rolename']")
	WebElement sendsearchRoleName;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[2]")
	WebElement addbuttonuserRole;

	public void addbuttonuserRole() {
		clickElement(addbuttonuserRole, "");
		//addbuttonuserRole.click();
	}

	public void searchRoleName() {
		clickElement(searchRoleName, "");
		//searchRoleName.click();
	}

	public void sendsearchRoleName(String value) throws InterruptedException {
       
		SetInputENterKey(sendsearchRoleName,"");
		SetInput(sendsearchRoleName, value, value);

	}
	
	public void editRoleButton() {
		
		clickElement(editRoleButton, "");
		//editRoleButton.click();
	}

	public void searchRoleNameThreeDot() {
		clickElement(searchRoleNameThreeDot, "");
		
	}

	public void networkstatusclick() {
		clickElement(networkstatusclick, "");
		
	}

	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
		
		public void outerlayerclick() {
			clickElement(outerlayerclick, "");
		
	}

}
