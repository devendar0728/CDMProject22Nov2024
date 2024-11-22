package com.cdm.pages.Latest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserRolePermission extends CommonActions {

	public UserRolePermission(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	
	@FindBy(xpath = "//input[@name='access']")
	WebElement permissionInput;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")

	WebElement addpermissioncolumn;

	@FindBy(xpath = "//tbody/tr[2]/td[2]/span[1]/img[1]")

	WebElement addpermissionicon;

	public void addpermissionicon() {
		clickElement(addpermissionicon,"");
		//addpermissionicon.click();
	}
	
	public void addpermissioncolumn() {
		clickElement(addpermissioncolumn,"");
		//addpermissioncolumn.click();
	}
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing,"");
			//backDropShowing.click();
		}
	}
	
	public void networkstatusclick() {
		clickElement(networkstatusclick, "");
		
	}
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement networkstatusclick;
	
	public void permissionInput(String value) {
		SetInputENterKey(permissionInput,"");

		SetInput(permissionInput, value, value);
		
//		permissionInput.sendKeys(Keys.ENTER);
//		permissionInput.sendKeys(value);
	}

	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
		
		public void outerlayerclick() {
			clickElement(outerlayerclick, "");
		
	}
}
